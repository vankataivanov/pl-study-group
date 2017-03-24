package kvhadzhiev.ioc.spring.xml.scheduler;

import kvhadzhiev.ioc.spring.xml.db.Repository;

public class TaskInvoker {

    private Repository targetRepo;

    public void setTargetRepo(Repository repo) {
        this.targetRepo = repo;
    }

    public void invokeTask() {
        targetRepo.insert();
    }

}
