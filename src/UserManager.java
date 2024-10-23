import java.util.ArrayList;
import java.util.List;
import java.io.*;
import org.mindrot.jbcrypt.BCrypt;

public class UserManager {
    private List<User> users;
    private static final String USER_FILE = "users.txt";

    public UserManager() {
        users = new ArrayList<>();
        loadUsers();
    }

    public boolean registerUser(String username, String password, String email, String RegNumber) {
        // Check if username or email already exists
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // User already exists
            }
        }

        // Hash the password using BCrypt before saving
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        // Add new user with the hashed password
        users.add(new User(username, hashedPassword, email, RegNumber));
        saveUsers();
        return true;
    }

    public String getRegNumber(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user.getRegNumber();
            }
        }
        return "";
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                // Verify the password using BCrypt (compares plaintext with hashed)
                if (BCrypt.checkpw(password, user.getPassword())) {
                    return true; // Successful login
                }
            }
        }
        return false; // Invalid credentials
    }

    private void saveUsers() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(USER_FILE))) {
            for (User user : users) {
                writer.println(user.getUsername() + "," +
                        user.getPassword() + "," +  // Save the hashed password
                        user.getEmail() + "," +
                        user.getRegNumber());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsers() {
        File file = new File(USER_FILE);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    // Load users with hashed passwords
                    users.add(new User(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
