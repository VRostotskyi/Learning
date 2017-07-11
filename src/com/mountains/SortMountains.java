package com.mountains;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o2.getHeight() - o1.getHeight();
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mtn.add(new Mountain("Лонг-Рейндж", 14255));
        mtn.add(new Mountain("Эльберт", 14433));
        mtn.add(new Mountain("Марун", 14156));
        mtn.add(new Mountain("Касл", 14265));

        System.out.println("В порядке добавления: \n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("По названи: \n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("По высоте: \n" + mtn);

    }
}


