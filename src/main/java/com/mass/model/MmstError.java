package com.mass.model;

public class MmstError {

	int dataInserted;
	int errorCode;
	Object fieldName;
	Object errorMessage;

	public int getDataInserted() {
		return dataInserted;
	}

	public void setDataInserted(int dataInserted) {
		this.dataInserted = dataInserted;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Object getFieldName() {
		return fieldName;
	}

	public void setFieldName(Object fieldName) {
		this.fieldName = fieldName;
	}

	public Object getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "MmstError [dataInserted=" + dataInserted + ", errorCode=" + errorCode + ", fieldName=" + fieldName
				+ ", errorMessage=" + errorMessage + "]";
	}

}
