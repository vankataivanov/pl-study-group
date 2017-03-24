package kvhadzhiev.ioc.spring.annotation;

import kvhadzhiev.ioc.spring.annotation.config.AppConfig;
import kvhadzhiev.ioc.spring.annotation.scheduler.ScheduledTaskRunner;
import org.springframework.context.ApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {

        System.out.println("Annotation Configured program startup.");
        ApplicationContext context = AppConfig.loadAppContext();
        ScheduledTaskRunner taskRunner = (ScheduledTaskRunner)context.getBean("insertPaymentScheduledTask");
        taskRunner.init();
        taskRunner.getLogger().init();

    }

}
