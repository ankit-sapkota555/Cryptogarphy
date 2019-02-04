package main;

public class Vigenere {

    private String key;

    public Vigenere(String key){
        this.key=key;
    }

    public String encrypt(String plainText){
        char[] plainArray= plainText.toUpperCase().toCharArray();
        char[] charArray = key.toUpperCase().toCharArray();
        for (int i=0;i<plainArray.length;i++){
            int charIndex = (charArray[i]+plainArray[i]-130)%26 + 65;
            plainArray[i]= (char) (charIndex);
        }
        return new String(plainArray);
    }

    public String decrypt(String cipherText){
        char[] cipherArray= cipherText.toUpperCase().toCharArray();
        char[] charArray = key.toUpperCase().toCharArray();
        for (int i=0;i<cipherArray.length;i++){
            int charIndex = (-charArray[i]+cipherArray[i]+26)%26 + 65;
            cipherArray[i]= (char) (charIndex);
        }
        return new String(cipherArray);
    }
}
