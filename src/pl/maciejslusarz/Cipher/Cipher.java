package pl.maciejslusarz.Cipher;

public class Cipher {
    private static final String[] ALPHABET = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "Q", "P", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static String encode(String message, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(encodeLetter(message.substring(i, i + 1), step));
        }
        return sb.toString();
    }

    public static String decode(String message, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(decodeLetter(message.substring(i, i + 1), step));
        }
        return sb.toString();
    }

    private static String encodeLetter(String letter, int step) {
        int i = 0;
        while (i < ALPHABET.length) {
            if (ALPHABET[i].equalsIgnoreCase(letter)) {
                try {
                    return ALPHABET[i + step];
                } catch (ArrayIndexOutOfBoundsException e) {
                    int howCloseToTheEnd = ALPHABET.length - i;
                    return ALPHABET[step - howCloseToTheEnd];
                }
            } else {
                i++;
            }
        }
        return " ";
    }

    private static String decodeLetter(String letter, int step) {
        int i = 0;
        while (i < ALPHABET.length) {
            if (ALPHABET[i].equalsIgnoreCase(letter)) {
                try {
                    return ALPHABET[i - step];
                } catch (ArrayIndexOutOfBoundsException e) {
                    int howCloseToTheBeginning = i - step;
                    return ALPHABET[ALPHABET.length + howCloseToTheBeginning];
                }
            } else {
                i++;
            }
        }
        return " ";
    }
}
