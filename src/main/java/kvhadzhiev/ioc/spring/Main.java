package kvhadzhiev.ioc.spring;

import kvhadzhiev.ioc.spring.config.AppConfig;
import kvhadzhiev.ioc.spring.scheduler.ScheduledTaskRunner;
import org.springframework.context.ApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program startup.");
        ApplicationContext context = AppConfig.loadAppContext();
        ScheduledTaskRunner taskRunner = (ScheduledTaskRunner)context.getBean("insertPaymentScheduledTask");
        taskRunner.init();
        taskRunner.getLogger().init();

    }

}
