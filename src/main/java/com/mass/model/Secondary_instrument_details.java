package com.mass.model;

public class Secondary_instrument_details {

	
	 private Object stream_id =0;	        				//        	| integer                        |
	 private Object stream_no ; 						//        	| integer                        |
	 private Object  mmst_id ;              			//        	| integer                        |
	 private Object fc_joint_calibration_frequency; 	//    		| integer                        | 
	
	 private Object fc_date_of_last_calibration ;   	//    		| timestamp(6) without time zone | 
	 private Object fc_next_calibration_date  ;     	//    		| timestamp(6) without time zone | 
	
	 private Object pt_type ;                           //	  		| integer                        | 
	 private Object pt_make ;                           //	  		| character varying(100)         | 
	 private Object pt_model;                           //    		| character varying(100)         | 
	 private Object pt_accuracy;                        //    		| double precision               | 
	 private Object pt_calibration_data_upload = "abc";         //  | character varying(100)          
	 private Object dpt_type;                           //    		| integer                        
	 private Object dpt_make ;                          //    		| character varying(100)          
	 private Object dpt_model;                          //    		| character varying(100)          
	 private Object dpt_accuracy ;                      //    		| double precision                
	 private Object dpt_calibration_data_upload = "def";  // 	  	| character varying(100)          
	 private Integer tt_temperature_input_to_flow_computer = 1; //	 	| integer              //manula set        
	 private Object tt_make ;                             	 //	 	| character varying(100)          
	 private Object tt_model ;                             	//	  	| character varying(100)          
	 private Object tt_accuracy ;                          	//		| double precision                
	 private Object tt_calibration_data_upload = "gih" ;    //		| character varying(100)          
	 private Object rtd_type ;                              //		| integer                         
	 private Object rtd_class ;                            //		| integer                         
	 private Object rtd_make ;                             //		| character varying(100)          
	 private Object rtd_model ;                            //		| character varying(100)          
	 private Object rtd_date_of_last_calibration ;         //		| timestamp(6) without time zone  
	 private Object rtd_next_calibration_due_date  = "29/12/2019";   //		| timestamp(6) without time zone | 
	 private Object bi_barrier_installed ;                 //		| integer                        | 
	 private Object bi_primary_meter_frequency_range ;     //		| character varying(100)         | 
	 private Object bi_installed_barrier_frequency_range ; 	//		| character varying(100)         | 
	 private Object bi_date_of_last_simulation ;            //		| timestamp(6) without time zone | 
	 private Object bi_next_simulation_due_date = "29/12/2019" ;          	//		| timestamp(6) without time zone | 
	
	 
	 public Object getStream_id() {
		return stream_id;
	}
	public void setStream_id(Object stream_id) {
		this.stream_id = stream_id;
	}
	public Object getStream_no() {
		return stream_no;
	}
	public void setStream_no(Object stream_no) {
		this.stream_no = stream_no;
	}
	public Object getMmst_id() {
		return mmst_id;
	}
	public void setMmst_id(Object mmst_id) {
		this.mmst_id = mmst_id;
	}
	public Object getFc_joint_calibration_frequency() {
		return fc_joint_calibration_frequency;
	}
	public void setFc_joint_calibration_frequency(Object fc_joint_calibration_frequency) {
		this.fc_joint_calibration_frequency = fc_joint_calibration_frequency;
	}
	public Object getFc_date_of_last_calibration() {
		return fc_date_of_last_calibration;
	}
	public void setFc_date_of_last_calibration(Object fc_date_of_last_calibration) {
		this.fc_date_of_last_calibration = fc_date_of_last_calibration;
	}
	public Object getFc_next_calibration_date() {
		return fc_next_calibration_date;
	}
	public void setFc_next_calibration_date(Object fc_next_calibration_date) {
		this.fc_next_calibration_date = fc_next_calibration_date;
	}
	public Object getPt_type() {
		return pt_type;
	}
	public void setPt_type(Object pt_type) {
		this.pt_type = pt_type;
	}
	public Object getPt_make() {
		return pt_make;
	}
	public void setPt_make(Object pt_make) {
		this.pt_make = pt_make;
	}
	public Object getPt_model() {
		return pt_model;
	}
	public void setPt_model(Object pt_model) {
		this.pt_model = pt_model;
	}
	public Object getPt_accuracy() {
		return pt_accuracy;
	}
	public void setPt_accuracy(Object pt_accuracy) {
		this.pt_accuracy = pt_accuracy;
	}
	public Object getPt_calibration_data_upload() {
		return pt_calibration_data_upload;
	}
	public void setPt_calibration_data_upload(Object pt_calibration_data_upload) {
		this.pt_calibration_data_upload = pt_calibration_data_upload;
	}
	public Object getDpt_type() {
		return dpt_type;
	}
	public void setDpt_type(Object dpt_type) {
		this.dpt_type = dpt_type;
	}
	public Object getDpt_make() {
		return dpt_make;
	}
	public void setDpt_make(Object dpt_make) {
		this.dpt_make = dpt_make;
	}
	public Object getDpt_model() {
		return dpt_model;
	}
	public void setDpt_model(Object dpt_model) {
		this.dpt_model = dpt_model;
	}
	public Object getDpt_accuracy() {
		return dpt_accuracy;
	}
	public void setDpt_accuracy(Object dpt_accuracy) {
		this.dpt_accuracy = dpt_accuracy;
	}
	public Object getDpt_calibration_data_upload() {
		return dpt_calibration_data_upload;
	}
	public void setDpt_calibration_data_upload(Object dpt_calibration_data_upload) {
		this.dpt_calibration_data_upload = dpt_calibration_data_upload;
	}
	public Integer getTt_temperature_input_to_flow_computer() {
		return tt_temperature_input_to_flow_computer;
	}
	public void setTt_temperature_input_to_flow_computer(Integer tt_temperature_input_to_flow_computer) {
		this.tt_temperature_input_to_flow_computer = tt_temperature_input_to_flow_computer;
	}
	public Object getTt_make() {
		return tt_make;
	}
	public void setTt_make(Object tt_make) {
		this.tt_make = tt_make;
	}
	public Object getTt_model() {
		return tt_model;
	}
	public void setTt_model(Object tt_model) {
		this.tt_model = tt_model;
	}
	public Object getTt_accuracy() {
		return tt_accuracy;
	}
	public void setTt_accuracy(Object tt_accuracy) {
		this.tt_accuracy = tt_accuracy;
	}
	public Object getTt_calibration_data_upload() {
		return tt_calibration_data_upload;
	}
	public void setTt_calibration_data_upload(Object tt_calibration_data_upload) {
		this.tt_calibration_data_upload = tt_calibration_data_upload;
	}
	public Object getRtd_type() {
		return rtd_type;
	}
	public void setRtd_type(Object rtd_type) {
		this.rtd_type = rtd_type;
	}
	public Object getRtd_class() {
		return rtd_class;
	}
	public void setRtd_class(Object rtd_class) {
		this.rtd_class = rtd_class;
	}
	public Object getRtd_make() {
		return rtd_make;
	}
	public void setRtd_make(Object rtd_make) {
		this.rtd_make = rtd_make;
	}
	public Object getRtd_model() {
		return rtd_model;
	}
	public void setRtd_model(Object rtd_model) {
		this.rtd_model = rtd_model;
	}
	public Object getRtd_date_of_last_calibration() {
		return rtd_date_of_last_calibration;
	}
	public void setRtd_date_of_last_calibration(Object rtd_date_of_last_calibration) {
		this.rtd_date_of_last_calibration = rtd_date_of_last_calibration;
	}
	public Object getRtd_next_calibration_due_date() {
		return rtd_next_calibration_due_date;
	}
	public void setRtd_next_calibration_due_date(Object rtd_next_calibration_due_date) {
		this.rtd_next_calibration_due_date = rtd_next_calibration_due_date;
	}
	public Object getBi_barrier_installed() {
		return bi_barrier_installed;
	}
	public void setBi_barrier_installed(Object bi_barrier_installed) {
		this.bi_barrier_installed = bi_barrier_installed;
	}
	public Object getBi_primary_meter_frequency_range() {
		return bi_primary_meter_frequency_range;
	}
	public void setBi_primary_meter_frequency_range(Object bi_primary_meter_frequency_range) {
		this.bi_primary_meter_frequency_range = bi_primary_meter_frequency_range;
	}
	public Object getBi_installed_barrier_frequency_range() {
		return bi_installed_barrier_frequency_range;
	}
	public void setBi_installed_barrier_frequency_range(Object bi_installed_barrier_frequency_range) {
		this.bi_installed_barrier_frequency_range = bi_installed_barrier_frequency_range;
	}
	public Object getBi_date_of_last_simulation() {
		return bi_date_of_last_simulation;
	}
	public void setBi_date_of_last_simulation(Object bi_date_of_last_simulation) {
		this.bi_date_of_last_simulation = bi_date_of_last_simulation;
	}
	public Object getBi_next_simulation_due_date() {
		return bi_next_simulation_due_date;
	}
	public void setBi_next_simulation_due_date(Object bi_next_simulation_due_date) {
		this.bi_next_simulation_due_date = bi_next_simulation_due_date;
	}
	
	@Override
	public String toString() {
		return "Secondary_instrument_details [stream_id=" + stream_id + ", stream_no=" + stream_no + ", mmst_id="
				+ mmst_id + ", fc_joint_calibration_frequency=" + fc_joint_calibration_frequency
				+ ", fc_date_of_last_calibration=" + fc_date_of_last_calibration + ", fc_next_calibration_date="
				+ fc_next_calibration_date + ", pt_type=" + pt_type + ", pt_make=" + pt_make + ", pt_model=" + pt_model
				+ ", pt_accuracy=" + pt_accuracy + ", pt_calibration_data_upload=" + pt_calibration_data_upload
				+ ", dpt_type=" + dpt_type + ", dpt_make=" + dpt_make + ", dpt_model=" + dpt_model + ", dpt_accuracy="
				+ dpt_accuracy + ", dpt_calibration_data_upload=" + dpt_calibration_data_upload
				+ ", tt_temperature_input_to_flow_computer=" + tt_temperature_input_to_flow_computer + ", tt_make="
				+ tt_make + ", tt_model=" + tt_model + ", tt_accuracy=" + tt_accuracy + ", tt_calibration_data_upload="
				+ tt_calibration_data_upload + ", rtd_type=" + rtd_type + ", rtd_class=" + rtd_class + ", rtd_make="
				+ rtd_make + ", rtd_model=" + rtd_model + ", rtd_date_of_last_calibration="
				+ rtd_date_of_last_calibration + ", rtd_next_calibration_due_date=" + rtd_next_calibration_due_date
				+ ", bi_barrier_installed=" + bi_barrier_installed + ", bi_primary_meter_frequency_range="
				+ bi_primary_meter_frequency_range + ", bi_installed_barrier_frequency_range="
				+ bi_installed_barrier_frequency_range + ", bi_date_of_last_simulation=" + bi_date_of_last_simulation
				+ ", bi_next_simulation_due_date=" + bi_next_simulation_due_date + "]";
	}

	
	
}
