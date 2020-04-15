package com.mass.model;

import java.util.List;

public class PrimaryMeterData {
	
//	Object stream_id ;					// Auto generated             
	Object stream_no ;					// 1/2/n
	Integer mmst_id ;              		// already generated
	Object  make;         				// PRIMARY_MAKE
	Object model;          				// PRIMARY_MODEL
	Object meter_type;       			// METERING_TYPE
	Object k_factor;        			// KFACTOR
	Object tag_no;      				// PRIMARY_TAG_NO
	Object serial_no;         			// PRIMARY_SERIAL_NO
	Object meter_size;       			// PRIMARY_METER_SIZE
	Object pressure_class;     			// PRIMARY_PRESSURE_CLASS
	Object g_rating;   					// PRIMARY_G_RATING
	Object q_max;    					// PRIMARY_Q_MAX
	Object q_min;    					//  PRIMARY_Q_MIN
	Object orifice_diameter;    		//	PRIMARY_ORIFICE_DIA
	Object meter_tube_pipeline_dia; 	// PRIMARY_TUBE_DIAMETER
	int connectivity_id;				//
	Integer consumer =0;					// consumer_name (consumer is of type interger but expresio character varying
	Integer fc_id = 1;
	
	
	public Object getStream_no() {
		return stream_no;
	}
	public void setStream_no(Object stream_no) {
		this.stream_no = stream_no;
	}
	public Integer getMmst_id() {
		return mmst_id;
	}
	public void setMmst_id(Integer mmst_id) {
		this.mmst_id = mmst_id;
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
	public Object getMeter_type() {
		return meter_type;
	}
	public void setMeter_type(Object meter_type) {
		this.meter_type = meter_type;
	}
	public Object getK_factor() {
		return k_factor;
	}
	public void setK_factor(Object k_factor) {
		this.k_factor = k_factor;
	}
	public Object getTag_no() {
		return tag_no;
	}
	public void setTag_no(Object tag_no) {
		this.tag_no = tag_no;
	}
	public Object getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(Object serial_no) {
		this.serial_no = serial_no;
	}
	public Object getMeter_size() {
		return meter_size;
	}
	public void setMeter_size(Object meter_size) {
		this.meter_size = meter_size;
	}
	public Object getPressure_class() {
		return pressure_class;
	}
	public void setPressure_class(Object pressure_class) {
		this.pressure_class = pressure_class;
	}
	public Object getG_rating() {
		return g_rating;
	}
	public void setG_rating(Object g_rating) {
		this.g_rating = g_rating;
	}
	public Object getQ_max() {
		return q_max;
	}
	public void setQ_max(Object q_max) {
		this.q_max = q_max;
	}
	public Object getQ_min() {
		return q_min;
	}
	public void setQ_min(Object q_min) {
		this.q_min = q_min;
	}
	public Object getOrifice_diameter() {
		return orifice_diameter;
	}
	public void setOrifice_diameter(Object orifice_diameter) {
		this.orifice_diameter = orifice_diameter;
	}
	public Object getMeter_tube_pipeline_dia() {
		return meter_tube_pipeline_dia;
	}
	public void setMeter_tube_pipeline_dia(Object meter_tube_pipeline_dia) {
		this.meter_tube_pipeline_dia = meter_tube_pipeline_dia;
	}
	public int getConnectivity_id() {
		return connectivity_id;
	}
	public void setConnectivity_id(int connectivity_id) {
		this.connectivity_id = connectivity_id;
	}
	public Integer getConsumer() {
		return consumer;
	}
	public void setConsumer(Integer consumer) {
		this.consumer = consumer;
	}
	public Integer getFc_id() {
		return fc_id;
	}
	public void setFc_id(Integer fc_id) {
		this.fc_id = fc_id;
	}
	@Override
	public String toString() {
		return "PrimaryMeterData [stream_no=" + stream_no + ", mmst_id=" + mmst_id + ", make=" + make + ", model="
				+ model + ", meter_type=" + meter_type + ", k_factor=" + k_factor + ", tag_no=" + tag_no
				+ ", serial_no=" + serial_no + ", meter_size=" + meter_size + ", pressure_class=" + pressure_class
				+ ", g_rating=" + g_rating + ", q_max=" + q_max + ", q_min=" + q_min + ", orifice_diameter="
				+ orifice_diameter + ", meter_tube_pipeline_dia=" + meter_tube_pipeline_dia + ", connectivity_id="
				+ connectivity_id + ", consumer=" + consumer + ", fc_id=" + fc_id + "]";
	}
	
	
	
	
	
}
