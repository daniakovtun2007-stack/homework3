public class Good {
    double price;
    String description;
    double weight;

    public Good(double price, String description, double weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
    }
    public String toString() {
        return "Good{" + "price=" + price + ", description=" + description + ", weight=" + weight + '}';
    }
}


