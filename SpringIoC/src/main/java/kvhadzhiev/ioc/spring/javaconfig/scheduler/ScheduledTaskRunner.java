package kvhadzhiev.ioc.spring.javaconfig.scheduler;

import kvhadzhiev.ioc.spring.javaconfig.util.ActionLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ScheduledTaskRunner {

    @Value("1000")
    private int period;

    @Autowired
    private TaskInvoker invoker;

    @Autowired
    private ActionLogger logger;

    public int runCounter = 0;

    public ScheduledTaskRunner() {

    }

    public ActionLogger getLogger() {
        return logger;
    }

    @PostConstruct
    public void init() {
        new Thread(() -> {
            while(true) {
                invoker.invokeTask();
                runCounter++;
                try {
                    Thread.sleep(period);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }).start();
    }

}
