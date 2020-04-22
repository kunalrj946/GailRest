package com.mass.model;

public class MMST_DB {	
		  
//		Integer mmst_id;							//auto genrated
	 	Object station_id  ;         
	 	Object pipelinemst_id ;         
	 	Object maintenance_base_id  ;   
	 	
	 	Integer process_fluid_id  ;   					//for switch   
	 	Integer  metering_type_id;  					    // for switch
	 	
	 	Object sap_id ;
	 	Object name_of_consumer_types;
	 	Object metering_capcity;
	 	Object metering_pressure;
	 	Object avg_metering_temeprature;
	 	Object avg_daily_consumption;
		Object no_of_stream;
		Object configuration;
		Object remarks;
	 	
	 	Integer status =0  ;   		
       	Integer is_delted = 0;
	 	Object 	no_flow = 0 ;
	 	
		public Object getStation_id() {
			return station_id;
		}
		public void setStation_id(Object station_id) {
			this.station_id = station_id;
		}
		public Object getPipelinemst_id() {
			return pipelinemst_id;
		}
		public void setPipelinemst_id(Object pipelinemst_id) {
			this.pipelinemst_id = pipelinemst_id;
		}
		public Object getMaintenance_base_id() {
			return maintenance_base_id;
		}
		public void setMaintenance_base_id(Object maintenance_base_id) {
			this.maintenance_base_id = maintenance_base_id;
		}
		public Integer getProcess_fluid_id() {
			return process_fluid_id;
		}
		public void setProcess_fluid_id(Integer process_fluid_id) {
			this.process_fluid_id = process_fluid_id;
		}
		public Integer getMetering_type_id() {
			return metering_type_id;
		}
		public void setMetering_type_id(Integer metering_type_id) {
			this.metering_type_id = metering_type_id;
		}
		public Object getSap_id() {
			return sap_id;
		}
		public void setSap_id(Object sap_id) {
			this.sap_id = sap_id;
		}
		public Object getName_of_consumer_types() {
			return name_of_consumer_types;
		}
		public void setName_of_consumer_types(Object name_of_consumer_types) {
			this.name_of_consumer_types = name_of_consumer_types;
		}
		public Object getMetering_capcity() {
			return metering_capcity;
		}
		public void setMetering_capcity(Object metering_capcity) {
			this.metering_capcity = metering_capcity;
		}
		public Object getMetering_pressure() {
			return metering_pressure;
		}
		public void setMetering_pressure(Object metering_pressure) {
			this.metering_pressure = metering_pressure;
		}
		public Object getAvg_metering_temeprature() {
			return avg_metering_temeprature;
		}
		public void setAvg_metering_temeprature(Object avg_metering_temeprature) {
			this.avg_metering_temeprature = avg_metering_temeprature;
		}
		public Object getAvg_daily_consumption() {
			return avg_daily_consumption;
		}
		public void setAvg_daily_consumption(Object avg_daily_consumption) {
			this.avg_daily_consumption = avg_daily_consumption;
		}
		public Object getNo_of_stream() {
			return no_of_stream;
		}
		public void setNo_of_stream(Object no_of_stream) {
			this.no_of_stream = no_of_stream;
		}
		public Object getConfiguration() {
			return configuration;
		}
		public void setConfiguration(Object configuration) {
			this.configuration = configuration;
		}
		public Object getRemarks() {
			return remarks;
		}
		public void setRemarks(Object remarks) {
			this.remarks = remarks;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getIs_delted() {
			return is_delted;
		}
		public void setIs_delted(Integer is_delted) {
			this.is_delted = is_delted;
		}
		public Object getNo_flow() {
			return no_flow;
		}
		public void setNo_flow(Object no_flow) {
			this.no_flow = no_flow;
		}
		@Override
		public String toString() {
			return "MMST_DB [station_id=" + station_id + ", pipelinemst_id=" + pipelinemst_id + ", maintenance_base_id="
					+ maintenance_base_id + ", process_fluid_id=" + process_fluid_id + ", metering_type_id="
					+ metering_type_id + ", sap_id=" + sap_id + ", name_of_consumer_types=" + name_of_consumer_types
					+ ", metering_capcity=" + metering_capcity + ", metering_pressure=" + metering_pressure
					+ ", avg_metering_temeprature=" + avg_metering_temeprature + ", avg_daily_consumption="
					+ avg_daily_consumption + ", no_of_stream=" + no_of_stream + ", configuration=" + configuration
					+ ", remarks=" + remarks + ", status=" + status + ", is_delted=" + is_delted + ", no_flow="
					+ no_flow + "]";
		}  
	 	
}
