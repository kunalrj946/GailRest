/**
 * 
 */

package com.mass.config;

import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.mass.logger.ALogger;

/**
 * @author Divanshu
 *
 */

public class Application {

  private static Application instance = null;
//  private Configurator configProps = null;
  public static final String APPLICATION_NAME = "gailRest";
//  private ConnectionPool connectionPoolObj = null;
//  private WriterDao writerDaoObj = null;
//  private JobCacheManager JobCacheManagerObj = null;
  private boolean isDbConnReady = false;
  private ALogger defaultLogger = new ALogger(APPLICATION_NAME);
  private ConcurrentHashMap<String, Object> schedulerInstance = new ConcurrentHashMap<String, Object>();
  public int insertQueryCounter2 = 0;
  public int cacheRecord2 = 0;

  public long receivedCounter = 0;
  public long threadCounter = 0;
  public long writtenCounter = 0;
  private boolean isSchedulerIsStarted = false;
  private boolean isKafkaSchedulerIsStarted = false;
  private JsonFactory streamingJsonFactory = new MappingJsonFactory();


  public static Application getInstance() {
	if (Application.instance == null) {
	  Application.instance = new Application();

	}
	return Application.instance;
  }


  public boolean isDbConnectionReady() {
	return this.isDbConnReady;
  }

  public void markDbConnectionReady(boolean ready) {
	this.isDbConnReady = ready;
  }

  public synchronized void updateWorkerThreadValue(String action) {
	if (action == "ADD") {
	  Application.getInstance().threadCounter += 1;
	}
	if (action == "SUBTRACT") {
	  Application.getInstance().threadCounter -= 1;
	}
  }

  public ALogger getDefaultLogger() {
	return defaultLogger;
  }

  public JsonFactory getStreamingJsonFactory() {
	return streamingJsonFactory;
  }
}