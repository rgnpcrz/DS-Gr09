import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportKey {
    static public void ImportKeyPublic(String teksti1, String teksti2) throws IOException {

        if (Files.exists(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2+".pub.xml"))) {
            InputStream is = null;
            OutputStream os = null;

                try {
                    is = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".pub.xml");
                    os = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti1 + ".pub.xml");
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) > 0) {
                        os.write(buffer, 0, length);

                    }
                } finally {
                    is.close();
                    os.close();
                }
            } else
                System.out.println("Ky celes nuk ekziston");
        }
        static public void ImportKeyPrivate(String teksti1, String teksti2) throws IOException {
            if (Files.exists(Paths.get("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2+".xml"))) {
            InputStream is = null;
            OutputStream os = null;

                try {
                    is = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".xml");
                    os = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti1 + ".xml");
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) > 0) {
                        os.write(buffer, 0, length);
                    }
                } finally {
                    is.close();
                    os.close();
                }
            } else System.out.println("Ky celes nuk ekzison");
        }

    }






