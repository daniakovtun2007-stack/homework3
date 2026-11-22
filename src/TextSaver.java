import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
    private final TextTransformer transformer;
    private final File file;

    public TextSaver(TextTransformer transformer, String filePath) {
        this.transformer = transformer;
        this.file = new File(filePath);
    }

    public void saveTextToFile(String text) {
        if (text == null) {
            return;
        }

        String transformedText = transformer.transform(text);

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(transformedText + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException("Не вдалося записати текст у файл: " + file.getPath(), e);
        }
    }
}