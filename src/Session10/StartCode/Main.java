package Session10.StartCode;


public class Main {
    public static void main(String[] args) {
        String encryptedString = "Pilxawp";
        String plainText = CipherHelper.decodeCaesarCipher(encryptedString,11);
        System.out.println(plainText);

        String plainText2 = "Example";
        String encryptedString2 = CipherHelper.encodeCaesarCipher(plainText2, 11);
        System.out.println(encryptedString2);
    }
}
