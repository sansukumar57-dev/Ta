package TaskManagerFinal;

public interface UserInterface {
    public String getUsername();
    public TaskInterface[] getTaskArray();
    public void setTaskArray(TaskInterface[] taskArray);
    public String getPassword();
    public void setPassword(String password);
    public boolean createTask(String title, String description);
    public void showTasks();
    public void updateTask(int choicetoupdate, String title, String descripiton,String status) ;
    public void deleteTask(int indexValue) ;


    }
