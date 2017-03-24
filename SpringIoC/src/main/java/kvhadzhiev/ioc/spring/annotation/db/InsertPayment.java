package kvhadzhiev.ioc.spring.annotation.db;

import kvhadzhiev.ioc.spring.annotation.util.Autocalled;

@Autocalled
public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

}
