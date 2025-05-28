package taskmanager;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Task added successfully.");
    }

    public void deleteTask(int index) {
        if (isValidIndex(index)) {
            tasks.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void updateTask(int index, String newTitle) {
        if (isValidIndex(index)) {
            tasks.get(index).setTitle(newTitle);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void toggleTaskCompletion(int index) {
        if (isValidIndex(index)) {
            tasks.get(index).toggleCompleted();
            System.out.println("Task completion status toggled.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        System.out.println("Current Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < tasks.size();
    }
}
