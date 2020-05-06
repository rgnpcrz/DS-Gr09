import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class CreateDelete
{
    static private Base64.Encoder encoder = Base64.getEncoder();

    static private void writeBase64(Writer out,Key key)
            throws java.io.IOException
    {
        byte[] buf = key.getEncoded();
        out.write(encoder.encodeToString(buf));
        out.write("\n");
    }

    public static void CreateKey(String emri) throws Exception
    {
        String emri1=emri;
        String pldh="RSA";
        int index = 0;
        String algo = pldh;
        index++;
        String outFile = null;
        if ( index < pldh.length() ) outFile = emri1; index++;

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");

        /* initialize with keySize: typically 2048 for RSA */
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();

        Writer out = null;
        Writer out1=null;
        try {


            if ( !Files.exists(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\"+outFile + ".pub.xml"))
                    && !Files.exists(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + outFile + ".xml"))){
                out = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\"+outFile + ".xml");
                out1 = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\"+outFile + ".pub.xml");

            out.write("-----BEGIN RSA PRIVATE KEY-----\n");
            writeBase64(out, kp.getPrivate());

            out.write("-----END RSA PRIVATE KEY-----\n");

                out1.write("-----BEGIN RSA PUBLIC KEY-----\n");
                writeBase64(out1, kp.getPublic());
                out1.write("-----END RSA PUBLIC KEY-----\n");
                out1.close();
            }
            else
                System.out.println("Ky celes ekziston paraprakisht");



        } finally {
            if ( out != null ) out.close();
        }
    }
    public static void DeleteKey(String emri1){
        try {
            Files.delete(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + emri1 + ".pub.xml"));
            Files.delete(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + emri1 + ".xml"));
        } catch (NoSuchFileException x) {
            System.err.format("Nuk ekziston ndonje celes me emrin %s ", emri1);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("Nuk ekziston ndonje celes me emrin %s ", emri1);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }
}