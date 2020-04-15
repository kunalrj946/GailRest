package com.mass.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.mass.config.Application;
import com.mass.exception.ServerApplicationException;
import com.mass.logger.ALogger;
import com.mass.model.ExcelColumn;
import com.mass.model.ISORequest;
import com.mass.model.MmstError;
import com.mass.service.ISOService;
import com.mass.service.MmstService;

@RestController
public class ISOController {

	@Autowired
	ISOService isoService;

	@Autowired
	MmstService mmstService;

	@Autowired
	ObjectMapper objectMapper;

	static ALogger logger = Application.getInstance().getDefaultLogger();

	@CrossOrigin
	@RequestMapping(value = "/calculateGasISO", method = RequestMethod.POST)
	public ResponseEntity<String> calculateGasISO(@RequestBody ISORequest isoRequest) {

		return new ResponseEntity<String>(toJson(isoService.calculateCalorificValue(isoRequest)), HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value = "/mmst", method = RequestMethod.POST)
	public ResponseEntity<Object> calculateGasmmst(HttpServletRequest request) throws ServerApplicationException {

		try {

			StringBuilder sb = new StringBuilder();
			BufferedReader reader = null;
			reader = request.getReader();
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line).append('\n');
			}
			String json = sb.toString();
			ExcelColumn data = null;
			data = createFailFastReader().readValue(json);
			return new ResponseEntity<Object>(toJson(mmstService.MmstProcess(data)), HttpStatus.OK);

		} catch (DataAccessException | SQLException e) {
			MmstError mmstError = new MmstError();
			mmstError.setDataInserted(0);
			mmstError.setFieldName("Database or Sql");
			mmstError.setErrorCode(100000);
			mmstError.setErrorMessage("SQl Error");
			return new ResponseEntity<Object>(toJson(mmstError), HttpStatus.OK);

		} catch (ServerApplicationException e) {

			MmstError mmstError = new MmstError();
			mmstError.setDataInserted(0);
			mmstError.setFieldName(e.inputName);
			mmstError.setErrorCode(e.getErrorCode());
			mmstError.setErrorMessage(e.getErrorMessage());

			return new ResponseEntity<Object>(toJson(mmstError), HttpStatus.OK);
		} catch (JsonProcessingException e1) 
		{
			
			
			System.out.println(e1.getOriginalMessage().split("\\(")[0]);
			
			
			
			return new ResponseEntity<Object>(toJson(e1.getOriginalMessage().split("\\(")[0]), HttpStatus.OK);
		}catch (IOException e1) 
		{
			return new ResponseEntity<Object>(toJson(e1.getMessage()), HttpStatus.OK);
		}

	}

	private ObjectReader createFailFastReader() 
	{
		return objectMapper.readerFor(ExcelColumn.class).with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	}

	public String toJson(Object obj) {
		String jsonStr = "{}";
		ObjectMapper mapperObj = new ObjectMapper();
		try {
			jsonStr = mapperObj.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			logger.error(this, "toJson()  JsonProcessingException  -->  " + e.toString());
			jsonStr = "{}";
		}

		return jsonStr;

	}

}
