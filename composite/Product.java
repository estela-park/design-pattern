@Data
public abstract class Product implements Box {
    protected final String title;
    protected final double price;
}

public class Book extends Product {
    public Book(String title, double price) {
        super(title, price);
    }
}

public class VideoGame extends Product {
    public VideoGame(String title, double price) {
        super(title, price);
    }
}