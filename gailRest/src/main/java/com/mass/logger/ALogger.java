
package com.mass.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ALogger {

  private Logger logger = null;//
  public static boolean schedulerLog = false;

  public static final boolean TRACE = false;
  public static final boolean DEBUG = true;
  public static final boolean INFO = true;
  public static final boolean ERROR = true;
  public static final boolean WARNING = false;
  public static final boolean dataLogs = false;

  public ALogger() {
	logger = LogManager.getRootLogger();
  }

  public ALogger(String applicationName) {
	logger = LogManager.getLogger(applicationName);
  }

  public void trace(Object c, String msg) {
	if (TRACE) {
	  System.out.println("[" + c.getClass().getName() + "], TRACE : " + msg);
	  logger.trace("[" + c.getClass().getName() + "]" + msg);
	}

  }

  public void debug(Object c, String msg) {
	if (DEBUG) {
	  System.out.println("[" + c.getClass().getName() + "], DEBUG : " + msg);
	  logger.debug("[" + c.getClass().getName() + "]" + msg);
	}
  }

  public void debug(Object c, String msg, Object[] params) {
	if (DEBUG) {
	  System.out.println("[" + c.getClass().getName() + "], DEBUG :" + msg);
	  logger.debug("[" + c.getClass().getName() + "]" + msg);
	}
  }

  public void error(Object c, String msg) {
	if (ERROR)
	  System.out.println("[" + c.getClass().getName() + "], ERROR :" + msg);
	logger.error("[" + c.getClass().getName() + "]" + msg);
  }

  public void error(Object c, String msg, Object[] params) {
	if (ERROR)
	  System.out.println("[" + c.getClass().getName() + "], ERROR :" + msg);
	logger.error("[" + c.getClass().getName() + "]" + msg);
  }

  public void error(Object c, String msg, Throwable ex) {
	if (ERROR)
	  System.out.println("[" + c.getClass().getName() + "], ERROR :" + msg);
	logger.error("[" + c.getClass().getName() + "]" + msg, ex);
  }

  public void warning(Object c, String msg) {
	if (WARNING)
	  System.out.println("[" + c.getClass().getName() + "], WARNING :" + msg);
	logger.warn("[" + c.getClass().getName() + "]" + msg);
  }

  public void warning(Object c, String msg, Object[] params) {
	if (WARNING)
	  System.out.println("[" + c.getClass().getName() + "], WARNING :" + msg);
	logger.warn("[" + c.getClass().getName() + "]" + msg);
  }

  public void info(Object c, String msg) {
	if (INFO)
	  System.out.println("[" + c.getClass().getName() + "], INFO :" + msg);
	logger.info("[" + c.getClass().getName() + "]" + msg);
  }

  public void dataLogs(Object c, String msg) {
	if (dataLogs)
	  System.out.println("[" + c.getClass().getName() + "], dataLogs :" + msg);
	logger.info("[" + c.getClass().getName() + "]" + msg);
  }
}
