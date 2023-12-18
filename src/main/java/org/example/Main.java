package org.example;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logToConsole = LoggerFactory.getLogger(Main.class);
    private static final Logger logToFile = LoggerFactory.getLogger(Main.class);
    String name;
    public static void main(String[] args) {
        logToConsole.info("log to consol number1");
        logToFile.info("log to file number2");
    }
}