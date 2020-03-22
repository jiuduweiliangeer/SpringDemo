package cdxy.demo.lession3;

public class Student {
    private String name;
    private int age;
    private Book book;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook(){
        return this.book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                ", address=" + address +
                '}';
    }
}
