package com;

import java.util.*;
import java.util.stream.Collector;

public class Application {
    public static void main(String[] args) {


        List<String> demoArrayList = Arrays.asList(new String[] {"5", "2", "1", "4", "3"});

        for (String a:demoArrayList) {
            System.out.println(a);
        }

        System.out.println();
        Collections.sort(demoArrayList);

        for (String a:demoArrayList) {
            System.out.println(a);
        }
    }
}
