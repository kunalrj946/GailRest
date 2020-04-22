package com.mass.responsemodel;

public class GetContentResponse extends MmstResponse{
	
	
	String app_generated_token;

	public GetContentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getApp_generated_token() {
		return app_generated_token;
	}

	public void setApp_generated_token(String app_generated_token) {
		this.app_generated_token = app_generated_token;
	}

	@Override
	public String toString() {
		return "GetContentResponse [app_generated_token=" + app_generated_token + "]";
	}


}
