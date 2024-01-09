import java.util.ArrayList;
import java.util.Scanner;

public class login {
    boolean a=true;
    boolean b=false;
    public void signin() {
        do {
            // Create an ArrayList to store user credentials
            ArrayList<User> users = new ArrayList<>();
    
            // Add some sample users
            users.add(new User("hotel", "tidur"));
            users.add(new User("resto", "makan"));
    
            // Get user input for login
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n----LOG IN PENGUNJUNG----");
    
            System.out.print("Masukkan Username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String passwordInput = scanner.nextLine();
    
            // Check if the entered credentials are valid
            if (isValidLogin(users, usernameInput, passwordInput)) {
                System.out.println("Login Successful!");
                a = b;
            } else {
                System.out.println("Login Failed!.");
            }
        } while (a);
    }

    // Method to validate login credentials
    private static boolean isValidLogin(ArrayList<User> users, String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Valid credentials
            }
        }
        return false; // Invalid credentials
    }
}

// User class to represent user credentials
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
