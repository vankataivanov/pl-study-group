package kvhadzhiev.ioc.spring.annotation.db;

import kvhadzhiev.ioc.spring.annotation.util.Autocalled;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Repository
public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

    @PostConstruct
    @Autocalled
    public void initHook() {
        System.out.println("InsertPayment bean init callback.");
    }

}
