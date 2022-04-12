package com.company.chainofresponsibility;

public abstract class AbtractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbtractLogger nextLogger;

    public void setNextLogger(AbtractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (this.nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
