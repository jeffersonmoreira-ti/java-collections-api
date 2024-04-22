package app;

import model.TaskList;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        int totalTasksQuantity = 0;

        for (int x = 0; x < 100; x++) {
            taskList.addTask("Task " + x);
            System.out.println("Task " + x + " Added");
            totalTasksQuantity++;
        }

        System.out.println("Added Tasks Total: " + totalTasksQuantity);
        taskList.getTasksDescription();

        System.out.println("Quantity of Tasks in the list: " + taskList.getTasksQuantity());

        taskList.deleteTask("Task 94");
        taskList.deleteTask("Task 64");
        taskList.deleteTask("Task 22");

        taskList.getTasksDescription();

        System.out.println("Quantity of Tasks in the list: " + taskList.getTasksQuantity());
    }

}
