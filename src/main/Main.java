package main;

public class Main {
    static public void main (String[] args){
        String plainText  = "CIPHER";
        int b  = 5;
        String CipherText= "JBZJYF";
        String monoKey ="HTKCUOISJYARGMZNBVFPXDLWQE";
        String vigenereKey ="HTKCUOISJYARG";


        CeaserCipher ceaserCipher= new CeaserCipher(b);
        System.out.println( "Encrypted data:"+ceaserCipher.encrypt(plainText));

        System.out.println("Decrypted Dat:"+ ceaserCipher.decrypt(CipherText));


        MonoAlpabetic monoAlpabetic =new MonoAlpabetic(monoKey);

        System.out.println( "Encrypted (mono):"+monoAlpabetic.encrypt(plainText));
        System.out.println("Decrypted (mono):"+ monoAlpabetic.decrypt(CipherText));


        Vigenere vigenere =new Vigenere(vigenereKey);

        System.out.println( "Encrypted (vigenere):"+vigenere.encrypt(plainText));
        System.out.println("Decrypted (vigenrere):"+ vigenere.decrypt(CipherText));
    }

}
