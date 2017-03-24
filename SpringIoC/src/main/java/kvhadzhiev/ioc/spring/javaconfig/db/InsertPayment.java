package kvhadzhiev.ioc.spring.javaconfig.db;

import kvhadzhiev.ioc.spring.javaconfig.util.Autocalled;

@Autocalled
public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

}
