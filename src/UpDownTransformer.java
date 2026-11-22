public class UpDownTransformer extends TextTransformer {
    @Override
    public String transform(String text) {
        if (text == null) {
            return null;
        }

        String[] letters = text.split("");
        for (int i = 0; i < letters.length; i++) {
            if (i % 2 == 0) {
                letters[i] = letters[i].toUpperCase();
            } else {
                letters[i] = letters[i].toLowerCase();
            }
        }
        return String.join("", letters);
    }
}
