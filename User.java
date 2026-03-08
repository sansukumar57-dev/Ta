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


    public boolean createTask(String title, String description) {

        TaskInterface task = new Task();
        task.createOrUpdate(title, description);

        for (int i = 0; i < this.taskArray.length; i++) {
            if (this.taskArray[i] == null) {
                this.taskArray[i] = task;

                return true;
            }
        }
        return false;
    }

    public void showTasks(int n) {

        if (taskArray[0] != null) {
            if(n==1) {
                for (int i = 0; i < taskArray.length; i++) {
                    if (taskArray[i] != null) {
                        System.out.print(i + 1 + "] Task: " + taskArray[i].getTitle() + " | ");
                        System.out.print("Description: " + taskArray[i].getDescription() + " | ");
                        System.out.println("Status: < " + taskArray[i].getStatus() + " >");

                    }
                }
            } else if (n==2) {
                for (int i = 0; i < taskArray.length; i++) {
                    if (taskArray[i] != null) {
                        if (taskArray[i].getStatus().equals("Todo"))
                            System.out.print(i + 1 + "] Task: " + taskArray[i].getTitle() + " | ");
                        System.out.print("Description: " + taskArray[i].getDescription() + " | ");
                        System.out.println("Status: < " + taskArray[i].getStatus() + " >");
                    }

                    }
                } else if (n==3) {
                for (int i = 0; i < taskArray.length; i++) {
                    if (taskArray[i] != null) {
                        if (taskArray[i].getStatus().equals("In-Progress"))
                            System.out.print(i + 1 + "] Task: " + taskArray[i].getTitle() + " | ");
                        System.out.print("Description: " + taskArray[i].getDescription() + " | ");
                        System.out.println("Status: < " + taskArray[i].getStatus() + " >");
                    }

                }

            } else if (n==4) {
                for (int i = 0; i < taskArray.length; i++) {
                    if (taskArray[i] != null) {
                        if (taskArray[i].getStatus().equals("Done"))
                            System.out.print(i + 1 + "] Task: " + taskArray[i].getTitle() + " | ");
                        System.out.print("Description: " + taskArray[i].getDescription() + " | ");
                        System.out.println("Status: < " + taskArray[i].getStatus() + " >");
                    }

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




        for (int i = indexValue - 1; i < taskArray.length - 1; i++) {
            if (taskArray[i] != null) {
                taskArray[i] = taskArray[i + 1];
            }
        }
        taskArray[taskArray.length - 1] = null;
        System.out.println("Deleted successfully ");

    }

}
