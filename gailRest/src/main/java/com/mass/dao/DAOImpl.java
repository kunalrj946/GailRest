package com.mass.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import com.mass.config.WebConfig;
//import com.mmst.logger.ALogger;
import com.mass.model.Energy_measurement_details;
import com.mass.model.FlowComputerData;
import com.mass.model.MMST_DB;
import com.mass.model.OrificePlateData;
import com.mass.model.PrimaryMeterData;
import com.mass.model.Secondary_instrument_details;
import com.mass.query.Query;
@Repository
public class DAOImpl implements DAOI{
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//	static ALogger logger = Application.getInstance().getDefaultLogger();
	Query mmstQuery = new Query();
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	String dbschema = "";
	public DAOImpl() throws IOException {
		super();
		WebConfig webconfig = new WebConfig();
		dbschema = webconfig.getPropValues();
}
	
	
//	FOR MMST TABLE 
	
@Override
public Integer getStationID(String stationName) 
{
	return jdbcTemplate.query(Query.getQuery(dbschema,"GET_STATION_ID") ,
			  new ResultSetExtractor<Integer>() 
	  { 
		 
		@Override
		public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
		if(rs.next()) {
			return rs.getInt("station_id");
		}
		else {
			return 0;
		}
			
			
			
		} },stationName );

}	

@Override
public Integer getPipeLineMaster(String region)
{
	return jdbcTemplate.query(Query.getQuery(dbschema,"GET_PIPELINEMST_ID") ,new Object[] {region} ,
			  new ResultSetExtractor<Integer>() 
	  { 
		 
		@Override
		public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			
			if(rs.next()) {
			return rs.getInt("pipelinemst_id");
			}
			else {
				return 0 ;
			}
		} } );

}	


@Override
public Integer getMaintenaceBaseID(String maintenanceBaseName)
{	
	return jdbcTemplate.query(Query.getQuery(dbschema,"GET_MAINTENANCE_BASE_ID") ,new Object[] {maintenanceBaseName} ,
			  new ResultSetExtractor<Integer>() 
	  { 
		 
		@Override
		public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			if(rs.next()) {
		
			
			return rs.getInt("maintenance_base_id");
			}
			else {
				return 0;
			}
		} } );

}	
	@Override
	public Integer insertMData(MMST_DB c) {
		 GeneratedKeyHolder holder = new GeneratedKeyHolder();
		 jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_MMST_DATA"), new String[] { "mmst_id" });
		        
		        statement.setInt(1 ,(int) c.getStation_id());
		        statement.setInt(2,(int) c.getPipelinemst_id());
		        statement.setInt(3,(int) c.getMaintenance_base_id());
		        statement.setInt(4 , c.getProcess_fluid_id());
		        
		        statement.setInt(5,c.getMetering_type_id());
		      
		        statement.setString(6,	(String)c.getSap_id());
		       
		        statement.setString(7, c.getName_of_consumer_types().toString());
		        statement.setDouble(8, Double.valueOf(((String)c.getMetering_capcity()).replace(",", "")));
		        statement.setDouble(9,Double.valueOf((String)c.getMetering_pressure()));
		        statement.setDouble(10 ,Double.valueOf((String)c.getAvg_metering_temeprature()));
		        statement.setDouble(11, Double.valueOf((String)c.getAvg_daily_consumption()));
		        statement.setInt(12,Integer.valueOf((String)c.getNo_of_stream()));
		        statement.setString(13,c.getConfiguration().toString());
		        
		        
		        
		        try {
		        	statement.setString(14 ,c.getRemarks().toString());
			        }
			        catch(NullPointerException e) {
			        	statement.setObject(14, null,java.sql.Types.VARCHAR);
			        }
		        
		        
		        
		        
		        
		        statement.setInt(15, c.getIs_delted());
		        statement.setInt(16, c.getStatus());
		        statement.setString(17, c.getNo_flow().toString());
		        
		        
		        return statement;
		    }
		}, holder);
		
		 
		 System.out.println( " mmst_id is : - " + holder.getKey().intValue());
		 
		 if (holder.getKeys() != null) 
		 {
			  holder.getKeys().get("mmst_id");
		  
		 } 
		return holder.getKey().intValue();
		
	}


	
	@Override
	public Integer insertPrimarydata(PrimaryMeterData pmdata) {
		
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		  jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_PRIMARY_METER_DATA"), new String[] { "stream_id" });
		       
		        statement.setInt(1 ,(pmdata.getMmst_id()));
		        statement.setInt(2 ,  pmdata.getConsumer());
		        statement.setInt(3 ,Integer.valueOf((String)pmdata.getStream_no()));
		        statement.setInt(4, Integer.valueOf(pmdata.getConnectivity_id()));
		        statement.setInt(5, pmdata.getFc_id());
		        statement.setString(6 , pmdata.getMake().toString());
		        statement.setString(7,pmdata.getModel().toString());
		        statement.setInt(8,Integer.parseInt(pmdata.getMeter_type().toString()));
		        try {
		        statement.setDouble(9, Double.valueOf((String)pmdata.getK_factor()));
		        }
		        catch(NullPointerException e) {
		        	statement.setObject(9, null,java.sql.Types.DOUBLE);
		        }
		       // statement.setString(9, (String)pmdata.getK_factor());
		        statement.setString(10, pmdata.getTag_no().toString());
		    
		        statement.setString(11,pmdata.getSerial_no().toString());
		        statement.setDouble(12 ,Double.valueOf((String)pmdata.getMeter_size()));
		       /* try {
		        statement.setDouble(13, Double.valueOf((String)pmdata.getPressure_class()));
		        }
		        catch(NumberFormatException e) {
		        	   statement.setObject(13, null ,java.sql.Types.DOUBLE);
		        }*/
		        
		        
		        statement.setString(13, (String)pmdata.getPressure_class());
		        statement.setString(14,pmdata.getG_rating().toString());
		        
		        try {
		        	statement.setDouble(15, Double.valueOf((String)pmdata.getQ_max()));
			        }
			        catch(NullPointerException e) {
			        	statement.setObject(15, null,java.sql.Types.DOUBLE);
			        }
		        
		        try {
		        	statement.setDouble(16, Double.valueOf((String)pmdata.getQ_min()));
			        }
			        catch(NullPointerException e) {
			        	statement.setObject(16, null,java.sql.Types.DOUBLE);
			        }
		 		
		 		
		 		statement.setDouble(17, Double.valueOf((String)pmdata.getOrifice_diameter()));
		 		statement.setDouble(18, Double.valueOf((String)pmdata.getMeter_tube_pipeline_dia()));
		 
		        
		        return statement;
		    }
		}, holder);
		 
		int stream_id ;
		 
		 System.out.println(" stream_id is : - " +holder.getKey().intValue());
		 
		 if (holder.getKeys() != null) 
		 {
			  holder.getKeys().get("stream_id");
		  
		 } else {
		    	
			 stream_id = 0; 
		    }
		return holder.getKey().intValue();
		 
		 
		 
	}


	
	
	
	@Override
	public Object insertFlowComputerData(FlowComputerData fcd) {
		
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		 return jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_FLOW_COMPUTER_DATA"), Statement.RETURN_GENERATED_KEYS);
		       
		        statement.setInt(1 ,fcd.getStream_id());
		        statement.setInt(2 ,fcd.getMmst_id());
		        statement.setInt(3 ,Integer.valueOf((String)fcd.getStream_no()));
		        statement.setInt(4 ,fcd.getType());
		        statement.setString(5 ,fcd.getMake().toString());
		        statement.setString(6 , fcd.getModel().toString());
		        statement.setInt(7 , fcd.getPower_source_id());
		        statement.setDouble(8 , Double.valueOf(((String)fcd.getBp_value_as_per_contract()).replace(",", "")));
		        statement.setObject(9 ,fcd.getBp_unit_as_per_contract_id(),java.sql.Types.INTEGER);
		        statement.setDouble(10 ,Double.valueOf(((String)fcd.getBp_value_configured_in_fc()).replace(",", "")));
		        statement.setInt(11 ,fcd.getBp_unit_configured_in_fc_id());
		        statement.setDouble(12 ,Double.valueOf(((String)fcd.getBt_value_as_per_contract()).replace(",", "")));
		        statement.setInt(13 ,fcd.getBt_unit_as_per_contract());
		        statement.setDouble(14 ,(Double.valueOf(((String)fcd.getBt_value_configured_in_fc()).replace(",", ""))));
		        statement.setInt(15 ,fcd.getBt_unit_as_configured_in_fc());
		        statement.setString(16 ,fcd.getError_curve_file().toString());
		        statement.setInt(17 ,fcd.getAp_source_id());
		        statement.setInt(18 ,fcd.getAp_frequency_of_update());
		        statement.setInt(19 ,fcd.getAp_data_used_for_update_in_fc());
		      
		        
		        String date  = fcd.getAp_last_date_of_update_in_fc().toString();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		        LocalDate data_datetime = null;
		        try {
		        data_datetime = LocalDate.parse(date, formatter);
		    	statement.setTimestamp(20, Timestamp.valueOf(data_datetime.atStartOfDay()));
		        }
		        catch(java.time.format.DateTimeParseException e) {
		        	statement.setObject(20, data_datetime, java.sql.Types.TIMESTAMP);
		        	//data_datetime = LocalDate.parse("1970-01-01", formatter);
		        }
//		    	2012-02-22T02:06:58.147Z
		    	
		        statement.setDouble(21 ,Double.valueOf((((String)(fcd.getAp_present_value()))).replace(",", "")));
		        statement.setInt(22 ,(fcd.getAp_unit_as_configured_in_fc()));
		        statement.setInt(23 ,fcd.getCcm_as_per_contract());
		        statement.setInt(24 ,(fcd.getCcm_as_configured_in_fc()));
		        statement.setInt(25 ,Integer.valueOf(((String)(fcd.getHvmm_as_per_contract())).replace(",", "")));
		        statement.setObject(26 ,(fcd.getHvmm_as_configured_in_fc()),java.sql.Types.INTEGER);
		        statement.setInt(27 ,fcd.getPresent_values());
		        
		        
		        String ap_nd  = fcd.getAp_next_date_of_update_in_fc().toString();
		        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		        LocalDate ap_ndate = null;
		        try {
		        ap_ndate = LocalDate.parse(ap_nd, formatter1);
		    	statement.setTimestamp(28, Timestamp.valueOf(ap_ndate.atStartOfDay()));
		        }
		        catch(java.time.format.DateTimeParseException e) {
		        	statement.setObject(28, ap_ndate, java.sql.Types.TIMESTAMP);
		        	//data_datetime = LocalDate.parse("1970-01-01", formatter);
		        }
//		        statement.setDate(28 ,Date.valueOf((String)(fcd.getAp_next_date_of_update_in_fc())));
		       
		        
		        return statement;
		    }
		}, holder);
	}


	
	
	
	@Override
	public Object insertOrificeData(OrificePlateData opd) {
		
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		 return jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_ORIFICE_PLATE_DATA"), Statement.RETURN_GENERATED_KEYS);
		       
		        statement.setInt(1 , opd.getStream_id());
		        statement.setInt(2 , opd.getMmst_id());
		        statement.setInt(3 , Integer.valueOf((String)opd.getStream_no()));
		       
		        
		        String lcd  = opd.getLast_calibration_date().toString();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		        LocalDate data_datetime = null;
		        try {
		    	data_datetime = LocalDate.parse(lcd, formatter);
		    	statement.setTimestamp(4 , Timestamp.valueOf(data_datetime.atStartOfDay()));
		        }
		        catch(java.time.format.DateTimeParseException e) {
		        	statement.setObject(4, data_datetime, java.sql.Types.TIMESTAMP);
		        	//data_datetime = LocalDate.parse("1970-01-01", formatter);
		        }
		       // statement.setObject(4, data_datetime, java.sql.Types.TIMESTAMP);
		    	//statement.setTimestamp(4 , Timestamp.valueOf(data_datetime.atStartOfDay()));
		        
		        
		        
		    	String ncd  = opd.getLast_calibration_date().toString();
		        DateTimeFormatter ncd_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		        LocalDate ncd_final = null;
		        try {
		        	ncd_final =LocalDate.parse(ncd, ncd_formatter);
		        	statement.setTimestamp(5, Timestamp.valueOf(ncd_final.atStartOfDay()));
		        }
		        catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(5, ncd_final, java.sql.Types.TIMESTAMP);
		        }
		    	//LocalDate ncd_final = LocalDate.parse(ncd, ncd_formatter);
		    	//statement.setTimestamp(5, Timestamp.valueOf(ncd_final.atStartOfDay()));
		    	 statement.setObject(5, ncd_final, java.sql.Types.TIMESTAMP);
		    	
		    	statement.setString(6 , opd.getDtl_of_calibration_agny().toString());
		        
		    	
		    	String ldti = opd.getLast_date_tube_inspection().toString();
		    	DateTimeFormatter ldti_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate ldti_final = null;
		    	try {
		    	ldti_final = LocalDate.parse(ldti, ldti_formatter);
		    	statement.setTimestamp(7 ,Timestamp.valueOf(ldti_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(7, ldti_final, java.sql.Types.TIMESTAMP);
		        }


		    	
		    	String ndti = opd.getNext_date_tube_inspection().toString();
		    	DateTimeFormatter ndti_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate ndti_final = null;
		    	try {
		    	ndti_final = LocalDate.parse(ndti, ndti_formatter);
		    	 statement.setObject(5, ncd_final, java.sql.Types.TIMESTAMP);
		    	statement.setTimestamp(8 ,Timestamp.valueOf(ndti_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(8, ndti_final, java.sql.Types.TIMESTAMP);
		        }

		    
		    	
		    	String diduf = opd.getDate_inspection_data_update_fc().toString();
		    	DateTimeFormatter diduf_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		    	LocalDate diduf_final = null;
		    	try {
		    	diduf_final = LocalDate.parse(diduf, diduf_formatter);
		    	statement.setTimestamp(9 ,Timestamp.valueOf(diduf_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(9, diduf_final, java.sql.Types.TIMESTAMP);
		        }

		        
		    	
		    	String lec = opd.getLast_error_curve().toString();
		    	DateTimeFormatter lec_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		    	LocalDate lec_final = null;
		    	try {
		    	lec_final = LocalDate.parse(lec, lec_formatter);
		    	statement.setTimestamp(10 ,Timestamp.valueOf(lec_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(10, lec_final, java.sql.Types.TIMESTAMP);
		        }

		    	
		    	
		    	String lmi = opd.getLast_meter_inspection().toString();
		    	DateTimeFormatter lmi_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate lmi_final = null;
		    	try {
		    	lmi_final = LocalDate.parse(lmi, lmi_formatter);
		    	statement.setTimestamp(11 ,Timestamp.valueOf(lmi_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(11, lmi_final, java.sql.Types.TIMESTAMP);
		        }
		    	
		    	String nmi = opd.getNext_meter_inspection().toString();
		    	DateTimeFormatter nmi_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate nmi_final = null;
		    	try {
		    	nmi_final = LocalDate.parse(nmi, nmi_formatter);
		    	statement.setTimestamp(12 ,Timestamp.valueOf(nmi_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(12, nmi_final, java.sql.Types.TIMESTAMP);
		        }
		    	
		        
		    	String lhm = opd.getLast_health_monitoring().toString();
		    	DateTimeFormatter lhm_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate lhm_final = null;
		    	try {
		    	lhm_final = LocalDate.parse(lhm, lhm_formatter);
		    	statement.setTimestamp(13 ,Timestamp.valueOf(lhm_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(13, lhm_final, java.sql.Types.TIMESTAMP);
		        }
		    
		    	String nhm = opd.getNext_health_monitoring().toString();
		    	DateTimeFormatter nhm_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate nhm_final = null;
		    	try {
		    	nhm_final = LocalDate.parse(nhm, nhm_formatter);
		    	statement.setTimestamp(14 ,Timestamp.valueOf(nhm_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(14, nhm_final, java.sql.Types.TIMESTAMP);
		        }
		    	
		    	
		        statement.setInt(15 , Integer.valueOf(opd.getStream_configured().toString()));
		        statement.setInt(16 , Integer.valueOf(opd.getOutput_custody().toString()));
		        
		        
		        String nsv = opd.getNext_sos_verification().toString();
		    	DateTimeFormatter nsv_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate nsv_final =  null;
		    	
		    	try{
		    		nsv_final = LocalDate.parse(nsv, nsv_formatter);
                    statement.setTimestamp(17 ,Timestamp.valueOf(nsv_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(17, nsv_final, java.sql.Types.TIMESTAMP);
		        }
		        
		    	String lsv =  opd.getLast_sos_verification().toString();
		    	DateTimeFormatter lsv_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate lsv_final = null;
		    	try {
		    	lsv_final = LocalDate.parse(lsv, lsv_formatter);
		    	statement.setTimestamp(18 ,Timestamp.valueOf(lsv_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(18, lsv_final, java.sql.Types.TIMESTAMP);
		        }
		       
		        statement.setInt(19 , Integer.valueOf((String)opd.getConsumer()));
		        
		
		
		return statement;
	}
		 } ,holder);
	}


	@Override
	public Object insertEnergyMeasurementDetails(Energy_measurement_details emd) {
		
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		 return jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_ENERGY_MEASUREMENT_DETAILS"), Statement.RETURN_GENERATED_KEYS);
		
	
		        statement.setInt(1 , emd.getStream_id());
		        
		        statement.setInt(2 , emd.getMmst_id());
		        statement.setInt(3 , Integer.valueOf((String)emd.getStream_no()));
		        
		        statement.setInt(4 , emd.getGas_quality_data_source());
		        
		        statement.setString(5 , emd.getGas_quality_data_source_analysis_frequency().toString());
		        
		        statement.setInt(6 , emd.getGas_quality_data_used_for_updation_in_fc());
		        
		        statement.setString(7 , emd.getGas_quality_data_updation_frequency_in_fc().toString());
		        
		        statement.setInt(8 , emd.getGas_quality_data_method_of_updation_in_fc());
		        
		        statement.setString(9 , emd.getLaboratory_details().toString());
		        
		        
		        
		        String vd =  emd.getValidity_date().toString();
		    	DateTimeFormatter vd_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate vd_final = null;
		    	try {
		    	vd_final = LocalDate.parse(vd, vd_formatter);
		    	statement.setTimestamp(10 ,Timestamp.valueOf(vd_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(10, vd_final, java.sql.Types.TIMESTAMP);
		        }
		    	statement.setInt(11 , emd.getGas_components_covered());
		
		
		    	
		    	
		    	return statement;
	
	}
}, holder);
}


	@Override
	public Object insertSecInstDetails(Secondary_instrument_details sid) {
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		 return jdbcTemplate.update(new PreparedStatementCreator() {
					
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(Query.getQuery(dbschema, "INSERT_SECONDARY_INSTRUMENT_DETAILS"), Statement.RETURN_GENERATED_KEYS);
		
	
		        
		        statement.setInt(1 , (int) sid.getStream_id());
		        statement.setInt(2,Integer.valueOf((String)sid.getStream_no()));
		        statement.setInt(3,(int) sid.getMmst_id());
		        statement.setInt(4, (int)sid.getFc_joint_calibration_frequency());
		        
		        
		        String fdlc =  sid.getFc_date_of_last_calibration().toString();
		    	DateTimeFormatter fdlc_formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
		    	LocalDate fdlc_final = null;
		    	
		    	try {
		    	fdlc_final = LocalDate.parse(fdlc, fdlc_formatter);
		    	statement.setTimestamp(5 ,Timestamp.valueOf(fdlc_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(5, fdlc_final, java.sql.Types.TIMESTAMP);
		        }
		    	
		    	
		    	
		    	String fncd =  sid.getFc_next_calibration_date().toString();
		    	DateTimeFormatter fncd_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    	LocalDate fncd_final = null;
		    	
		    	try {
		    	fncd_final = LocalDate.parse(fncd, fncd_formatter);
		    	statement.setTimestamp(6 ,Timestamp.valueOf(fncd_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(6, fncd_final, java.sql.Types.TIMESTAMP);
		        }
		        
		        statement.setInt(7,(int) sid.getPt_type());
		        
		        statement.setString(8, sid.getPt_make().toString());
		        statement.setString(9, sid.getPt_model().toString());
		       
		       // statement.setDouble(10,Double.valueOf(((String) sid.getPt_accuracy()).replace("+/-","").replace("%", "")));
		        statement.setString(10,(String) sid.getPt_accuracy());
		        
		        statement.setString(11, sid.getPt_calibration_data_upload().toString());
		        /*  Double dptTp = null;
		       if("I".equals((String)sid.getDpt_type())) {
		        	 dptTp = (double) 1;
		        }
		        else if("E".equals((String)sid.getDpt_type())){
			         dptTp = (double) 2;
		        }
		        else if("0".equals((String)sid.getDpt_type())){
			         dptTp = (double) 0;
		        }
		        statement.setObject(12, dptTp,java.sql.Types.DOUBLE);*/
		      statement.setString(12, (String)sid.getDpt_type());
		        statement.setString(13, sid.getDpt_make().toString());
		        statement.setString(14, sid.getDpt_model().toString());
		       // statement.setDouble(15, Double.valueOf(((String)sid.getDpt_accuracy()).replace("+/-","").replace("%", "")));
		        statement.setString(15, (String)sid.getDpt_accuracy());
		        statement.setString(16, sid.getDpt_calibration_data_upload().toString());
		        statement.setInt(17, sid.getTt_temperature_input_to_flow_computer());
		        
		        statement.setString(18, sid.getTt_make().toString());
		        statement.setString(19, sid.getTt_model().toString());
		        //statement.setDouble(20,Double.valueOf(((String) sid.getTt_accuracy()).replace("+/-","").replace("%", "")));
		        statement.setString(20,(String) sid.getTt_accuracy());
		        statement.setString(21, sid.getTt_calibration_data_upload().toString());
		        statement.setInt(22, Integer.valueOf((String)sid.getRtd_type()));
		        statement.setInt(23,(int) sid.getRtd_class());
		        statement.setString(24, sid.getRtd_make().toString());
		        statement.setString(25, sid.getRtd_model().toString());
		        
		        
		        String rdlc =  sid.getRtd_date_of_last_calibration().toString();
		    	DateTimeFormatter rdlc_formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
		    	
		    	LocalDate rdlc_final = null;
		    	
		    	try {
		    	rdlc_final = LocalDate.parse(rdlc, rdlc_formatter);
		    	statement.setTimestamp(26 ,Timestamp.valueOf(rdlc_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(26, rdlc_final, java.sql.Types.TIMESTAMP);
		        }
		    	String rncdd =  sid.getRtd_next_calibration_due_date().toString();
		    	DateTimeFormatter rncdd_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    	LocalDate rncdd_final = null;
		    	try {
		    	rncdd_final = LocalDate.parse(rncdd, rncdd_formatter);
		    	statement.setTimestamp(27 ,Timestamp.valueOf(rncdd_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(27, rncdd_final, java.sql.Types.TIMESTAMP);
		        }
		        
		        statement.setInt(28, (int) sid.getBi_barrier_installed());
		        statement.setString(29, sid.getBi_primary_meter_frequency_range().toString());
		        statement.setString(30, sid.getBi_installed_barrier_frequency_range().toString());
		        
		        
		        
		        String bdls =  sid.getBi_date_of_last_simulation().toString();
		    	DateTimeFormatter bdls_formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
		    	LocalDate bdls_final =null;
		    	try {
		    	bdls_final = LocalDate.parse(bdls, bdls_formatter);
		    	statement.setTimestamp(31 ,Timestamp.valueOf(bdls_final.atStartOfDay()));
		    	}
		    	catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(31, bdls_final, java.sql.Types.TIMESTAMP);
		        }

		    	String bnsdd =  sid.getBi_next_simulation_due_date().toString();
			    DateTimeFormatter bnsdd_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			    LocalDate bnsdd_final = null;
			    try {
			    bnsdd_final = LocalDate.parse(bnsdd, bnsdd_formatter);
			    statement.setTimestamp(32 ,Timestamp.valueOf(bnsdd_final.atStartOfDay()));
			    }
			    catch(java.time.format.DateTimeParseException e) {
		        	//ncd_final = LocalDate.parse("1970-01-01", formatter);
		        	statement.setObject(32, bnsdd_final, java.sql.Types.TIMESTAMP);
		        }
		        
		        
		        
		        
		return statement;
	}
}, holder );
	}
	

	public String StringDateValues(String cellValue) {
		String returnValue = null;
		if("NA".equals(cellValue)||"".equals(cellValue.trim())) {
			returnValue = "0";
		}else{
			returnValue = cellValue;
			
		}
		
		return returnValue;
	}
}