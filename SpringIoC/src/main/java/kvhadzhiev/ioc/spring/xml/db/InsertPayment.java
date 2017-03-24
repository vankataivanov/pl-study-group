package kvhadzhiev.ioc.spring.xml.db;

import kvhadzhiev.ioc.spring.xml.util.Autocalled;

@Autocalled
public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

    @Autocalled
    public static InsertPayment createInstance() {
        return new InsertPayment();
    }

    @Autocalled
    public void initHook() {
        System.out.println("InsertPayment bean init callback.");
    }

}
