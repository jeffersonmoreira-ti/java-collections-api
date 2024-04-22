package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class TaskList {
    private List<Task> taskList;


    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public TaskList(List<Task> taskList) {
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
