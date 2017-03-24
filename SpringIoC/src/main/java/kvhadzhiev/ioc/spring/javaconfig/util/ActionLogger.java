package kvhadzhiev.ioc.spring.javaconfig.util;

import kvhadzhiev.ioc.spring.javaconfig.scheduler.ScheduledTaskRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ActionLogger {

    List<ScheduledTaskRunner> taskRunnerList;

    public static int id = 0;

    public ActionLogger() {

    }

    @Bean
    public ActionLogger actionLogger() {
        return new ActionLogger();
    }

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
