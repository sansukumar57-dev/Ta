package TaskManagerFinal;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer id;
    private String username;
    private List<Task> taskList=new ArrayList<>();
    public User(){

    }
    public User(Integer id,String username){
        this.id = id;
        this.username=username;
    }

    public User(int id) {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
