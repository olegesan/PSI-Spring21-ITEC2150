package Session10.Complete;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileString = readFile("./src/Session10/Complete/exampleSecret.txt");
        int shift = getShift(fileString);
        String encryptedString = getEncryptedMessage(fileString);
        String plainText = CipherHelper.decodeCaesarCipher(encryptedString, shift);
        System.out.println(plainText);

        String secret2String = readFile("./src/Session10/Complete/secret2.txt");
        printAllCombinations(secret2String);
    }

    public static String readFile(String path){
        File f = new File(path);
        String output = "";
        try{
            Scanner reader = new Scanner(f);
            while(reader.hasNext()){
                output += reader.nextLine();
            }
        }catch( IOException err){
            System.out.println(err);
        }
        return output;
    }

    public static int getShift (String encrypted){
        return Integer.parseInt(encrypted.split(" ")[0]);
    }

    public static String getEncryptedMessage(String encrypted){
        String[] arr = encrypted.split(" ");
        String output = arr[1];
        for(int i = 2; i < arr.length; i++ ) {
            output += " " + arr[i];
        }
        return output;
    }
    public static void printAllCombinations(String encrypted){
        for(int i = 1; i < 26 ; i++){
            System.out.println(CipherHelper.decodeCaesarCipher(encrypted, i) + " | shift: "+i);
        }
    }
}
