package org.example;

import java.util.Objects;

// To be a singleton class, it must present the items 1, 2, 3.
public final class MyLog {
    private static MyLog INSTANCE; // 1. A static field containing its only instance
    private LogLevel priority;

    // 2. A private constructor
    private MyLog(){
        priority = LogLevel.INFO;
    }

    //3. A static factory method for obtaining the instance
    public synchronized static MyLog getInstance(){
        if(INSTANCE == null) INSTANCE = new MyLog();
        return INSTANCE;
    }

    /* It is not part of the pattern, but it is part of the logging problem
    *  If you implemented the pattern correctly, but you did not solve the problem
    *  what is the point?
    */
    public void log(String message, LogLevel level){
        Objects.requireNonNull(message, "Message must not be null"); // sanitizes the parameter
        Objects.requireNonNull(level, "LogLevel must not be null"); // sanitizes the parameter
        // Use the compareTo method already available in the enum to check if the message should be logged
        if(level.compareTo(priority) >= 0) System.out.println(level + " message: " + message);
    }

    public LogLevel getPriority() {
        return priority;
    }

    public void setPriority(LogLevel priority) {
        this.priority = priority;
    }
}
