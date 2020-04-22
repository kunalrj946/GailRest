package com.mass.conversion;

import org.apache.commons.math3.util.Precision;

public class Conversion {

	public double pressureConversion(double value, String i, String u) {

		if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("atm")) {
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("bar")) {
			value = value * 1.01325d;
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("Pa")) {
			value = value * 101325d;
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("Mpa")) {
			value = value / 9.869d;
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("Gpa")) {
			value = value / 9869;
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("Torr")) {
			value = value * 760;

			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("psi")) {
			value = value * 14.6959d;
			return value;
		} else if (i.equalsIgnoreCase("atm") && u.equalsIgnoreCase("kPa")) {
			value = value * 101.325d;
			return value;
		} else if ((i.equalsIgnoreCase("atm"))
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value * 1.03323;
			return value;
		} else if ((i.equalsIgnoreCase("atm"))
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 10332.3d;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("atm")) {
			value = value / 1.013d;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("bar")) {

			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("Pa")) {
			value = value * 100000;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("Mpa")) {
			value = value / 10;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("Gpa")) {
			value = value / 10000;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("Torr")) {
			value = value * 750;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("psi")) {
			value = value * 14.504;
			return value;
		} else if (i.equalsIgnoreCase("bar") && u.equalsIgnoreCase("kPa")) {
			value = value * 100;
			return value;
		} else if (i.equalsIgnoreCase("bar")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value * 1.02;
			return value;
		} else if (i.equalsIgnoreCase("bar")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 10197;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("atm")) {
			value = value / 101325;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("bar")) {
			value = value / 100000;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("pa")) {

			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("mpa")) {
			value = value / 1e+6;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("gpa")) {
			value = value / 1e+9;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("Torr")) {
			value = value / 133;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("psi")) {
			value = value / 6895;
			return value;
		} else if (i.equalsIgnoreCase("pa") && u.equalsIgnoreCase("kPa")) {
			value = value / 1000;
			return value;
		} else if (i.equalsIgnoreCase("pa")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value / 98067;
			return value;
		} else if (i.equalsIgnoreCase("pa")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value / 9.807;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("atm")) {
			value = value * 9.869;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("bar")) {
			value = value * 10;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("pa")) {
			value = value * 1e+6;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("Mpa")) {

			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("Gpa")) {
			value = value / 1000;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("Torr")) {
			value = value * 7501;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("psi")) {
			value = value * 145;
			return value;
		} else if (i.equalsIgnoreCase("Mpa") && u.equalsIgnoreCase("kpa")) {
			value = value * 1000;
			return value;
		} else if (i.equalsIgnoreCase("Mpa")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value * 10.197;
			return value;
		} else if (i.equalsIgnoreCase("Mpa")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 101972;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("atm")) {
			value = value * 9869;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("bar")) {
			value = value * 10000;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("pa")) {
			value = value * 1e+9;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("Mpa")) {
			value = value * 1000;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("Gpa")) {

			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("Torr")) {
			value = value * 7.501e+6;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("psi")) {
			value = value * 145038;
			return value;
		} else if (i.equalsIgnoreCase("Gpa") && u.equalsIgnoreCase("kPa")) {
			value = value * 1000000;
			return value;
		} else if (i.equalsIgnoreCase("Gpa")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value * 10197;
			return value;
		} else if (i.equalsIgnoreCase("Gpa")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 1.02e+8;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("atm")) {
			value = value / 760;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("bar")) {
			value = value / 750;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("pa")) {
			value = value * 133;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("Mpa")) {
			value = value / 7501;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("Gpa")) {
			value = value / 7.501e+6;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("Torr")) {

			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("psi")) {
			value = value / 51.715;
			return value;
		} else if (i.equalsIgnoreCase("Torr") && u.equalsIgnoreCase("kPa")) {
			value = value / 7.501;
			return value;
		} else if (i.equalsIgnoreCase("Torr")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value / 736;
			return value;
		} else if (i.equalsIgnoreCase("Torr")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 13.595;
			return value;
		} else if (i.equalsIgnoreCase("psi") && (u.equalsIgnoreCase("atm"))) {
			value = value / 14.696;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("bar")) {
			value = value / 14.504;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("pa")) {
			value = value * 6895;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("Mpa")) {
			value = value / 145;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("Gpa")) {
			value = value / 145038;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("Torr")) {
			value = value * 51.715;
			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("psi")) {

			return value;
		} else if (i.equalsIgnoreCase("psi") && u.equalsIgnoreCase("kPa")) {
			value = value * 6.89476;
			return value;
		} else if (i.equalsIgnoreCase("psi")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value / 14.223;
			return value;
		} else if (i.equalsIgnoreCase("psi")
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 703;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("atm")) {
			value = value / 101;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("bar")) {
			value = value / 100;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("pa")) {
			value = value * 1000;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("Mpa")) {
			value = value / 1000;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("Gpa")) {
			value = value / 1e+6;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("Torr")) {
			value = value * 7.501;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("psi")) {
			value = value / 6.895;
			return value;
		} else if (i.equalsIgnoreCase("kpa") && u.equalsIgnoreCase("kpa")) {
			return value;
		} else if (i.equalsIgnoreCase("kpa")
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value / 98.066;
			return value;
		} else if ((i.equalsIgnoreCase("kpa"))
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 102;
			return value;
		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("atm")) {
			value = value / 1.033;
			return value;
		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("bar")) {
			value = value / 1.02;
			return value;
		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("bar")) {
			value = value / 1.02;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("pa")) {
			value = value * 98067;
			return value;

		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("pa")) {
			value = value * 98067;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("Mpa")) {
			value = value / 10.197;
			return value;

		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("Mpa")) {
			value = value / 10.197;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("Gpa")) {
			value = value / 10197;
			return value;
		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("Gpa")) {
			value = value / 10197;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("Torr")) {
			value = value * 736;
			return value;
		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("Torr")) {
			value = value * 736;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("psi")) {
			value = value * 14.223;
			return value;

		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("psi")) {
			value = value * 14.223;
			return value;

		} else if (i.equalsIgnoreCase("kgf/cm2") && u.equalsIgnoreCase("kPa")) {

			value = value * 98.0665d;
			return value;

		} else if (i.equalsIgnoreCase("kg/cm2") && u.equalsIgnoreCase("kPa")) {
			value = value * 98.0665d;
			return value;

		} else if ((i.equalsIgnoreCase("kg/cm2") || (i.equalsIgnoreCase("kgf/cm2")))
				&& (u.equalsIgnoreCase("kgf/cm2") || (u.equalsIgnoreCase("kg/cm2")))) {

			return value;
		}

		else if ((i.equalsIgnoreCase("kg/cm2") || (i.equalsIgnoreCase("kgf/cm2")))
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {
			value = value * 10000;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("atm"))) {
			value = value / 10332;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("bar"))) {
			value = value / 10197;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("pa"))) {
			value = value * 9.807;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("Mpa"))) {
			value = value / 101972;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("Gpa"))) {
			value = value / 1.02e+8;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("psi"))) {
			value = value / 703;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("kPa"))) {
			value = value / 102;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("kgf/cm2") || u.equalsIgnoreCase("kg/cm2"))) {
			value = value / 10000;
			return value;
		} else if ((i.equalsIgnoreCase("kgf/m2") || i.equalsIgnoreCase("kg/m2"))
				&& (u.equalsIgnoreCase("kgf/m2") || u.equalsIgnoreCase("kg/m2"))) {

			return value;
		}

		return value;
	}

	public double tempConversion(double value, String i, String u) {

		if (i.equalsIgnoreCase("C") && u.equalsIgnoreCase("C")) {

			return value;
		} else if (i.equalsIgnoreCase("C") && u.equalsIgnoreCase("K")) {
			value = value + 273.15;
			return value;

		} else if (i.equalsIgnoreCase("C") && u.equalsIgnoreCase("F")) {
			value = (value * 9 / 5) + 32;
			return value;

		} else if (i.equalsIgnoreCase("C") && u.equalsIgnoreCase("Rankine")) {

			value = value * 9 / 5 + 491.67;

			return Precision.round(value, 6);

		} else if (i.equalsIgnoreCase("K") && u.equalsIgnoreCase("C")) {
			value = value - 273.15;
			return value;

		} else if (i.equalsIgnoreCase("K") && u.equalsIgnoreCase("F")) {
			value = (value - 273.15) * 9 / 5 + 32;
			return value;

		} else if (i.equalsIgnoreCase("K") && u.equalsIgnoreCase("K")) {

			return value;

		} else if (i.equalsIgnoreCase("K") && u.equalsIgnoreCase("Rankine")) {
			value = value * 1.8;
			return value;
		} else if (i.equalsIgnoreCase("F") && u.equalsIgnoreCase("C")) {
			value = (value - 32) * 5 / 9;
			return value;

		} else if (i.equalsIgnoreCase("F") && u.equalsIgnoreCase("K")) {
			value = (value - 32) * 5 / 9 + 273.15;
			return value;

		} else if (i.equalsIgnoreCase("F") && u.equalsIgnoreCase("F")) {

			return value;

		} else if (i.equalsIgnoreCase("F") && u.equalsIgnoreCase("Rankine")) {

			value = value + 459.67d;
			return value;

		} else if (i.equalsIgnoreCase("Rankine") && u.equalsIgnoreCase("C")) {
			value = (value - 491.67d) * 5 / 9;

			return value;
		} else if (i.equalsIgnoreCase("Rankine") && u.equalsIgnoreCase("F")) {
			value = value - 459.67d;

			return value;
		} else if (i.equalsIgnoreCase("Rankine") && u.equalsIgnoreCase("K")) {
			value = value * 5 / 9;

			return value;
		} else if (i.equalsIgnoreCase("Rankine") && u.equalsIgnoreCase("Rankine")) {

			return value;
		}
		return value;
	}
	
	
	public double lengthConversion(double value , String i , String o)
	{
		if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("inch")) 
		{
			value = value /25.4;
			value = Precision.round(value, 6);
			return value;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("km"))
		{
			value = value / 1e+6;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("m"))
		{
			value = value / 1000;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("cm"))
		{
			value = value / 10;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("mm"))
		{
			
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("micrometer"))
		{
			value = value * 1000;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("nanometer"))
		{
			value = value * 1e+6;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("mile"))
		{
			value = value / 1.609e+6;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("yard"))
		{
			value = value / 914;
			return value ;
		}else if (i.equalsIgnoreCase("mm") && o.equalsIgnoreCase("foot"))
		{
			value = value / 305;
			return value ;
		}
		
		return value;
	}
	
	
	
	
	public double diffPres( double pressureInBar , double pipediaMeterInMm , double fluidDensityinKgm3 , double MassFlowRateINkgHr ) 
	{
		
		double k = (1.59923 * pressureInBar * Math.pow(pipediaMeterInMm , 4) *fluidDensityinKgm3 ) / Math.pow(MassFlowRateINkgHr, 2);
		
		
		return k ;
	}
	
	
	public double diffpressconv(double value , String iunit ,String uunit)
	{
		if(iunit.equalsIgnoreCase("mm-h2o") && uunit.equalsIgnoreCase("psia"))
		{
			value = value *0.00142; 
		
		}
		return value;
	}
	
	public double visocityconv(double value , String iunit , String uunit) 
	{
		if (iunit.equalsIgnoreCase("centipoise") && uunit.equalsIgnoreCase("Lb/ft-Sec"))
		{
		value = value *0.00067196897514;
		}
		
		return Precision.round(value, 15);
	}
	
	
}
