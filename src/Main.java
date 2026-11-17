public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(100, 50, 200);

        System.out.println(box1);
        System.out.println(box1.getVolume());

        Box box2 = new Box();

        box2.width = 50;
        box2.height = 50;
        box2.length = 50;

        System.out.println(box2);
        System.out.println(box2.getVolume());

        Box box3 = new Box(20, 30, 40);
        Box box4 = new Box(20, 30, 50);

        Box[] boxes = {box1, box2, box3, box4};

        Box maxBox = getMaxBox(boxes);

        System.out.println("Max box:");
        System.out.println(maxBox);
        System.out.println("Max volume: " + maxBox.getVolume());
    }

    public static Box getMaxBox(Box[] boxes) {

        Box maxBox = boxes[0];

        for (Box box : boxes) {

            if (box.getVolume() > maxBox.getVolume()) {
                maxBox = box;
            }
        }

        return maxBox;
    }
}