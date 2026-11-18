public class Main1 {
    public static void main(String[] args) {
        Good good1 = new Good(200, "shoes", 50);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(good1);
        System.out.println(triangle.area());
    }
}