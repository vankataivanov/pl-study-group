package kvhadzhiev.ioc.spring.xml.scheduler;

import kvhadzhiev.ioc.spring.xml.util.ActionLogger;

public class ScheduledTaskRunner {

    private int period;
    private TaskInvoker invoker;
    private ActionLogger logger;

    public int runCounter = 0;

    // we need the default ctor, because we switch between constructor and setter injection and we have
    // a non-default constructor in the class
    public ScheduledTaskRunner() {

    }

    public ScheduledTaskRunner(ActionLogger logger) {
        this.logger = logger;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setInvoker(TaskInvoker invoker) {
        this.invoker = invoker;
    }

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
