package com.mass.service;

import java.io.IOException;

//import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.mass.config.WebConfig;
import com.mass.dao.DAOI;
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
		public  MmstService() throws IOException {
		super();
		WebConfig webconfig = new WebConfig();
		dbschema = webconfig.getPropValues();
	}

		public  MmstResponse MmstProcess(ExcelColumn data)
		{	
			
			MMST_DB mmst = new MMST_DB();
			PrimaryMeterData pmd = new PrimaryMeterData();
			OrificePlateData opd  = new OrificePlateData();
			FlowComputerData fcd = new FlowComputerData();
			Energy_measurement_details emd = new Energy_measurement_details();
			Secondary_instrument_details sid = new Secondary_instrument_details();
			
			
			mmst.setStation_id(mmstDAOI.getStationID(data.getSAP_ID()));
			mmst.setPipelinemst_id(mmstDAOI.getPipeLineMaster(data.getREGION()));
			mmst.setMaintenance_base_id(mmstDAOI.getMaintenaceBaseID(data.getMAINT_BASE()));
			
			
			if (data.getPROCESS_FLUID().equals("D"))
			{
				mmst.setProcess_fluid_id(1);
				
			} 
			else if (data.getPROCESS_FLUID().equals("W"))
			{
				mmst.setProcess_fluid_id(2);
			}
			else 
			{
				mmst.setProcess_fluid_id(0);
			}
			
			if(data.getMETERING_TYPE().equals("O"))
			{
			mmst.setMetering_type_id(1);
			}
			else if (data.getMETERING_TYPE().equals("T"))
			{
				mmst.setMetering_type_id(2);
			}
			else if (data.getMETERING_TYPE().equals("R"))
			{
				mmst.setMetering_type_id(3);
			}
			else if (data.getMETERING_TYPE().equals("U"))
			{
				mmst.setMetering_type_id(4);
			}
			else if (data.getMETERING_TYPE().equals("C"))
			{
				mmst.setMetering_type_id(5);
			}else {
				
				mmst.setMetering_type_id(0);
			
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
			
			
			int mmst_id = mmstDAOI.insertMData(mmst);
			
			
		
//		public void PmdSet() {
			
			
			pmd.setStream_no(data.getSTREAM_INDEX());
			pmd.setMmst_id(mmst_id);
			pmd.setMake(data.getPRIMARY_MAKE());
			pmd.setModel(data.getPRIMARY_MODEL());


			if (data.getMETERING_TYPE().equals("O")){
				pmd.setMeter_type(1);
				}else if (data.getMETERING_TYPE().equals("T"))
				{
					pmd.setMeter_type(2);
				}
				else if (data.getMETERING_TYPE().equals("R"))
				{
					pmd.setMeter_type(3);
				}else if (data.getMETERING_TYPE().equals("U"))
				{
					pmd.setMeter_type(4);
				}else if  (data.getMETERING_TYPE().equals("C"))
				{
					pmd.setMeter_type(5);
				}else 
				{
					pmd.setMeter_type(0);
				}
			
			
			
			pmd.setK_factor(data.getKFACTOR());
			pmd.setTag_no(data.getPRIMARY_TAG_NO());
			pmd.setSerial_no(data.getPRIMARY_SERIAL_NO());
			pmd.setMeter_size(data.getPRIMARY_METER_SIZE());
			pmd.setPressure_class(data.getPRIMARY_PRESSURE_CLASS());
			pmd.setG_rating(data.getPRIMARY_G_RATING());
			pmd.setQ_max(data.getPRIMARY_Q_MAX());
			pmd.setQ_min(data.getPRIMARY_Q_MIN());
			pmd.setOrifice_diameter(data.getPRIMARY_ORIFICE_DIA());
			pmd.setMeter_tube_pipeline_dia(data.getPRIMARY_TUBE_DIAMETER());


			if (data.getCONNECTIVITY().equals("OTHER"))
			{
			pmd.setConnectivity_id(5);
			}else if(data.getCONNECTIVITY().equals("OFC"))	
			{
				pmd.setConnectivity_id(1);
			}else if (data.getCONNECTIVITY().equals("GPRS"))
			{
				pmd.setConnectivity_id(2);
			}else if (data.getCONNECTIVITY().equals("GSM"))
			{
				pmd.setConnectivity_id(3);
			}else if (data.getCONNECTIVITY().equals("NONE"))
			{
				pmd.setConnectivity_id(4);
				
			}else 
			{
				pmd.setConnectivity_id(0);
				
			}
			
//			pmd.setConsumer(consumer);
//			pmd.setFc_id(fc_id);
			
			
			int stream_id = mmstDAOI.insertPrimarydata(pmd);
			
		
//		public void OpdSet() {
			
			
//			opd.setStream_id(stream_id);
//			opd.setMmst_id(mmst_id);
			opd.setStream_no(data.getSTREAM_INDEX());
			
//		----------------------------------------------------------------------------------------	
			if (data.getMETERING_TYPE().equals("T"))
			{
			opd.setLast_calibration_date(data.getTR_LD_CALIBRATION());
			}
		else if (data.getMETERING_TYPE().equals("O"))
			{
			
			opd.setLast_calibration_date(data.getORIFICE_LD_CALIBRATION());
			
			}
		else if (data.getMETERING_TYPE().equals("U"))
			{
			opd.setLast_calibration_date(data.getUSM_LD_CALIBRATION());
			}
		
		else {  System.out.println("Error In Last_calibration_date >> NOT MATCHING ... ");
			
			
//		----------------------------------------------------------------------------------------
		
		
		if (data.getMETERING_TYPE().equals("T")) 
		{
		opd.setNext_calibration_date(data.getTR_ND_CALIBRATION());
		}
		else if (data.getMETERING_TYPE().equals("O"))
		{
			opd.setNext_calibration_date(data.getORIFICE_ND_CALIBRATION());
		}

		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setLast_calibration_date(data.getUSM_ND_CALIBRATION());
		}
		else 
		{  
			System.out.println("NEXT_CALIBRATION_DATA_COLUMN NOT MATCHING ..."); 
		}
		
//		------------------------------------------------------------------------------------------

		
		if (data.getMETERING_TYPE().equals("T")) 
		{
			opd.setDtl_of_calibration_agny(data.getTR_CALIBRATION_AGENCY());
		}
		else if (data.getMETERING_TYPE().equals("O"))
		{
			opd.setDtl_of_calibration_agny(data.getORIFICE_CALIBRATION_AGENCY());
		}

		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setDtl_of_calibration_agny(data.getUSM_CALIBRATION_AGENCY());
		}
		else 
		{  
			System.out.println("Error In dtl_of_calibration_agny >> NOT MATCHING PLEASE CHECKK..."); 
		}
		
		
//		----------------------------------------------------------------------------------------------
		



		if (data.getMETERING_TYPE().equals("T")) 
		{
			opd.setLast_date_tube_inspection(data.getTR_LD_METERTUBE_INSPECTION());
		}
		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setLast_date_tube_inspection(data.getUSM_LD_METERTUBE_INSPECTION());
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
		else 
		{  
			
			System.out.println("Error In last_date_tube_insepction  NOT MATCHING "); 
		}
		

//		---------------------------------------------------------------------------------------------
		
//		---------------------------------------------------------------------------------------------

		
		if (data.getMETERING_TYPE().equals("T")) 
		{
			opd.setNext_date_tube_inspection(data.getTR_ND_METERTUBE_INSPECTION());
		}
		else if ( data.getMETERING_TYPE().equals("U"))
		{
			opd.setNext_date_tube_inspection(data.getUSM_ND_METERTUBE_INSPECTION());
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
		
		else 
		{  
			System.out.println("Error in next_date_tube_insepction NOT MATCHING "); 
		}	
			
//		------------------------------------------------------------------------------------------
		
//			opd.setDate_inspection_data_update_fc(date_inspection_data_update_fc);		//mapping not done
		
//		------------------------------------------------------------------------------------------	
		
		if (data.getMETERING_TYPE().equals("T")) 
		{
			opd.setLast_error_curve(data.getTR_LD_ERROR_UPDATION());
		}
		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setLast_error_curve(data.getUSM_LD_ERROR_UPDATION());
		}				
		else 
		{  
			System.out.println("Error In last_error_curve_column NOT MATCHING"); 
		}
			
		
//		--------------------------------------------------------------------------------------------
		
		if (data.getMETERING_TYPE().equals("T")) 
		{
			opd.setLast_meter_inspection(data.getTR_LD_METER_INTERNAL_INSP());
		}
		else if (data.getMETERING_TYPE().equals("O"))
		{
			opd.setLast_meter_inspection(data.getORIFICE_LD_METER_INTERNAL_INSP());
		}                        

		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setLast_meter_inspection(data.getUSM_LD_METER_INTERNAL_INSP());
		}
		else 
		{  
			System.out.println("Error In LAST_METER_INSPECTION NOT MATCHING "); 
		}
		
//		------------------------------------------------------------------------------------------
		
		if (data.getMETERING_TYPE().equals("O")) 
		{
			opd.setNext_meter_inspection(data.getORIFICE_ND_METER_INTERNAL_INSP());
		}
		else if (data.getMETERING_TYPE().equals("T"))
		{
			opd.setNext_meter_inspection(data.getTR_ND_METER_INTERNAL_INSP());
		}

		else if (data.getMETERING_TYPE().equals("U"))
		{
			opd.setNext_meter_inspection(data.getUSM_ND_METER_INTERNAL_INSP());
		}
		else 
		{  
			System.out.println("Error In next_meter_inspection >> DATA NOT MATCHING "); 
		}
		
//		------------------------------------------------------------------------------------------
		opd.setLast_health_monitoring(data.getUSM_LD_HEALTH_MONITORING());
		opd.setNext_health_monitoring(data.getUSM_ND_HEALTH_MONITORING());
		opd.setStream_configured(data.getUSM_STREAM_CONFIGURED());
		opd.setOutput_custody(data.getUSM_ND_SOS_VERIFICATION());
		opd.setNext_sos_verification(data.getUSM_ND_SOS_VERIFICATION());
		opd.setLast_sos_verification(data.getUSM_LD_SOS_VERIFICATION());
//		opd.setConsumer(consumer);
			

		
		
		
//		public void FcdSet() {
			
			
			
			fcd.setStream_id(stream_id);
			fcd.setMmst_id(mmst_id);
			fcd.setStream_no(data.getSTREAM_INDEX());
			
//		-------------------------------------------------------------------------------------------
			
			if (data.getFC_TYPE().equals("F")){
				fcd.setType(2);
			}else if (data.getFC_TYPE().equals("C"))
			{
				fcd.setType(1);
			}else if (data.getFC_TYPE().equals("K"))
			{
				fcd.setType(3);
			}else if (data.getFC_TYPE().equals("R"))
			{
				fcd.setType(4);
				
			}else 
			{
				fcd.setType(0);
			}

//		--------------------------------------------------------------------------------------------
			
			
			fcd.setMake(data.getFC_MAKE());
			fcd.setModel(data.getFC_MODEL());
			
			
			if (data.getFC_POWER_SOURCE().equals("S")){
				fcd.setPower_source_id(2);	
				
			}else if (data.getFC_POWER_SOURCE().equals("U")) {
				
				fcd.setPower_source_id(3);
			}else if (data.getFC_POWER_SOURCE().equals("B")) 
			{
				fcd.setPower_source_id(1);
				
			}else 
			{
				fcd.setPower_source_id(0);
			}
//		------------------------------------------------------------------------------------------
		
			
			fcd.setBp_value_as_per_contract(data.getBP_CONTRACT_VALUE());
			
			if (data.getBP_CONTRACT_UNIT().equals("Kpa a"))
			{
				fcd.setBp_unit_as_per_contract_id(4);
			} else  if (data.getBP_CONTRACT_UNIT().equals("Kg/cm2 g"))
			{
				fcd.setBp_unit_as_per_contract_id(6);
			}
			else if (data.getBP_CONTRACT_UNIT().equals("Bar a"))
			{	
				
				fcd.setBp_unit_as_per_contract_id(2);
			}else if (data.getBP_CONTRACT_UNIT().equals("Kg/cm2 a"))
			{
				fcd.setBp_unit_as_per_contract_id(1);
			}
			else if (data.getBP_CONTRACT_UNIT().equals("PSI"))
			{
				fcd.setBp_unit_as_per_contract_id(3);
				
			}else if (data.getBP_CONTRACT_UNIT().equals("Kpa g"))
			{
				fcd.setBp_unit_as_per_contract_id(5);
			}else 
			{
				fcd.setBp_unit_as_per_contract_id(0);
			}


//		------------------------------------------------------------------------------------
			
			
			fcd.setBp_value_configured_in_fc(data.getBP_ASCONFIGURED_VALUE());
			
			if (data.getBP_ASCONFIGURED_UNIT().equals("Kpa a"))
			 {
				 fcd.setBp_unit_configured_in_fc_id(4);
			 }else if (data.getBP_ASCONFIGURED_UNIT().equals("Kg/cm2 g"))
			 {
				 fcd.setBp_unit_configured_in_fc_id(6);
			 }else if (data.getBP_ASCONFIGURED_UNIT().equals("Kg/cm2 a"))
			 {
				 fcd.setBp_unit_configured_in_fc_id(1);
			 }else if (data.getBP_ASCONFIGURED_UNIT().equals("PSI"))
			 {
				 fcd.setBp_unit_configured_in_fc_id(3);
			 }else if (data.getBP_ASCONFIGURED_UNIT().equals("Bar a"))
			 {
				 fcd.setBp_unit_configured_in_fc_id(2);
				 
			 }else {
				 
				 fcd.setBp_unit_configured_in_fc_id(0);
			 }

//		-----------------------------------------------------------------------------------------------------------	
			
			fcd.setBt_value_as_per_contract(data.getBT_CONTRACT_VALUE());
			
			
			if(data.getBT_CONTRACT_UNIT().equals("oC"))
				{
					fcd.setBt_unit_as_per_contract(1);
					
				}else if (data.getBT_CONTRACT_UNIT().equals("F"))
				{
					fcd.setBt_unit_as_per_contract(2);
				}else if (data.getBT_CONTRACT_UNIT().equals("K")) 
				{
					fcd.setBt_unit_as_per_contract(3);
				}else if (data.getBT_CONTRACT_UNIT().equals("R"))
				{
					fcd.setBt_unit_as_per_contract(4);
				}else 
				{
					fcd.setBt_unit_as_per_contract(0);
				}

//		--------------------------------------------------------------------------------------------------------	
			
			fcd.setBt_value_configured_in_fc(data.getBT_ASCONFIG_VALUE());
			
			if(	data.getBT_ASCONFIG_UNIT().equals("oC"))
			{
				fcd.setBt_unit_as_configured_in_fc(1);
			
			}else if (data.getBT_ASCONFIG_UNIT().equals("F"))
			{
				fcd.setBt_unit_as_configured_in_fc(2);
			}else if (data.getBT_ASCONFIG_UNIT().equals("K")) 
			{
				fcd.setBt_unit_as_configured_in_fc(3);
			}else if (data.getBT_ASCONFIG_UNIT().equals("R"))
			{
				fcd.setBt_unit_as_configured_in_fc(4);
			}else 
			{
				
				fcd.setBt_unit_as_configured_in_fc(0);
			}

//		--------------------------------------------------------------------------------------------------------	
			
//			fcd.setError_curve_file(error_curve_file);								//MAPPING NOT DONE..
			
			if (data.getAP_SOURCE_TYPE().equals("OTHER"))
			{
			 
				fcd.setAp_source_id((2));
				
			}else if (data.getAP_SOURCE_TYPE().equals("Atmospheric Pressure Transmitter"))
			{
				fcd.setAp_source_id((1));
			}else {
				fcd.setAp_source_id((0));
				}
			
//		--------------------------------------------------------------------------------------------------------	
			
			if (data.getAP_FREQ_OF_UPDATION().equals("Q"))
			{
			fcd.setAp_frequency_of_update(1);
			
			}else if (data.getAP_FREQ_OF_UPDATION().equals("M"))
			{
				fcd.setAp_frequency_of_update(2);
				
			} 
			else if (data.getAP_FREQ_OF_UPDATION().equals("O"))
			
			{
				fcd.setAp_frequency_of_update(3);
				
			}else 
			{
				fcd.setAp_frequency_of_update(0);
				
			}

			
			if (data.getAP_DATA_USED_FOR_UPDATION().equals("Q"))
			{
				fcd.setAp_data_used_for_update_in_fc(1);
			
			}else if (data.getAP_DATA_USED_FOR_UPDATION().equals("M"))
			{
				fcd.setAp_data_used_for_update_in_fc(2);
				
			} 
			else if (data.getAP_DATA_USED_FOR_UPDATION().equals("O"))
			
			{
				fcd.setAp_data_used_for_update_in_fc(3);
				
			}else 
			{
				fcd.setAp_data_used_for_update_in_fc(0);
				
			}
			
			
			fcd.setAp_last_date_of_update_in_fc(data.getAP_LD_UPDATION());
			fcd.setAp_present_value(data.getAP_PRESENT_VALUE());
//		--------------------------------------------------------------------------------------------------
			
			if (data.getAP_PRESENT_UNIT().equals("Kg/cm2 a"))
			{
			fcd.setAp_unit_as_configured_in_fc(1);
			}
			else if (data.getAP_PRESENT_UNIT().equals("KPA a"))
			{
				fcd.setAp_unit_as_configured_in_fc(4);
			}else if (data.getAP_PRESENT_UNIT().equals("PSI"))
			{
				fcd.setAp_unit_as_configured_in_fc(3);
			}
			else if (data.getAP_PRESENT_UNIT().equals("BAR"))
			{
				fcd.setAp_unit_as_configured_in_fc(2);
			}
				else 
			{
					fcd.setAp_unit_as_configured_in_fc(0);	
			}
			
			
//		-----------------------------------------------------------------------------------------------------	

			if (data.getCCM_ASPERCONTRACT().equals("AGA 8")) 
			{
				
				fcd.setCcm_as_per_contract(1);
				
			}
			else if (data.getCCM_ASPERCONTRACT().equals("NIX 19"))
			{
				fcd.setCcm_as_per_contract(2);
					
			}
			 else 
			{
				 fcd.setCcm_as_per_contract(0);
			}

//		----------------------------------------------------------------------------------------
			
			
			if(data.getCCM_ASCONFIGURED().equals("AGA 8 DETAILED METHOD"))
			{
			fcd.setCcm_as_configured_in_fc(1);
			}
			else if(data.getCCM_ASCONFIGURED().equals("AGA 8 GROSS I"))
			{
				fcd.setCcm_as_configured_in_fc(2);
			}
			else {
				fcd.setCcm_as_configured_in_fc(0);
			}
			
//		---------------------------------------------------------------------------------------	
			
			fcd.setHvmm_as_per_contract(data.getHV_ASPERCONTRACT());

	//-----------------------------------------------------------------------------------------------
			
			
			if (data.getHV_ASCONFIGURED().equals("GPA 2172 WITH 2145"))
			{
			fcd.setHvmm_as_configured_in_fc(2);
			}else if (data.getHV_ASCONFIGURED().equals("ISO 6976"))
			{
			fcd.setHvmm_as_configured_in_fc(1);
			} else if (data.getHV_ASCONFIGURED().equals("ASTMD3588"))
			{
			fcd.setHvmm_as_configured_in_fc(3);
			}else 
			{
				fcd.setHvmm_as_configured_in_fc(0);
			}
			
//		--------------------------------------------------------------------------------------
			
//			fcd.setPresent_values(0);											//it is not usable column say by: nitesh
			fcd.setAp_next_date_of_update_in_fc(data.getAP_ND_UPDATION());
			
			
		
//		public void EmdSet() {
			
			
			
			emd.setStream_id(stream_id);
			emd.setMmst_id(mmst_id);
			emd.setStream_no(data.getSTREAM_INDEX());

//		-------------------------------------------------------------------------------------------
			
			if (data.getGQ_DATASOURCE().equals("G"))
			{
				emd.setGas_quality_data_source(3);
			
			}else if (data.getGQ_DATASOURCE().equals("C"))
			{
				emd.setGas_quality_data_source(2);
				
			}else if (data.getGQ_DATASOURCE().equals("O"))			//here O means ONLINE GC
			{
				emd.setGas_quality_data_source(1);
			}else if (data.getGQ_DATASOURCE().equals("S"))
			{
				emd.setGas_quality_data_source(4);
			}else 
			{
				emd.setGas_quality_data_source(0);
			}
			
//		--------------------------------------------------------------------------------------------	
			
			
			
			emd.setGas_quality_data_source_analysis_frequency(data.getGQ_FREQ());
			
			if (data.getGQ_DATA_USED().equals("FA")) {
			emd.setGas_quality_data_used_for_updation_in_fc(5);
			}else if (data.getGQ_DATA_USED().equals("FS"))
			{
				emd.setGas_quality_data_used_for_updation_in_fc(4);
			}else if (data.getGQ_DATA_USED().equals("C"))
			{
				emd.setGas_quality_data_used_for_updation_in_fc(1);
			}else if (data.getGQ_DATA_USED().equals("OTHER"))
			{
				emd.setGas_quality_data_used_for_updation_in_fc(6);
			}else if (data.getGQ_DATA_USED().equals("DA"))
			{
				emd.setGas_quality_data_used_for_updation_in_fc(3);
			}else if (data.getGQ_DATA_USED().equals("DS"))
			{
				emd.setGas_quality_data_used_for_updation_in_fc(2);
			}else 
			{
				emd.setGas_quality_data_used_for_updation_in_fc(0);
			}
			
//		-------------------------------------------------------------------------------------------------------
			
			
			emd.setGas_quality_data_updation_frequency_in_fc(data.getGQ_UPDATE_FREQ());
//		-------------------------------------------------------------------------------------------------------
			
			if (data.getGQ_UPDATE_METHOD().equals("M"))
			{
			emd.setGas_quality_data_method_of_updation_in_fc(3);
			}else if (data.getGQ_UPDATE_METHOD().equals("O"))
			{
			emd.setGas_quality_data_method_of_updation_in_fc(3);
			}
			else if (data.getGQ_UPDATE_METHOD().equals("S"))
			{
			emd.setGas_quality_data_method_of_updation_in_fc(2);
			}else if (data.getGQ_UPDATE_METHOD().equals("OTHER"))
			{
			emd.setGas_quality_data_method_of_updation_in_fc(4);
			}else 
			{
				emd.setGas_quality_data_method_of_updation_in_fc(0);
			}
			
			emd.setLaboratory_details(data.getLAB_DETAILS());
			emd.setValidity_date(data.getVALIDITY_DATE());
//		------------------------------------------------------------------------------------------------------------
		
		if(data.getCOMP_COVERED().equals("HC6")) {
			emd.setGas_components_covered(1);
			}else if (data.getCOMP_COVERED().equals("HC9"))
			{
				emd.setGas_components_covered(2);
			}else if (data.getCOMP_COVERED().equals("OTHER")) 
			{
				emd.setGas_components_covered(3);
			}else{
				emd.setGas_components_covered(0);
				}
		
		
//		------------------------------------------------------------------------------------------------------------
			
			

//		public void SidSet() {
			
			
			
			sid.setStream_id(stream_id);
			sid.setStream_no(data.getSTREAM_INDEX());
			sid.setMmst_id(mmst_id);
			
			
			if (data.getJOINT_CALI_FREQ().equals("Q"))
			{
				sid.setFc_joint_calibration_frequency(1);
				
			}else if (data.getJOINT_CALI_FREQ().equals("M"))
			{
				sid.setFc_joint_calibration_frequency(2);
			}else if (data.getJOINT_CALI_FREQ().equals("O"))
			{
				sid.setFc_joint_calibration_frequency(3);	
			}else 
			{
				sid.setFc_joint_calibration_frequency(0);
			}

			
			sid.setFc_date_of_last_calibration(data.getLD_CALIBRATION());
			sid.setFc_next_calibration_date(data.getNEXT_CALIBRATION_DATE());
			
			sid.setPt_type(data.getPT_TYPE());
			
			sid.setPt_make(data.getPT_MAKE());
			sid.setPt_model(data.getPT_MODEL());
			sid.setPt_accuracy(data.getPT_ACCURACY());
			
//			sid.setPt_calibration_data_upload(pt_calibration_data_upload);			//excel mapping not done ...
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
			sid.setRtd_class(data.getRTD_CLASS());
			sid.setRtd_make(data.getRTD_MAKE());
			sid.setRtd_model(data.getRTD_MODEL());
			
			sid.setRtd_date_of_last_calibration(data.getRTD_LD_CALIBRATION());
//			sid.setRtd_next_calibration_due_date(rtd_next_calibration_due_date);		// excel mapping not done
		
//		----------------------------------------------------------------------------------
		
		if(data.getIS_BARRIER_INSTALLED().equals("YES"))
		{
			sid.setBi_barrier_installed(1);
		}else if (data.getIS_BARRIER_INSTALLED().equals("NO"))
		{
			sid.setBi_barrier_installed(2);
		}else {
			
			sid.setBi_barrier_installed(0);
		}
			

	//--------------------------------------------------------------------------------------------	
			sid.setBi_primary_meter_frequency_range(data.getFB_PM_FREQ_RANGE());
			sid.setBi_installed_barrier_frequency_range(data.getBARRIER_FREQ_RANGE());
			sid.setBi_date_of_last_simulation(data.getLD_SIMULATION());
			
//			sid.setBi_next_simulation_due_date(bi_next_simulation_due_date);					// excel mapping not done
				
				
				
				
				System.out.println(fcd);
				mmstDAOI.insertFlowComputerData(fcd);
//				System.out.println(opd);
//				mmstDAOI.insertOrificeData(opd);
				System.out.println(emd);
//				mmstDAOI.insertEnergyMeasurementDetails(emd);
				System.out.println(sid);
				mmstDAOI.insertSecInstDetails(sid);
				System.out.println(sid);
				System.out.println("mmst id is :- " +mmst);
				
		}		
				
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
