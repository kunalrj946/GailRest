package com.mass.model;

import java.util.Arrays;

public class ISORequest {
	
	Double gasCompresibilty;
	String standard;
	GasComposition[] gasComposition;
	String rmct;
	
	public Double getGasCompresibilty() {
		return gasCompresibilty;
	}
	public void setGasCompresibilty(Double gasCompresibilty) {
		this.gasCompresibilty = gasCompresibilty;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public GasComposition[] getGasComposition() {
		return gasComposition;
	}
	public void setGasComposition(GasComposition[] gasComposition) {
		this.gasComposition = gasComposition;
	}
	public String getRmct() {
		return rmct;
	}
	public void setRmct(String rmct) {
		this.rmct = rmct;
	}
	@Override
	public String toString() {
		return "ISORequest [gasCompresibilty=" + gasCompresibilty + ", standard=" + standard + ", gasComposition="
				+ Arrays.toString(gasComposition) + ", rmct=" + rmct + "]";
	}
	
	
	
	

}
