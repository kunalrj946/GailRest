package com.mass.model;

public class OrificePlateData {
	
	 Integer stream_id = 0;                 ;              // integer 
	 Integer mmst_id                        ;              // integer 
	 Object stream_no                      ;              // integer       NO_OF_STREAM    
	 Object last_calibration_date          ;              // timestamp(6) without time zone 
	 Object next_calibration_date          ;              // timestamp(6) without time zone  
	 Object dtl_of_calibration_agny        ;              // character varying(100)          
	 Object last_date_tube_inspection      ;              // timestamp(6) without time zone 
	 Object next_date_tube_inspection      ;              // timestamp(6) without time zone 
	 Object date_inspection_data_update_fc ="25/06/2021";    // timestamp(6) without time zone		//mappiing not done
	                  
	                  
	 Object last_error_curve               ;              // timestamp(6) without time zone                        
	 Object last_meter_inspection          ;              // timestamp(6)                     
	 
	 Object next_meter_inspection          ;              // timestamp(6)                        
	 
	 Object last_health_monitoring         ;              // timestamp(6)                       
	 Object next_health_monitoring         ;              // timestamp(6)                        
	 Object stream_configured              ;              // integer                       
	 Object output_custody                 ;              // integer                       
	 Object next_sos_verification          ;              // timestamp(6)                       
	 Object last_sos_verification          ;              // timestamp(6)                      
	 Object consumer     				   ;			  // Integer
	 							
	 public Integer getStream_id() {
		return stream_id;
	}
	public void setStream_id(Integer stream_id) {
		this.stream_id = stream_id;
	}
	public Object getLast_calibration_date() {
		return last_calibration_date;
	}
	public void setLast_calibration_date(Object last_calibration_date) {
		this.last_calibration_date = last_calibration_date;
	}
	public Object getNext_calibration_date() {
		return next_calibration_date;
	}
	public void setNext_calibration_date(Object next_calibration_date) {
		this.next_calibration_date = next_calibration_date;
	}
	public Object getDtl_of_calibration_agny() {
		return dtl_of_calibration_agny;
	}
	public void setDtl_of_calibration_agny(Object dtl_of_calibration_agny) {
		this.dtl_of_calibration_agny = dtl_of_calibration_agny;
	}
	public Object getLast_date_tube_inspection() {
		return last_date_tube_inspection;
	}
	public void setLast_date_tube_inspection(Object last_date_tube_inspection) {
		this.last_date_tube_inspection = last_date_tube_inspection;
	}
	public Object getNext_date_tube_inspection() {
		return next_date_tube_inspection;
	}
	public void setNext_date_tube_inspection(Object next_date_tube_inspection) {
		this.next_date_tube_inspection = next_date_tube_inspection;
	}
	public Object getDate_inspection_data_update_fc() {
		return date_inspection_data_update_fc;
	}
	public void setDate_inspection_data_update_fc(Object date_inspection_data_update_fc) {
		this.date_inspection_data_update_fc = date_inspection_data_update_fc;
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
	public Object getLast_error_curve() {
		return last_error_curve;
	}
	public void setLast_error_curve(Object last_error_curve) {
		this.last_error_curve = last_error_curve;
	}
	public Object getLast_meter_inspection() {
		return last_meter_inspection;
	}
	public void setLast_meter_inspection(Object last_meter_inspection) {
		this.last_meter_inspection = last_meter_inspection;
	}
	public Object getNext_meter_inspection() {
		return next_meter_inspection;
	}
	public void setNext_meter_inspection(Object next_meter_inspection) {
		this.next_meter_inspection = next_meter_inspection;
	}
	public Object getLast_health_monitoring() {
		return last_health_monitoring;
	}
	public void setLast_health_monitoring(Object last_health_monitoring) {
		this.last_health_monitoring = last_health_monitoring;
	}
	public Object getNext_health_monitoring() {
		return next_health_monitoring;
	}
	public void setNext_health_monitoring(Object next_health_monitoring) {
		this.next_health_monitoring = next_health_monitoring;
	}
	public Object getStream_configured() {
		return stream_configured;
	}
	public void setStream_configured(Object stream_configured) {
		this.stream_configured = stream_configured;
	}
	public Object getOutput_custody() {
		return output_custody;
	}
	public void setOutput_custody(Object output_custody) {
		this.output_custody = output_custody;
	}
	public Object getNext_sos_verification() {
		return next_sos_verification;
	}
	public void setNext_sos_verification(Object next_sos_verification) {
		this.next_sos_verification = next_sos_verification;
	}
	public Object getLast_sos_verification() {
		return last_sos_verification;
	}
	public void setLast_sos_verification(Object last_sos_verification) {
		this.last_sos_verification = last_sos_verification;
	}
	public Object getConsumer() {
		return consumer;
	}
	public void setConsumer(Object consumer) {
		this.consumer = consumer;
	}
	@Override
	public String toString() {
		return "OrificePlateData [stream_id=" + stream_id + ", last_calibration_date=" + last_calibration_date
				+ ", next_calibration_date=" + next_calibration_date + ", dtl_of_calibration_agny="
				+ dtl_of_calibration_agny + ", last_date_tube_inspection=" + last_date_tube_inspection
				+ ", next_date_tube_inspection=" + next_date_tube_inspection + ", date_inspection_data_update_fc="
				+ date_inspection_data_update_fc + ", mmst_id=" + mmst_id + ", stream_no=" + stream_no
				+ ", last_error_curve=" + last_error_curve + ", last_meter_inspection=" + last_meter_inspection
				+ ", next_meter_inspection=" + next_meter_inspection + ", last_health_monitoring="
				+ last_health_monitoring + ", next_health_monitoring=" + next_health_monitoring + ", stream_configured="
				+ stream_configured + ", output_custody=" + output_custody + ", next_sos_verification="
				+ next_sos_verification + ", last_sos_verification=" + last_sos_verification + ", consumer=" + consumer
				+ "]";
	}
	
	
}
