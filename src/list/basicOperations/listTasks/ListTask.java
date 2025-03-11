package list.basicOperations.listTasks;

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
        taskList.forEach(t -> {
            if(t.getDescription().trim().equalsIgnoreCase(description)){
                taskForRemove.add(t);
            }
        });

        taskList.removeAll(taskForRemove);
    }

    public int getTotalTasks(){
        return taskList.size();
    }

    public void getDescriptionTask(){
        System.out.println("\n=================\nTarefas V");
        taskList.forEach(task -> System.out.println(task.getDescription()));
        System.out.println("=================");
    }

    public static void main(String[] args) {
        ListTask list = new ListTask();

        list.addTask("Estudar autenticação com JWT!");
        list.addTask("Estudar Quarkus!");
        System.out.println("Número total de tarefas: " + list.getTotalTasks());

        list.getDescriptionTask();
    }

}
