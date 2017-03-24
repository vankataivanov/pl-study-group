package kvhadzhiev.ioc.spring.xml.util;

// start second logger(use prototype scope for logger)
public class FileLogger {

    public FileLogger() {

    }

    public FileLogger(ActionLogger actionLogger) {
        actionLogger.init();
    }

    public void setLogger(ActionLogger actionLogger) {
        actionLogger.init();
    }

}
