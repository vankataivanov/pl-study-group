package kvhadzhiev.ioc.spring.scheduler;

import kvhadzhiev.ioc.spring.db.Repository;
import kvhadzhiev.ioc.spring.util.Autocalled;

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
