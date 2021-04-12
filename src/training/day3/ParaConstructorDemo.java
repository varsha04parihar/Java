package training.day3;

class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void print(){
        System.out.println("Book: Title="+ title+", Author="+ author+", Price="+ price);
    }
}
public class ParaConstructorDemo {
    public static void main(String[] args) {


        Book2 bookObj1 = new Book2("Html", "Author 1", 1000);
        Book2 bookObj2 = new Book2("Angular", "Author 2", 2000);

        bookObj1.print();
        bookObj2.print();
    }
}