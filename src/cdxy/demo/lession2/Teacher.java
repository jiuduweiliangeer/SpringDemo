package cdxy.demo.lession2;

import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private int age;
    private List<Book> bookList;
    private Map<String,Book> bookMap;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bookList=" + bookList +
                ", bookMap=" + bookMap +
                '}';
    }
}
