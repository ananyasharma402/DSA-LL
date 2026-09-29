import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
       
        ArrayList<Integer> list =new ArrayList<>();
        //addelements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add elements in btwn
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete elem
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

         //loops
         for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
         }
         System.out.println();

         //Sorting
         Collections.sort(list);

    }
}
