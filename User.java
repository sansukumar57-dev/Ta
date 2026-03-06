package TaskManagerFinal;



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



    public boolean createTask(String title,String description){
        Task   task=new Task();
//       this.task.setTitle(title);
//        this.task.setDescription(description);
        task.createOrUpdate(title,description);
        for (int i = 0; i < this.getTaskArray().length; i++) {
            if(this.getTaskArray()[i]==null){
                this.getTaskArray()[i]=task;
                return true;
            }
        }
        return false;
    }
    public void showTasks() {

        if (taskArray[0] != null) {
            for (int i = 0; i < taskArray.length; i++) {
                if (taskArray[i] != null) {
                    System.out.println(i + 1 + "] Task: " + taskArray[i].getTitle());
                    System.out.println("Description: " + taskArray[i].getDescription());

                }
            }
        } else {
            System.out.println(" task is Not here ");
        }
    }
    public boolean updateTask(int choicetoupdate,String title,String descripiton){
        if(choicetoupdate <= 0 || choicetoupdate > taskArray.length || taskArray[choicetoupdate - 1] == null){
           return false;
        }
        taskArray[choicetoupdate - 1].createOrUpdate(title,descripiton);
        return true;
    }
    public boolean deleteTask(int indexValue){
        if(indexValue <= 0 || indexValue > taskArray.length || taskArray[indexValue - 1] == null)
        {
            return false;
        }

        for (int i = indexValue-1; i < taskArray.length-1; i++) {
            taskArray[i] = taskArray[i + 1];
        }
        taskArray[taskArray.length - 1] = null;
        return true;
    }

}
