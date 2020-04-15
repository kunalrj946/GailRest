package com.mass.responsemodel;

public class MmstResponse {

	int errorCode;
	String errorMessage = "";

	public MmstResponse() {
		super();
		
	}

	public MmstResponse(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "BaseCapperResponse [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}
