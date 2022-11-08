/*
 * Author : Ankit Kishor
 * Date: 08-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Book extends Author {
    private String numberISBN;
    private String title;
    private String description;
    private double price;

    public Book() {
    }



    public Book(String authorName,String penName,String numberISBN,
                String title,
                String description,
                double price)
    {
        super(authorName,penName);
        this.numberISBN = numberISBN;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getNumberISBN() {
        return numberISBN;
    }

    public void setNumberISBN(String numberISBN) {
        this.numberISBN = numberISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String displayBookDetails(){
        return toString();
    }
}
