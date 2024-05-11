package com.example.design.behavioral.chainOfResponsibility;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChainOfRespoContoller {
	
	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}

	@GetMapping("/chainofrespo")
	public String getMessage() {
		Logger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(Logger.INFO, "This is an information.");
		loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
		loggerChain.logMessage(Logger.ERROR, "This is an error information.");
		
		return "chainofrespo";
	}
}
