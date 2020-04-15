package com.mass.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mass.model.ISORequest;
import com.mass.model.ISOResponse;
import com.mass.model.ValueUnitPOJO;

@Service
public class ISOService {
	
	
	
public ISOResponse calculateCalorificValue(ISORequest isoRequest) {
	
	ObjectMapper mapper = new ObjectMapper();
	Map<String, Object> map = 
		    mapper.convertValue(isoRequest.getGasComposition()[0], new TypeReference<Map<String, Object>>() {});
	HashMap<String,Double> idealGasNCV = new HashMap<String,Double>();
	HashMap<String,Double> idealGasGCV = new HashMap<String,Double>();
	HashMap<String,Double> summationFactor = new HashMap<String,Double>();
	HashMap<String,Double> molarMass = new HashMap<String,Double>();
	HashMap<String,Double> bj = new HashMap<String,Double>();
	String standard = isoRequest.getStandard();

	double entalpyOfVapour  = 44.431d;
	double molarMassAir = 28.9626d;//input
	double densityOfAir = 0.99958d;//input
	double basePressure = 101.325d;//input
	double baseTemperature = 15d;//input
	double compressZ = 8.31451d;

	
	/*
	 * HashMap<String,Double> idealGasNCV = new HashMap<String,Double>();
	idealGasNCV.put("nitrogen", 0d);
	idealGasNCV.put("carbon_dioxide", 0d);
	idealGasNCV.put("methane", 33.948d);
	idealGasNCV.put("ethane", 60.43d);
	idealGasNCV.put("propane", 86.42d);
	idealGasNCV.put("iso_butane", 112.01d);
	idealGasNCV.put("normal_butane", 112.4d);
	idealGasNCV.put("iso_pentane", 138.09d);
	idealGasNCV.put("normal_pentane", 138.38d);
	idealGasNCV.put("hexane", 164.4d);
	idealGasNCV.put("heptane", 190.39d);
	idealGasNCV.put("octane", 216.37d);
	idealGasNCV.put("nonane", 242.4d);
	idealGasNCV.put("deccane", 0d);
	idealGasNCV.put("air", 0d);
	idealGasNCV.put("water", 0d);
	idealGasNCV.put("argon", 0d);
	idealGasNCV.put("corbon_monoxide", 0d);
	idealGasNCV.put("hydrogen_sulphide", 0d);
	idealGasNCV.put("helium", 0d);
	idealGasNCV.put("hydrogen", 0d);
	idealGasNCV.put("oxygen", 0d);
	idealGasNCV.put("other", 0d);
	idealGasNCV.put("ethylene", 0d);
	
	HashMap<String,Double> idealGasGCV = new HashMap<String,Double>();
	idealGasGCV.put("nitrogen", 0d);
	idealGasGCV.put("carbon_dioxide", 0d);
	idealGasGCV.put("methane", 37.706d);
	idealGasGCV.put("ethane", 66.07d);
	idealGasGCV.put("propane", 93.94d);
	idealGasGCV.put("iso_butane", 121.4d);
	idealGasGCV.put("normal_butane", 121.79d);
	idealGasGCV.put("iso_pentane", 149.360d);
	idealGasGCV.put("normal_pentane", 149.66d);
	idealGasGCV.put("hexane", 177.55d);
	idealGasGCV.put("heptane", 205.42d);
	idealGasGCV.put("octane", 233.28d);
	idealGasGCV.put("nonane", 261.19d);
	idealGasGCV.put("deccane", 0d);
	idealGasGCV.put("air", 0d);
	idealGasGCV.put("water", 0d);
	idealGasGCV.put("argon", 0d);
	idealGasGCV.put("corbon_monoxide", 0d);
	idealGasGCV.put("hydrogen_sulphide", 0d);
	idealGasGCV.put("helium", 0d);
	idealGasGCV.put("hydrogen", 0d);
	idealGasGCV.put("oxygen", 0d);
	idealGasGCV.put("other", 0d);
	idealGasGCV.put("ethylene", 0d);
	
	 * 
	 * 
	 * 
	 * 
	 * */
	
	if("1995".equals(standard)) {
		//HashMap<String,Double> idealGasNCV = new HashMap<String,Double>();
		idealGasNCV.put("nitrogen", 0d);
		idealGasNCV.put("carbon_dioxide", 0d);
		idealGasNCV.put("methane", 802.690d);
		idealGasNCV.put("ethane", 1428.840d);
		idealGasNCV.put("propane", 2043.370d);
		idealGasNCV.put("iso_butane", 2648.420d);
		idealGasNCV.put("normal_butane", 2657.600d);
		idealGasNCV.put("iso_pentane", 3265.080d);
		idealGasNCV.put("normal_pentane", 3272.000d);
		idealGasNCV.put("hexane", 3887.210d);
		idealGasNCV.put("heptane", 4501.720d);
		idealGasNCV.put("octane", 5116.110d);
		idealGasNCV.put("nonane", 5731.490d);
		idealGasNCV.put("deccane", 6346.140d);
		idealGasNCV.put("air", 0d);
		idealGasNCV.put("water", 0d);
		idealGasNCV.put("argon", 0d);
		idealGasNCV.put("corbon_monoxide", 282.91d);
		idealGasNCV.put("hydrogen_sulphide", 517.95d);
		idealGasNCV.put("helium", 0d);
		idealGasNCV.put("hydrogen", 241.72d);
		idealGasNCV.put("oxygen", 0d);
		idealGasNCV.put("other", 0d);
		idealGasNCV.put("ethylene", 0d);
		
		
		idealGasGCV.put("nitrogen", 0d);
		idealGasGCV.put("carbon_dioxide", 0d);
		idealGasGCV.put("methane", 891.560000d);
		idealGasGCV.put("ethane", 1562.140000d);
		idealGasGCV.put("propane", 2221.100000d);
		idealGasGCV.put("iso_butane", 2870.580000d);
		idealGasGCV.put("normal_butane", 2879.760000d);
		idealGasGCV.put("iso_pentane", 3531.680000d);
		idealGasGCV.put("normal_pentane", 3538.600000d);
		idealGasGCV.put("hexane", 4198.240000d);
		idealGasGCV.put("heptane", 4857.180000d);
		idealGasGCV.put("octane", 5516.010000d);
		idealGasGCV.put("nonane", 6175.820000d);
		idealGasGCV.put("deccane", 6834.900000d);
		idealGasGCV.put("air", 0d);
		idealGasGCV.put("water", 44.433000d);
		idealGasGCV.put("argon", 0d);
		idealGasGCV.put("corbon_monoxide", 282.910000d);
		idealGasGCV.put("hydrogen_sulphide", 562.380000d);
		idealGasGCV.put("helium", 0d);
		idealGasGCV.put("hydrogen", 286.150000d);
		idealGasGCV.put("oxygen", 0d);
		idealGasGCV.put("other", 0d);
		idealGasGCV.put("ethylene", 0d);
		
		
		summationFactor.put("nitrogen", 0.017300d);
		summationFactor.put("carbon_dioxide", 0.074800d);
		summationFactor.put("methane", 0.044700d);
		summationFactor.put("ethane", 0.092200d);
		summationFactor.put("propane", 0.133800d);
		summationFactor.put("iso_butane", 0.178900d);
		summationFactor.put("normal_butane", 0.187100d);
		summationFactor.put("iso_pentane", 0.228000d);
		summationFactor.put("normal_pentane", 0.251000d);
		summationFactor.put("hexane", 0.295000d);
		summationFactor.put("heptane", 0.366100d);
		summationFactor.put("octane", 0.445000d);
		summationFactor.put("nonane", 0.538500d);
		summationFactor.put("deccane", 0.645000d);
		summationFactor.put("air", 0d);
		summationFactor.put("water", 0.234500d);
		summationFactor.put("argon", 0.028300d);
		summationFactor.put("corbon_monoxide", 0.022400d);
		summationFactor.put("hydrogen_sulphide", 0.100000d);
		summationFactor.put("helium", 0.000200d);
		summationFactor.put("hydrogen", 0.004800d);
		summationFactor.put("oxygen", 0.028300d);
		summationFactor.put("other", 0d);
		summationFactor.put("ethylene", 0d);
		
		
		molarMass.put("nitrogen", 28.013500d);
		molarMass.put("carbon_dioxide", 44.010000d);
		molarMass.put("methane",16.043000d);
		molarMass.put("ethane", 30.070000d);
		molarMass.put("propane", 44.097000d);
		molarMass.put("iso_butane", 58.123000d);
		molarMass.put("normal_butane", 58.123000d);
		molarMass.put("iso_pentane",72.150000d);
		molarMass.put("normal_pentane", 72.150000d);
		molarMass.put("hexane", 86.177000d);
		molarMass.put("heptane", 100.204000d);
		molarMass.put("octane", 114.231000d);
		molarMass.put("nonane", 128.258000d);
		molarMass.put("deccane", 142.285000d);
		molarMass.put("air", 28.962600d);
		molarMass.put("water", 18.015300d);
		molarMass.put("argon", 39.948000d);
		molarMass.put("corbon_monoxide", 28.010000d);
		molarMass.put("hydrogen_sulphide", 34.082000d);
		molarMass.put("helium", 4.002600d);
		molarMass.put("hydrogen", 2.015900d);
		molarMass.put("oxygen", 31.998800d);
		molarMass.put("other", 0d);
		molarMass.put("ethylene", 0d);

		entalpyOfVapour = 44.431d;
		molarMassAir = 28.9626d;//input
		densityOfAir = 0.99958d;//input
		basePressure = 101.325d;//input
		baseTemperature = 15d;//input
		compressZ = 8.31451d;

	
	}
	
	
	if("2016".equals(standard)) {
		
		idealGasNCV.put("nitrogen", 0d);
		idealGasNCV.put("carbon_dioxide", 0d);
		idealGasNCV.put("methane", 802.690d);
		idealGasNCV.put("ethane", 1428.840d);
		idealGasNCV.put("propane", 2043.370d);
		idealGasNCV.put("iso_butane", 2648.420d);
		idealGasNCV.put("normal_butane", 2657.600d);
		idealGasNCV.put("iso_pentane", 3265.080d);
		idealGasNCV.put("normal_pentane", 3272.000d);
		idealGasNCV.put("hexane", 3887.210d);
		idealGasNCV.put("heptane", 4501.720d);
		idealGasNCV.put("octane", 5116.110d);
		idealGasNCV.put("nonane", 5731.490d);
		idealGasNCV.put("deccane", 6346.140d);
		idealGasNCV.put("air", 0d);
		idealGasNCV.put("water", 0d);
		idealGasNCV.put("argon", 0d);
		idealGasNCV.put("corbon_monoxide", 282.91d);
		idealGasNCV.put("hydrogen_sulphide", 517.95d);
		idealGasNCV.put("helium", 0d);
		idealGasNCV.put("hydrogen", 241.72d);
		idealGasNCV.put("oxygen", 0d);
		idealGasNCV.put("other", 0d);
		idealGasNCV.put("ethylene", 0d);
		
	//	HashMap<String,Double> idealGasGCV = new HashMap<String,Double>();
		idealGasGCV.put("nitrogen", 0d);
		idealGasGCV.put("carbon_dioxide", 0d);
		idealGasGCV.put("methane", 891.510000d);
		idealGasGCV.put("ethane", 1562.140000d);
		idealGasGCV.put("propane", 2221.100000d);
		idealGasGCV.put("iso_butane", 2870.580000d);
		idealGasGCV.put("normal_butane", 2879.760000d);
		idealGasGCV.put("iso_pentane", 3531.680000d);
		idealGasGCV.put("normal_pentane", 3538.600000d);
		idealGasGCV.put("hexane", 4198.240000d);
		idealGasGCV.put("heptane", 4857.180000d);
		idealGasGCV.put("octane", 5516.010000d);
		idealGasGCV.put("nonane", 6175.820000d);
		idealGasGCV.put("deccane", 6834.900000d);

		idealGasGCV.put("air", 0d);
		idealGasGCV.put("water", 44.431000d);
		idealGasGCV.put("argon", 0d);
		idealGasGCV.put("corbon_monoxide", 282.910000d);
		idealGasGCV.put("hydrogen_sulphide", 562.380000d);
		idealGasGCV.put("helium", 0d);
		idealGasGCV.put("hydrogen", 286.150000d);
		idealGasGCV.put("oxygen", 0d);
		idealGasGCV.put("other", 0d);
		idealGasGCV.put("ethylene", 0d);

		//HashMap<String,Double> summationFactor = new HashMap<String,Double>();
		

		summationFactor.put("nitrogen", 0.017000d);
		summationFactor.put("carbon_dioxide", 0.752000d);
		summationFactor.put("methane", 0.044520d);
		summationFactor.put("ethane", 0.091900d);
		summationFactor.put("propane", 0.134400d);
		summationFactor.put("iso_butane", 0.172200d);
		summationFactor.put("normal_butane", 0.184000d);
		summationFactor.put("iso_pentane", 0.225100d);
		summationFactor.put("normal_pentane", 0.236100d);
		summationFactor.put("hexane", 0.300100d);
		summationFactor.put("heptane", 0.366800d);
		summationFactor.put("octane", 0.434600d);
		summationFactor.put("nonane", 0.503000d);
		summationFactor.put("deccane",0.599100d);

		summationFactor.put("air", 0d);
		summationFactor.put("water", 0.256200d);
		summationFactor.put("argon", 0.027300d);
		summationFactor.put("corbon_monoxide", 0.0217000d);
		summationFactor.put("hydrogen_sulphide", 0.092300d);
		summationFactor.put("helium", 0d);
		summationFactor.put("hydrogen", 286.150000d);
		summationFactor.put("oxygen", 0.027600d);
		summationFactor.put("other", 0d);
		summationFactor.put("ethylene", 0d);

		//HashMap<String,Double> molarMass = new HashMap<String,Double>();
		molarMass.put("nitrogen", 28.013400d);
		molarMass.put("carbon_dioxide", 44.009500d);
		molarMass.put("methane",16.042460d);
		molarMass.put("ethane", 30.069040d);
		molarMass.put("propane", 44.095620d);
		molarMass.put("iso_butane", 58.122200d);
		molarMass.put("normal_butane", 58.122200d);
		molarMass.put("iso_pentane",72.148780d);
		molarMass.put("normal_pentane", 72.148780d);
		molarMass.put("hexane", 86.175360d);
		molarMass.put("heptane", 100.201940d);
		molarMass.put("octane", 114.228520d);
		molarMass.put("nonane", 128.255100d);
		molarMass.put("deccane", 142.281680d);

		molarMass.put("air", 28.965460d);
		molarMass.put("water", 18.015280d);
		molarMass.put("argon", 39.948000d);
		molarMass.put("corbon_monoxide", 28.010100d);
		molarMass.put("hydrogen_sulphide", 34.080880d);
		molarMass.put("helium", 4.002602d);
		molarMass.put("hydrogen", 2.015880d);
		molarMass.put("oxygen", 31.998800d);
		molarMass.put("other", 0d);
		molarMass.put("ethylene", 0d);

		
        bj.put("nitrogen", 0d);
        bj.put("carbon_dioxide", 0d);
        bj.put("methane",4d);
		bj.put("ethane", 6d);
		bj.put("propane", 8d);
		bj.put("iso_butane", 10d);
		bj.put("normal_butane", 10d);
		bj.put("iso_pentane",12d);
		bj.put("normal_pentane", 12d);
		bj.put("hexane", 14d);
		bj.put("heptane", 16d);
		bj.put("octane", 18d);
		bj.put("nonane", 20d);
		bj.put("deccane", 22d);
		
		bj.put("air", 0d);
		bj.put("water", 2d);
		bj.put("argon", 0d);
		bj.put("corbon_monoxide", 0d);
		bj.put("hydrogen_sulphide", 2d);
		bj.put("helium", 0d);
		bj.put("hydrogen", 2d);
		bj.put("oxygen", 0d);
		bj.put("other", 0d);
		bj.put("ethylene", 0d);

		entalpyOfVapour = 44.431d;
		molarMassAir = 28.96546d;//input
		densityOfAir = 0.999595d;//input
		basePressure = 101.325d;//input
		baseTemperature = 15d;//input
		compressZ = 8.3144621d;
		
	}


	double gcSum=0.0d;
	double ncvIntSum=0.0d;
	double gcvIntSum=0.0d;
	double molefraction = 0.0d;
	double GCVFraction = 0.0d;
	double molecularWeightFraction = 0.0d;
	double NCVFraction = 0.0d;
	double compressFraction = 0.0d;

	Set<String> gcKeySet= map.keySet();
	
	Iterator<String> gcIterator = gcKeySet.iterator();
	
	while(gcIterator.hasNext()) {
		String gas = gcIterator.next();
		
		System.out.println(gas);
		System.out.println((double)map.get(gas));
		gcSum += (double)map.get(gas);
		
	}

    gcIterator = gcKeySet.iterator();
	
	while(gcIterator.hasNext()) {
		String gas = gcIterator.next();
		
		//ncvIntSum += ((((double)map.get(gas)*100)/gcSum)*idealGasNCV.get(gas))/100d;
		if("1995".equals(standard)) {
			double gasMolarFraction=(((double)map.get(gas)*100)/gcSum)/100d;
			double gasNCV = gasMolarFraction*idealGasNCV.get(gas);
			ncvIntSum += gasNCV;
			
			gcvIntSum += ((((double)map.get(gas)*100)/gcSum)*idealGasGCV.get(gas))/100d;
			
			molecularWeightFraction += ((((double)map.get(gas)*100)/gcSum)*molarMass.get(gas))/100d;
			compressFraction += ((((double)map.get(gas)*100)/gcSum)*summationFactor.get(gas))/100d;
		}
		
		if("2016".equals(standard)) {
			double gasMolarFraction=(((double)map.get(gas)*100)/gcSum)/100d;
			double gasGCV = gasMolarFraction*idealGasGCV.get(gas);
			gcvIntSum +=gasGCV;
					
			
			double gasNCV = gasGCV - gasMolarFraction * ((double)bj.get(gas)/2)*entalpyOfVapour;
			ncvIntSum += gasNCV;
			
			molecularWeightFraction += ((((double)map.get(gas)*100)/gcSum)*molarMass.get(gas))/100d;
			compressFraction += ((((double)map.get(gas)*100)/gcSum)*summationFactor.get(gas))/100d;
		}
	}
	
	System.out.println(ncvIntSum);
	System.out.println(gcvIntSum);
	//double gasCompresibilty=isoRequest.getGasCompresibilty();
	
	double gasCompresibilty=1-(compressFraction*compressFraction);

	//double ncv=ncvIntSum/gasCompresibilty;
	//double gcv=gcvIntSum/gasCompresibilty;
	
	double molecularWeight = molecularWeightFraction;
	double zbAt15C = 1-(compressFraction*compressFraction);
	double relativeDensityIdeal = molecularWeight/molarMassAir;
	double relativeDensityReal = relativeDensityIdeal*densityOfAir/zbAt15C;

	double NCVMolarIdeal = ncvIntSum;
	double NCVMolarReal = NCVMolarIdeal;
	double NCVVolumeIdeal = (NCVMolarIdeal*basePressure)/((baseTemperature + 273.15d)*compressZ);
	double NCVVolumeReal = (NCVMolarIdeal/zbAt15C)*basePressure/((baseTemperature + 273.15d)*compressZ);
	double NCVMassIdeal = NCVMolarReal/molecularWeight;
	double NCVMassReal = NCVMolarReal/molecularWeight;
	double wobbeIndexIdeal = NCVVolumeIdeal/Math.sqrt(relativeDensityIdeal);
	double wobbeIndexReal = NCVVolumeReal/Math.sqrt(relativeDensityReal);
	
	
	double GCVMolarIdeal = gcvIntSum;
	double GCVMolarReal = GCVMolarIdeal;
	double GCVVolumeIdeal = (GCVMolarIdeal*basePressure)/((baseTemperature + 273.15d)*compressZ);
	double GCVVolumeReal = (GCVMolarIdeal/zbAt15C)*basePressure/((baseTemperature + 273.15d)*compressZ);
	double GCVMassIdeal = GCVMolarReal/molecularWeight;
	double GCVMassReal = GCVMolarReal/molecularWeight;
	double gcvWobbeIndexIdeal = GCVVolumeIdeal/Math.sqrt(relativeDensityIdeal);
	double gcvWobbeIndexReal = GCVVolumeReal/Math.sqrt(relativeDensityReal);
	
    ISOResponse isoResponse = new ISOResponse();
//    isoResponse.setNCV(getValueUnitArray(ncv,"MJ/m3"));
  //  isoResponse.setGCV(getValueUnitArray(gcv,"MJ/m3"));
    
    isoResponse.setGCVMassIdeal(getValueUnitArray(GCVMassIdeal,"MJ/kg"));
    isoResponse.setGCVMassReal(getValueUnitArray(GCVMassReal,"MJ/kg"));
    isoResponse.setGCVMolarIdeal(getValueUnitArray(GCVMolarIdeal,"KJ/Mol"));
    isoResponse.setGCVMolarReal(getValueUnitArray(GCVMolarReal,"KJ/Mol"));
    isoResponse.setGCVVolumeIdeal(getValueUnitArray(GCVVolumeIdeal,"MJ/m3"));
    isoResponse.setGCVVolumeReal(getValueUnitArray(GCVVolumeReal,"MJ/m3"));
    isoResponse.setGcvWobbeIndexIdeal(getValueUnitArray(gcvWobbeIndexIdeal,"MJ/m3"));
    isoResponse.setGcvWobbeIndexReal(getValueUnitArray(gcvWobbeIndexReal,"MJ/m3"));
    isoResponse.setMolecularWeight(getValueUnitArray(molecularWeight,"kg/mol"));
    isoResponse.setNCVMassIdeal(getValueUnitArray(NCVMassIdeal,"MJ/kg"));
    isoResponse.setNCVMassReal(getValueUnitArray(NCVMassReal,"MJ/kg"));
    isoResponse.setNCVMolarIdeal(getValueUnitArray(NCVMolarIdeal,"KJ/Mol"));
    isoResponse.setNCVMolarReal(getValueUnitArray(NCVMolarReal,"KJ/Mol"));
    isoResponse.setNCVVolumeIdeal(getValueUnitArray(NCVVolumeIdeal,"MJ/m3"));
    isoResponse.setNCVVolumeReal(getValueUnitArray(NCVVolumeReal,"MJ/m3"));
    isoResponse.setRelativeDensityIdeal(getValueUnitArray(relativeDensityIdeal,""));
    isoResponse.setRelativeDensityReal(getValueUnitArray(relativeDensityReal,""));
    isoResponse.setWobbeIndexIdeal(getValueUnitArray(wobbeIndexIdeal,"MJ/m3"));
    isoResponse.setWobbeIndexReal(getValueUnitArray(wobbeIndexReal,"MJ/m3"));
    isoResponse.setZbAt15C(getValueUnitArray(zbAt15C,""));
    System.out.println(isoResponse.toString());
    return isoResponse;

}

private ValueUnitPOJO getValueUnitArray(double value,String unit) {
	  
	  ValueUnitPOJO valueUnitPOJO = new ValueUnitPOJO();
	  valueUnitPOJO.setValue(value);
	  valueUnitPOJO.setUnit(unit);
	//  ValueUnitPOJO[] valueUnitPOJOArray = new ValueUnitPOJO[] {valueUnitPOJO};
	  return valueUnitPOJO;
}

}
