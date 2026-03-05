package TaskManagerFinal;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Task[][] userArray = new Task[10][10];

        while (true) {
            System.out.println("Enter User Id");
            Integer id=0;
            try {
                id = new Integer(sc.nextLine());
                if (id < 1 || id > 10) {
                    System.out.println("Invalid User ID");
                    continue;
                }
            }
            catch (Exception e){
                System.out.println("Enter the valid number");
                continue;
            }
            Task[] taskArray=userArray[id-1];

            int choice = 0;
            while (choice != 5) {
                Task task=new Task();
                System.out.println("\n1.Add task");
                System.out.println("2.Read Task");
                System.out.println("3.Update Task");
                System.out.println("4.Delete Task");
                System.out.println("5.Exit ");
                System.out.print("Enter the choice:");



                try {
                  choice = new Integer(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid number:");
                    continue;
                }
                if (choice == 1) {
                    while(true) {

                        System.out.println("Add Title");
                        String title = sc.nextLine();
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
                            if(choicetoupdate>=taskArray.length||taskArray[choicetoupdate] == null){
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
                            if(choicetoupdate>=taskArray.length||taskArray[choicetoupdate] == null)
                            {
                                continue;
                            }

                            for (int i = choicetoupdate; i < taskArray.length-1; i++) {
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

                }


            }

        }

    }
}
