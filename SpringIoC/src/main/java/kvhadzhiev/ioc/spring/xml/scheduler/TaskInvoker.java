package kvhadzhiev.ioc.spring.xml.scheduler;

import kvhadzhiev.ioc.spring.xml.db.Repository;
import kvhadzhiev.ioc.spring.xml.util.Autocalled;

public class TaskInvoker {

    private Repository targetRepo;

    @Autocalled
    public void setTargetRepo(Repository repo) {
        this.targetRepo = repo;
    }

    public void invokeTask() {
        targetRepo.insert();
    }

}
