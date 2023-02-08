package task_04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static LinkedList<String> lst = new LinkedList<>();

    public static void main(String[] args) {
        addData(lst);
        enumerateLst(lst);
        System.out.println("**************");
        addPositionData();
        enumerateLst(lst);

    }

    public static void addData(List<String> lst) {
        String s1 = "milk, banana, orange, plum, strawberry";
        lst.addAll(Arrays.asList(s1.split(", ")));
    }

    public static void addPositionData() {
        lst.addFirst("potato");
        lst.addLast("bread");
    }

    public static void enumerateLst(List<String> lst) {
        int num = 1;
        for (String elem : lst) {
            System.out.printf("%s. " + elem + "\n", num);
            num++;
        }
    }


}