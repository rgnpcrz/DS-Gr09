import java.io.*;

public class ExportKey {
    static public void ExportKeyPublic(String teksti2, String teksti3) throws IOException {
        if (teksti3.length() == 0) {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".pub.xml"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                in.close();
            }




            InputStream is = null;
            OutputStream os = null;
            try {

                is = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".pub.xml");
                os = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti3 + ".pub.xml");
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                is.close();
                os.close();
            }
        }
    }



    static public void ExportKeyPrivate(String teksti2, String teksti3) throws IOException {

        if (teksti3 == null) {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".xml"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                in.close();
            }
        }
        else {

            InputStream is = null;
            OutputStream os = null;
            try {

                is = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti2 + ".xml");
                os = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\ProjektiSiguri\\Key\\" + teksti3 + ".xml");
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                is.close();
                os.close();
            }
        }

    }


}





