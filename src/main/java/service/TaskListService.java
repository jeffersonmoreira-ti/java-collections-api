package service;

import lombok.Getter;
import lombok.Setter;
import model.Task;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class TaskListService {
    private List<Task> taskList;


    public TaskListService() {
        this.taskList = new ArrayList<>();
    }

    public TaskListService(List<Task> taskList) {
        this.taskList = taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        this.taskList.add(new Task(description));
    }

    public void deleteTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task : this.taskList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }
        this.taskList.removeAll(tasksToRemove);
    }

    public int getTasksQuantity() {
        return this.taskList.size();
    }

    public void getTasksDescription() {
        for (Task task : this.taskList)
            System.out.println(task.toString());
    }


}
