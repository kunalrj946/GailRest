package com.mass.model;

public class Energy_measurement_details {

	
	private Integer stream_id ;                                  	//	integer   
	private Integer mmst_id ;                                    	//	integer                    
	private Object stream_no;                                   	//	integer                      
	private Integer gas_quality_data_source ;                    	//	integer                   
	private Object gas_quality_data_source_analysis_frequency;  	//	character varying(100)     
	private Integer gas_quality_data_used_for_updation_in_fc = 1;    	//	integer           			//NOT MAPPING            
	private Object gas_quality_data_updation_frequency_in_fc;   	//	character varying(100)      
	private Integer gas_quality_data_method_of_updation_in_fc = 3;   	//	integer                     
	private Object laboratory_details;                          	//	character varying(100)       
	private Object validity_date ;                             		//	timestamp(6) without time zone | 
	private Integer gas_components_covered;                     		//	integer                  
	
	
	
	public Integer getStream_id() {
		return stream_id;
	}
	
	public void setStream_id(Integer stream_id) {
		this.stream_id = stream_id;
	}
	public Integer getMmst_id() {
		return mmst_id;
	}
	public void setMmst_id(Integer mmst_id) {
		this.mmst_id = mmst_id;
	}
	public Object getStream_no() {
		return stream_no;
	}
	public void setStream_no(Object stream_no) {
		this.stream_no = stream_no;
	}
	public Integer getGas_quality_data_source() {
		return gas_quality_data_source;
	}
	public void setGas_quality_data_source(Integer gas_quality_data_source) {
		this.gas_quality_data_source = gas_quality_data_source;
	}
	public Object getGas_quality_data_source_analysis_frequency() {
		return gas_quality_data_source_analysis_frequency;
	}
	public void setGas_quality_data_source_analysis_frequency(Object gas_quality_data_source_analysis_frequency) {
		this.gas_quality_data_source_analysis_frequency = gas_quality_data_source_analysis_frequency;
	}
	public Integer getGas_quality_data_used_for_updation_in_fc() {
		return gas_quality_data_used_for_updation_in_fc;
	}
	public void setGas_quality_data_used_for_updation_in_fc(Integer gas_quality_data_used_for_updation_in_fc) {
		this.gas_quality_data_used_for_updation_in_fc = gas_quality_data_used_for_updation_in_fc;
	}
	public Object getGas_quality_data_updation_frequency_in_fc() {
		return gas_quality_data_updation_frequency_in_fc;
	}
	public void setGas_quality_data_updation_frequency_in_fc(Object gas_quality_data_updation_frequency_in_fc) {
		this.gas_quality_data_updation_frequency_in_fc = gas_quality_data_updation_frequency_in_fc;
	}
	public Integer getGas_quality_data_method_of_updation_in_fc() {
		return gas_quality_data_method_of_updation_in_fc;
	}
	public void setGas_quality_data_method_of_updation_in_fc(Integer gas_quality_data_method_of_updation_in_fc) {
		this.gas_quality_data_method_of_updation_in_fc = gas_quality_data_method_of_updation_in_fc;
	}
	public Object getLaboratory_details() {
		return laboratory_details;
	}
	public void setLaboratory_details(Object laboratory_details) {
		this.laboratory_details = laboratory_details;
	}
	public Object getValidity_date() {
		return validity_date;
	}
	public void setValidity_date(Object validity_date) {
		this.validity_date = validity_date;
	}
	public Integer getGas_components_covered() {
		return gas_components_covered;
	}
	public void setGas_components_covered(Integer gas_components_covered) {
		this.gas_components_covered = gas_components_covered;
	}
	@Override
	public String toString() {
		return "Energy_measurement_details [stream_id=" + stream_id + ", mmst_id=" + mmst_id + ", stream_no="
				+ stream_no + ", gas_quality_data_source=" + gas_quality_data_source
				+ ", gas_quality_data_source_analysis_frequency=" + gas_quality_data_source_analysis_frequency
				+ ", gas_quality_data_used_for_updation_in_fc=" + gas_quality_data_used_for_updation_in_fc
				+ ", gas_quality_data_updation_frequency_in_fc=" + gas_quality_data_updation_frequency_in_fc
				+ ", gas_quality_data_method_of_updation_in_fc=" + gas_quality_data_method_of_updation_in_fc
				+ ", laboratory_details=" + laboratory_details + ", validity_date=" + validity_date
				+ ", gas_components_covered=" + gas_components_covered + "]";
	}

	
	
	
}
