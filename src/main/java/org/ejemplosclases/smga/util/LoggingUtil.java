package org.ejemplosclases.smga.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingUtil {
    private static final Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logError(String message) {
        logger.error(message);
    }
}


