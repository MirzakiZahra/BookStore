import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Book implements Comparable<Book> {
    private String AuthorName;
    private int ISBN;
    private String BookTitel;
    private int PublishedYear;
    private int Price;
    private int SoldNumber;
    private int SoldTotalPrice;

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitel() {
        return BookTitel;
    }

    public void setBookTitel(String bookTitel) {
        BookTitel = bookTitel;
    }

    public int getPublishedYear() {
        return PublishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        PublishedYear = publishedYear;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSoldNumber() {
        return SoldNumber;
    }

    public void setSoldNumber(int soldNumber) {
        SoldNumber = soldNumber;
    }

    public int getSoldTotalPrice() {
        return SoldTotalPrice;
    }

    public void setSoldTotalPrice(int soldTotalPrice) {
        SoldTotalPrice = soldTotalPrice;
    }

    public Book(String authorName, int ISBN, String bookTitel, int publishedYear, int price, int soldNumber, int soldTotalPrice) {
        AuthorName = authorName;
        this.ISBN = ISBN;
        BookTitel = bookTitel;
        PublishedYear = publishedYear;
        Price = price;
        SoldNumber = soldNumber;
        SoldTotalPrice = soldTotalPrice;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return AuthorName.equals(book.AuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AuthorName);
    }


    public int totalPrice() {
       int sum= this.SoldNumber*this.Price;
       return sum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "AuthorName='" + AuthorName + '\'' +
                ", ISBN=" + ISBN +
                ", BookTitel='" + BookTitel + '\'' +
                ", PublishedYear=" + PublishedYear +
                ", Price=" + Price +
                ", SoldNumber=" + SoldNumber +
                ", SoldTotalPrice=" + SoldTotalPrice +
                '}';
    }

    public Book() {
    }

    @Override
    public int compareTo(Book other) {
        int number=Long.compare(this.PublishedYear, other.PublishedYear);
        return number;
    }

    // @Override
    /*  public int compareTo(Book otherObject) {
      if (equals(otherObject)==true){
            return Long.compare(this.PublishedYear, otherObject.PublishedYear);
        }
        // int number=Long.compare(this.PublishedYear, otherObject.PublishedYear);
        else {
            return this.AuthorName.compareTo(otherObject.AuthorName);
        }
        //  return Long.compare(this.salary, otherObject.salary);
    }*/

}



