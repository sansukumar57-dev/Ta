package TaskManagerFinal;


public class User implements UserInterface {

    private String username;
    private String password;
    private TaskInterface[] taskArray = new Task[10];


    public User() {

    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public TaskInterface[] getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(TaskInterface[] taskArray) {
        this.taskArray = taskArray;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean createTask(String title, String description,UserInterface user) {

        TaskInterface task = new Task();
        task.createOrUpdate(title, description);
        task.setUser(user);
        for (int i = 0; i < this.getTaskArray().length; i++) {
            if (taskArray[i] == null) {
                taskArray[i] = task;

                return true;
            }
        }
        return false;
    }

    public void showTasks() {

        if (taskArray[0] != null) {

            for (int i = 0; i < taskArray.length; i++) {
                if (taskArray[i] != null) {
                    System.out.print(i + 1 + "] Task: " + taskArray[i].getTitle()+" | ");
                    System.out.print("Description: " + taskArray[i].getDescription()+" | ");
                    System.out.println("Status: < "+taskArray[i].getStatus()+" >");

                }
            }
        } else {
            System.out.println(" task is Not here ");
        }
    }

    public void updateTask(int choicetoupdate, String title, String descripiton,String status) {
        if(title!=null){
            taskArray[choicetoupdate-1].createOrUpdate(title,getTaskArray()[choicetoupdate-1].getDescription());
        }
        if(descripiton!=null) {

            taskArray[choicetoupdate - 1].createOrUpdate(getTaskArray()[choicetoupdate-1].getTitle(), descripiton);
        }
        if(status!=null){
            taskArray[choicetoupdate - 1].setStatus(status);

        }

    }

    public void deleteTask(int indexValue) {

        if (taskArray[indexValue - 1] == null) {
            System.out.println("Task is not found");
            return;
        }


        for (int i = indexValue - 1; i < taskArray.length - 1; i++) {
            if (taskArray[i] != null) {
                taskArray[i] = taskArray[i + 1];
            }
        }
        taskArray[taskArray.length - 1] = null;
        System.out.println("Deleted successfully ");

    }

}
