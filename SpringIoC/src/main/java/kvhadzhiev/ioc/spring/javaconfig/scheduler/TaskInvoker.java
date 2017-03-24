package kvhadzhiev.ioc.spring.javaconfig.scheduler;

import kvhadzhiev.ioc.spring.javaconfig.db.Repository;
import kvhadzhiev.ioc.spring.javaconfig.util.Autocalled;

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
