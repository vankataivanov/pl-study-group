package kvhadzhiev.ioc.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    public static ApplicationContext loadAppContext() {
        return new ClassPathXmlApplicationContext("/app-context.xml");
    }

}
