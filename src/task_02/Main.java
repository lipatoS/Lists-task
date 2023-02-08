package task_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<String> lst = new ArrayList<>();

    public static void main(String[] args) {
        addData(lst);
        enumerateLst(lst);
        System.out.println("**************");
        enumerateLst2(lst);
    }

    public static void addData(List<String> lst) {
        String s1 = "milk, banana, orange, plum, strawberry, nut, bread, potato";
        lst.addAll(Arrays.asList(s1.split(", ")));
    }

    public static void enumerateLst(List<String> lst) {
        int num = 1;
        for (String elem : lst) {
            System.out.printf("%s. " + elem + "\n", num);
            num++;
        }
    }

    public static void enumerateLst2(List<String> lst) {
        int num = 1;
        for (String elem : lst) {
            if (num >= 2 && num <= 5) {
                System.out.printf("%s. " + elem + "\n", num);
            }
            num++;
        }
    }
}
