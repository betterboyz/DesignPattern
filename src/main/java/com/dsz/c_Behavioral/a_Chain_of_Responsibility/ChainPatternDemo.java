package com.dsz.c_Behavioral.a_Chain_of_Responsibility;

import com.dsz.c_Behavioral.a_Chain_of_Responsibility.abstractLogger.AbstractLogger;
import com.dsz.c_Behavioral.a_Chain_of_Responsibility.abstractLogger.ConsoleLogger;
import com.dsz.c_Behavioral.a_Chain_of_Responsibility.abstractLogger.ErrorLogger;
import com.dsz.c_Behavioral.a_Chain_of_Responsibility.abstractLogger.FileLogger;

/**
 * @author dsz
 * @date 18/08/03
 */
public class ChainPatternDemo {

  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

    loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
  }
}
