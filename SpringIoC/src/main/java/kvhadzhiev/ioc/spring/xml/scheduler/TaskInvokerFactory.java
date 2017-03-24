package kvhadzhiev.ioc.spring.xml.scheduler;

import kvhadzhiev.ioc.spring.xml.util.Autocalled;

@Autocalled
public class TaskInvokerFactory {

    @Autocalled
    public TaskInvoker createTaskInvoker() {
        return new TaskInvoker();
    }

}
