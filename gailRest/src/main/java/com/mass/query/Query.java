package com.mass.query;

import com.mass.config.WebConfig;
//import com.mmst.logger.ALogger;

public class Query {
	WebConfig webconfig = new WebConfig();
//	ALogger logger = new ALogger();
	
	public static  String getQuery(String dbschema , String Query) {
		String getQuery="";
		switch (Query) 
		{
		
// 				FOR PRIMARY_METER_DATA   TABLE 
		
		case "GET_CONNECTIVITY_ID": 
			
			getQuery = "select id from "+ dbschema + ".connectivity where value= ?  AND is_deleted = '0'";				//value = excel 
			
			break;
			
		case "GET_MMST_ID":
			getQuery = "select mmst_id from "+dbschema +".mmst ";
			
			break;
		
					
		
//		FOR MMST TABLE 
		
		case "GET_STATION_ID" :{
			
				getQuery = "select station_id  from "+ dbschema + ".pipe_station where  station_serial_no = ? AND is_deleted = '0'";  //station_serial_no = excel SAP_ID
				break;
		}
		
		case "GET_PIPELINEMST_ID" :{
			
			getQuery = "select pipelinemst_id  from "+ dbschema + ".pipeline_mst where pipeline_name = ? AND is_deleted = '0'";	 // pipeline_name = 	REGION			
			break;
	
		}
		case "GET_MAINTENANCE_BASE_ID" :{
			
			getQuery = "select maintenance_base_id from "+dbschema + ".maintenance_base where maintenance_base_name = ? AND is_deleted = '0'"; //maintenance_base_name = excel MAINT_BASE
			
			break;
		}
		
		case "INSERT_MMST_DATA":{
			
			getQuery = "INSERT INTO "+dbschema+".mmst(station_id,pipelinemst_id,maintenance_base_id,process_fluid_id,"
					+ "metering_type_id,sap_id,name_of_consumer_types,metering_capcity,metering_pressure,"
					+ "avg_metering_temeprature, avg_daily_consumption,no_of_stream,configuration,remarks,is_deleted,status,"
					+ "no_flow) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ON CONFLICT (sap_id)  DO UPDATE SET station_id = EXCLUDED.station_id ,"
					+ "pipelinemst_id = EXCLUDED.pipelinemst_id , maintenance_base_id = EXCLUDED.maintenance_base_id , "
					+ "process_fluid_id = EXCLUDED.process_fluid_id ,metering_type_id = EXCLUDED.metering_type_id , sap_id = EXCLUDED.sap_id,"
					+ "name_of_consumer_types = EXCLUDED.name_of_consumer_types , metering_capcity = EXCLUDED.metering_capcity ,"
					+ "metering_pressure = EXCLUDED.metering_pressure,avg_metering_temeprature = EXCLUDED.avg_metering_temeprature,"
					+ " avg_daily_consumption = EXCLUDED.avg_daily_consumption , no_of_stream = EXCLUDED.no_of_stream , "
					+ "configuration = EXCLUDED.configuration , remarks = EXCLUDED.remarks , is_deleted = EXCLUDED.is_deleted,"
					+ "status = EXCLUDED.status , no_flow = EXCLUDED.no_flow";
			
			break;
		}
		
		
		case "INSERT_PRIMARY_METER_DATA" :
		{
			getQuery = "insert into  "+ dbschema + ".primary_meter_data (mmst_id ,consumer,stream_no,connectivity_id,fc_id ,"
					+ "make,model,meter_type,k_factor,tag_no,serial_no,meter_size,pressure_class,g_rating,q_max,q_min,orifice_diameter,"
					+ "meter_tube_pipeline_dia) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) "
					+ "ON CONFLICT (mmst_id, stream_no) DO UPDATE SET mmst_id = EXCLUDED.mmst_id,consumer = EXCLUDED.consumer , "
					+ "stream_no = EXCLUDED.stream_no , connectivity_id = EXCLUDED.connectivity_id , fc_id = EXCLUDED.fc_id,"
					+ "make = EXCLUDED.make , model = EXCLUDED.model , meter_type = EXCLUDED.meter_type , "
					+ "k_factor = EXCLUDED.k_factor , tag_no = EXCLUDED.tag_no ,serial_no = EXCLUDED.serial_no,"
					+ "meter_size = EXCLUDED.meter_size , pressure_class = EXCLUDED.pressure_class,g_rating = EXCLUDED.g_rating,"
					+ "q_max = EXCLUDED.q_max, q_min = EXCLUDED.q_min ,orifice_diameter = EXCLUDED.orifice_diameter , "
					+ "meter_tube_pipeline_dia = EXCLUDED.meter_tube_pipeline_dia";
					
			break;
			}
		
		
		case "INSERT_FLOW_COMPUTER_DATA":{
			
			getQuery = "INSERT INTO "+dbschema+".flow_computer_data(stream_id , mmst_id ,stream_no ,type, make, model,"
					+ "power_source_id, bp_value_as_per_contract, bp_unit_as_per_contract_id, bp_value_configured_in_fc ," 
					+ "bp_unit_configured_in_fc_id , bt_value_as_per_contract, bt_unit_as_per_contract, bt_value_configured_in_fc,"
					+ "bt_unit_as_configured_in_fc, error_curve_file ,ap_source_id ,ap_frequency_of_update ,"
					+ "ap_data_used_for_update_in_fc, ap_last_date_of_update_in_fc ,ap_present_value,ap_unit_as_configured_in_fc,"
					+ "ccm_as_per_contract,ccm_as_configured_in_fc, hvmm_as_per_contract,hvmm_as_configured_in_fc ,"
					+ "present_values ,ap_next_date_of_update_in_fc)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ON CONFLICT (mmst_id, stream_no) DO UPDATE SET "
					+ "stream_id = EXCLUDED.stream_id , mmst_id = EXCLUDED.mmst_id , stream_no = EXCLUDED.stream_no ,"
					+ "type = EXCLUDED.type , make = EXCLUDED.make , model = EXCLUDED.model ,  "
					+ "power_source_id = EXCLUDED.power_source_id , bp_value_as_per_contract = EXCLUDED.bp_value_as_per_contract,"
					+ "bp_unit_as_per_contract_id =EXCLUDED.bp_unit_as_per_contract_id ,"
					+ "bp_value_configured_in_fc = EXCLUDED.bp_value_configured_in_fc , "
					+ "bp_unit_configured_in_fc_id = EXCLUDED.bp_unit_configured_in_fc_id , "
					+ "bt_value_as_per_contract = EXCLUDED.bt_value_as_per_contract , "
					+ "bt_unit_as_per_contract = EXCLUDED.bt_unit_as_per_contract , "
					+ "bt_value_configured_in_fc = EXCLUDED.bt_value_configured_in_fc , "
					+ "bt_unit_as_configured_in_fc = EXCLUDED.bt_unit_as_configured_in_fc ,"
					+ "error_curve_file =EXCLUDED.error_curve_file , ap_source_id = EXCLUDED.ap_source_id , "
					+ "ap_frequency_of_update = EXCLUDED.ap_frequency_of_update ,"
					+ "ap_data_used_for_update_in_fc = EXCLUDED.ap_data_used_for_update_in_fc , "
					+ "ap_last_date_of_update_in_fc = EXCLUDED.ap_last_date_of_update_in_fc , ap_present_value =EXCLUDED.ap_present_value,"
					+ "ap_unit_as_configured_in_fc = EXCLUDED.ap_unit_as_configured_in_fc , ccm_as_per_contract = EXCLUDED.ccm_as_per_contract,"
					+ "ccm_as_configured_in_fc = EXCLUDED.ccm_as_configured_in_fc ,hvmm_as_per_contract = EXCLUDED.hvmm_as_per_contract,"
					+ "hvmm_as_configured_in_fc = EXCLUDED.hvmm_as_configured_in_fc , present_values = EXCLUDED.present_values,"
					+ "ap_next_date_of_update_in_fc = EXCLUDED.ap_next_date_of_update_in_fc ";
			
			break;
		}
		
		case"INSERT_ORIFICE_PLATE_DATA":{
			
			getQuery = "INSERT INTO "+ dbschema+".orifice_plate_data(stream_id ,mmst_id,stream_no, last_calibration_date ,next_calibration_date,"
					+ "dtl_of_calibration_agny,last_date_tube_inspection,next_date_tube_inspection ,date_inspection_data_update_fc ,"
					+ "last_error_curve ,last_meter_inspection ,next_meter_inspection ,last_health_monitoring ,"
					+ "next_health_monitoring ,stream_configured , output_custody ,next_sos_verification ,last_sos_verification,consumer)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)  ON CONFLICT () DO UPDATE SET "
					+ "stream_id = EXCLUDED.stream_id ,mmst_id = EXCLUDED.mmst_id,stream_no = EXCLUDED.stream_no,"
					+ "last_calibration_date = EXCLUDED.last_calibration_date , next_calibration_date = EXCLUDED.next_calibration_date,"
					+ "dtl_of_calibration_agny = EXCLUDED.dtl_of_calibration_agny , last_date_tube_inspection = EXCLUDED.last_date_tube_inspection,"
					+ "next_date_tube_inspection = EXCLUDED.next_date_tube_inspection , "
					+ "date_inspection_data_update_fc = EXCLUDED.date_inspection_data_update_fc ,"
					+ "last_error_curve = EXCLUDED.last_error_curve ,last_meter_inspection = EXCLUDED.last_meter_inspection ,"
					+ "next_meter_inspection = EXCLUDED.next_meter_inspection ,last_health_monitoring = EXCLUDED.last_health_monitoring, "
					+ "next_health_monitoring = EXCLUDED.next_health_monitoring ,stream_configured = EXCLUDED.stream_configured ,"
					+ "output_custody = EXCLUDED.output_custody ,next_sos_verification  = EXCLUDED.next_sos_verification ,"
					+ "last_sos_verification = EXCLUDED.last_sos_verification,consumer = EXCLUDED.consumer";
		
		
			break;
		}
		
		case "INSERT_ENERGY_MEASUREMENT_DETAILS" :{
			
			getQuery = "INSERT INTO "+dbschema+".energy_measurement_details(stream_id,mmst_id , stream_no,"
					+ "gas_quality_data_source , gas_quality_data_source_analysis_frequency , "
					+ "gas_quality_data_used_for_updation_in_fc ,gas_quality_data_updation_frequency_in_fc ,"
					+ "gas_quality_data_method_of_updation_in_fc ,laboratory_details ,validity_date ,"
					+ "gas_components_covered ) VALUES (?,?,?,?,?,?,?,?,?,?,?) ON CONFLICT (stream_id) DO UPDATE  SET "
					+ "stream_id = EXCLUDED.stream_id ,mmst_id = EXCLUDED.mmst_id , stream_no = EXCLUDED.stream_no,"
					+ "gas_quality_data_source = EXCLUDED.gas_quality_data_source, "
					+ "gas_quality_data_source_analysis_frequency = EXCLUDED.gas_quality_data_source_analysis_frequency ,"
					+ "gas_quality_data_used_for_updation_in_fc = EXCLUDED.gas_quality_data_used_for_updation_in_fc ,"
					+ "gas_quality_data_updation_frequency_in_fc = EXCLUDED.gas_quality_data_updation_frequency_in_fc ,"
					+ "gas_quality_data_method_of_updation_in_fc  = EXCLUDED.gas_quality_data_method_of_updation_in_fc,"
					+ "laboratory_details = EXCLUDED.laboratory_details ,validity_date = EXCLUDED.validity_date,"
					+ "gas_components_covered = EXCLUDED.gas_components_covered";
			
			break;
		}
		
		case "INSERT_SECONDARY_INSTRUMENT_DETAILS":{
			
			getQuery = "INSERT INTO "+dbschema+".secondary_instrument_details(stream_id,stream_no,mmst_id,fc_joint_calibration_frequency,"
					+ "fc_date_of_last_calibration,fc_next_calibration_date,pt_type,pt_make,pt_model,pt_accuracy,"
					+ "pt_calibration_data_upload,dpt_type,dpt_make,dpt_model,dpt_accuracy,dpt_calibration_data_upload,"
					+ "tt_temperature_input_to_flow_computer,tt_make,tt_model,tt_accuracy,tt_calibration_data_upload,"
					+ "rtd_type,rtd_class,rtd_make,rtd_model,rtd_date_of_last_calibration,rtd_next_calibration_due_date,"
					+ "bi_barrier_installed,bi_primary_meter_frequency_range,bi_installed_barrier_frequency_range,"
					+ "bi_date_of_last_simulation,bi_next_simulation_due_date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
					+ ",?,?,?,?,?,?,?,?) ON CONFLICT (stream_id) DO UPDATE SET stream_id = EXCLUDED.stream_id,"
					+ "stream_no = EXCLUDED.stream_no,mmst_id = EXCLUDED.mmst_id,"
					+ "fc_joint_calibration_frequency = EXCLUDED.fc_joint_calibration_frequency,"
					+ "fc_date_of_last_calibration = EXCLUDED.fc_date_of_last_calibration,"
					+ "fc_next_calibration_date = EXCLUDED.fc_next_calibration_date,pt_type = EXCLUDED.pt_type,"
					+ "pt_make = EXCLUDED.pt_make,pt_model = EXCLUDED.pt_model,pt_accuracy = EXCLUDED.pt_accuracy, "
					+ "pt_calibration_data_upload = EXCLUDED.pt_calibration_data_upload,dpt_type = EXCLUDED.dpt_type,"
					+ "dpt_make= EXCLUDED.dpt_make, dpt_model = EXCLUDED.dpt_model,dpt_accuracy = EXCLUDED.dpt_accuracy,"
					+ "dpt_calibration_data_upload = EXCLUDED.dpt_calibration_data_upload,"
					+ "tt_temperature_input_to_flow_computer = EXCLUDED.tt_temperature_input_to_flow_computer,"
					+ "tt_make = EXCLUDED.tt_make,tt_model = EXCLUDED.tt_model,tt_accuracy = EXCLUDED.tt_accuracy,"
					+ "tt_calibration_data_upload = EXCLUDED.tt_calibration_data_upload,rtd_type = EXCLUDED.rtd_type,"
					+ "rtd_class = EXCLUDED.rtd_class,rtd_make = EXCLUDED.rtd_make,rtd_model= EXCLUDED.rtd_model,"
					+ "rtd_date_of_last_calibration = EXCLUDED.rtd_date_of_last_calibration,"
					+ "rtd_next_calibration_due_date = EXCLUDED.rtd_next_calibration_due_date,"
					+ "bi_barrier_installed = EXCLUDED.bi_barrier_installed,"
					+ "bi_primary_meter_frequency_range = EXCLUDED.bi_primary_meter_frequency_range,"
					+ "bi_installed_barrier_frequency_range = EXCLUDED.bi_installed_barrier_frequency_range,"
					+ "bi_date_of_last_simulation = EXCLUDED.bi_date_of_last_simulation,"
					+ "bi_next_simulation_due_date = EXCLUDED.bi_next_simulation_due_date";
			
			break;
		}
		
	}
		
		return getQuery;
		
  }
}