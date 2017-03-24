package kvhadzhiev.ioc.spring.xml;

import kvhadzhiev.ioc.spring.xml.config.AppConfig;
import kvhadzhiev.ioc.spring.xml.scheduler.ScheduledTaskRunner;
import org.springframework.context.ApplicationContext;

public class XMLMain {

    public static void main(String[] args) {

        System.out.println("XML Configured program startup.");
        ApplicationContext context = AppConfig.loadAppContext();
        ScheduledTaskRunner taskRunner = (ScheduledTaskRunner)context.getBean("insertPaymentScheduledTask");
        taskRunner.init();
        taskRunner.getLogger().init();

    }

}
