package com.mass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mass.config.Application;
import com.mass.logger.ALogger;
import com.mass.model.ExcelColumn;
import com.mass.model.ISORequest;
import com.mass.service.ISOService;
import com.mass.service.MmstService;

@RestController
public class ISOController {
	
	
	
	@Autowired
	ISOService isoService;
	
	@Autowired
	MmstService mmstService;

	static ALogger logger = Application.getInstance().getDefaultLogger();
	
	@CrossOrigin
	@RequestMapping(value = "/calculateGasISO", method = RequestMethod.POST)
	public ResponseEntity<String> calculateGasISO(@RequestBody ISORequest isoRequest) {
		
		
		return new ResponseEntity<String>(toJson(isoService.calculateCalorificValue(isoRequest)),HttpStatus.OK);
				}
	
	
	@CrossOrigin
	@RequestMapping(value = "/mmst", method = RequestMethod.POST)
	public ResponseEntity<String> calculateGasmmst(@RequestBody ExcelColumn isoRequest) {
		
		
		return new ResponseEntity<String>(toJson(mmstService.MmstProcess(isoRequest)),HttpStatus.OK);
				}
	
	public String toJson(Object obj) {
		String jsonStr = "{}";
		ObjectMapper mapperObj = new ObjectMapper();
			try {
			  jsonStr = mapperObj.writeValueAsString(obj);
			} catch (JsonProcessingException e) {
			  e.printStackTrace();
			  logger.error(this, "toJson()  JsonProcessingException  -->  "+e.toString());
			  jsonStr = "{}";
			}

		return jsonStr;

		  }
}
