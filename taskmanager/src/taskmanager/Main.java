package taskmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n--- Task Manager Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Toggle Task Completion");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    taskManager.addTask(title);
                    break;

                case 2:
                    taskManager.displayTasks();
                    break;

                case 3:
                    System.out.print("Enter task index to update: ");
                    int uIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    taskManager.updateTask(uIndex, newTitle);
                    break;

                case 4:
                    System.out.print("Enter task index to delete: ");
                    int dIndex = scanner.nextInt();
                    taskManager.deleteTask(dIndex);
                    break;

                case 5:
                    System.out.print("Enter task index to toggle completion: ");
                    int tIndex = scanner.nextInt();
                    taskManager.toggleTaskCompletion(tIndex);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
