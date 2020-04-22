package com.mass.service;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;

//import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mass.config.WebConfig;
import com.mass.dao.DAOI;
import com.mass.exception.ServerApplicationException;
import com.mass.model.Energy_measurement_details;
import com.mass.model.ExcelColumn;
import com.mass.model.FlowComputerData;
import com.mass.model.MMST_DB;
import com.mass.model.MmstResponse;
import com.mass.model.OrificePlateData;
import com.mass.model.PrimaryMeterData;
import com.mass.model.Secondary_instrument_details;

@Service
public class MmstService {

	@Value("${apiUrl}")
	private String apiURL;

	@Autowired
	DAOI mmstDAOI;

	WebConfig connection = new WebConfig();

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//	static ALogger logger = Application.getInstance().getDefaultLogger();

	String dbschema = "";

	public MmstService() throws IOException {
		super();
		WebConfig webconfig = new WebConfig();
		dbschema = webconfig.getPropValues();
	}

	public static void checkInteger(String inputName, String inputValue) throws ServerApplicationException {

		if (inputValue.equals("")) {

		} else
			try {
				Integer.parseInt(inputValue);

			} catch (NumberFormatException e) {

				throw new ServerApplicationException("en", 100001, inputName);
			}

	}

	public static void checkDouble(String inputName, String inputValue) throws ServerApplicationException {
		if (inputValue.equals("")) {

		} else

			try {
				Double.parseDouble(inputValue);

			} catch (NumberFormatException e) {

				throw new ServerApplicationException("en", 100002, inputName);
			}

	}

	public static void checkNull(String inputName, String inputValue) throws ServerApplicationException {

		if (inputValue == null) {
			throw new ServerApplicationException("en", 100003, inputName);
		}

	}

	public static void checkDateTime(String inputName, String inputValue, String format)
			throws ServerApplicationException {
		if (inputValue.equals("")) {

		} else

			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
				LocalDate.parse(inputValue, formatter);

			} catch (DateTimeParseException e) {

				throw new ServerApplicationException("en", 100004, inputName);
			}

	}

	@Transactional
	public MmstResponse MmstProcess(ExcelColumn data) throws DataAccessException, NumberFormatException, SQLException,
			DateTimeParseException, ServerApplicationException {

		MMST_DB mmst = new MMST_DB();
		PrimaryMeterData pmd = new PrimaryMeterData();
		OrificePlateData opd = new OrificePlateData();
		FlowComputerData fcd = new FlowComputerData();
		Energy_measurement_details emd = new Energy_measurement_details();
		Secondary_instrument_details sid = new Secondary_instrument_details();

		class CheckAllInput {
			void checkAllInput() throws ServerApplicationException {

				checkNull("SAP_ID (Note: SAP_ID is mandatory field, it must be present) ", 
						data.getSAP_ID());
				checkInteger("SAP_ID", data.getSAP_ID());

				checkNull("REGION (Note: REGION is mandatory field , it must be present)", 
						data.getREGION());

				checkNull("MAINT_BASE (Note: MAINT_BASE is mandatory field , it must be present)",
						data.getMAINT_BASE());
//				----------------------------------------------------------------------------------------------------------------
				checkNull("PROCESS_FLUID (It Is a Mandatory Field , It Must Be Present)", data.getPROCESS_FLUID());
				
				if(data.getPROCESS_FLUID().equals("D")) 
				{}else if (data.getPROCESS_FLUID().equals("W"))
				{}else if (data.getPROCESS_FLUID().equals("L"))
				{}else {
				throw new ServerApplicationException("en", ServerApplicationException.PROCESS_FLUID ,"PROCESS_FLUID" );
				}
				
//				----------------------------------------------------------------------------------------------------------------
				
				checkNull("METERING_TYPE (It Is a Mandatory Field ,It Must Be Present)", data.getMETERING_TYPE());
				
				if(data.getMETERING_TYPE().equals("O")) 
				{}else if (data.getMETERING_TYPE().equals("T"))
				{}else if (data.getMETERING_TYPE().equals("R"))
				{}else if (data.getMETERING_TYPE().equals("U"))
				{}else if (data.getMETERING_TYPE().equals("C"))
				{}else {
					throw new ServerApplicationException("en", ServerApplicationException.METERING_TYPE ,"METERING_TYPE" );
				}
				
//				-----------------------------------------------------------------------------------------------------------------
				
				checkNull("STREAM_INDEX (Note : STREAM_INDEX is mandatory field , it must be present", 
						data.getSTREAM_INDEX());
				checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());


				checkInteger("DESIGN_CAPACITY", data.getDESIGN_CAPACITY());
				checkInteger("AVG_PRESSURE", data.getAVG_PRESSURE());
				checkInteger("AVG_TEMP", data.getAVG_TEMP());
				checkInteger("AVG_DAILY_CONSUMPTION", data.getAVG_DAILY_CONSUMPTION());
				checkInteger("NO_OF_STREAM", data.getNO_OF_STREAM());
				checkDouble("KFACTOR", data.getKFACTOR());
				checkDouble("PRIMARY_METER_SIZE", data.getPRIMARY_METER_SIZE());
				checkDouble("PRIMARY_Q_MAX", data.getPRIMARY_Q_MAX());
				checkDouble("PRIMARY_Q_MIN", data.getPRIMARY_Q_MIN());
				checkDouble("PRIMARY_ORIFICE_DIA", data.getPRIMARY_ORIFICE_DIA());
				checkDouble("PRIMARY_TUBE_DIAMETER", data.getPRIMARY_TUBE_DIAMETER());
				checkInteger("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());
				checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());
				checkDouble("BP_CONTRACT_VALUE", data.getBP_CONTRACT_VALUE());
				checkDouble("BP_ASCONFIGURED_VALUE", data.getBP_ASCONFIGURED_VALUE());
				checkDouble("BT_CONTRACT_VALUE", data.getBT_CONTRACT_VALUE());
				checkDouble("BT_ASCONFIG_VALUE", data.getBT_ASCONFIG_VALUE());
				checkDouble("AP_PRESENT_VALUE", data.getAP_PRESENT_VALUE());
				checkInteger("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());
				checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());
				checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());
				checkInteger("RTD_TYPE", data.getRTD_TYPE());
				
				checkDateTime("AP_LD_UPDATION  Is Must be this format :- 'MM/dd/yyyy hh:mm:ss' " ,data.getAP_LD_UPDATION() , "MM/dd/yyyy hh:mm:ss");
				checkDateTime("AP_ND_UPDATION Is Must be this format :-'MM/dd/yyyy hh:mm:ss'", data.getAP_ND_UPDATION(), "MM/dd/yyyy hh:mm:ss");
				
				checkDateTime("TR_LD_CALIBRATION Is Must be this format :-'MM/dd/yyyy'", data.getTR_LD_CALIBRATION(), "MM/dd/yyyy");
				checkDateTime("ORIFICE_LD_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" , data.getORIFICE_LD_CALIBRATION(), "MM/dd/yyyy");
				checkDateTime("USM_LD_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" ,data.getUSM_LD_CALIBRATION(),"MM/dd/yyyy");
				checkDateTime("CORIOLIS_LD_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" , data.getCORIOLIS_LD_CALIBRATION() ,"MM/dd/yyyy");

				checkDateTime("TR_ND_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" ,data.getTR_ND_CALIBRATION() , "MM/dd/yyyy");
				checkDateTime("ORIFICE_ND_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" , data.getORIFICE_ND_CALIBRATION() , "MM/dd/yyyy");
				checkDateTime("USM_ND_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" , data.getUSM_ND_CALIBRATION() , "MM/dd/yyyy");
				checkDateTime("CORIOLIS_ND_CALIBRATION Is Must be this format :-'MM/dd/yyyy'" , data.getCORIOLIS_ND_CALIBRATION() , "MM/dd/yyyy");

				checkDateTime("TR_LD_METERTUBE_INSPECTION Is Must be this format :-'MM/dd/yyyy'" , data.getTR_LD_METERTUBE_INSPECTION() , "MM/dd/yyyy");
				checkDateTime("USM_LD_METERTUBE_INSPECTION Is Must be this format :-'MM/dd/yyyy'" , data.getUSM_LD_METERTUBE_INSPECTION() , "MM/dd/yyyy");
				checkDateTime("CORIOLIS_LD_METER_TUBE_INSP Is Must be this format :-'MM/dd/yyyy'" , data.getCORIOLIS_LD_METER_TUBE_INSP() , "MM/dd/yyyy");
				
				checkDateTime("TR_ND_METERTUBE_INSPECTION Is Must be this format :-'MM/dd/yyyy'" , data.getTR_ND_METERTUBE_INSPECTION() , "MM/dd/yyyy");
				checkDateTime("USM_ND_METERTUBE_INSPECTION Is Must be this format :- 'MM/dd/yyyy'" , data.getUSM_ND_METERTUBE_INSPECTION() , "MM/dd/yyyy");
				checkDateTime("CORIOLIS_ND_METER_TUBE_INSP Is Must be this format :-'MM/dd/yyyy'" , data.getCORIOLIS_ND_METER_TUBE_INSP(), "MM/dd/yyyy");

							
				checkDateTime("TR_LD_ERROR_UPDATION Is Must be this format :-'MM/dd/yyyy hh:mm:ss'" , data.getTR_LD_ERROR_UPDATION(), "MM/dd/yyyy hh:mm:ss");
				checkDateTime("USM_LD_ERROR_UPDATION Is Must be this format :-'MM/dd/yyyy hh:mm:ss'" , data.getUSM_LD_ERROR_UPDATION(), "MM/dd/yyyy hh:mm:ss");

				checkDateTime("TR_LD_METER_INTERNAL_INSP Is Must be this format :-'MM/dd/yyyy'" , data.getTR_LD_METER_INTERNAL_INSP(), "MM/dd/yyyy");
				checkDateTime("ORIFICE_LD_METER_INTERNAL_INSP Is Must be this format :-'MM/dd/yyyy'" , data.getORIFICE_LD_METER_INTERNAL_INSP(), "MM/dd/yyyy");
				checkDateTime("USM_LD_METER_INTERNAL_INSP Is Must be this format :-'MM/dd/yyyy'" , data.getUSM_LD_METER_INTERNAL_INSP(), "MM/dd/yyyy");


				checkDateTime("ORIFICE_ND_METER_INTERNAL_INSP Is Must be this format :-'MM/dd/yyyy'" ,data.getORIFICE_ND_METER_INTERNAL_INSP(), "MM/dd/yyyy");
				checkDateTime("TR_ND_METER_INTERNAL_INSP Is Must be this format :- 'MM/dd/yyyy'" ,data.getTR_ND_METER_INTERNAL_INSP(), "MM/dd/yyyy");
				checkDateTime("USM_ND_METER_INTERNAL_INSP Is Must be this format :-'MM/dd/yyyy'" ,data.getUSM_ND_METER_INTERNAL_INSP(), "MM/dd/yyyy");

				checkDateTime("USM_LD_HEALTH_MONITORING Is Must be this format :- 'MM/dd/yyyy'" ,data.getUSM_LD_HEALTH_MONITORING(), "MM/dd/yyyy");
				checkDateTime("USM_ND_HEALTH_MONITORING Is Must be this format :-'MM/dd/yyyy'" ,data.getUSM_ND_HEALTH_MONITORING(), "MM/dd/yyyy");

				checkDateTime("USM_ND_SOS_VERIFICATION Is Must be this format :- 'MM/dd/yyyy'" ,data.getUSM_ND_SOS_VERIFICATION(), "MM/dd/yyyy");
				checkDateTime("USM_LD_SOS_VERIFICATION Is Must be this format :- 'MM/dd/yyyy'" ,data.getUSM_LD_SOS_VERIFICATION(), "MM/dd/yyyy");

				checkDateTime("VALIDITY_DATE Is Must be this format :- 'MM/dd/yyyy hh:mm:ss'" ,data.getVALIDITY_DATE(), "MM/dd/yyyy hh:mm:ss");


				checkDateTime("LD_CALIBRATION Is Must be this format :- 'MM/dd/yyyy hh:mm:ss'" ,data.getLD_CALIBRATION(), "MM/dd/yyyy hh:mm:ss");
				checkDateTime("NEXT_CALIBRATION_DATE Is Must be this format :- 'MM/dd/yyyy'" ,data.getNEXT_CALIBRATION_DATE(), "MM/dd/yyyy");

				checkDateTime("RTD_LD_CALIBRATION Is Must be this format :- 'MM/dd/yyyy hh:mm:ss'" ,data.getRTD_LD_CALIBRATION(), "MM/dd/yyyy hh:mm:ss");

				checkDateTime("LD_SIMULATION Is Must be this format :- 'MM/dd/yyyy hh:mm:ss'" ,data.getLD_SIMULATION().toString(), "MM/dd/yyyy hh:mm:ss");



			}
		}

		new CheckAllInput().checkAllInput();

		mmst.setStation_id(mmstDAOI.getStationID(data.getSAP_ID()));
		mmst.setPipelinemst_id(mmstDAOI.getPipeLineMaster(data.getREGION()));
		mmst.setMaintenance_base_id(mmstDAOI.getMaintenaceBaseID(data.getMAINT_BASE()));

		if (data.getPROCESS_FLUID().equals("D")) {
			mmst.setProcess_fluid_id(1);

		} else if (data.getPROCESS_FLUID().equals("W")) {
			mmst.setProcess_fluid_id(2);
		}else if (data.getPROCESS_FLUID().equals("L")) {
			mmst.setProcess_fluid_id(3);
		}else {
			mmst.setProcess_fluid_id(0);
//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "PROCESS_FLUID IS NOT MATCHING WITH D ,W");
		}

		if (data.getMETERING_TYPE().equals("O")) {
			mmst.setMetering_type_id(1);
		} else if (data.getMETERING_TYPE().equals("T")) {
			mmst.setMetering_type_id(2);
		} else if (data.getMETERING_TYPE().equals("R")) {
			mmst.setMetering_type_id(3);
		} else if (data.getMETERING_TYPE().equals("U")) {
			mmst.setMetering_type_id(4);
		} else if (data.getMETERING_TYPE().equals("C")) {
			mmst.setMetering_type_id(5);
		} else {

			mmst.setMetering_type_id(0);
//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Metering_type_id");

		}

		mmst.setSap_id(data.getSAP_ID());

		mmst.setName_of_consumer_types(data.getCONSUMER_NAME());

		mmst.setMetering_capcity(data.getDESIGN_CAPACITY());

		mmst.setMetering_pressure(data.getAVG_PRESSURE());

		mmst.setAvg_metering_temeprature(data.getAVG_TEMP());

		mmst.setAvg_daily_consumption(data.getAVG_DAILY_CONSUMPTION());

		mmst.setNo_of_stream(data.getNO_OF_STREAM());

		mmst.setConfiguration(data.getCONFIGURATION());
		mmst.setRemarks(data.getMM_REMARKS());
		
		mmst.setStatus(0);
		mmst.setIs_delted(0);
		mmst.setNo_flow(0);
		if ((int) mmst.getStation_id() == 0) {
			mmst.setStation_id(-1);
			mmst.setIs_delted(1);
		}

		
		System.out.println(mmst);
		int mmst_id = mmstDAOI.insertMData(mmst);			// mmst inserting ...

//		=======================================================================
		
		pmd.setStream_no(data.getSTREAM_INDEX());
		pmd.setMmst_id(mmst_id);

		pmd.setMake(data.getPRIMARY_MAKE());

		pmd.setModel(data.getPRIMARY_MODEL());

		if (data.getMETERING_TYPE().equals("O")) {
			pmd.setMeter_type(1);
		} else if (data.getMETERING_TYPE().equals("T")) {
			pmd.setMeter_type(2);
		} else if (data.getMETERING_TYPE().equals("R")) {
			pmd.setMeter_type(3);
		} else if (data.getMETERING_TYPE().equals("U")) {
			pmd.setMeter_type(4);
		} else if (data.getMETERING_TYPE().equals("C")) {
			pmd.setMeter_type(5);
		} else {
			pmd.setMeter_type(0);
//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Meter_type");
		}

		pmd.setK_factor(data.getKFACTOR());

		pmd.setTag_no(data.getPRIMARY_TAG_NO());

		pmd.setSerial_no(data.getPRIMARY_SERIAL_NO());

		pmd.setMeter_size(data.getPRIMARY_METER_SIZE());

		pmd.setPressure_class(data.getPRIMARY_PRESSURE_CLASS());

		pmd.setG_rating(data.getPRIMARY_G_RATING());

		pmd.setQ_max(data.getPRIMARY_Q_MAX().replaceAll(",", ""));

		pmd.setQ_min(data.getPRIMARY_Q_MIN().replaceAll(",", ""));

		pmd.setOrifice_diameter(data.getPRIMARY_ORIFICE_DIA());

		pmd.setMeter_tube_pipeline_dia(data.getPRIMARY_TUBE_DIAMETER());

		if (data.getCONNECTIVITY().equals("OTHER")) {
			pmd.setConnectivity_id(5);
		} else if (data.getCONNECTIVITY().equals("OFC")) {
			pmd.setConnectivity_id(1);
		} else if (data.getCONNECTIVITY().equals("GPRS")) {
			pmd.setConnectivity_id(2);
		} else if (data.getCONNECTIVITY().equals("GSM")) {
			pmd.setConnectivity_id(3);
		} else if (data.getCONNECTIVITY().equals("NONE")) {
			pmd.setConnectivity_id(4);

		} else {
			
			pmd.setConnectivity_id(0);
//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Connectivity_id");

		}

//			pmd.setConsumer(consumer);
//			pmd.setFc_id(fc_id);

		System.out.println(pmd);
		int stream_id = mmstDAOI.insertPrimarydata(pmd);				//primary meter data inserting...

//		======================================================================================
		
		opd.setStream_id(stream_id);
		opd.setMmst_id(mmst_id);

		opd.setStream_no(data.getSTREAM_INDEX());

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
//			checkNull("TR_LD_CALIBRATION", data.getTR_LD_CALIBRATION());
			opd.setLast_calibration_date(data.getTR_LD_CALIBRATION());
		} else if (data.getMETERING_TYPE().equals("O")) {
//			checkNull("ORIFICE_LD_CALIBRATION", data.getORIFICE_LD_CALIBRATION());
			opd.setLast_calibration_date(data.getORIFICE_LD_CALIBRATION());
		} else if (data.getMETERING_TYPE().equals("U")) {
//			checkNull("USM_LD_CALIBRATION", data.getUSM_LD_CALIBRATION());
			opd.setLast_calibration_date(data.getUSM_LD_CALIBRATION());
		} else if (data.getMETERING_TYPE().equals("C")) {
//			checkNull("CORIOLIS_LD_CALIBRATION", data.getCORIOLIS_LD_CALIBRATION());
			opd.setLast_calibration_date(data.getCORIOLIS_LD_CALIBRATION());
		}

		else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Last_calibration_date");
			opd.setLast_calibration_date(0);
//			System.out.println("Error In Last_calibration_date >> NOT MATCHING ... ");
		}

//		----------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
//			checkNull("TR_ND_CALIBRATION", data.getTR_ND_CALIBRATION());
			opd.setNext_calibration_date(data.getTR_ND_CALIBRATION());
		} else if (data.getMETERING_TYPE().equals("O")) {
//			checkNull("ORIFICE_ND_CALIBRATION", data.getORIFICE_ND_CALIBRATION());
			opd.setNext_calibration_date(data.getORIFICE_ND_CALIBRATION());
		}else if (data.getMETERING_TYPE().equals("U")) {
//			checkNull("USM_ND_CALIBRATION", data.getUSM_ND_CALIBRATION());
			opd.setNext_calibration_date(data.getUSM_ND_CALIBRATION());
		} else if (data.getMETERING_TYPE().equals("C")) {
//			checkNull("CORIOLIS_ND_CALIBRATION", data.getCORIOLIS_ND_CALIBRATION());
			opd.setNext_calibration_date(data.getCORIOLIS_ND_CALIBRATION());
		}else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Next_calibration_date");
			opd.setNext_calibration_date(0);
//			System.out.println("NEXT_CALIBRATION_DATA_COLUMN NOT MATCHING ...");
		}

//		------------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_CALIBRATION_AGENCY", data.getTR_CALIBRATION_AGENCY());
			opd.setDtl_of_calibration_agny(data.getTR_CALIBRATION_AGENCY());
		} else if (data.getMETERING_TYPE().equals("O")) {
			checkNull("ORIFICE_CALIBRATION_AGENCY", data.getORIFICE_CALIBRATION_AGENCY());
			opd.setDtl_of_calibration_agny(data.getORIFICE_CALIBRATION_AGENCY());
		}else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_CALIBRATION_AGENCY", data.getUSM_CALIBRATION_AGENCY());
			opd.setDtl_of_calibration_agny(data.getUSM_CALIBRATION_AGENCY());
		} else if (data.getMETERING_TYPE().equals("C")) {
			checkNull("CORIOLIS_CALIBRATION_AGENCY", data.getCORIOLIS_CALIBRATION_AGENCY());
			opd.setDtl_of_calibration_agny(data.getCORIOLIS_CALIBRATION_AGENCY());
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Dtl_of_calibration_agny");
			opd.setDtl_of_calibration_agny(0);
//			System.out.println("Error In dtl_of_calibration_agny >> NOT MATCHING PLEASE CHECKK...");
		}

//		----------------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_LD_METERTUBE_INSPECTION", data.getTR_LD_METERTUBE_INSPECTION());
			opd.setLast_date_tube_inspection(data.getTR_LD_METERTUBE_INSPECTION());
		} else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_LD_METERTUBE_INSPECTION", data.getUSM_LD_METERTUBE_INSPECTION());
			opd.setLast_date_tube_inspection(data.getUSM_LD_METERTUBE_INSPECTION());
		} else if (data.getMETERING_TYPE().equals("C")) {
			checkNull("CORIOLIS_LD_METER_TUBE_INSP", data.getCORIOLIS_LD_METER_TUBE_INSP());
			opd.setLast_date_tube_inspection(data.getCORIOLIS_LD_METER_TUBE_INSP());
		}

		else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Last_date_tube_inspection");
			opd.setLast_date_tube_inspection(0);
			// System.out.println("last_date_tube_insepction_COLUMN NOT MATCHING PLEASE
			// CHECKK...");
		}

//		else if (data.getMETERING_TYPE().equals("O"))
//		{
//			opd.setLast_date_tube_inspection(data.getORIFICE_LD_METERTUBE_INSPECTION());
//		}
//		else if (StringCheckCellValues(formatter.formatCellValue(row.getCell(14))).equals("C"))
//		{
//			opd.setLast_date_tube_inspection(StringCheckCellValues(formatter.formatCellValue(row.getCell(53))));
//		}
//		else if (StringCheckCellValues(formatter.formatCellValue(row.getCell(14))).equals("R"))
//		{
//			opd.setLast_date_tube_inspection(StringCheckCellValues(formatter.formatCellValue(row.getCell(53))));
//		}	

//		---------------------------------------------------------------------------------------------

//		---------------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_ND_METERTUBE_INSPECTION", data.getTR_ND_METERTUBE_INSPECTION());
			opd.setNext_date_tube_inspection(data.getTR_ND_METERTUBE_INSPECTION());
		} else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_ND_METERTUBE_INSPECTION", (data.getUSM_ND_METERTUBE_INSPECTION()));
			opd.setNext_date_tube_inspection(data.getUSM_ND_METERTUBE_INSPECTION());
		} else if (data.getMETERING_TYPE().equals("C")) {
			checkNull("CORIOLIS_ND_METER_TUBE_INSP", (data.getCORIOLIS_ND_METER_TUBE_INSP()));
			opd.setNext_date_tube_inspection(data.getCORIOLIS_ND_METER_TUBE_INSP());
		}else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Next_date_tube_inspection");
			opd.setNext_date_tube_inspection(0);
			// System.out.println("last_date_tube_insepction_COLUMN NOT MATCHING PLEASE
			// CHECKK...");
		}
//		else if (data.getMETERING_TYPE().equals("O"))
//		{
//			opd.setNext_date_tube_inspection(data.getORIFICE_ND_METERTUBE_INSPECTION());
//		}
//		else if (data.getMETERING_TYPE().equals("C"))
//		{
//			opd.setNext_date_tube_inspection(data.get);
//			
//		}
//		else if (data.getMETERING_TYPE().equals("R"))
//		{
//			opd.setNext_date_tube_inspection(data.get);
//		}

//		------------------------------------------------------------------------------------------

//			opd.setDate_inspection_data_update_fc(date_inspection_data_update_fc);		//mapping not done

//		------------------------------------------------------------------------------------------	

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_LD_ERROR_UPDATION", (data.getTR_LD_ERROR_UPDATION()));
			opd.setLast_error_curve(data.getTR_LD_ERROR_UPDATION());
		} else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_LD_ERROR_UPDATION", (data.getUSM_LD_ERROR_UPDATION()));
			opd.setLast_error_curve(data.getUSM_LD_ERROR_UPDATION());
		} else {
//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Last_error_curve");
			opd.setLast_error_curve(0);
			// System.out.println("last_error_curve_column NOT MATCHING PLEASE CHECKK...");
		}

//		--------------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_LD_METER_INTERNAL_INSP", (data.getTR_LD_METER_INTERNAL_INSP()));
			opd.setLast_meter_inspection(data.getTR_LD_METER_INTERNAL_INSP());
		} else if (data.getMETERING_TYPE().equals("O")) {
			checkNull("ORIFICE_LD_METER_INTERNAL_INSP", (data.getORIFICE_LD_METER_INTERNAL_INSP()));
			opd.setLast_meter_inspection(data.getORIFICE_LD_METER_INTERNAL_INSP());
		}

		else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_LD_METER_INTERNAL_INSP", (data.getUSM_LD_METER_INTERNAL_INSP()));
			opd.setLast_meter_inspection(data.getUSM_LD_METER_INTERNAL_INSP());
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Last_meter_inspection");
			opd.setLast_meter_inspection(0);
//			System.out.println("Error In LAST_METER_INSPECTION NOT MATCHING ");
		}

//		------------------------------------------------------------------------------------------

		if (data.getMETERING_TYPE().equals("O")) {
			checkNull("ORIFICE_ND_METER_INTERNAL_INSP", (data.getORIFICE_ND_METER_INTERNAL_INSP()));
			opd.setNext_meter_inspection(data.getORIFICE_ND_METER_INTERNAL_INSP());
		} else if (data.getMETERING_TYPE().equals("T") || data.getMETERING_TYPE().equals("R")) {
			checkNull("TR_ND_METER_INTERNAL_INSP", (data.getTR_ND_METER_INTERNAL_INSP()));
			opd.setNext_meter_inspection(data.getTR_ND_METER_INTERNAL_INSP());
		}
		else if (data.getMETERING_TYPE().equals("U")) {
			checkNull("USM_ND_METER_INTERNAL_INSP", (data.getUSM_ND_METER_INTERNAL_INSP()));
			opd.setNext_meter_inspection(data.getUSM_ND_METER_INTERNAL_INSP());
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Next_meter_inspection");

			opd.setNext_meter_inspection(0);
//			System.out.println("Error In next_meter_inspection >> DATA NOT MATCHING ");
		}

//		------------------------------------------------------------------------------------------

		opd.setLast_health_monitoring(data.getUSM_LD_HEALTH_MONITORING());

		opd.setNext_health_monitoring(data.getUSM_ND_HEALTH_MONITORING());

		if (data.getUSM_STREAM_CONFIGURED().equals("S")) {
			opd.setStream_configured(1);
		} else if (data.getUSM_STREAM_CONFIGURED().equals("P")) {
			opd.setStream_configured(2);
		} else if (data.getUSM_STREAM_CONFIGURED().equals("B")) {
			opd.setStream_configured(3);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Stream_configured");
			opd.setStream_configured(0);
		}
		if (data.getUSM_OP_CUST_TRAN_INVOICE().equals("S")) {
			opd.setOutput_custody(1);
		} else if (data.getUSM_OP_CUST_TRAN_INVOICE().equals("P")) {
			opd.setOutput_custody(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Output_custody");
			opd.setOutput_custody(0);
		}

		opd.setNext_sos_verification(data.getUSM_ND_SOS_VERIFICATION());

		opd.setLast_sos_verification(data.getUSM_LD_SOS_VERIFICATION());

//		opd.setConsumer(data.getHV_ASPERCONTRACT());
//		opd.setConsumer(consumer);

		
		
//		-------------------------------------------------------------------------------------------
		
		fcd.setStream_id(stream_id);
		fcd.setMmst_id(mmst_id);

		fcd.setStream_no(data.getSTREAM_INDEX());



		if (data.getFC_TYPE().equals("F")) {
			fcd.setType(2);
		} else if (data.getFC_TYPE().equals("C")) {
			fcd.setType(1);
		} else if (data.getFC_TYPE().equals("K")) {
			fcd.setType(3);
		} else if (data.getFC_TYPE().equals("R")) {
			fcd.setType(4);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Type");
			fcd.setType(0);
		}

//		--------------------------------------------------------------------------------------------

		fcd.setMake(data.getFC_MAKE());

		fcd.setModel(data.getFC_MODEL());

		if (data.getFC_POWER_SOURCE().equals("S")) {
			fcd.setPower_source_id(2);

		} else if (data.getFC_POWER_SOURCE().equals("U")) {

			fcd.setPower_source_id(3);
		} else if (data.getFC_POWER_SOURCE().equals("B")) {
			fcd.setPower_source_id(1);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Power_source_id");
			fcd.setPower_source_id(0);
		}
//		------------------------------------------------------------------------------------------

		fcd.setBp_value_as_per_contract(data.getBP_CONTRACT_VALUE());

		if (data.getBP_CONTRACT_UNIT().equals("Kpa a")) {
			fcd.setBp_unit_as_per_contract_id(4);
		} else if (data.getBP_CONTRACT_UNIT().equals("Kg/cm2 g")) {
			fcd.setBp_unit_as_per_contract_id(6);
		} else if (data.getBP_CONTRACT_UNIT().equals("Bar a")) {

			fcd.setBp_unit_as_per_contract_id(2);
		} else if (data.getBP_CONTRACT_UNIT().equals("Kg/cm2 a")) {
			fcd.setBp_unit_as_per_contract_id(1);
		} else if (data.getBP_CONTRACT_UNIT().equals("PSI")) {
			fcd.setBp_unit_as_per_contract_id(3);

		} else if (data.getBP_CONTRACT_UNIT().equals("Kpa g")) {
			fcd.setBp_unit_as_per_contract_id(5);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Bp_unit_as_per_contract_id");
			
			fcd.setBp_unit_as_per_contract_id(0);
		}

//		------------------------------------------------------------------------------------

		fcd.setBp_value_configured_in_fc(data.getBP_ASCONFIGURED_VALUE());

		if (data.getBP_ASCONFIGURED_UNIT().equals("Kpa a")) {
			fcd.setBp_unit_configured_in_fc_id(4);
		} else if (data.getBP_ASCONFIGURED_UNIT().equals("Kg/cm2 g")) {
			fcd.setBp_unit_configured_in_fc_id(6);
		} else if (data.getBP_ASCONFIGURED_UNIT().equals("Kg/cm2 a")) {
			fcd.setBp_unit_configured_in_fc_id(1);
		} else if (data.getBP_ASCONFIGURED_UNIT().equals("PSI")) {
			fcd.setBp_unit_configured_in_fc_id(3);
		} else if (data.getBP_ASCONFIGURED_UNIT().equals("Bar a")) {
			fcd.setBp_unit_configured_in_fc_id(2);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Bp_unit_configured_in_fc_id");
			
			fcd.setBp_unit_configured_in_fc_id(0);
		}

//		-----------------------------------------------------------------------------------------------------------	

		fcd.setBt_value_as_per_contract(data.getBT_CONTRACT_VALUE());

		if (data.getBT_CONTRACT_UNIT().equals("oC")) {
			fcd.setBt_unit_as_per_contract(1);

		} else if (data.getBT_CONTRACT_UNIT().equals("F")) {
			fcd.setBt_unit_as_per_contract(2);
		} else if (data.getBT_CONTRACT_UNIT().equals("K")) {
			fcd.setBt_unit_as_per_contract(3);
		} else if (data.getBT_CONTRACT_UNIT().equals("R")) {
			fcd.setBt_unit_as_per_contract(4);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Bt_unit_as_per_contract");
			fcd.setBt_unit_as_per_contract(0);
		}

//		--------------------------------------------------------------------------------------------------------	

		fcd.setBt_value_configured_in_fc(data.getBT_ASCONFIG_VALUE());

		if (data.getBT_ASCONFIG_UNIT().equals("oC")) {
			fcd.setBt_unit_as_configured_in_fc(1);

		} else if (data.getBT_ASCONFIG_UNIT().equals("F")) {
			fcd.setBt_unit_as_configured_in_fc(2);
		} else if (data.getBT_ASCONFIG_UNIT().equals("K")) {
			fcd.setBt_unit_as_configured_in_fc(3);
		} else if (data.getBT_ASCONFIG_UNIT().equals("R")) {
			fcd.setBt_unit_as_configured_in_fc(4);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Bt_unit_as_configured_in_fc");
			fcd.setBt_unit_as_configured_in_fc(0);
		}

//		--------------------------------------------------------------------------------------------------------	

//			fcd.setError_curve_file(error_curve_file);								//MAPPING NOT DONE..

		if (data.getAP_SOURCE_TYPE().equals("OTHER")) {

			fcd.setAp_source_id((2));

		} else if (data.getAP_SOURCE_TYPE().equals("Atmospheric Pressure Transmitter")) {
			fcd.setAp_source_id((1));
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Ap_source_id");
			fcd.setAp_source_id((0));
		}

//		--------------------------------------------------------------------------------------------------------	

		if (data.getAP_FREQ_OF_UPDATION().equals("Q")) {
			fcd.setAp_frequency_of_update(1);

		} else if (data.getAP_FREQ_OF_UPDATION().equals("M")) {
			fcd.setAp_frequency_of_update(2);

		} else if (data.getAP_FREQ_OF_UPDATION().equals("O"))

		{
			fcd.setAp_frequency_of_update(3);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Ap_frequency_of_update");
			fcd.setAp_frequency_of_update(0);

		}

		if (data.getAP_DATA_USED_FOR_UPDATION().equals("Q")) {
			fcd.setAp_data_used_for_update_in_fc(1);

		} else if (data.getAP_DATA_USED_FOR_UPDATION().equals("M")) {
			fcd.setAp_data_used_for_update_in_fc(2);

		} else if (data.getAP_DATA_USED_FOR_UPDATION().equals("O"))

		{
			fcd.setAp_data_used_for_update_in_fc(3);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Ap_data_used_for_update_in_fc");
			fcd.setAp_data_used_for_update_in_fc(0);

		}

		fcd.setAp_last_date_of_update_in_fc(data.getAP_LD_UPDATION());

		fcd.setAp_present_value(data.getAP_PRESENT_VALUE());
//		--------------------------------------------------------------------------------------------------

		if (data.getAP_PRESENT_UNIT().equals("Kg/cm2 a")) {
			fcd.setAp_unit_as_configured_in_fc(1);
		} else if (data.getAP_PRESENT_UNIT().equals("KPA a")) {
			fcd.setAp_unit_as_configured_in_fc(4);
		} else if (data.getAP_PRESENT_UNIT().equals("PSI")) {
			fcd.setAp_unit_as_configured_in_fc(3);
		} else if (data.getAP_PRESENT_UNIT().equals("BAR")) {
			fcd.setAp_unit_as_configured_in_fc(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Ap_unit_as_configured_in_fc");
			fcd.setAp_unit_as_configured_in_fc(0);
		}

//		-----------------------------------------------------------------------------------------------------	

		if (data.getCCM_ASPERCONTRACT().equals("AGA 8")) {

			fcd.setCcm_as_per_contract(1);

		} else if (data.getCCM_ASPERCONTRACT().equals("NIX 19")) {
			fcd.setCcm_as_per_contract(2);

		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Ccm_as_per_contract");
			fcd.setCcm_as_per_contract(0);
		}

//		----------------------------------------------------------------------------------------

		if (data.getCCM_ASCONFIGURED().equals("AGA 8 DETAILED METHOD")) {
			fcd.setCcm_as_configured_in_fc(1);
		} else if (data.getCCM_ASCONFIGURED().equals("AGA 8 GROSS I")) {
			fcd.setCcm_as_configured_in_fc(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Ccm_as_configured_in_fc");
			fcd.setCcm_as_configured_in_fc(0);
		}

//		---------------------------------------------------------------------------------------	

		fcd.setHvmm_as_per_contract(data.getHV_ASPERCONTRACT());

		// -----------------------------------------------------------------------------------------------

		if (data.getHV_ASCONFIGURED().equals("GPA 2172 WITH 2145")) {
			fcd.setHvmm_as_configured_in_fc(2);
		} else if (data.getHV_ASCONFIGURED().equals("ISO 6976")) {
			fcd.setHvmm_as_configured_in_fc(1);
		} else if (data.getHV_ASCONFIGURED().equals("ASTMD3588")) {
			fcd.setHvmm_as_configured_in_fc(3);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Hvmm_as_configured_in_fc");
			fcd.setHvmm_as_configured_in_fc(0);
		}



//			fcd.setPresent_values(0);											//it is not usable column say by: nitesh

		fcd.setAp_next_date_of_update_in_fc(data.getAP_ND_UPDATION());

//		public void EmdSet() {

		
//		--------------------------------------------------------------------------------------
		
		
		emd.setStream_id(stream_id);
		emd.setMmst_id(mmst_id);

		emd.setStream_no(data.getSTREAM_INDEX());

//		-------------------------------------------------------------------------------------------

		if (data.getGQ_DATASOURCE().equals("G")) {
			emd.setGas_quality_data_source(3);

		} else if (data.getGQ_DATASOURCE().equals("C")) {
			emd.setGas_quality_data_source(2);

		} else if (data.getGQ_DATASOURCE().equals("O")) // here O means ONLINE GC
		{
			emd.setGas_quality_data_source(1);
		} else if (data.getGQ_DATASOURCE().equals("S")) {
			emd.setGas_quality_data_source(4);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Gas_quality_data_source");
			emd.setGas_quality_data_source(0);
		}

//		--------------------------------------------------------------------------------------------	

		emd.setGas_quality_data_source_analysis_frequency(data.getGQ_FREQ());

		if (data.getGQ_DATA_USED().equals("FA")) {
			emd.setGas_quality_data_used_for_updation_in_fc(5);
		} else if (data.getGQ_DATA_USED().equals("FS")) {
			emd.setGas_quality_data_used_for_updation_in_fc(4);
		} else if (data.getGQ_DATA_USED().equals("C")) {
			emd.setGas_quality_data_used_for_updation_in_fc(1);
		} else if (data.getGQ_DATA_USED().equals("OTHER")) {
			emd.setGas_quality_data_used_for_updation_in_fc(6);
		} else if (data.getGQ_DATA_USED().equals("DA")) {
			emd.setGas_quality_data_used_for_updation_in_fc(3);
		} else if (data.getGQ_DATA_USED().equals("DS")) {
			emd.setGas_quality_data_used_for_updation_in_fc(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Gas_quality_data_used_for_updation_in_fc");
			emd.setGas_quality_data_used_for_updation_in_fc(0);
		}

//		-------------------------------------------------------------------------------------------------------

		emd.setGas_quality_data_updation_frequency_in_fc(data.getGQ_UPDATE_FREQ());
//		-------------------------------------------------------------------------------------------------------

		if (data.getGQ_UPDATE_METHOD().equals("M")) {
			emd.setGas_quality_data_method_of_updation_in_fc(3);
		} else if (data.getGQ_UPDATE_METHOD().equals("O")) {
			emd.setGas_quality_data_method_of_updation_in_fc(3);
		} else if (data.getGQ_UPDATE_METHOD().equals("S")) {
			emd.setGas_quality_data_method_of_updation_in_fc(2);
		} else if (data.getGQ_UPDATE_METHOD().equals("OTHER")) {
			emd.setGas_quality_data_method_of_updation_in_fc(4);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Gas_quality_data_method_of_updation_in_fc");
			emd.setGas_quality_data_method_of_updation_in_fc(0);
		}

		emd.setLaboratory_details(data.getLAB_DETAILS());

		emd.setValidity_date(data.getVALIDITY_DATE());
//		------------------------------------------------------------------------------------------------------------

		if (data.getCOMP_COVERED().equals("HC6")) {
			emd.setGas_components_covered(1);
		} else if (data.getCOMP_COVERED().equals("HC9")) {
			emd.setGas_components_covered(2);
		} else if (data.getCOMP_COVERED().equals("OTHER")) {
			emd.setGas_components_covered(3);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Gas_components_covered");
			emd.setGas_components_covered(0);
		}

//		=====================================================================================================

//		public void SidSet() {

		sid.setStream_id(stream_id);

		sid.setStream_no(data.getSTREAM_INDEX());

		sid.setMmst_id(mmst_id);

		if (data.getJOINT_CALI_FREQ().equals("Q")) {
			sid.setFc_joint_calibration_frequency(1);

		} else if (data.getJOINT_CALI_FREQ().equals("M")) {
			sid.setFc_joint_calibration_frequency(2);
		} else if (data.getJOINT_CALI_FREQ().equals("O")) {
			sid.setFc_joint_calibration_frequency(3);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL,"Fc_joint_calibration_frequency");
			sid.setFc_joint_calibration_frequency(0);
		}

		sid.setFc_date_of_last_calibration(data.getLD_CALIBRATION());

		sid.setFc_next_calibration_date(data.getNEXT_CALIBRATION_DATE());

		// sid.setPt_type(data.getPT_TYPE());
		if (data.getPT_TYPE().equals("E")) {
			sid.setPt_type(1);
		} else if (data.getPT_TYPE().equals("I")) {
			sid.setPt_type(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Pt_type");
			sid.setPt_type(0);
		}

		sid.setPt_make(data.getPT_MAKE());

		sid.setPt_model(data.getPT_MODEL());

		sid.setPt_accuracy(data.getPT_ACCURACY());

//		sid.setPt_calibration_data_upload(pt_calibration_data_upload);			//excel mapping not done ...

		sid.setDpt_type(data.getDIFF_PT_TYPE());

		sid.setDpt_make(data.getDIFF_PT_MAKE());

		sid.setDpt_model(data.getDIFF_PT_MODEL());

		sid.setDpt_accuracy(data.getDIFF_PT_ACCURACY());

//			sid.setDpt_calibration_data_upload(dpt_calibration_data_upload); 		// excel mapping not done ...

//			sid.setTt_temperature_input_to_flow_computer(data.getTEMP_INP_TO_FC());	// value not mapping ..

		sid.setTt_make(data.getTEMP_MAKE());

		sid.setTt_model(data.getTEMP_MODEL());

		sid.setTt_accuracy(data.getTEMP_ACCURACY());

//			sid.setTt_calibration_data_upload(tt_calibration_data_upload);			//excel mapping not done 

		sid.setRtd_type(data.getRTD_TYPE());

		if (data.getRTD_CLASS().equals("A")) {
			sid.setRtd_class(1);

		} else if (data.getRTD_CLASS().equals("B")) {

			sid.setRtd_class(2);
		} else {

//			throw new ServerApplicationException("en", ServerApplicationException.CHECK_NULL, "Rtd_class");
			sid.setRtd_class(0);

		}
		// sid.setRtd_class(data.getRTD_CLASS());

		sid.setRtd_make(data.getRTD_MAKE());

		sid.setRtd_model(data.getRTD_MODEL());

		sid.setRtd_date_of_last_calibration(data.getRTD_LD_CALIBRATION());
//			sid.setRtd_next_calibration_due_date(rtd_next_calibration_due_date);		// excel mapping not done

//		----------------------------------------------------------------------------------

		if (data.getIS_BARRIER_INSTALLED().equals("YES")) {
			sid.setBi_barrier_installed(1);
		} else if (data.getIS_BARRIER_INSTALLED().equals("NO")) {
			sid.setBi_barrier_installed(2);
		} else {

//			throw new ServerApplicationException("en", 100001, "Bi_barrier_installed");
			sid.setBi_barrier_installed(0);
		}

		// --------------------------------------------------------------------------------------------

		sid.setBi_primary_meter_frequency_range(data.getFB_PM_FREQ_RANGE());

		sid.setBi_installed_barrier_frequency_range(data.getBARRIER_FREQ_RANGE());

		sid.setBi_date_of_last_simulation(data.getLD_SIMULATION());

//			sid.setBi_next_simulation_due_date(bi_next_simulation_due_date);					// excel mapping not done

		System.out.println(fcd);
		mmstDAOI.insertFlowComputerData(fcd);
		System.out.println(opd);
		mmstDAOI.insertOrificeData(opd);
		System.out.println(emd);
		mmstDAOI.insertEnergyMeasurementDetails(emd);
		System.out.println(sid);
		mmstDAOI.insertSecInstDetails(sid);

		MmstResponse mmstResponse = new MmstResponse();
		mmstResponse.setDataInserted(1);
		mmstResponse.setMmstId(mmst_id);
		return mmstResponse;
	}

//		public String StringCheckCellValues(String cellValue) {
//			String returnValue = null;
//			if("NA".equals(cellValue)||"".equals(cellValue.trim())) {
//				returnValue = "0";
//			}else{
//				returnValue = cellValue;
//				
//			}
//			
//			return returnValue;
//		}

}

//checkNull("CONSUMER_NAME", data.getCONSUMER_NAME());

//checkNull("DESIGN_CAPACITY", data.getDESIGN_CAPACITY());
//checkInteger("DESIGN_CAPACITY", data.getDESIGN_CAPACITY());

//checkNull("AVG_PRESSURE", data.getAVG_PRESSURE());
//checkInteger("AVG_PRESSURE", data.getAVG_PRESSURE());

//checkNull("AVG_TEMP", data.getAVG_TEMP());
//checkInteger("AVG_TEMP", data.getAVG_TEMP());

//checkNull("AVG_DAILY_CONSUMPTION", data.getAVG_DAILY_CONSUMPTION());
//checkInteger("AVG_DAILY_CONSUMPTION", data.getAVG_DAILY_CONSUMPTION());

//checkNull("NO_OF_STREAM", data.getNO_OF_STREAM());
//checkInteger("NO_OF_STREAM", data.getNO_OF_STREAM());

//checkNull("CONFIGURATION", data.getCONFIGURATION());
//checkNull("MM_REMARKS", data.getMM_REMARKS());

//BELOW CODE FOR PRIMARY METER DATA 

//checkNull("PRIMARY_MAKE", data.getPRIMARY_MAKE());
//
//checkNull("PRIMARY_MODEL", data.getPRIMARY_MODEL());
//
//checkNull("KFACTOR", data.getKFACTOR());
//checkDouble("KFACTOR", data.getKFACTOR());

//checkNull("PRIMARY_TAG_NO", data.getPRIMARY_TAG_NO());
//
//checkNull("PRIMARY_SERIAL_NO", data.getPRIMARY_SERIAL_NO());
//
//checkNull("PRIMARY_METER_SIZE", data.getPRIMARY_METER_SIZE());
//checkDouble("PRIMARY_METER_SIZE", data.getPRIMARY_METER_SIZE());

//checkNull("PRIMARY_PRESSURE_CLASS", data.getPRIMARY_PRESSURE_CLASS());
//
//checkNull("PRIMARY_G_RATING", data.getPRIMARY_G_RATING());
//
//checkNull("PRIMARY_Q_MAX", data.getPRIMARY_Q_MAX());
//checkDouble("PRIMARY_Q_MAX", data.getPRIMARY_Q_MAX());

//checkNull("PRIMARY_Q_MIN", data.getPRIMARY_Q_MIN());
//checkDouble("PRIMARY_Q_MIN", data.getPRIMARY_Q_MIN());

//checkNull("PRIMARY_ORIFICE_DIA", data.getPRIMARY_ORIFICE_DIA());
//checkDouble("PRIMARY_ORIFICE_DIA", data.getPRIMARY_ORIFICE_DIA());

//checkNull("PRIMARY_TUBE_DIAMETER", data.getPRIMARY_TUBE_DIAMETER());
//checkDouble("PRIMARY_TUBE_DIAMETER", data.getPRIMARY_TUBE_DIAMETER());

//checkNull("CONNECTIVITY", data.getCONNECTIVITY());

//BELOW CODE FOR ORIFACE PLATE DATA....

//checkNull("USM_LD_HEALTH_MONITORING", data.getUSM_LD_HEALTH_MONITORING());

//checkNull("USM_ND_HEALTH_MONITORING", data.getUSM_ND_HEALTH_MONITORING());

//checkNull("USM_STREAM_CONFIGURED", data.getUSM_STREAM_CONFIGURED());

//checkNull("USM_OP_CUST_TRAN_INVOICE", data.getUSM_OP_CUST_TRAN_INVOICE());

//checkNull("USM_ND_SOS_VERIFICATION", data.getUSM_ND_SOS_VERIFICATION());

//checkNull("USM_LD_SOS_VERIFICATION", data.getUSM_LD_SOS_VERIFICATION());

//checkNull("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());
//checkInteger("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());

//BELOW CODE  FOR FLOW COMPUTER DATA

//checkNull("STREAM_INDEX", data.getSTREAM_INDEX());
//checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());

//checkNull("FC_TYPE", data.getFC_TYPE());

//checkNull("FC_MAKE", data.getFC_MAKE());
//
//checkNull("FC_MODEL", data.getFC_MODEL());
//
//checkNull("FC_POWER_SOURCE", data.getFC_POWER_SOURCE());
//
//checkNull("BP_CONTRACT_VALUE", data.getBP_CONTRACT_VALUE());
//checkDouble("BP_CONTRACT_VALUE", data.getBP_CONTRACT_VALUE());

//checkNull("BP_CONTRACT_UNIT", data.getBP_CONTRACT_UNIT());
//
//checkNull("BP_ASCONFIGURED_VALUE", data.getBP_ASCONFIGURED_VALUE());
//checkDouble("BP_ASCONFIGURED_VALUE", data.getBP_ASCONFIGURED_VALUE());

//checkNull("BP_ASCONFIGURED_UNIT", data.getBP_ASCONFIGURED_UNIT());
//
//checkNull("BT_CONTRACT_VALUE", data.getBT_CONTRACT_VALUE());
//checkDouble("BT_CONTRACT_VALUE", data.getBT_CONTRACT_VALUE());

//checkNull("BT_CONTRACT_UNIT", data.getBT_CONTRACT_UNIT());

//checkDouble("BT_ASCONFIG_VALUE", data.getBT_ASCONFIG_VALUE());
//checkNull("BT_ASCONFIG_VALUE", data.getBT_ASCONFIG_VALUE());
//
//checkNull("BT_ASCONFIG_UNIT", data.getBT_ASCONFIG_UNIT());
//
//checkNull("AP_SOURCE_TYPE", data.getAP_SOURCE_TYPE());
//
//checkNull("AP_FREQ_OF_UPDATION", data.getAP_FREQ_OF_UPDATION());
//
//checkNull("AP_DATA_USED_FOR_UPDATION", data.getAP_DATA_USED_FOR_UPDATION());
//
//checkNull("AP_LD_UPDATION", data.getAP_LD_UPDATION());

//checkDouble("AP_PRESENT_VALUE", data.getAP_PRESENT_VALUE());
//checkNull("AP_PRESENT_VALUE", data.getAP_PRESENT_VALUE());
//
//checkNull("AP_PRESENT_UNIT", data.getAP_PRESENT_UNIT());
//
//checkNull("CCM_ASPERCONTRACT", data.getCCM_ASPERCONTRACT());
//
//checkNull("CCM_ASCONFIGURED", data.getCCM_ASCONFIGURED());

//checkInteger("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());
//checkNull("HV_ASPERCONTRACT", data.getHV_ASPERCONTRACT());
//
//checkNull("HV_ASCONFIGURED", data.getHV_ASCONFIGURED());
//
//checkNull("AP_ND_UPDATION", data.getAP_ND_UPDATION());
//
//checkNull("STREAM_INDEX", data.getSTREAM_INDEX());
//checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());

//checkNull("GQ_DATASOURCE", data.getGQ_DATASOURCE());
//
//checkNull("GQ_FREQ", data.getGQ_FREQ());
//
//checkNull("GQ_DATA_USED", data.getGQ_DATA_USED());
//
//checkNull("GQ_UPDATE_FREQ", data.getGQ_UPDATE_FREQ());
//
//checkNull("GQ_UPDATE_METHOD", data.getGQ_UPDATE_METHOD());
//
//checkNull("LAB_DETAILS", data.getLAB_DETAILS());
//
//checkNull("VALIDITY_DATE", data.getVALIDITY_DATE());
//
//checkNull("COMP_COVERED", data.getCOMP_COVERED());
//
//checkNull("STREAM_INDEX", data.getSTREAM_INDEX());
//checkInteger("STREAM_INDEX", data.getSTREAM_INDEX());

//checkNull("JOINT_CALI_FREQ", data.getJOINT_CALI_FREQ());
//
//checkNull("LD_CALIBRATION", data.getLD_CALIBRATION());
//
//checkNull("NEXT_CALIBRATION_DATE", data.getNEXT_CALIBRATION_DATE());
//
//checkNull("PT_TYPE", data.getPT_TYPE());
//
//checkNull("PT_MAKE", data.getPT_MAKE());
//
//checkNull("PT_MODEL", data.getPT_MODEL());
//
//checkNull("PT_ACCURACY", data.getPT_ACCURACY());
//
//checkNull("DIFF_PT_TYPE", data.getDIFF_PT_TYPE());
//
//checkNull("DIFF_PT_MAKE", data.getDIFF_PT_MAKE());
//
//checkNull("DIFF_PT_MODEL", data.getDIFF_PT_MODEL());
//
//checkNull("DIFF_PT_ACCURACY", data.getDIFF_PT_ACCURACY());
//
//checkNull("TEMP_MAKE", data.getTEMP_MAKE());
//
//checkNull("TEMP_MODEL", data.getTEMP_MODEL());
//
//checkNull("TEMP_ACCURACY", data.getTEMP_ACCURACY());
//
//checkNull("RTD_TYPE", data.getRTD_TYPE());
//checkInteger("RTD_TYPE", data.getRTD_TYPE());

//checkNull("RTD_CLASS", data.getRTD_CLASS());
//
//checkNull("RTD_MAKE", data.getRTD_MAKE());
//
//checkNull("RTD_MODEL", data.getRTD_MODEL());
//
//checkNull("RTD_LD_CALIBRATION", data.getRTD_LD_CALIBRATION());
//
//checkNull("IS_BARRIER_INSTALLED", data.getIS_BARRIER_INSTALLED());
//
//checkNull("FB_PM_FREQ_RANGE", data.getFB_PM_FREQ_RANGE());
//checkNull("BARRIER_FREQ_RANGE", data.getBARRIER_FREQ_RANGE());
//checkNull("LD_SIMULATION", data.getLD_SIMULATION());