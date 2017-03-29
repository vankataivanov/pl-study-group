package kvhadzhiev.ioc.spring.javaconfig.db;

public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

    public void initHook() {
        System.out.println("InsertPayment bean init callback.");
    }

}
