package com.github.chain;

public abstract class AbstractLogger {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;
    
    protected int level;
    protected AbstractLogger nextLogger;
    
    protected void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    protected final void logMessage(int level, String message) {
        if (this.level <= level)
            write(message);
        if (nextLogger != null)
            nextLogger.logMessage(level, message);
    }
    
    protected abstract void write(String message);

}
