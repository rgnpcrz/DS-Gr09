public class TapCode {
    public static void TapCodeEncryption(String TextToBeCoded) {
        String plaintext = TextToBeCoded;
        String text = plaintext.toLowerCase();
        String tapCode = "";
        char matrix[][] = { { 'a', 'b', 'c', 'd', 'e' },
                { 'f', 'g', 'h', 'i', 'j' },
                { 'l', 'm', 'n', 'o', 'p' },
                { 'q', 'r', 's', 't', 'u' },
                { 'v', 'w', 'x', 'y', 'z' } };

        char[] KtoC = text.toCharArray();
        for (int c = 0; c < text.length(); c++) {
            if (KtoC[c] =='k') {
                KtoC[c] = 'c';
            }
        }
        text = KtoC.toString();

        for (int l = 0; l < text.length(); l++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (text.charAt(l) == matrix[i][j]) {
                        for (int h = 0; h < i + 1; h++) {
                            tapCode = tapCode + ".";
                        }
                        tapCode = tapCode + " ";
                        for (int v = 0; v < j + 1; v++) {
                            tapCode = tapCode + ".";
                        }
                        tapCode = tapCode + " ";
                    }
                }
            }
        }
        System.out.println("Plaintexti eshte: " + plaintext);
        System.out.println("Texti i koduar me TapCode eshte: " + tapCode);
    }

    public static void TapCodeDecryption(String tapC) {
        char matrix[][] = {{'a','b','c','d','e'},
                {'f','g','h','i','j'},
                {'l','m','n','o','p'},
                {'q','r','s','t','u'},
                {'v','w','x','y','z'}};

        String DeC = "";
        DeC.toLowerCase();
        int indexH = 0;
        int indexV = 0;
        int i = -1;
        int sc = 0;
        for(int c=0;c<tapC.length();c++) {
            if(tapC.charAt(c) == ' ') {
                sc++;
            }
        }
        int scd = (sc + 1) / 2;

        for(int f = 0; f < scd; f++) {
            for(i++; i < tapC.length(); i++) {
                if(tapC.charAt(i) == '.') {
                    indexH++;
                    sc++;
                }
                else
                    break;
            }
            for( i++; i < tapC.length(); i++) {
                if(tapC.charAt(i) == '.') {
                    indexV++;
                    sc++;

                }
                else {
                    DeC = DeC + matrix[indexH-1][indexV-1];
                    indexH=0; indexV=0;
                    break;
                }
            }

        }
        System.out.println("TapCode eshte: " + tapC);
        System.out.println("Teksti i dekoduar nka tapcodi eshte: " + DeC);
    }
}