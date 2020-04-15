package com.mass.model;

import java.util.Arrays;

public class ISORequest {
	
	double gasCompresibilty;
	String standard;
	GasComposition[] gasComposition;
	public double getGasCompresibilty() {
		return gasCompresibilty;
	}
	public void setGasCompresibilty(double gasCompresibilty) {
		this.gasCompresibilty = gasCompresibilty;
	}
	public GasComposition[] getGasComposition() {
		return gasComposition;
	}
	public void setGasComposition(GasComposition[] gasComposition) {
		this.gasComposition = gasComposition;
	}
	
	
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "ISORequest [gasCompresibilty=" + gasCompresibilty + ", gasComposition="
				+ Arrays.toString(gasComposition) + "]";
	}
	

}
