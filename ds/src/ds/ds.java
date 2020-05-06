public class ds {

    public static void main(String[] args) throws Exception {

        NumericalCode numcode = new NumericalCode();
        TapCode TapCode = new TapCode();
        switch (args[0]) {
            case "tap-code":
                if (args[1].equals("encode")) {
                    TapCode.TapCodeEncryption(args[2]);
                } else if (args[1].equals("decode")) {
                    TapCode.TapCodeDecryption(args[2]);
                }
                break;

            case "numerical":
                if (args[1].equals("encode")) {
                    NumericalCode.NumericalCodeEncryption(args[2]);
                } else if (args[1].equals("decode")) {
                    NumericalCode.NumericalCodeDecryption(args[2]);
                }
                break;

                case "create-user":
                    CreateDelete.CreateKey(args[1]);
                break;

                case "delete-user":
                    CreateDelete.DeleteKey(args[1]);
                break;

            case "export-key":
                if (args[1].equals("public")){
                    ExportKey.ExportKeyPublic(args[2],args[3]);
                System.out.println("Celesi publik u ruajt ne fajllin: "+ args[3]);
                }
                else if(args[1].equals("private")) {
                    ExportKey.ExportKeyPrivate(args[2], args[3]);
                    System.out.println("Celesi privat u ruajt ne fajllin: " + args[3]);
                }
                break;

            case "import-key":
                if (args[1].equals("public")) {
                    ImportKey.ImportKeyPublic(args[2],args[3]);
                    System.out.println("Celesi publik u ruajt ne"+args[2]);
                }

                else if(args[1].equals("private"))
                    ImportKey.ImportKeyPrivate(args[2],args[3]);
                System.out.println("Celesi privat u ruajt ne"+args[2]);
                break;

            case "write-message":

                WriteMessage.WriteMessage(args[1],args[2]);
            break;
            default:System.out.println("Keni shkruar argumente jo valide!");
        }
    }


}