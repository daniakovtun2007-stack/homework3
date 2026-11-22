public class Main5 {
    public static void main(String[] args) {
        TextTransformer textTransformer = new UpDownTransformer();
        TextSaver saver = new TextSaver(textTransformer, "TextSaver.txt");
        saver.saveTextToFile("Hello");
    }
}
