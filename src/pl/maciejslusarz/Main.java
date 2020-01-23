package pl.maciejslusarz;

import pl.maciejslusarz.Cipher.Cipher;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int step = 5;
        String message = "Slowo do zaszyfrowania";
        System.out.println(message);
        String encodedMessage = Cipher.encode(message, step);
        System.out.println(encodedMessage);
        String decodedMessage = Cipher.decode(encodedMessage, step);
        System.out.println(decodedMessage);
    }
}
