import java.security.SecureRandom;
import java.util.Base64;
public class WriteMessage {


    public static void WriteMessage(String teksti1, String teksti2) throws Exception {
        String base64encodedString = Base64.getEncoder().encodeToString(
                teksti1.getBytes("utf-8"));
        SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
        String base64encodedString1 = Base64.getEncoder().encodeToString(
                teksti2.getBytes("prng"));

        String ciphertext = base64encodedString + "." + base64encodedString1 ;
        System.out.println(ciphertext);

    }


}