package com.mass.dao;

import java.sql.SQLException;

import org.postgresql.util.PSQLException;
import org.springframework.dao.DataAccessException;

import com.mass.model.Energy_measurement_details;
import com.mass.model.FlowComputerData;
import com.mass.model.MMST_DB;
import com.mass.model.OrificePlateData;
import com.mass.model.PrimaryMeterData;
import com.mass.model.Secondary_instrument_details;

public interface DAOI {
			
	public Integer  insertMData(MMST_DB mmst_db) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	public Integer getStationID(String sap_id) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	public Integer getPipeLineMaster(String region) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	public Integer getMaintenaceBaseID(String maintenanceBaseName) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	public Integer insertPrimarydata(PrimaryMeterData pmdata) throws   DataAccessException,NumberFormatException, SQLException, PSQLException;
	
	public Object insertFlowComputerData(FlowComputerData flowComputerD) throws   DataAccessException,NumberFormatException, SQLException, PSQLException;
	
	public Object insertOrificeData(OrificePlateData orifice) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	
	public Object insertEnergyMeasurementDetails(Energy_measurement_details emd) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	
	public Object insertSecInstDetails(Secondary_instrument_details sid) throws  DataAccessException,NumberFormatException, SQLException, PSQLException;
	
	
	
}
