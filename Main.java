package TaskManagerFinal;
//folder called TaskManager Final


import java.util.Scanner;
//java libirary gives the scanner class

public class Main {
// public isthe access modifier

    static int login(User[] arr,String username,String password){

        if(arr[0]!=null){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                   if(  arr[i].getUsername().equals(username)){
                         if(arr[i].getPassword().equals(password)){
                  return i;
                         }
                         else {
                             return -2;
                         }
                   }
            }


        }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User[] users=new User[10];

        while (true) {
            System.out.println("Enter Username:");
            String username=sc.nextLine();
            System.out.println("Enter the Password");
            String password=sc.nextLine();

          int currentuser=  Main.login(users,username,password);

          if(currentuser==-2){
                System.out.println("Invalid Credintials ");
                continue;
            }
           else if(currentuser ==-1){
                System.out.println("creating the user");
              User user=new User();
                user.setUsername(username);
                user.setPassword(password);
                for (int i = 0; i < users.length; i++) {
                    if(users[i]==null){
                        users[i]=user;
                        currentuser=i;
                        break;
                    }

                }
            }else{
              System.out.println("Welcome back "+username);
          }

            Task[] taskArray = users[currentuser].getTaskArray();
            


            int choice = 0;
            while (choice != 5) {

                System.out.println("\n1.Add task");
                System.out.println("2.Read Task");
                System.out.println("3.Update Task");
                System.out.println("4.Delete Task");
                System.out.println("5.Exit ");
                System.out.print("Enter the choice:");



                try {
                  choice = new Integer(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Enter a valid number:");
                    continue;
                }
                if (choice == 1) {
                    Task task=new Task();
                    while(true) {

                        System.out.println("Add Title");
                        String title = sc.nextLine();
                        if(title==null|| title.isEmpty()){
                            System.out.println("Title should not be empty");
                            continue;
                        }


                        System.out.println("Add description ");
                        String description = sc.nextLine();


                        task.setDescription(description);
                        task.setTitle(title);
                        boolean added = false;
                        for (int i = 0; i < taskArray.length; i++) {
                            if (taskArray[i] == null) {
                                taskArray[i] = task;
                                System.out.println("Task Added Successfully!");
                                added = true;
                                break;
                            }
                        }

                        if (!added) {
                            System.out.println("Task list is full!");
                        }
                        break;

                    }
                }
                else if (choice == 2) {
                    while(true) {
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
                        break;
                    }


                }
                else if (choice == 3) {
                    while(true) {

                        System.out.println("Update Task");
                        if (taskArray[0] != null) {
                            for (int i = 0; i < taskArray.length; i++) {
                                if (taskArray[i] == null) {
                                    break;
                                } else {//taskArray[i].getName()
                                    System.out.print(i + 1 + ". " + taskArray[i].getTitle());//name'
                                    System.out.println(" [" + taskArray[i].getDescription() + "] ");
                                }
                            }
                            System.out.println("Enter the number to Update");
                            int choicetoupdate = 0;
                            try {
                                choicetoupdate = new Integer(sc.nextLine());
                            } catch (Exception e) {
                                System.out.println("Enter the correct number ");
                                continue;
                            }
                            if(choicetoupdate <= 0 || choicetoupdate > taskArray.length || taskArray[choicetoupdate - 1] == null){
                                continue;
                            }
                            System.out.print("Enter new title: ");
                            String title = sc.nextLine();
                            System.out.print("Enter new description: ");
                            String descripiton = sc.nextLine();
                            taskArray[choicetoupdate - 1].setTitle(title);
                            taskArray[choicetoupdate - 1].setDescription(descripiton);
                            System.out.println("Task Updated Successfully!");

                        } else {
                            System.out.println("There is no task here to show");
                        }
                        break;
                    }
                } else if (choice == 4) {
                    while (true) {

                        if (taskArray[0] != null) {
                            for (int i = 0; i < taskArray.length; i++) {

                                if (taskArray[i] == null) {
                                    break;
                                }
                                else{
                                    System.out.println(i + 1 + ". " + taskArray[i].getTitle());//name

                                }
                            }
                            System.out.println("Enter the choice to delete ");
                            int choicetoupdate = 0;
                            try {
                                choicetoupdate = new Integer(sc.nextLine()) ;
                            } catch (Exception e) {
                                System.out.println("Enter the correct value");
                                continue;
                            }
                            if(choicetoupdate <= 0 || choicetoupdate > taskArray.length || taskArray[choicetoupdate - 1] == null)
                            {
                                continue;
                            }

                            for (int i = choicetoupdate-1; i < taskArray.length-1; i++) {
                                taskArray[i] = taskArray[i + 1];
                            }
                            taskArray[taskArray.length - 1] = null;
                        } else {
                            System.out.println("There is no task here to show");
                        }
                        break;
                    }


                }
                else if (choice == 5) {
                    break;
                }
                else {
                    System.out.println("Enter correct number ");
                    continue;
                }


            }

        }

    }
}
