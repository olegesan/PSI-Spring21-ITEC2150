package Session10.StartCode;

public class CipherHelper {
    public static String decodeCaesarCipher(String encryptedString, int shift) {
        StringBuilder decryptedString = new StringBuilder();
        for (String symbol : encryptedString.split("")) {
            if (!Character.isAlphabetic(symbol.charAt(0))) {
                decryptedString.append(symbol);
            } else {
                char decodedChar;
                if (Character.isUpperCase(symbol.charAt(0))) {
                    int diff = ((symbol.charAt(0) - 65 - shift) % 26 );
                    if(diff < 0){
                        decodedChar = (char) (26+diff+65);
                    }
                    else{
                        decodedChar = (char) (diff+65);
                    }

                } else {
                    int diff =   ((symbol.charAt(0) - 97 - shift) % 26);
                    if(diff < 0){
                        decodedChar = (char) (26+diff+97);
                    }
                    else{
                        decodedChar = (char) (diff+97);
                    }
                }
                decryptedString.append(decodedChar);

            }
        }
        return decryptedString.toString();
    }

    public static String encodeCaesarCipher(String plainText, int shift){
        StringBuilder encryptedString = new StringBuilder();
        for(String symbol: plainText.split("")){
            if (!Character.isAlphabetic(symbol.charAt(0))) {
                encryptedString.append(symbol);
            } else {
                char encodedChar;
                if (Character.isUpperCase(symbol.charAt(0))) {
                    int diff = ((symbol.charAt(0) - 65 + shift) % 26 );
                    if(diff < 0){
                        encodedChar = (char) (26+diff+65);
                    }
                    else{
                        encodedChar = (char) (diff+65);
                    }

                } else {
                    int diff =   ((symbol.charAt(0) - 97 + shift) % 26);
                    if(diff < 0){
                        encodedChar = (char) (26+diff+97);
                    }
                    else{
                        encodedChar = (char) (diff+97);
                    }
                }
                encryptedString.append(encodedChar);

            }
        }
        return encryptedString.toString();
    }
}
