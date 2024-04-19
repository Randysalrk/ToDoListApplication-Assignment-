import java.util.*;

public class UserLogin {
private String username = "lahiru";
private String password = "123";

public UserLogin(String username, String password) {
this.username = username;
this.password = password;
}

public boolean startLoginSteps() {
    Scanner sr = new Scanner(System.in);

    System.out.println("Enter username: ");
    String enteredUsername = sr.nextLine();

    System.out.println("Enter password: ");
    String enteredPassword = sr.nextLine();

    if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
    System.out.println("Login Successful!");
            
    return true;
            
    } else {
    System.out.println("Incorrect username or password. Try again!");
            
    return false;
    }
        
    }


}
