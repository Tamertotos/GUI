abstract public class Movie {
     String title;
     double price;
     String category;

    public Movie(String title, double price, String category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    abstract double getPrice();

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
