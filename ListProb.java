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

   }
}
