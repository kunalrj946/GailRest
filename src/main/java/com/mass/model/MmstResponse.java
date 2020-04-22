package com.mass.model;

public class MmstResponse {
	
	int mmstId;
	int dataInserted;
	public int getMmstId() {
		return mmstId;
	}
	public void setMmstId(int mmstId) {
		this.mmstId = mmstId;
	}
	public int getDataInserted() {
		return dataInserted;
	}
	public void setDataInserted(int dataInserted) {
		this.dataInserted = dataInserted;
	}
	@Override
	public String toString() {
		return "MmstResponse [mmstId=" + mmstId + ", dataInserted=" + dataInserted + "]";
	}
	
	

}
