public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width= 100;
        box1.height= 50;
        box1.length= 100;
        System.out.println(box1);
        System.out.println(box1.getVolume());

        Box box2 = new Box();
        box2.width= 50;
        box2.height= 50;
        box2.length= 50;
        System.out.println(box2);
        System.out.println(box2.getVolume());
    }
}
