package n09_encryption;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;

public class Main {
    public static void main(String[] args) {
        String in = "encrypted";
        String out = "decrypted.pdf";
        String key = "SecretKey123!!!!";

        try {
            decryptFile(in, out, key, "AES");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void decryptFile(String inputFile, String outputFile, String key, String transformationString) throws Exception {
        Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance(transformationString);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] input = Files.readAllBytes(Path.of(inputFile));
        byte[] output = cipher.doFinal(input);
        Files.write(Path.of(outputFile), output);
    }
}
