public class Product {
    String description;
    int price;
    int id;
    public Product(String description, int price, int id) {
        this.description = description;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", price=" + price + ", id=" + id + '}';
    }
}
