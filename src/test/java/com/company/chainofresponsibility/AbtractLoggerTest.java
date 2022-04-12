package com.company.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbtractLoggerTest {

    @Test
    void write() {
        AbtractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbtractLogger.INFO, "This is an information");
        loggerChain.logMessage(AbtractLogger.DEBUG, "This is an debug");
        loggerChain.logMessage(AbtractLogger.ERROR, "This is an error");

    }

    private AbtractLogger getChainOfLogger(){
        AbtractLogger errorLogger = new ErrorLogger(AbtractLogger.ERROR);
        AbtractLogger fileLogger = new FileLogger(AbtractLogger.DEBUG);
        AbtractLogger consoleLogger = new ConsoleLogger(AbtractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}