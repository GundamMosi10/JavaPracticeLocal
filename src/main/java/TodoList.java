import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    private static List<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nTodoList");
            System.out.println("1. Add task");
            System.out.println("2. Edit task");
            System.out.println("3. Delete task");
            System.out.println("4. Mark task as completed");
            System.out.println("5. View tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    editTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    markTaskCompleted();
                    break;
                case 5:
                    viewTasks();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");
    }

    private static void editTask() {
        viewTasks();
        System.out.print("Enter task number to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new description: ");
            String newTask = scanner.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task edited successfully.");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int index = scanner.nextInt() -1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void markTaskCompleted() {
        viewTasks();
        System.out.print("Enter task number to mark as completed: ");
        int index = scanner.nextInt() -1;
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, "[Completed] " + tasks.get(index));
            System.out.println("Task mark as completed.");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void viewTasks() {
        System.out.println("Tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + "." + tasks.get(i));
        }
    }
}
