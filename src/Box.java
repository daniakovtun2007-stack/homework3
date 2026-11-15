public class Box {
    int width;
    int length;
    int height;

    public String toString(){
        return "Box{" + "width=" + width + " cm , length=" + length + " cm , height=" + height + "cm }";
    }
    public int getVolume(){
        return width * length * height;
    }
}
