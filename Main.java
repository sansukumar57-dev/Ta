package TaskManagerFinal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     List<User> users=new ArrayList<>();
     System.out.println("Welcome to task Manager ");

while (true) {

    System.out.println("Enter the user name");
    String userName = sc.nextLine();
    boolean isUserThere = false;
    User currentUser = null;

    for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(userName)) {
                currentUser = users.get(i);
                isUserThere = true;
                break;
            }
    }
    if(!isUserThere) {
        currentUser = new User(userName);
        users.add(currentUser);
        System.out.println(" New user " + userName);
    }
    if (isUserThere) {
        System.out.println(" Welcome Back " + userName);
    }

    int choice=5;
    while(choice!=3) {
        System.out.println("===============================================");
        System.out.println("Perform the Options");
        System.out.println("1.Add task");
        System.out.println("2.Show task");
        System.out.println("3. Exit");
        System.out.println("Enter the Above any options (1/3)");
        String option = sc.nextLine();
        System.out.println("===============================================");
        String desOption = null;
        if (option.equals("1"))
        {
            boolean taskFlag=false;





            if(!taskFlag)
            {

                System.out.println("Enter the Title ");
                String title = sc.nextLine();
                Task task = new Task(title);


                System.out.println("If you want to add Description (yes/no) ");
                desOption = sc.nextLine();

                if (desOption.equals("yes"))
                {
                    System.out.println("Enter the description");
                    String des = sc.nextLine();
                   task.setDescription(des);
                }
                else if (desOption.equals("no"))
                {


                }
                else
                {
                    System.out.println("Enter the yes/no ");
                }


                System.out.println("Enter the Date and Time (yes/no)");
                String dateTimeOption=sc.nextLine();
                if(dateTimeOption.equals("yes")){
                    System.out.println("Enter the Start Day Time ( dd.MM.yyyy HH:mm )");
                    Integer startDateTime=sc.nextInt();

                    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                    LocalDateTime localDateTime=LocalDateTime.of(startDateTime);







                    System.out.println("Enter the End Day Time ( dd.MM.yyyy HH:mm )");
                    String endDateTime=sc.nextLine();


                }
                currentUser.getTaskList().add(task);

                for (int i = 0; i < currentUser.getTaskList().size(); i++) {
                    if(currentUser.getTaskList().get(i)!=null){
                        System.out.print(i+1+". "+currentUser.getTaskList().get(i).getTitle());
                        System.out.println(" "+"["+currentUser.getTaskList().get(i).getDescription()+"] ");

                    }
                }

            }  else {
                System.out.println("Task is full ");
            }


        }




        else if (option.equals("2")) {
            boolean showList=false;

            for (int i = 0; i < currentUser.getTaskList().size(); i++) {
                if(currentUser.getTaskList().get(i)!=null){

                    System.out.print(i+1+". "+currentUser.getTaskList().get(i).getTitle());
                    System.out.print(" "+"["+currentUser.getTaskList().get(i).getDescription()+"] ");
                    showList=true;

                }
            }
            if(showList==false){
                System.out.println("No Tasks here to Show  ");
            }

        } else if (option.equals("3")) {
            break;
        }


    }



}
 }
}
