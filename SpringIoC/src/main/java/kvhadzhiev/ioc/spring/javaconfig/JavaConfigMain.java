package kvhadzhiev.ioc.spring.javaconfig;

import kvhadzhiev.ioc.spring.javaconfig.config.AppConfig;
import kvhadzhiev.ioc.spring.javaconfig.scheduler.ScheduledTaskRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {

        System.out.println("JavaConfig program startup.");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ScheduledTaskRunner taskRunner = (ScheduledTaskRunner)context.getBean("insertPaymentScheduledTask");
        taskRunner.init();
        taskRunner.getLogger().init();

    }

}
