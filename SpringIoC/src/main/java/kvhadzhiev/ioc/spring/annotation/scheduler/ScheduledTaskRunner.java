package kvhadzhiev.ioc.spring.annotation.scheduler;

import kvhadzhiev.ioc.spring.annotation.util.ActionLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ScheduledTaskRunner {

    @Value("1000")
    public int period;

    @Autowired
    public TaskInvoker invoker;

    private ActionLogger logger;

    public int runCounter = 0;

    @Autowired
    public void setLogger(ActionLogger logger) {
        this.logger = logger;
        ArrayList<ScheduledTaskRunner> list = new ArrayList<>();
        list.add(this);
        logger.setTaskRunnerList(list);
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
