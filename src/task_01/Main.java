package task_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<String> lst = new ArrayList<>();

    public static void main(String[] args) {
        addData(lst);
        enumerateLst(lst);
        System.out.println("**************");
        alphabetLst(lst);
    }

    public static void addData(List<String> lst) {
        String s1 = "Alina, Victor, Yana, Dmytro, Vladimir";
        lst.addAll(Arrays.asList(s1.split(", ")));
    }

    public static void enumerateLst(List<String> lst) {
        int num = 1;
        for (String elem : lst) {
            System.out.printf("%s. " + elem + "\n", num);
            num++;
        }
    }

    public static void alphabetLst(List<String> lst) {
        Collections.sort(lst);
        int num = 1;
        for (String elem : lst) {
            System.out.printf("%s. " + elem + "\n", num);
            num++;
        }

    }
}
