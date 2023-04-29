package org.example;

/*Singletons are almost like a normal class. Therefore, they can also have methods and attributes.
* They also implement Comparable by default and the compareTo method behaviour is that the first
* value is the lowest and the last is the highest.
*/
public enum LogLevel {
    INFO ("Information"),
    WARNING ("Warning"),
    ERROR ("Error");

    private final String name;

    LogLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
