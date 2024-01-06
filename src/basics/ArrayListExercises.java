package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExercises {
    public static void main(String[] args) {
     ArrayList <String> names = new ArrayList<>();
     names.add("John");
     names.add("Smith");
     names.add("Maria");

     ArrayList<String> friends = new ArrayList<>();
     friends.add("Tony");
     friends.add("Munia");
     friends.add("Aiden");

//     ARRAYLIST METHODS

//      ADDING
      names.add("Madison");    //append an element at the end of the list
      names.add(2,"Rahman");     //add a specific element on a specific index position
      System.out.println("=================================");

//      REMOVING ELEMENT AN ELEMENT
      //names.remove(0);   // will remove the element at 0 index
      //names.remove("John");   // will remove John from the list
      System.out.println("=================================");

//      CLEARING THE LIST
      // names.clear();     //will clear the list
      System.out.println("=================================");

//      SIZE OR LENGTH
      System.out.println(names.size());    //size or length of the length
      System.out.println("=================================");

//      GETTING SPECIFIC INDEX
      System.out.println(names.get(4));     //gets an element from a specific index position
      System.out.println("=================================");

//      INDEXOF
      System.out.println(names.indexOf("Maria"));
      System.out.println("=================================");

//      REPLACING AN ELEMENT WITH NEW VALUE
      names.set(1,"Smilga");
      System.out.println(names);
      System.out.println("=================================");

//      CLONE
      //names.clone();     //create duplicate of the list
      System.out.println("=================================");

//      CONTAINS and ISEMPTY
      System.out.println(names.contains("Tim"));    //returns boolean
      System.out.println(names.isEmpty());     //returns boolean
      System.out.println("=================================");

//      MERGING TWO LISTS
      names.addAll(friends);      //adds all the elements of another list
      System.out.println(names);
      names.addAll(5,friends);    //adds all the element of another list starting from specific index
      System.out.println(names);
      System.out.println("=================================");

//      REMOVEALL
      names.removeAll(friends);
      System.out.println(names);
      System.out.println("=================================");

//      ******* SORTING AN ARRAYLIST
      ArrayList<Integer> nums = new ArrayList<>();
      nums.add(15);
      nums.add(2);
      nums.add(7);
      nums.add(20);
      nums.add(5);
//      before sorting
      System.out.println("Before sorting: "+nums);
      Collections.sort(nums);
//      after sorting
      System.out.println("After sorting: "+ nums);
      System.out.println("=================================");

//      *********** ARRAYLIST TO ARRAY    //CONVERTING NAMES ARRAYLIST TO NAMES-ARRAY
      Object[] namesArr = names.toArray();
      System.out.println(namesArr[3]);
      System.out.println("=================================");

    }
}
