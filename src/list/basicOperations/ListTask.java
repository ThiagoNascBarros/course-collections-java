package list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

    private List<Task> taskList;

    public ListTask() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> taskForRemove = new ArrayList<>();
        taskForRemove.forEach(t -> {
            if(t.getDescription().equalsIgnoreCase(description)){
                taskForRemove.remove(t);
            }
        });
    }

}
