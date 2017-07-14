package com.set;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book book1 = new Book("Как устроены кошки");
        Book book2 = new Book("Постройте заново свое тело");
        Book book3 = new Book("В поисках Эмо");

        BookComparable b1 = new BookComparable("Как устроены кошки");
        BookComparable b2 = new BookComparable("Постройте заново свое тело");
        BookComparable b3 = new BookComparable("В поисках Эмо");

//        Использовать TreeSet с передачей компаратора в конструктор. Таким образом объект
//        не объязан реализовывать интерфейс Comparable
        TreeSet<Book> treeBooks = new TreeSet<>(new BookCompare());
        treeBooks.add(book1);
        treeBooks.add(book2);
        treeBooks.add(book3);
        System.out.println(treeBooks);

//        При добавлении в этот Set исользуется метод compareTo() добавляемого объекта.
//        Т.е. объект, который добавляется должен реализовать интерфейс Comparable.
        TreeSet<BookComparable> treeComparable = new TreeSet<>();
        treeComparable.add(b1);
        treeComparable.add(b2);
        treeComparable.add(b3);
        System.out.println(treeComparable);
    }
}

class Book {
    String title;

    public Book(String t) {
        title = t;
    }

    @Override
    public String toString() {
        return title;
    }
}

class BookComparable implements Comparable {
    String title;

    public BookComparable (String t){
        title = t;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        return title.compareTo(((BookComparable) o).title);
    }
}

class BookCompare implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}