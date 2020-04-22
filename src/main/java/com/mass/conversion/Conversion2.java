package com.mass.conversion;

public class Conversion2 {
	
	
	public double pressureConversion(double value, String inputUnit, String outputUnit) {

		switch (inputUnit ) {
		case "atm":
			value = value * 14.696d;

			break;

		case "bar":
			value = value * 14.504d;
			break;

		case "Pa":
			value = value / 6895d;
			break;

		case "MPa":
			value = value * 145d;
			break;

		case "GPa":
			value = value * 145038d;
			break;

		case "Torr":
			value = value / 51.715d;
			break;

		case "psi":
			value = value;
			break;
		case "kPa":
			value = value / 6.895d;
			break;

		case "kgf/cm2":
			value = value * 14.223d;
			break;

		case "kgf/m2":
			value = value / 703;

		}

//		---------------------------------------

		switch (outputUnit) {
		case "atm":
			value = value / 14.696d;

			break;

		case "bar":
			value = value / 14.504d;
			break;

		case "Pa":
			value = value * 6895d;
			break;

		case "MPa":
			value = value / 145d;
			break;

		case "GPa":
			value = value / 145038;
			break;

		case "Torr":
			value = value * 51.715d;
			break;

		case "psi":
			value = value;
			break;
		case "kPa":
			value = value * 6.895d;
			break;
		case "kg/cm2":
			value = value / 14.223d;
			break;
		case "kg/m2":
			value = value * 703;
		}

		return value;

	}
	
	
	
	public double tempConversion(double value, String inputUnit, String outputUnit) {

		switch (inputUnit) {

		case "C":
			value = value;
			break;
		case "K":
			value = value-273.15d;
			break;
		case "F":
			value = (value-32)*5/9;
			break;
		}

		switch (outputUnit) {
		case "C":
			value = value;
			break;
		case "K":
			value = value + 273.15d;
			break;
		case "F":
			value = (value * 9 / 5) + 32d;
			break;

		}
		return value;

	}
	
	
	
	
	

}
