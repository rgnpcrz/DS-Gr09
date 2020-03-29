package ds;

public class TapCode {
	public static void TapCodeEncryption(String TextToBeCoded) {
		String plaintext = TextToBeCoded;
		String text = plaintext.toLowerCase();
		String tapCode = "";
		char matrix[][] = { { 'a', 'b', 'c', 'd', 'e' }, { 'f', 'g', 'h', 'i', 'j' }, { 'l', 'm', 'n', 'o', 'p' },
				{ 'q', 'r', 's', 't', 'u' }, { 'v', 'w', 'x', 'y', 'z' } };

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
//						System.out.println("Test");
					}
//					else tapCode = tapCode + " ";
				}
			}
		}
		System.out.println("PLaintexti eshte: " + plaintext);
		System.out.println("Texti i koduar me TapCode eshte: " + tapCode);
	}

	public static void TapCodeDecryption(String tapCode) {
		char matrix[][] = { { 'a', 'b', 'c', 'd', 'e' }, { 'f', 'g', 'h', 'i', 'j' }, { 'l', 'm', 'n', 'o', 'p' },
				{ 'q', 'r', 's', 't', 'u' }, { 'v', 'w', 'x', 'y', 'z' } };

		String text = tapCode;
		text.toLowerCase();
		String tapUnCode = "";
		int nH = 0, nV = 0;
		for (int i = 0; i < tapCode.length(); i++) {
			if (tapCode.charAt(i) == '.') {
				nH++;
			} else {
				for (i++; i < tapCode.length(); i++) {
					if (tapCode.charAt(i) == '.') {
						nV++;
					} else {
						tapUnCode = tapUnCode + matrix[nH - 1][nV - 1];
						nH = 0;
						nV = 0;
						break;
					}
				}
			}
		}
		System.out.println("TapCode eshte: " + tapCode);

		System.out.println("Teksti i dekoduar nka tapcodi eshte: " + tapUnCode);
	}
}
