package kvhadzhiev.ioc.spring.javaconfig.util;

import org.springframework.beans.factory.annotation.Autowired;

// start second logger(use prototype scope for logger)
public class FileLogger {

    public FileLogger() {

    }

    @Autowired
    public void setLogger(ActionLogger actionLogger) {
        actionLogger.init();
    }

}
