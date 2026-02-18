package Problems;

import java.util.*;

import  java.util.Collections;

public class ListProb {
   public static void main(String[] args) {

       List<String> l=new ArrayList<>();
       l.add("a");
       l.add("b");
       l.add("c");
       l.add("d");
       System.out.println(l);

       System.out.println(l.isEmpty());

       System.out.println(l.get(3));
       System.out.println(l.contains("c"));

       ArrayList<String> list =new ArrayList<>();

       list.add("Apple");
       list.add("Banana");
       Collections.addAll(list,"Mango","Grapes");
       System.out.println("After Adding: "+ list);


       list.remove("Banana");
       list.remove(0);
       System.out.println("After Removing "+list);
       if(list.contains("Mango")){
           System.out.println("Mango is Present ");
       }
       list.set(0,"Apple");
       System.out.println("After Updating "+ list);

       ArrayList <String> fr=new ArrayList<>();
       fr.add("Banana");
       fr.add("Apple");
       fr.add("Mango");
       fr.add("Grapse");
       Collections.sort(fr);
       System.out.println("After Sorting "+fr);

   }
}
