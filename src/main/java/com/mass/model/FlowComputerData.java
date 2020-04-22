package com.mass.model;

public class FlowComputerData 
{
	
	Integer	stream_id ;                  			// integer             
	Integer mmst_id;
	Object 	stream_no;
	Integer type;	               		  	 		// integer     							 FC_TYPE      
	Object 	make ;                        	 		// character varying(100)   	 		 FC_MAKE 
	Object 	model ;                       	  		// character varying(100)  		 		 FC_MODEL 
	Integer power_source_id ;             	 		// integer     							 FC_POWER_SOURCE                
	Object 	bp_value_as_per_contract  ;   	 		// double precision 				 	 BP_CONTRACT_VALUE            
	Integer bp_unit_as_per_contract_id;   			// integer           			 		 BP_CONTRACT_UNIT            
	Object 	bp_value_configured_in_fc ;   	 		// double precision        			  	 BP_ASCONFIGURED_VALUE      
	Integer bp_unit_configured_in_fc_id;  			// integer                      	     BP_ASCONFIGURED_UNIT 
	Object 	bt_value_as_per_contract ;     			// double precision             		 BT_CONTRACT_VALUE
	Integer bt_unit_as_per_contract ;      			// integer                      	  	 BT_CONTRACT_UNIT
	Object 	bt_value_configured_in_fc ;    			// double precision              		 BT_ASCONFIG_VALUE
	Integer bt_unit_as_configured_in_fc ;  			// integer                       		 BT_ASCONFIG_UNIT
	Object 	error_curve_file = "abc";           			// character varying(100)        
	Integer ap_source_id ;                 			// integer                        	
	Integer ap_frequency_of_update ;       			// integer                       		 AP_FREQ_OF_UPDATION
	Integer ap_data_used_for_update_in_fc; 			// integer                     		 	 AP_DATA_USED_FOR_UPDATION
	Object 	ap_last_date_of_update_in_fc;  			// timestamp(6) without time zone 		 AP_LD_UPDATION
	Object 	ap_present_value ;             			// double precision              		 AP_PRESENT_VALUE
	Integer ap_unit_as_configured_in_fc ;  			// integer                       		 AP_PRESENT_UNIT
	Integer ccm_as_per_contract ;          			// integer                       		 CCM_ASPERCONTRACT
	Integer ccm_as_configured_in_fc ;      			// integer                       		 CCM_ASCONFIGURED
	Object 	hvmm_as_per_contract;          			// integer                       		 HV_ASPERCONTRACT
	
	Integer hvmm_as_configured_in_fc ;     			// integer   							 HV_ASCONFIGURED                   
    
	Integer present_values = 0;               		// integer                       
	Object 	ap_next_date_of_update_in_fc;  			// timestamp without time zone   		 AP_ND_UPDATION
	
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Object getMake() {
		return make;
	}
	public void setMake(Object make) {
		this.make = make;
	}
	public Object getModel() {
		return model;
	}
	public void setModel(Object model) {
		this.model = model;
	}
	public Integer getPower_source_id() {
		return power_source_id;
	}
	public void setPower_source_id(Integer power_source_id) {
		this.power_source_id = power_source_id;
	}
	public Object getBp_value_as_per_contract() {
		return bp_value_as_per_contract;
	}
	public void setBp_value_as_per_contract(Object bp_value_as_per_contract) {
		this.bp_value_as_per_contract = bp_value_as_per_contract;
	}
	public Integer getBp_unit_as_per_contract_id() {
		return bp_unit_as_per_contract_id;
	}
	public void setBp_unit_as_per_contract_id(Integer bp_unit_as_per_contract_id) {
		this.bp_unit_as_per_contract_id = bp_unit_as_per_contract_id;
	}
	public Object getBp_value_configured_in_fc() {
		return bp_value_configured_in_fc;
	}
	public void setBp_value_configured_in_fc(Object bp_value_configured_in_fc) {
		this.bp_value_configured_in_fc = bp_value_configured_in_fc;
	}
	public Integer getBp_unit_configured_in_fc_id() {
		return bp_unit_configured_in_fc_id;
	}
	public void setBp_unit_configured_in_fc_id(Integer bp_unit_configured_in_fc_id) {
		this.bp_unit_configured_in_fc_id = bp_unit_configured_in_fc_id;
	}
	public Object getBt_value_as_per_contract() {
		return bt_value_as_per_contract;
	}
	public void setBt_value_as_per_contract(Object bt_value_as_per_contract) {
		this.bt_value_as_per_contract = bt_value_as_per_contract;
	}
	public Integer getBt_unit_as_per_contract() {
		return bt_unit_as_per_contract;
	}
	public void setBt_unit_as_per_contract(Integer bt_unit_as_per_contract) {
		this.bt_unit_as_per_contract = bt_unit_as_per_contract;
	}
	public Object getBt_value_configured_in_fc() {
		return bt_value_configured_in_fc;
	}
	public void setBt_value_configured_in_fc(Object bt_value_configured_in_fc) {
		this.bt_value_configured_in_fc = bt_value_configured_in_fc;
	}
	public Integer getBt_unit_as_configured_in_fc() {
		return bt_unit_as_configured_in_fc;
	}
	public void setBt_unit_as_configured_in_fc(Integer bt_unit_as_configured_in_fc) {
		this.bt_unit_as_configured_in_fc = bt_unit_as_configured_in_fc;
	}
	public Object getError_curve_file() {
		return error_curve_file;
	}
	public void setError_curve_file(Object error_curve_file) {
		this.error_curve_file = error_curve_file;
	}
	public Integer getAp_source_id() {
		return ap_source_id;
	}
	public void setAp_source_id(Integer ap_source_id) {
		this.ap_source_id = ap_source_id;
	}
	public Integer getAp_frequency_of_update() {
		return ap_frequency_of_update;
	}
	public void setAp_frequency_of_update(Integer ap_frequency_of_update) {
		this.ap_frequency_of_update = ap_frequency_of_update;
	}
	public Integer getAp_data_used_for_update_in_fc() {
		return ap_data_used_for_update_in_fc;
	}
	public void setAp_data_used_for_update_in_fc(Integer ap_data_used_for_update_in_fc) {
		this.ap_data_used_for_update_in_fc = ap_data_used_for_update_in_fc;
	}
	public Object getAp_last_date_of_update_in_fc() {
		return ap_last_date_of_update_in_fc;
	}
	public void setAp_last_date_of_update_in_fc(Object ap_last_date_of_update_in_fc) {
		this.ap_last_date_of_update_in_fc = ap_last_date_of_update_in_fc;
	}
	public Object getAp_present_value() {
		return ap_present_value;
	}
	public void setAp_present_value(Object ap_present_value) {
		this.ap_present_value = ap_present_value;
	}
	public Integer getAp_unit_as_configured_in_fc() {
		return ap_unit_as_configured_in_fc;
	}
	public void setAp_unit_as_configured_in_fc(Integer ap_unit_as_configured_in_fc) {
		this.ap_unit_as_configured_in_fc = ap_unit_as_configured_in_fc;
	}
	public Integer getCcm_as_per_contract() {
		return ccm_as_per_contract;
	}
	public void setCcm_as_per_contract(Integer ccm_as_per_contract) {
		this.ccm_as_per_contract = ccm_as_per_contract;
	}
	public Integer getCcm_as_configured_in_fc() {
		return ccm_as_configured_in_fc;
	}
	public void setCcm_as_configured_in_fc(Integer ccm_as_configured_in_fc) {
		this.ccm_as_configured_in_fc = ccm_as_configured_in_fc;
	}
	public Object getHvmm_as_per_contract() {
		return hvmm_as_per_contract;
	}
	public void setHvmm_as_per_contract(Object hvmm_as_per_contract) {
		this.hvmm_as_per_contract = hvmm_as_per_contract;
	}
	public Integer getHvmm_as_configured_in_fc() {
		return hvmm_as_configured_in_fc;
	}
	public void setHvmm_as_configured_in_fc(Integer hvmm_as_configured_in_fc) {
		this.hvmm_as_configured_in_fc = hvmm_as_configured_in_fc;
	}
	public Integer getPresent_values() {
		return present_values;
	}
	public void setPresent_values(Integer present_values) {
		this.present_values = present_values;
	}
	public Object getAp_next_date_of_update_in_fc() {
		return ap_next_date_of_update_in_fc;
	}
	public void setAp_next_date_of_update_in_fc(Object ap_next_date_of_update_in_fc) {
		this.ap_next_date_of_update_in_fc = ap_next_date_of_update_in_fc;
	}
	@Override
	public String toString() {
		return "FlowComputerData [stream_id=" + stream_id + ", mmst_id=" + mmst_id + ", stream_no=" + stream_no
				+ ", type=" + type + ", make=" + make + ", model=" + model + ", power_source_id=" + power_source_id
				+ ", bp_value_as_per_contract=" + bp_value_as_per_contract + ", bp_unit_as_per_contract_id="
				+ bp_unit_as_per_contract_id + ", bp_value_configured_in_fc=" + bp_value_configured_in_fc
				+ ", bp_unit_configured_in_fc_id=" + bp_unit_configured_in_fc_id + ", bt_value_as_per_contract="
				+ bt_value_as_per_contract + ", bt_unit_as_per_contract=" + bt_unit_as_per_contract
				+ ", bt_value_configured_in_fc=" + bt_value_configured_in_fc + ", bt_unit_as_configured_in_fc="
				+ bt_unit_as_configured_in_fc + ", error_curve_file=" + error_curve_file + ", ap_source_id="
				+ ap_source_id + ", ap_frequency_of_update=" + ap_frequency_of_update
				+ ", ap_data_used_for_update_in_fc=" + ap_data_used_for_update_in_fc + ", ap_last_date_of_update_in_fc="
				+ ap_last_date_of_update_in_fc + ", ap_present_value=" + ap_present_value
				+ ", ap_unit_as_configured_in_fc=" + ap_unit_as_configured_in_fc + ", ccm_as_per_contract="
				+ ccm_as_per_contract + ", ccm_as_configured_in_fc=" + ccm_as_configured_in_fc
				+ ", hvmm_as_per_contract=" + hvmm_as_per_contract + ", hvmm_as_configured_in_fc="
				+ hvmm_as_configured_in_fc + ", present_values=" + present_values + ", ap_next_date_of_update_in_fc="
				+ ap_next_date_of_update_in_fc + "]";
	}
	
	
	
	
	
	

}
