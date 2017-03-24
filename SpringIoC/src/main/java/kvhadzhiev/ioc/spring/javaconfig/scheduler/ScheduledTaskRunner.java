package kvhadzhiev.ioc.spring.javaconfig.scheduler;

import kvhadzhiev.ioc.spring.javaconfig.util.ActionLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTaskRunner {

    @Value("1000")
    private int period;

    private TaskInvoker invoker;
    private ActionLogger logger;

    public int runCounter = 0;

    @Bean
    public ScheduledTaskRunner insertPaymentScheduledTask() {
        return new ScheduledTaskRunner();
    }

    public ScheduledTaskRunner() {

    }

    public ScheduledTaskRunner(ActionLogger logger) {
        this.logger = logger;
    }

    @Autowired
    public void setInvoker(TaskInvoker invoker) {
        this.invoker = invoker;
    }

    @Autowired
    public void setLogger(ActionLogger logger) {
        this.logger = logger;
    }

    public ActionLogger getLogger() {
        return logger;
    }

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
