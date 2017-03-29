package kvhadzhiev.ioc.spring.javaconfig.util;

import kvhadzhiev.ioc.spring.javaconfig.scheduler.ScheduledTaskRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActionLogger {

    @Autowired
    List<ScheduledTaskRunner> taskRunnerList;

    public static int id = 0;

    public ActionLogger() {

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
