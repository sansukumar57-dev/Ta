package TaskManagerFinal;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private Task[] taskArray = new Task[10];


    public User() {

    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Task[] getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(Task[] taskArray) {
        this.taskArray = taskArray;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
