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

public class ISO1995 {

	public ISOResponse calc95(ISORequest isoRequest) {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = mapper.convertValue(isoRequest.getGasComposition()[0],
				new TypeReference<Map<String, Object>>() {
				});

		HashMap<String, Double> idealGasNCV = new HashMap<String, Double>(); // net calorific value
		HashMap<String, Double> idealGasGCV = new HashMap<String, Double>(); // gross calorific value
		HashMap<String, Double> summationFactor = new HashMap<String, Double>();
		HashMap<String, Double> molarMass = new HashMap<String, Double>();
		HashMap<String, Double> bj = new HashMap<String, Double>();

		molarMass.put("nitrogen", 28.013500d);
		molarMass.put("carbon_dioxide", 44.010000d);
		molarMass.put("methane", 16.043000d);
		molarMass.put("ethane", 30.070000d);
		molarMass.put("propane", 44.097000d);
		molarMass.put("iso_butane", 58.123000d);
		molarMass.put("normal_butane", 58.123000d);
		molarMass.put("iso_pentane", 72.150000d);
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

		double entalpyOfVapour, densityOfAir, basePressure, baseTemperature, molarMassAir, gas_constant;
		double z_dryAir = 0d;

		densityOfAir = 0d; // input
		baseTemperature = 15d; // input
		entalpyOfVapour = 0d;

		molarMassAir = 28.96546d; // Molar Mass of air /kg*kmol-1 //constant
		gas_constant = 8.3144621d; // Gas Constant
		basePressure = 101.325d; // Base Pressure as per Standard (KPa)


		String rmct = isoRequest.getRmct();
		String[] parts = rmct.split("/");

		String ncv_combustion_ref_temp = parts[0]; // mr Metering reference Temp
		String summation_metering_ref_temp = parts[1]; // ct Cumbustion Temperature

		switch (ncv_combustion_ref_temp) {
		case "0":
			idealGasNCV.put("nitrogen", 0d);
			idealGasNCV.put("carbon_dioxide", 0d);
			idealGasNCV.put("methane", 802.820d);
			idealGasNCV.put("ethane", 1429.120d);
			idealGasNCV.put("propane", 2043.710d);
			idealGasNCV.put("iso_butane", 2648.830d);
			idealGasNCV.put("normal_butane", 2658.450d);
			idealGasNCV.put("iso_pentane", 3265.540d);
			idealGasNCV.put("normal_pentane", 3272.450d);
			idealGasNCV.put("hexane", 3887.710d);
			idealGasNCV.put("heptane", 4502.280d);
			idealGasNCV.put("octane", 5116.730d);
			idealGasNCV.put("nonane", 5732.170d);
			idealGasNCV.put("deccane", 6346.880d);
			idealGasNCV.put("air", 0d);
			idealGasNCV.put("water", 0d);
			idealGasNCV.put("argon", 0d);
			idealGasNCV.put("corbon_monoxide", 282.80d);
			idealGasNCV.put("hydrogen_sulphide", 517.87d);
			idealGasNCV.put("helium", 0d);
			idealGasNCV.put("hydrogen", 241.56d);
			idealGasNCV.put("oxygen", 0d);
			idealGasNCV.put("other", 0d);
			idealGasNCV.put("ethylene", 0d); // 1323.36

			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 892.970000d);
			idealGasGCV.put("ethane", 1564.340000d);
			idealGasGCV.put("propane", 2224.0100000d);
			idealGasGCV.put("iso_butane", 2874.20000d);
			idealGasGCV.put("normal_butane", 2883.820000d);
			idealGasGCV.put("iso_pentane", 3535.980000d);
			idealGasGCV.put("normal_pentane", 3542.8900000d);
			idealGasGCV.put("hexane", 4203.230000d);
			idealGasGCV.put("heptane", 4862.870000d);
			idealGasGCV.put("octane", 5522.400000d);
			idealGasGCV.put("nonane", 6182.910000d);
			idealGasGCV.put("deccane", 6842.690000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 45.074000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.800000d);
			idealGasGCV.put("hydrogen_sulphide", 562.940000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 286.630000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 1413.51d); // default 0

			entalpyOfVapour = 45.074d; // kj-mol-1

			break;
		case "15":
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

			entalpyOfVapour = 44.433d;

			break;
		case "20":
			idealGasNCV.put("nitrogen", 0d);
			idealGasNCV.put("carbon_dioxide", 0d);
			idealGasNCV.put("methane", 802.820d);
			idealGasNCV.put("ethane", 1428.740d);
			idealGasNCV.put("propane", 2043.230d);
			idealGasNCV.put("iso_butane", 2648.26d);
			idealGasNCV.put("normal_butane", 2657.45d);
			idealGasNCV.put("iso_pentane", 3264.89d);
			idealGasNCV.put("normal_pentane", 3271.83d);
			idealGasNCV.put("hexane", 3887.01d);
			idealGasNCV.put("heptane", 4501.49d);
			idealGasNCV.put("octane", 5115.870d);
			idealGasNCV.put("nonane", 5731.220d);
			idealGasNCV.put("deccane", 6345.850d);
			idealGasNCV.put("air", 0d);
			idealGasNCV.put("water", 0d);
			idealGasNCV.put("argon", 0d);
			idealGasNCV.put("corbon_monoxide", 282.95d);
			idealGasNCV.put("hydrogen_sulphide", 517.97d);
			idealGasNCV.put("helium", 0d);
			idealGasNCV.put("hydrogen", 241.76d);
			idealGasNCV.put("oxygen", 0d);
			idealGasNCV.put("other", 0d);
			idealGasNCV.put("ethylene", 0d); // 1323.20

			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 891.090000d);
			idealGasGCV.put("ethane", 1561.410000d);
			idealGasGCV.put("propane", 2220.1300000d);
			idealGasGCV.put("iso_butane", 2869.38000d);
			idealGasGCV.put("normal_butane", 2878.570000d);
			idealGasGCV.put("iso_pentane", 3530.240000d);
			idealGasGCV.put("normal_pentane", 3537.1700000d);
			idealGasGCV.put("hexane", 4196.580000d);
			idealGasGCV.put("heptane", 4855.290000d);
			idealGasGCV.put("octane", 5513.8800000d);
			idealGasGCV.put("nonane", 6173.460000d);
			idealGasGCV.put("deccane", 6832.310000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 44.224000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.9500000d);
			idealGasGCV.put("hydrogen_sulphide", 562.190000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 285.990000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 1411.65d); // default 0

			entalpyOfVapour = 44.224d;

			break;
		case "25":
			idealGasNCV.put("nitrogen", 0d);
			idealGasNCV.put("carbon_dioxide", 0d);
			idealGasNCV.put("methane", 802.600d);
			idealGasNCV.put("ethane", 1428.64d);
			idealGasNCV.put("propane", 2043.110d);
			idealGasNCV.put("iso_butane", 2648.120d);
			idealGasNCV.put("normal_butane", 2657.320d);
			idealGasNCV.put("iso_pentane", 3264.730d);
			idealGasNCV.put("normal_pentane", 3271.670d);
			idealGasNCV.put("hexane", 3886.840d);
			idealGasNCV.put("heptane", 4501.300d);
			idealGasNCV.put("octane", 5115.660d);
			idealGasNCV.put("nonane", 5730.990d);
			idealGasNCV.put("deccane", 6345.590d);
			idealGasNCV.put("air", 0d);
			idealGasNCV.put("water", 0d);
			idealGasNCV.put("argon", 0d);
			idealGasNCV.put("corbon_monoxide", 282.98d);
			idealGasNCV.put("hydrogen_sulphide", 517.99d);
			idealGasNCV.put("helium", 0d);
			idealGasNCV.put("hydrogen", 241.81d);
			idealGasNCV.put("oxygen", 0d);
			idealGasNCV.put("other", 0d);
			idealGasNCV.put("ethylene", 0d); // 1323.15

			idealGasGCV.put("nitrogen", 0d);
			idealGasGCV.put("carbon_dioxide", 0d);
			idealGasGCV.put("methane", 890.630000d);
			idealGasGCV.put("ethane", 1560.690000d);
			idealGasGCV.put("propane", 2219.1700000d);
			idealGasGCV.put("iso_butane", 2868.20000d);
			idealGasGCV.put("normal_butane", 2877.400000d);
			idealGasGCV.put("iso_pentane", 3528.830000d);
			idealGasGCV.put("normal_pentane", 3535.7700000d);
			idealGasGCV.put("hexane", 4194.950000d);
			idealGasGCV.put("heptane", 4853.430000d);
			idealGasGCV.put("octane", 5511.8000000d);
			idealGasGCV.put("nonane", 6171.150000d);
			idealGasGCV.put("deccane", 6829.770000d);
			idealGasGCV.put("air", 0d);
			idealGasGCV.put("water", 44.016000d);
			idealGasGCV.put("argon", 0d);
			idealGasGCV.put("corbon_monoxide", 282.9800000d);
			idealGasGCV.put("hydrogen_sulphide", 562.010000d);
			idealGasGCV.put("helium", 0d);
			idealGasGCV.put("hydrogen", 285.830000d);
			idealGasGCV.put("oxygen", 0d);
			idealGasGCV.put("other", 0d);
			idealGasGCV.put("ethylene", 1411.18d); // default 0

			entalpyOfVapour = 44.016d;

			break;
		}

		switch (summation_metering_ref_temp) {
		case "0":
			summationFactor.put("nitrogen", 0.022400d);
			summationFactor.put("carbon_dioxide", 0.081900d);
			summationFactor.put("methane", 0.04900d);
			summationFactor.put("ethane", 0.10000d);
			summationFactor.put("propane", 0.145300d);
			summationFactor.put("iso_butane", 0.204900d);
			summationFactor.put("normal_butane", 0.206900d);
			summationFactor.put("iso_pentane", 0.251000d);
			summationFactor.put("normal_pentane", 0.2864000d);
			summationFactor.put("hexane", 0.3286000d);
			summationFactor.put("heptane", 0.412300d);
			summationFactor.put("octane", 0.5079000d);
			summationFactor.put("nonane", 0.622100d);
			summationFactor.put("deccane", 0.7523000d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.264600d);
			summationFactor.put("argon", 0.031600d);
			summationFactor.put("corbon_monoxide", 0.026500d);
			summationFactor.put("hydrogen_sulphide", 0.100000d);
			summationFactor.put("helium", 0.000600d);
			summationFactor.put("hydrogen", 0.00400d); // -0.004
			summationFactor.put("oxygen", 0.031600d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);

			z_dryAir = 0.99941d;
			densityOfAir = 1.292923d; // input

			break;
		case "15":
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

			z_dryAir = 0.99958d;
			densityOfAir = 1.225410; // input

			break;

		case "20":
			summationFactor.put("nitrogen", 0.017300d);
			summationFactor.put("carbon_dioxide", 0.072800d);
			summationFactor.put("methane", 0.043600d);
			summationFactor.put("ethane", 0.089400d);
			summationFactor.put("propane", 0.128800d);
			summationFactor.put("iso_butane", 0.178900d);
			summationFactor.put("normal_butane", 0.178300d);
			summationFactor.put("iso_pentane", 0.216000d);
			summationFactor.put("normal_pentane", 0.2345000d);
			summationFactor.put("hexane", 0.284000d);
			summationFactor.put("heptane", 0.352100d);
			summationFactor.put("octane", 0.4278000d);
			summationFactor.put("nonane", 0.514800d);
			summationFactor.put("deccane", 0.614000d);
			summationFactor.put("air", 0d);
			summationFactor.put("water", 0.219100d);
			summationFactor.put("argon", 0.026500d);
			summationFactor.put("corbon_monoxide", 0.02000d);
			summationFactor.put("hydrogen_sulphide", 0.100000d);
			summationFactor.put("helium", 0.000000d);
			summationFactor.put("hydrogen", 0.005100d);// -0.0051
			summationFactor.put("oxygen", 0.026500d);
			summationFactor.put("other", 0d);
			summationFactor.put("ethylene", 0d);

			z_dryAir = 0.99963d;
			densityOfAir = 1.204449d; // input

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

			System.out.println(gas);
			System.out.println((double) map.get(gas));
			gcSum += (double) map.get(gas);

		}

		gcIterator = gcKeySet.iterator();

		while (gcIterator.hasNext()) {
			String gas = gcIterator.next();

			ncvIntSum += ((((double) map.get(gas) * 100) / gcSum) * idealGasNCV.get(gas)) / 100d;
			// if ("1995".equals(standard)) {

			double gasMolarFraction = (((double) map.get(gas) * 100) / gcSum) / 100d;
			double gasNCV = gasMolarFraction * idealGasNCV.get(gas);
			ncvIntSum += gasNCV;
			gcvIntSum += ((((double) map.get(gas) * 100) / gcSum) * idealGasGCV.get(gas)) / 100d;
			molecularWeightFraction += ((((double) map.get(gas) * 100) / gcSum) * molarMass.get(gas)) / 100d;
			compressFraction += ((((double) map.get(gas) * 100) / gcSum) * summationFactor.get(gas)) / 100d;

		}

		System.out.println(ncvIntSum);
		System.out.println(gcvIntSum);
		// double gasCompresibilty=isoRequest.getGasCompresibilty();

		double gasCompresibilty = 1 - (compressFraction * compressFraction);

		// double ncv=ncvIntSum/gasCompresibilty;
		// double gcv=gcvIntSum/gasCompresibilty;

		double molecularWeight = molecularWeightFraction;
		double zbAt15C = 1 - (compressFraction * compressFraction);
		double relativeDensityIdeal = molecularWeight / molarMassAir;
		double relativeDensityReal = relativeDensityIdeal * z_dryAir / zbAt15C;

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
		// isoResponse.setNCV(getValueUnitArray(ncv,"MJ/m3"));
		// isoResponse.setGCV(getValueUnitArray(gcv,"MJ/m3"));

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
