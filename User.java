package TaskManagerFinal;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Task> taskList=new ArrayList<>();
    public User(){

    }
    public User(String username){
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
