package kvhadzhiev.ioc.spring.javaconfig.config;

import kvhadzhiev.ioc.spring.javaconfig.db.InsertPayment;
import kvhadzhiev.ioc.spring.javaconfig.scheduler.ScheduledTaskRunner;
import kvhadzhiev.ioc.spring.javaconfig.scheduler.TaskInvoker;
import kvhadzhiev.ioc.spring.javaconfig.util.ActionLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

    public static ApplicationContext loadAppContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(InsertPayment.class, ScheduledTaskRunner.class, TaskInvoker.class, ActionLogger.class);
        context.refresh();
        return context;
    }

}
