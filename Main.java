package TaskManagerFinal;
//folder called TaskManager Final
import java.util.Scanner;


//java libirary gives the scanner class

public class Main {
// public isthe access modifier

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User[] users=new User[10];
        int appchoice=1;


        while (appchoice==1)
        {
            System.out.println("Welcome  to Task Manager");
            boolean flag = false;
            while (!flag) {
                System.out.println("1. Start 2. Close");
                System.out.println("==================");
                try {
                    appchoice = new Integer(sc.nextLine());

                    if (appchoice > 2 || appchoice < 0) {
                        System.out.println("enter the 1 or 2 ");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Enter (1 / 2) ");
                    continue;
                }

                flag = true;
            }

            if (appchoice == 2) {
                continue;
            }
            while (flag == true)
            {

                System.out.println("Enter Username:");
                String username = sc.nextLine();

                System.out.println("Enter the Password");
                String password = sc.nextLine();

                int currentuser = Utility.login(users, username, password);
                User user = null;
                if (currentuser == -2) {
                    System.out.println("Invalid Credintials ");
                    continue;
                } else if (currentuser == -1) {
                    System.out.println("creating the user");

                    user = new User(username,password);

                    for (int i = 0; i < users.length; i++) {
                        if (users[i] == null) {
                            users[i] = user;
                            currentuser = i;
                            break;
                        }

                    }
                } else {
                    System.out.println("Welcome Back " + username+" ['_']! ");
                    user = users[currentuser];
                }


                int choice = 0;
                while (choice != 5) {

                    System.out.println("1.Add task");
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


                        boolean addTask = false;
                        String title =null;
                        String addDes =null;
                        while (!addTask) {

                            System.out.println("Add Title");
                            title = sc.nextLine();
                            if (title.isEmpty()) {
                                System.out.println("Title should not be empty");
                                continue;
                            }
                            boolean addDesc=false;
                            boolean taskCreate = false;
                            while (!addDesc) {

                                System.out.println("If you want to add description ( Yes ) / exit ( No )");
                                addDes = sc.nextLine();


                                if (addDes.equals("yes") || addDes.equals("Yes")) {
                                    System.out.println("Add description ");
                                    String description = sc.nextLine();

                                    taskCreate = user.createTask(title, description);
                                    if (taskCreate == true) {
                                        System.out.println("Task is created");
                                    } else {
                                        System.out.println("Error in creating the task");
                                    }
                                    addDesc=true;


                                } else if (addDes.equals("No") || addDes.equals("no")) {
                                    addDesc=true;
                                }
                            }
                             if (addDes.equals("No") || addDes.equals("no")) {

                                 taskCreate = user.createTask(title, "");
                                 if (taskCreate == true) {
                                     System.out.println("Task is created");
                                 } else {
                                     System.out.println("Error in creating the task");
                                 }

                            }


                            System.out.println("If You want to add Task [ Enter ]  Exit  [ no ]");
                            String taskExit = sc.nextLine();

                            if (taskExit.equals("no")) {
                                addTask = true;
                            }
                        }
                    } else if (choice == 2) {

                        while (true) {

                            System.out.println("1. Show All task ");
                            System.out.println("2. Show the Todo");
                            System.out.println("3. Show the In-Progress");
                            System.out.println("4. Show the Done");
                            System.out.println("Pick any option To show");
                            int showOption=0;
                            try{
                                 showOption=new Integer(sc.nextLine());
                            }
                            catch (Exception e){
                                System.out.println("Enter the correct option");
                                continue;
                            }
                            user.showTasks(showOption);
                            break;
                        }
                    } else if (choice == 3) {

                        boolean update=false;
                        while (!update)
                        {

                            System.out.println("Update Task");
                            if (user.getTaskArray()[0] != null) {
                                user.showTasks();

                                System.out.println("Enter the number to Update");
                                int choicetoupdate = 0;
                                try {
                                    choicetoupdate = new Integer(sc.nextLine());
                                    if (choicetoupdate <= 0 || choicetoupdate > user.getTaskArray().length || user.getTaskArray()[choicetoupdate - 1] == null) {
                                        System.out.println("Enter the correct number ");
                                        continue;
                                    }

                                } catch (Exception e) {
                                    System.out.println("Enter the correct number ");
                                    continue;
                                }
                                System.out.println("What you wanna Update \n1.Title \n2. Description \n3. Status");
                                String option=sc.nextLine();
                                String title=null;
                                String descripiton =null;
                                String status=null;
                                if(option.isEmpty()){
                                    System.out.println("Enter any option ");
                                    continue;
                                }
                                if(option.equals("1"))
                                {
                                    System.out.print("Enter new title: ");
                                     title = sc.nextLine();
                                    if (title.isEmpty()) {
                                        System.out.println("Title should not be empty");
                                        continue;

                                    }
                                } else if (option.equals("2")) {

                                    System.out.print("Enter new description: ");
                                    descripiton = sc.nextLine();
                                    if (descripiton.isEmpty()) {
                                        System.out.println("Description should not be empty");
                                        continue;
                                    }
                                } else if (option.equals("3")) {
                                    System.out.println("Pick any one to change the status \n1. Todo \n2. In-Progress \n3.Done ");
                                    String updateStatusOption=sc.nextLine();
                                    if(updateStatusOption.isEmpty()){
                                        System.out.println("Enter the correct status");
                                        continue;
                                    }

                                    if(updateStatusOption.equals("1"))
                                    {
                                        status="Todo";


                                    } else if (updateStatusOption.equals("2")) {
                                        status="In-Progress";

                                    }else if (updateStatusOption.equals("3")) {
                                        status="Done";

                                    }
                                    else {
                                        System.out.println("Enter the correct Status option ");
                                        continue;
                                    }


                                } else {
                                    System.out.println("Enter correct option ");
                                    continue;
                                }
                                user.updateTask(choicetoupdate, title, descripiton,status);
                                System.out.println("Updated Successfully");

                            } else {
                                System.out.println("No tasks to update");
                                continue;
                            }
                            System.out.println("If you want to Update Task [ Enter ] or exit (no) ");
                            String updateTask=sc.nextLine();
                            if(updateTask.equals("no")){
                                update=true;
                                break;
                            }

                            if(updateTask.equals("yes")){
                                continue;
                            }

                        }
                    } else if (choice == 4) {
                        boolean delete=false;
                        while (!delete) {

                            if (user.getTaskArray()[0] != null) {

                                user.showTasks();
                                System.out.println("Enter the choice to delete ");
                                int choicetodelete = 0;
                                try {
                                    choicetodelete = new Integer(sc.nextLine());
                                    if (choicetodelete <= 0 || choicetodelete > user.getTaskArray().length ) {
                                       throw new Exception();
                                    }
                                    if( user.getTaskArray()[choicetodelete - 1] == null){
                                        throw new Exception();
                                    }

                                } catch (Exception e) {
                                    if(choicetodelete <= 0 || choicetodelete > user.getTaskArray().length) {
                                        System.out.println("Enter the correct value");
                                        continue;
                                    }
                                    if( user.getTaskArray()[choicetodelete - 1] == null){
                                        System.out.println("Task is not here ");
                                        continue;
                                    }
                                }

                               user.deleteTask(choicetodelete);

                            } else {
                                System.out.println("There is no task here to show");
                            }
                            System.out.println("If you want to delete Task (yes) or exit (no) ");
                            String deleteTask=sc.nextLine();
                            if(deleteTask.equals("no")){
                               delete=true;

                            }

                        }


                    } else if (choice == 5) {
                        break;
                    } else {
                        System.out.println("Enter correct number ");

                    }


                }

            }

        }

    }
}
