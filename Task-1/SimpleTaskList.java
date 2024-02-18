import java.util.ArrayList;
import java.util.Scanner;

public class SimpleTaskList {
    private ArrayList<String> tasks;

    public SimpleTaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        SimpleTaskList toDoList = new SimpleTaskList();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Display Tasks\n4. Exit\nEnter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task to add:");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    break;
                case 2:
                    System.out.println("Enter index of task to remove:");
                    int indexToRemove = scanner.nextInt();
                    toDoList.removeTask(indexToRemove - 1);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting ToDoList application. Goodbye!");
    }
}