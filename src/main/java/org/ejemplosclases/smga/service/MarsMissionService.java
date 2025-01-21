package org.ejemplosclases.smga.service;

import org.ejemplosclases.smga.util.LoggingUtil;
import org.springframework.stereotype.Service;

@Service
public class MarsMissionService {

    public void processBatch() {
        LoggingUtil.logInfo("Starting batch processing for Mars mission.");
        // Simulate batch processing
        LoggingUtil.logInfo("Batch processing completed successfully.");
    }

}

