package kvhadzhiev.ioc.spring.javaconfig.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertPayment implements Repository {

    @Bean
    public InsertPayment insertPayment() {
        return new InsertPayment();
    }

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

    public void initHook() {
        System.out.println("InsertPayment bean init callback.");
    }

}
