package com.company;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    static  Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        BasicConfigurator.configure();
        logger.debug("Đây là câu lệnh debug");
        logger.info("Đây là câu lệnh info");

    }
}
