package kvhadzhiev.ioc.spring.annotation.util;

import kvhadzhiev.ioc.spring.annotation.scheduler.ScheduledTaskRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActionLogger {


    List<ScheduledTaskRunner> taskRunnerList;

    public static int id = 0;

    public void setTaskRunnerList(List<ScheduledTaskRunner> list) {
        this.taskRunnerList = list;
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
