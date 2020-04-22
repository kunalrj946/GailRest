package com.mass.model;

public class ValueUnitPOJO {
	
	double value;
	String unit;
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "ValueUnitPOJO [value=" + value + ", unit=" + unit + "]";
	}
	
   
}
