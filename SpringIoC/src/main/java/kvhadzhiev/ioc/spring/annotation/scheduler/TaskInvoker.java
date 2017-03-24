package kvhadzhiev.ioc.spring.annotation.scheduler;

import kvhadzhiev.ioc.spring.annotation.db.Repository;
import kvhadzhiev.ioc.spring.annotation.util.Autocalled;

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
