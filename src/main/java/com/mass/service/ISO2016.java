package com.mass.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mass.model.ISORequest;
import com.mass.model.ISOResponse;
import com.mass.model.ValueUnitPOJO;

public class ISO2016 {

	public ISOResponse calc16(ISORequest isoRequest) {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = mapper.convertValue(isoRequest.getGasComposition()[0],
				new TypeReference<Map<String, Object>>() {
				});

		HashMap<String, Double> idealGasGCV = new HashMap<String, Double>();
		HashMap<String, Double> summationFactor = new HashMap<String, Double>();

		HashMap<String, Double> molarMass = new HashMap<String, Double>();
		HashMap<String, Double> bj = new HashMap<String, Double>();

//		==============================================================

	
		molarMass.put("nitrogen", 28.013400d);
		molarMass.put("carbon_dioxide", 44.009500d);
		molarMass.put("methane", 16.042460d);
		molarMass.put("ethane", 30.069040d);
		molarMass.put("propane", 44.095620d);
		molarMass.put("iso_butane", 58.122200d);
		molarMass.put("normal_butane", 58.122200d);
		molarMass.put("iso_pentane", 72.148780d);
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
		bj.put("methane", 4d);
		bj.put("ethane", 6d);
		bj.put("propane", 8d);
		bj.put("iso_butane", 10d);
		bj.put("normal_butane", 10d);
		bj.put("iso_pentane", 12d);
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

		// ===========================================================================

		double entalpyOfVapour, densityOfAir, basePressure, baseTemperature, molarMassAir, gas_constant;
		double z_dryair = 0d;

		densityOfAir = 0.99958d; // input
		baseTemperature = 15d; // input
		entalpyOfVapour = 0d;

		molarMassAir = 28.96546d; // Molar Mass of air /kg*kmol-1 //constant
		gas_constant = 8.3144621d; // Gas Constant
		basePressure = 101.325d; // Base Pressure as per Standard (KPa)

		String rmct = isoRequest.getRmct();
		String[] parts = rmct.split("/");

		String gcv_combustion_ref_temp = parts[0]; // mr Metering reference Temp
		String summation_metering_ref_temp = parts[1]; // ct Cumbustion Temperature

		// =============================================================================

		switch (gcv_combustion_ref_temp) {
		case "0":

			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 892.9200000d);
			idealGasGCV.put("ethane", 1564.350000d);
			idealGasGCV.put("propane", 2224.030000d);
			idealGasGCV.put("iso_butane", 2874.210000d);
			idealGasGCV.put("normal_butane", 2883.350000d);
			idealGasGCV.put("iso_pentane", 3536.010000d);
			idealGasGCV.put("normal_pentane", 3542.910000d);
			idealGasGCV.put("hexane", 4203.240000d);
			idealGasGCV.put("heptane", 4862.880000d);
			idealGasGCV.put("octane", 5522.41000d);
			idealGasGCV.put("nonane", 6182.920000d);
			idealGasGCV.put("deccane", 6842.6900000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 45.064000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.800000d);
			idealGasGCV.put("hydrogen_sulphide", 562.930000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 286.640000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 0d);
			entalpyOfVapour = 45.0640d;

			break;
		case "15":
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
			entalpyOfVapour = 44.4310d;

			break;

		case "15.55":
			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 891.460000d);
			idealGasGCV.put("ethane", 1562.060000d);
			idealGasGCV.put("propane", 2220.990000d);
			idealGasGCV.put("iso_butane", 2870.450000d);
			idealGasGCV.put("normal_butane", 2879.630000d);
			idealGasGCV.put("iso_pentane", 3531.520000d);
			idealGasGCV.put("normal_pentane", 3538.450000d);
			idealGasGCV.put("hexane", 4198.060000d);
			idealGasGCV.put("heptane", 4856.980000d);
			idealGasGCV.put("octane", 5515.780000d);
			idealGasGCV.put("nonane", 6175.560000d);
			idealGasGCV.put("deccane", 6834.620000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 44.408000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.910000d);
			idealGasGCV.put("hydrogen_sulphide", 562.360000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 286.130000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 0d);
			entalpyOfVapour = 44.408d;

			break;

		case "20":
			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 891.050000d);
			idealGasGCV.put("ethane", 1561.420000d);
			idealGasGCV.put("propane", 2220.130000d);
			idealGasGCV.put("iso_butane", 2869.390000d);
			idealGasGCV.put("normal_butane", 2878.580000d);
			idealGasGCV.put("iso_pentane", 3530.250000d);
			idealGasGCV.put("normal_pentane", 3537.190000d);
			idealGasGCV.put("hexane", 4196.600000d);
			idealGasGCV.put("heptane", 4855.310000d);
			idealGasGCV.put("octane", 5513.900000d);
			idealGasGCV.put("nonane", 6173.480000d);
			idealGasGCV.put("deccane", 6832.330000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 44.222000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.950000d);
			idealGasGCV.put("hydrogen_sulphide", 562.190000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 285.990000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 0d);

			entalpyOfVapour = 44.222d;

			break;

		case "25":
			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 890.580000d);
			idealGasGCV.put("ethane", 1560.690000d);
			idealGasGCV.put("propane", 2219.170000d);
			idealGasGCV.put("iso_butane", 2868.200000d);
			idealGasGCV.put("normal_butane", 2877.400000d);
			idealGasGCV.put("iso_pentane", 3528.830000d);
			idealGasGCV.put("normal_pentane", 3535.770000d);
			idealGasGCV.put("hexane", 4194.950000d);
			idealGasGCV.put("heptane", 4853.430000d);
			idealGasGCV.put("octane", 5511.800000d);
			idealGasGCV.put("nonane", 6171.150000d);
			idealGasGCV.put("deccane", 6829.770000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 44.013000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.980000d);
			idealGasGCV.put("hydrogen_sulphide", 562.010000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 285.830000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 0d);

			entalpyOfVapour = 44.013d;
			break;
		}
		switch (summation_metering_ref_temp) {
		case "0":
			summationFactor.put("nitrogen", 0.0214000d);
			summationFactor.put("carbon_dioxide", 0.0821000d);
			summationFactor.put("methane", 0.048860d);
			summationFactor.put("ethane", 0.099700d);
			summationFactor.put("propane", 0.146500d);
			summationFactor.put("iso_butane", 0.188500d);
			summationFactor.put("normal_butane", 0.2022000d);
			summationFactor.put("iso_pentane", 0.245800d);
			summationFactor.put("normal_pentane", 0.258600d);
			summationFactor.put("hexane", 0.331900d);
			summationFactor.put("heptane", 0.407600d);
			summationFactor.put("octane", 0.484500d);
			summationFactor.put("nonane", 0.5617000d);
			summationFactor.put("deccane", 0.671300d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.309300d);
			summationFactor.put("argon", 0.030700d);
			summationFactor.put("corbon_monoxide", 0.0258000d);
			summationFactor.put("hydrogen_sulphide", 0.100600d);
			summationFactor.put("helium", 0d); // -0.01
			summationFactor.put("hydrogen", 286.150000d); // -0.01
			summationFactor.put("oxygen", 0.031100d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);
			z_dryair = 0.999419d;

			break;
		case "15":
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
			summationFactor.put("deccane", 0.599100d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.256200d);
			summationFactor.put("argon", 0.027300d);
			summationFactor.put("corbon_monoxide", 0.0217000d);
			summationFactor.put("hydrogen_sulphide", 0.092300d);
			summationFactor.put("helium", 0d);
			summationFactor.put("hydrogen", 286.150000d); // -0.01
			summationFactor.put("oxygen", 0.027600d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);
			z_dryair = 0.999595d;

			break;

		case "15.55":
			summationFactor.put("nitrogen", 0.016900d);
			summationFactor.put("carbon_dioxide", 0.0749000d);
			summationFactor.put("methane", 0.044370d);
			summationFactor.put("ethane", 0.091600d);
			summationFactor.put("propane", 0.13400d);
			summationFactor.put("iso_butane", 0.171700d);
			summationFactor.put("normal_butane", 0.183400d);
			summationFactor.put("iso_pentane", 0.224400d);
			summationFactor.put("normal_pentane", 0.235400d);
			summationFactor.put("hexane", 0.299000d);
			summationFactor.put("heptane", 0.365400d);
			summationFactor.put("octane", 0.432900d);
			summationFactor.put("nonane", 0.501000d);
			summationFactor.put("deccane", 0.596700d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.254600d);
			summationFactor.put("argon", 0.027200d);
			summationFactor.put("corbon_monoxide", 0.0215000d);
			summationFactor.put("hydrogen_sulphide", 0.092000d);
			summationFactor.put("helium", 0d); // -0.01
			summationFactor.put("hydrogen", 286.150000d); // -0.01
			summationFactor.put("oxygen", 0.027500d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);
			z_dryair = 0.999601d;
			break;

		case "20":
			summationFactor.put("nitrogen", 0.0156000d);
			summationFactor.put("carbon_dioxide", 0.073000d);
			summationFactor.put("methane", 0.043170d);
			summationFactor.put("ethane", 0.089500d);
			summationFactor.put("propane", 0.130800d);
			summationFactor.put("iso_butane", 0.167300d);
			summationFactor.put("normal_butane", 0.1785000d);
			summationFactor.put("iso_pentane", 0.218900d);
			summationFactor.put("normal_pentane", 0.229500d);
			summationFactor.put("hexane", 0.290700d);
			summationFactor.put("heptane", 0.354700d);
			summationFactor.put("octane", 0.419800d);
			summationFactor.put("nonane", 0.4856000d);
			summationFactor.put("deccane", 0.577800d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.241900d);
			summationFactor.put("argon", 0.026200d);
			summationFactor.put("corbon_monoxide", 0.0203000d);
			summationFactor.put("hydrogen_sulphide", 0.089800d);
			summationFactor.put("helium", 0d); // -0.01
			summationFactor.put("hydrogen", 286.150000d); // -0.01
			summationFactor.put("oxygen", 0.026500d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);
			z_dryair = 0.999645d;

			break;

		}

		double gcSum = 0.0d;
		double ncvIntSum = 0.0d;
		double gcvIntSum = 0.0d;
		double molefraction = 0.0d;
		double GCVFraction = 0.0d;
		double molecularWeightFraction = 0.0d;
		double NCVFraction = 0.0d;
		double compressFraction = 0.0d;

		Set<String> gcKeySet = map.keySet();
		Iterator<String> gcIterator = gcKeySet.iterator();

		while (gcIterator.hasNext()) {
			String gas = gcIterator.next();

			System.out.println(gas + " " + (double) map.get(gas));

			gcSum += (double) map.get(gas);
		}

		gcIterator = gcKeySet.iterator();
		while (gcIterator.hasNext()) {
			String gas = gcIterator.next();
			double gasMolarFraction = (((double) map.get(gas) * 100) / gcSum) / 100d;
			System.out.println("gasMolarFraction" + gasMolarFraction);
			double gasGCV = gasMolarFraction * idealGasGCV.get(gas);
			gcvIntSum += gasGCV;

			double gasNCV = gasGCV - gasMolarFraction * ((double) bj.get(gas) / 2) * entalpyOfVapour;
			ncvIntSum += gasNCV;

			molecularWeightFraction += ((((double) map.get(gas) * 100) / gcSum) * molarMass.get(gas)) / 100d;
			compressFraction += ((((double) map.get(gas) * 100) / gcSum) * summationFactor.get(gas)) / 100d;

		}

		System.out.println("ncvIntSum  " + ncvIntSum);
		System.out.println("gcvIntSum  " + gcvIntSum);

		double gasCompresibilty = 1 - (compressFraction * compressFraction);
		System.out.println("gas compressbility  " + gasCompresibilty);

		double molecularWeight = molecularWeightFraction;
		double zbAt15C = 1 - (compressFraction * compressFraction);
		double relativeDensityIdeal = molecularWeight / molarMassAir;
		double relativeDensityReal = relativeDensityIdeal * z_dryair / zbAt15C;

		double NCVMolarIdeal = ncvIntSum;
		double NCVMolarReal = NCVMolarIdeal;
		double NCVVolumeIdeal = (NCVMolarIdeal * basePressure) / ((baseTemperature + 273.15d) * gas_constant);
		double NCVVolumeReal = (NCVMolarIdeal / zbAt15C) * basePressure / ((baseTemperature + 273.15d) * gas_constant);
		double NCVMassIdeal = NCVMolarReal / molecularWeight;
		double NCVMassReal = NCVMolarReal / molecularWeight;
		double wobbeIndexIdeal = NCVVolumeIdeal / Math.sqrt(relativeDensityIdeal);
		double wobbeIndexReal = NCVVolumeReal / Math.sqrt(relativeDensityReal);

		double GCVMolarIdeal = gcvIntSum;
		double GCVMolarReal = GCVMolarIdeal;
		double GCVVolumeIdeal = (GCVMolarIdeal * basePressure) / ((baseTemperature + 273.15d) * gas_constant);
		double GCVVolumeReal = (GCVMolarIdeal / zbAt15C) * basePressure / ((baseTemperature + 273.15d) * gas_constant);
		double GCVMassIdeal = GCVMolarReal / molecularWeight;
		double GCVMassReal = GCVMolarReal / molecularWeight;
		double gcvWobbeIndexIdeal = GCVVolumeIdeal / Math.sqrt(relativeDensityIdeal);
		double gcvWobbeIndexReal = GCVVolumeReal / Math.sqrt(relativeDensityReal);

		ISOResponse isoResponse = new ISOResponse();

		isoResponse.setGCVMassIdeal(getValueUnitArray(GCVMassIdeal, "MJ/kg"));
		isoResponse.setGCVMassReal(getValueUnitArray(GCVMassReal, "MJ/kg"));
		isoResponse.setGCVMolarIdeal(getValueUnitArray(GCVMolarIdeal, "KJ/Mol"));
		isoResponse.setGCVMolarReal(getValueUnitArray(GCVMolarReal, "KJ/Mol"));
		isoResponse.setGCVVolumeIdeal(getValueUnitArray(GCVVolumeIdeal, "MJ/m3"));
		isoResponse.setGCVVolumeReal(getValueUnitArray(GCVVolumeReal, "MJ/m3"));
		isoResponse.setGcvWobbeIndexIdeal(getValueUnitArray(gcvWobbeIndexIdeal, "MJ/m3"));
		isoResponse.setGcvWobbeIndexReal(getValueUnitArray(gcvWobbeIndexReal, "MJ/m3"));
		isoResponse.setMolecularWeight(getValueUnitArray(molecularWeight, "kg/mol"));
		isoResponse.setNCVMassIdeal(getValueUnitArray(NCVMassIdeal, "MJ/kg"));
		isoResponse.setNCVMassReal(getValueUnitArray(NCVMassReal, "MJ/kg"));
		isoResponse.setNCVMolarIdeal(getValueUnitArray(NCVMolarIdeal, "KJ/Mol"));
		isoResponse.setNCVMolarReal(getValueUnitArray(NCVMolarReal, "KJ/Mol"));
		isoResponse.setNCVVolumeIdeal(getValueUnitArray(NCVVolumeIdeal, "MJ/m3"));
		isoResponse.setNCVVolumeReal(getValueUnitArray(NCVVolumeReal, "MJ/m3"));
		isoResponse.setRelativeDensityIdeal(getValueUnitArray(relativeDensityIdeal, ""));
		isoResponse.setRelativeDensityReal(getValueUnitArray(relativeDensityReal, ""));
		isoResponse.setWobbeIndexIdeal(getValueUnitArray(wobbeIndexIdeal, "MJ/m3"));
		isoResponse.setWobbeIndexReal(getValueUnitArray(wobbeIndexReal, "MJ/m3"));
		isoResponse.setZbAt15C(getValueUnitArray(zbAt15C, ""));
		System.out.println(isoResponse.toString());

		return isoResponse;

	}

	private ValueUnitPOJO getValueUnitArray(double value, String unit) {

		ValueUnitPOJO valueUnitPOJO = new ValueUnitPOJO();
		valueUnitPOJO.setValue(value);
		valueUnitPOJO.setUnit(unit);
		// ValueUnitPOJO[] valueUnitPOJOArray = new ValueUnitPOJO[] {valueUnitPOJO};
		return valueUnitPOJO;
	}
}