package TaskManagerFinal;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String task=null;
        String user=new String();
while (true) {
    System.out.print("Enter the choice:");
    int choice = new Integer(sc.nextLine());
    if (choice == 1) {

        System.out.println("Add Task");
        String addTask = sc.nextLine();
        task = addTask;
    } else if (choice == 2) {
        System.out.println("Update Task");
        task = sc.nextLine();

    } else if (choice == 3) {
        System.out.println("Task: " + task);
    } else if (choice == 4) {
        System.out.println("Delete Task");
        task = null;
    }


    System.out.println("After the Task " + task);
}

 }
}
