package kvhadzhiev.ioc.spring.javaconfig.scheduler;

import kvhadzhiev.ioc.spring.javaconfig.db.Repository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskInvoker {

    private Repository targetRepo;

    @Autowired
    public void setTargetRepo(Repository repo) {
        this.targetRepo = repo;
    }

    public void invokeTask() {
        targetRepo.insert();
    }

}
