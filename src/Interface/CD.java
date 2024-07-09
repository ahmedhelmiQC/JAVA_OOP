package Interface;

public class CD implements RetailItem{
        double price;
        String title;
        String artist;

    public CD() {}

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    public double getitemprice(){
        return price;
    }
}
