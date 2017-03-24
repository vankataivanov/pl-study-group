package kvhadzhiev.ioc.spring.annotation.scheduler;

import kvhadzhiev.ioc.spring.annotation.db.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskInvoker {

    @Autowired
    public Repository targetRepo;

    public void invokeTask() {
        targetRepo.insert();
    }

}
