package kvhadzhiev.ioc.spring.javaconfig.config;

import kvhadzhiev.ioc.spring.javaconfig.db.InsertPayment;
import kvhadzhiev.ioc.spring.javaconfig.scheduler.ScheduledTaskRunner;
import kvhadzhiev.ioc.spring.javaconfig.scheduler.TaskInvoker;
import kvhadzhiev.ioc.spring.javaconfig.util.ActionLogger;
import kvhadzhiev.ioc.spring.javaconfig.util.FileLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "insertPaymentTask")
    public InsertPayment insertPayment() {
        return new InsertPayment();
    }

    @Bean(name = "insertPaymentScheduledTask")
    ScheduledTaskRunner scheduledTaskRunner() {
        return new ScheduledTaskRunner();
    }

    @Bean(name = "actionLogger")
    @Scope("prototype")
    ActionLogger actionLogger() {
        return new ActionLogger();
    }

    @Bean
    TaskInvoker taskInvoker() {
        return new TaskInvoker();
    }

    @Bean
    @DependsOn("actionLogger")
    FileLogger fileLogger() {
        return new FileLogger();
    }

}
