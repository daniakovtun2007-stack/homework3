public class Box {
    private int width;
    private int length;
    private int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public Box() {}
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString(){
        return "Box{" + "width=" + width + " cm , length=" + length + " cm , height=" + height + "cm }";
    }
    public int getVolume(){
        return width * length * height;
    }
}
