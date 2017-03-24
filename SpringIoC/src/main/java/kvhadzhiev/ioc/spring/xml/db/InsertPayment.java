package kvhadzhiev.ioc.spring.xml.db;

public class InsertPayment implements Repository {

    public void insert() {
        System.out.println("Inserting payment in database.");
    }

    public static InsertPayment createInstance() {
        return new InsertPayment();
    }

    public void initHook() {
        System.out.println("InsertPayment bean init callback.");
    }

}
