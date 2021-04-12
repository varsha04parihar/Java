package training.day3;
class Book{
    private String title;
    private String author;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void print(){
        System.out.println("Book: Title="+ title+", Author="+ author+", Price="+ price);
    }

}

public class ClassDemo {
    public static void main(String[] args) {
//        Book bookObj = new Book();
//        bookObj.title = "Html";
//        bookObj.author = "Author 1";
//        bookObj.price = 1000.99f;
//
//        Book bookObj2 = new Book();
//        bookObj2.title = "Angular";
//        bookObj2.author = "Author 2";
//        bookObj2.price = 2000.33f;

        // System.out.println("Book: Title="+ bookObj.title+", Author="+ bookObj.author+", Price="+ bookObj.price);
        //System.out.println("Book: Title="+ bookObj2.title+", Author="+ bookObj2.author+", Price="+ bookObj2.price);


        Book bookObj = new Book();
        bookObj.setTitle("HTML");
        bookObj.setAuthor("Author 1");
        bookObj.setPrice(1000.76f);

        Book bookObj2 = new Book();
        bookObj2.setTitle("Angular");
        bookObj2.setAuthor("Author 2");
        bookObj2.setPrice(2000.54f);


        bookObj.print();
        bookObj2.print();


    }
}
