package com.ortecfinance.education.service.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import java.util.Set;

public class LoggerAppInitializer implements ServletContainerInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAppInitializer.class);

    static void logLogLevels() {
        LOGGER.trace("TRACE");
        LOGGER.debug("DEBUG");
        LOGGER.info("INFO");
        LOGGER.warn("WARN");
        LOGGER.error("ERROR");
    }

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) {
        logLogLevels();

        LOGGER.info("Physical location of application: '{}'", ctx.getRealPath("/"));
        LOGGER.info("Initialized logger module");
    }
}
