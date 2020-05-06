import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
public class WriteMessage {


    public static void WriteMessage(String teksti1, String teksti2) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int pldh = 111;
        byte[] arr = new byte[pldh];
        SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
        prng.nextBytes(arr);

        byte[] arr1 = new byte[pldh];
        SecureRandom prng1 = SecureRandom.getInstance("SHA1PRNG");
        prng1.nextBytes(arr1);


        String base64encodedString = Base64.getEncoder().encodeToString(
                teksti1.getBytes("utf-8"));

        String base64encodedString1 = Base64.getEncoder().encodeToString(
                teksti2.getBytes("utf-8"));

        String base64encodedString2 = Base64.getEncoder().encodeToString(
                prng1.getBytes("utf-8"));

        String ciphertext = base64encodedString + "." + arr + "." + arr1 + "." + base64encodedString1;
        System.out.println(ciphertext);

    }
}


