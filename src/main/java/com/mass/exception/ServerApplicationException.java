package com.mass.exception;

import java.util.HashMap;
import java.util.Map;

public class ServerApplicationException extends Exception {


	private static final long serialVersionUID = -713389081883819475L;
	private String errorMessage;
	private Integer errorCode;
	// General//
	public static int CHECK_INTEGER = 100001;
	public static int CHECK_DOUBLE = 100002;
	public static int CHECK_NULL = 100003;
	public static int CHECK_DATE_TIME = 100004;
	public static int PROCESS_FLUID = 100005;
	public static int METERING_TYPE = 100006;
	
	

	public Map<String, Map<Integer, String>> uiExecptionlist = null;
	public HashMap<String, Object> data = null;
	public String inputName = null;

	public void prepareModelException() {
		// General
		uiExecptionlist = new HashMap<String, Map<Integer, String>>();
		Map<Integer, String> en = new HashMap<Integer, String>();
		en.put(CHECK_INTEGER, "-> int Value Are Valid Only ");
		en.put(CHECK_NULL, "-> Null Value ");
		en.put(CHECK_DOUBLE, "-> Double Value Are Valid Only ");
		en.put(CHECK_DATE_TIME , "Datetime Format Not Valid  ");
		en.put(PROCESS_FLUID, "Note: It is a Mandatory field ,it must be present ,Valid Characters are (D,W,L) Only)");
		en.put(METERING_TYPE, "Note: It is a Mandatory field ,it must be present ,Valid Characters are (O,T,R,U,C) Only)");
		
		uiExecptionlist.put("en", en);
	}

//  HashMap<String, Object> output = new HashMap<String, Object>();
	public ServerApplicationException(String locale, Integer errorCode) {

		super();
		prepareModelException();
		this.setErrorCode(errorCode);
		this.setErrorMessage(uiExecptionlist.get(locale).get(errorCode));
	}
	
	
	
	public ServerApplicationException(String locale, Integer errorCode , String inputName) {

		super();
		prepareModelException();
		this.setErrorCode(errorCode);
		this.setErrorMessage(uiExecptionlist.get(locale).get(errorCode));
		this.setInputName(inputName);
	}

	public ServerApplicationException(String locale, Integer errorCode, HashMap<String, Object> data) {

		super();
		prepareModelException();
		this.setErrorCode(errorCode);
		this.setErrorMessage(uiExecptionlist.get(locale).get(errorCode));
		this.setData(data);
	}

	

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode2) {
		this.errorCode = errorCode2;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	
	
}
