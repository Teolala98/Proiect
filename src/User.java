import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private List<Task> tasks;

    public User(String firstName, String lastName, String userName, String email, String password, List<Task> tasks){
        this.firstName=firstName;
        this.lastName = lastName;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.tasks=tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
