package ds;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;


public class ds {
	

			public static void shkronja() {
				Scanner input = new Scanner(System.in);
				String teksti1;
				System.out.print("Shkruani tekstin qe doni te enkodoni: ");
				teksti1=input.nextLine();
			HashMap<String, String> shkronjat=new HashMap<>();
			
			shkronjat.put("A", ". .");
			shkronjat.put("B", ". .. ");
			shkronjat.put("C", ". ...");
			shkronjat.put("D", ". .... ");
			shkronjat.put("E", ". .....");
			shkronjat.put("F", ".. .");
			shkronjat.put("G", ".. ..");
			shkronjat.put("H", ".. ...");
			shkronjat.put("I", ".. ....");
			shkronjat.put("J", ".. .....");
			shkronjat.put("L", "... .");
			shkronjat.put("M", "... ..");
			shkronjat.put("N", "... ...");
			shkronjat.put("O", "... ....");
			shkronjat.put("P", "... .....");
			shkronjat.put("Q", ".... .");
			shkronjat.put("R", ".... ..");
			shkronjat.put("S", ".... ...");
			shkronjat.put("T", ".... ....");
			shkronjat.put("U", ".... .....");
			shkronjat.put("V", "..... .");
			shkronjat.put("W", "..... ..");
			shkronjat.put("X", " ");
			shkronjat.put("Y", "..... ....");
			shkronjat.put("Z", "..... .....");
			
			System.out.println("text: " + teksti1);
			
			String tapcode="";
			for(char c: teksti1.toCharArray()) {
				tapcode+=shkronjat.get((c+"").toUpperCase())+" ";
				
			}
				System.out.println("Teksti i koduar me TapCode: "+tapcode);

		}
		
		public static void main( String[] args) {
			ds dese=new ds();
			Scanner input1 = new Scanner(System.in);
			String teksti2;
			System.out.println("Zgjedhni menyren e enkriptimit: ");
			teksti2 =input1.nextLine();
		
			dese.shkronja();
						
			}
		}

