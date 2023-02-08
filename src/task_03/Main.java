package task_03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static LinkedList<String> lst1 = new LinkedList<>();
    static LinkedList<String> lst2 = new LinkedList<>();


    public static void main(String[] args) {
        addData1(lst1);
        addData2(lst2);
        enumerateLst(lst1);
        System.out.println("**************");
        unionLst(lst1, lst2);
        enumerateLst(lst1);
    }

    public static void addData1(List<String> lst) {
        String s1 = "milk, banana, orange, plum, strawberry";
        lst.addAll(Arrays.asList(s1.split(", ")));
    }

    public static void addData2(List<String> lst) {
        String s1 = "nut, bread, potato";
        lst.addAll(Arrays.asList(s1.split(", ")));
    }

    public static void enumerateLst(List<String> lst) {
        int num = 1;
        for (String elem : lst) {
            System.out.printf("%s. " + elem + "\n", num);
            num++;
        }
    }

    public static void unionLst(List<String> lst1, List<String> lst2) {
        lst1.addAll(1, lst2);
    }

}
