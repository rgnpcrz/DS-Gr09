public class NumericalCode  {

    public static void NumericalCodeEncryption(String teksti1){
    String teksti=teksti1.toUpperCase();
    char seperator='.';
        char c = 0;
        int numri=0;
        for(int i=0;i<teksti.length();i++){
            c=teksti.charAt(i);
            if(c == ' ')
              continue;
            else
            numri=c;
            System.out.print(numri-64+" ");
        }
    }
    public static void NumericalCodeDecryption(String kodi){

        int rez;
        int abc;
        char c;

        for(int i=0;i<kodi.length();i++){
            c=kodi.charAt(i);
            if(c==' ')
                continue;
            else
            rez=c;
            abc=rez+48;
            System.out.print((char)abc);
        }
    }

}