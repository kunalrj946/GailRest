package com.mass.dao;

import com.mass.model.Energy_measurement_details;
import com.mass.model.FlowComputerData;
import com.mass.model.MMST_DB;
import com.mass.model.OrificePlateData;
import com.mass.model.PrimaryMeterData;
import com.mass.model.Secondary_instrument_details;

public interface DAOI {
			
	public Integer  insertMData(MMST_DB mmst_db);
	public Integer getStationID(String stationName) ;
	public Integer getPipeLineMaster(String region);
	public Integer getMaintenaceBaseID(String maintenanceBaseName);
	public Integer insertPrimarydata(PrimaryMeterData pmdata);
	
	public Object insertFlowComputerData(FlowComputerData flowComputerD);
	
	public Object insertOrificeData(OrificePlateData orifice);
	
	public Object insertEnergyMeasurementDetails(Energy_measurement_details emd);
	
	public Object insertSecInstDetails(Secondary_instrument_details sid);
	
	
	
}
