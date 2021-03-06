package com.mass.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mass")
public class WebConfig {
	
	@Autowired
	Environment environment;

	private final String URL = "url";
	private final String USER = "dbuser";
	private final String DRIVER = "driver";
	private final String PASSWORD = "dbpassword";
//	private final String SCHEMA = "currentschema";
	
	@Autowired
	DataSource dataSource;
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver canBeCalledAnything(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        return resolver;
    }
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(){
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        return mapper;
    }
	
	@Bean
	public DataSource getDataSOurce() throws NamingException {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:postgresql://192.168.1.160:5433/alethe3?autoReconnect=true");
        driverManagerDataSource.setUsername("postgres");
		driverManagerDataSource.setPassword("Alethe@123");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		driverManagerDataSource.setSchema("mass2");
		System.out.println("Db connected");
		
//		driverManagerDataSource.setUrl("jdbc:postgresql://172.16.5.141:5432/OPCServerDataBase?autoReconnect=true");
//      driverManagerDataSource.setUsername("postgres");
//		driverManagerDataSource.setPassword("sa1985");
//		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
//		driverManagerDataSource.setSchema(environment.getProperty(SCHEMA));
//		System.out.println("Db connected");
		return driverManagerDataSource;
	}
	
	public String getPropValues()  {
		
		
	return "mass2";
	}
}
