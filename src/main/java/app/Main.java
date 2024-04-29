package app;

import service.TaskListService;

public class Main {
    public static void main(String[] args) {

        TaskListService taskListService = new TaskListService();
        int totalTasksQuantity = 0;

        for (int x = 0; x < 100; x++) {
            taskListService.addTask("Task " + x);
            System.out.println("Task " + x + " Added");
            totalTasksQuantity++;
        }

        System.out.println("Added Tasks Total: " + totalTasksQuantity);
        taskListService.getTasksDescription();

        System.out.println("Quantity of Tasks in the list: " + taskListService.getTasksQuantity());

        taskListService.deleteTask("Task 94");
        taskListService.deleteTask("Task 64");
        taskListService.deleteTask("Task 22");

        taskListService.getTasksDescription();

        System.out.println("Quantity of Tasks in the list: " + taskListService.getTasksQuantity());
    }

}
