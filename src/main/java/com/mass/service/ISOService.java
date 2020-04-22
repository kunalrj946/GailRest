package com.mass.service;



import org.springframework.stereotype.Service;

import com.mass.model.ISORequest;
import com.mass.model.ISOResponse;

@Service
public class ISOService {

	public ISOResponse calculateCalorificValue(ISORequest isoRequest) {

		ISOResponse	response = new ISOResponse();

		String standard = isoRequest.getStandard();
		
		
		if("1995".equals(standard))
		{
			ISO1995	iso = new ISO1995();
			response = iso.calc95(isoRequest);
		}
		
		 else if("2016".equals(standard)) {
			
			 ISO2016	 iso = new ISO2016();
			 response = iso.calc16(isoRequest);
		}else 
		{
			System.out.println("Please Enter Valid Standard");
		}
		
		
		return response;

	}	

}
