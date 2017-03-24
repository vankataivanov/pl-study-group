package kvhadzhiev.ioc.spring.xml.util;

import kvhadzhiev.ioc.spring.xml.scheduler.ScheduledTaskRunner;

import java.util.List;

public class ActionLogger {

    List<ScheduledTaskRunner> taskRunnerList;

    public ActionLogger(List<ScheduledTaskRunner> taskRunnerList) {
        this.taskRunnerList = taskRunnerList;
    }

    public void init() {
        new Thread(() -> {
            while (true) {
                taskRunnerList.forEach(t -> System.out.println("Tasks ran: " + t.runCounter));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }).start();
    }

}
