public class Main9 {
    public static void main(String[] args) {
        Product product1 = new Product("Banana", 5, 1);
        Product product2 = new Product("Apple", 3, 2);
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        System.out.println(order);
        try {
            Product product3 = order.searchProductById(5);
            System.out.println(product3);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(order.removeProductById(2));
    }

}
