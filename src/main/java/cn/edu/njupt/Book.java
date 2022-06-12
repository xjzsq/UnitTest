package cn.edu.njupt;
// some fix...
public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public boolean equals(Object object) {
        if (object instanceof Book) {
            Book book = (Book) object;
            return getTitle().equals(book.getTitle())
                    && getPrice() == book.getPrice();
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }
}
