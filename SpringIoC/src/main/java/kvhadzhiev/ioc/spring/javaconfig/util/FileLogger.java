package kvhadzhiev.ioc.spring.javaconfig.util;

@Autocalled
public class FileLogger {

    @Autocalled
    public FileLogger() {

    }

    @Autocalled
    public FileLogger(ActionLogger actionLogger) {
        actionLogger.init();
    }

    @Autocalled
    public void setLogger(ActionLogger actionLogger) {
        actionLogger.init();
    }

}
