package kvhadzhiev.ioc.spring.xml.util;

import kvhadzhiev.ioc.spring.xml.scheduler.ScheduledTaskRunner;

import java.util.List;

public class ActionLogger {

    List<ScheduledTaskRunner> taskRunnerList;

    public static int id = 0;

    public ActionLogger(List<ScheduledTaskRunner> taskRunnerList) {
        this.taskRunnerList = taskRunnerList;
    }

    public void init() {
        id++;
        int localId = id;
        new Thread(() -> {
            while (true) {
                taskRunnerList.forEach(t -> System.out.println("Logger: " + localId + " | Tasks ran: " + t.runCounter));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }).start();
    }

}
