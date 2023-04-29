package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("-- Logging with INFO priority --");
        MyLog.getInstance().setPriority(LogLevel.INFO);
        MyLog.getInstance().log("Mensagem", LogLevel.INFO);
        MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);
        MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);

        System.out.println("\n-- Logging with WARNING priority --");
        MyLog.getInstance().setPriority(LogLevel.WARNING);
        MyLog.getInstance().log("Mensagem", LogLevel.INFO); // It will not be logged
        MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);
        MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);

        System.out.println("\n-- Logging with ERROR priority --");
        MyLog.getInstance().setPriority(LogLevel.ERROR);
        MyLog.getInstance().log("Mensagem", LogLevel.INFO); // It will not be logged
        MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING); // It will not be logged
        MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);
    }
}