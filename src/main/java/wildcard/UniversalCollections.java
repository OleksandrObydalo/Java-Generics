package wildcard;

import java.util.ArrayList;
import java.util.List;

public class UniversalCollections {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        printList(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        printList(list2);
    }

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
