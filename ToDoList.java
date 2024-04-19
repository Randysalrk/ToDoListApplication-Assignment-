import java.util.*;

public class ToDoList {
private List<Task> tasks;

public ToDoList() {
this.tasks = new ArrayList<>();
}

public void addTask(String description) {
Task task = new Task(description);
tasks.add(task);
}

public void viewTasks() {
System.out.println("To-Do List:");
for (int i = 0; i < tasks.size(); i++) {
Task task = tasks.get(i);
System.out.println((i + 1) + ". " + task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not - complete"));
}
}

public void markTaskAsCompleted(int index) {
if (index >= 0 && index < tasks.size()) {
Task task = tasks.get(index);
task.markAsCompleted();
System.out.println("Task marked as completed: " + task.getDescription());
} else {
System.out.println("Invalid task index.");
}
}
}
