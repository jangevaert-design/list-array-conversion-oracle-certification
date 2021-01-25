package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Tony");
    names.add("Jimmy");
    names.add("Anthony");

    Object[] namesArray = names.toArray();//converts the ArrayList to a regular array.
    System.out.println(namesArray.length);//since it is now an array we can print out its length.
    //careful here: we started with a generic ArrayList of Strings and now we converted to an
    //Object[] which means that we can add all sort of Objects to it and not only Strings.

    String[] stringArray = names.toArray(new String[0]);//you can specify any size and the array will
    //be resized to hold the elements coming from the ArrayList. This can take some time.
    System.out.println();
    //another way to get to the exact size of the ArrayList is to use its size to specify.
    String[] newStringArray = names.toArray(new String[names.size()]);

    String[] petsArray = {"dog", "cat", "parrot"};
    //List<String> petsListArray = Arrays.asList(petsArray);
     List<String> petsListArray = Arrays.asList(petsArray);//also possible but
    //careful as this is a fixed sized list.

    petsListArray.set(0, "bird");
    System.out.println(petsListArray);
    System.out.println(Arrays.toString(petsArray));//prints the same result since petsArray and
    //petsListArray are linked.

    petsArray[0] = "husky";
    System.out.println("\n" + petsListArray);
    System.out.println(Arrays.toString(petsArray));//changes both.

//  petsListArray.add("kangaroo");//gives an UnsupportedOperationException because Arrays.asList() has
    //a fixed size.
//  petsListArray.remove(1);//also not supported.


  }
}
