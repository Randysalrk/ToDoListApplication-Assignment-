import java.util.*;

public class MainApp {
public static void main(String[] args) {
UserLogin user = new UserLogin("lahiru", "123");
boolean loginSuccessful = user.startLoginSteps();

if(loginSuccessful){
ToDoList toDoList = new ToDoList();
Scanner scan = new Scanner(System.in);


while (true) {

System.out.println("<<<<<------------------------------>>>>>");    
System.out.println("1. Add Task");
System.out.println("2. View Tasks");
System.out.println("3. Mark Task as Completed");
System.out.println("4. Exit");

System.out.print("Enter your choice: ");
int choice = scan.nextInt();
scan.nextLine(); 

switch (choice) {
case 1:
System.out.println("-------------------------");    
System.out.print("Enter task description: ");
String description = scan.nextLine();
toDoList.addTask(description);
break;
              
case 2:
toDoList.viewTasks();
break;

case 3:
System.out.println("-------------------------");  
System.out.print("Enter the task index to mark as completed: ");
int index = scan.nextInt();
toDoList.markTaskAsCompleted(index - 1); 
break;
                
case 4:
System.out.println("-------------------------");  
System.out.println("Loged out!. Goodbye!");
System.exit(0);
        
default:
System.out.println("-------------------------");  
System.out.println("Invalid choice. Please try again.");
}
//scan.close();
}
} else {
    System.out.println("-------------------------");  
System.out.println("Login unsuccessful. Exiting the application.");
}

    
}
}
