package Problems;

import java.util.*;

public class ListProb {
   public static void main(String[] args) {
       System.out.println("hello world");


     //  list
       List<String> list= new ArrayList<>();
       list.add("Hero");
       list.add("zoro");
       list.add("Villan");
       list.add("Anti-heroiene");

       System.out.println("List of element ");
       for(int i=0;i<list.toArray().length;i++){
           System.out.println(list);

       }
       System.out.println(
               "Second Element"       );
       System.out.println(list.get(1));
       list.remove("zoro");
       System.out.println("After deleted : "+list);
       ArrayList<String> tasks= new ArrayList<>();
       tasks.add("Study Dsa");
       tasks.add("Build Projects");
       tasks.add("Study Dsa");// duplicates can be allowed
       System.out.println(tasks);
       //add
       tasks.add("New Tasks");
       tasks.remove(2);
       tasks.get(0);
       tasks.size();
       tasks.contains("Studey");
       HashSet<String> set = new HashSet<>();

       set.add("Java");
       set.add("Python");
       set.add("Java"); // ignored

       System.out.println(set);
       Queue<String> queue = new LinkedList<>();

       queue.add("Task 1");
       queue.add("Task 2");

       System.out.println(queue.poll()); // removes first
       HashMap<Integer, String> students = new HashMap<>();

       students.put(1, "Arun");
       students.put(2, "Vijay");

       System.out.println(students.get(1));



   }
}
