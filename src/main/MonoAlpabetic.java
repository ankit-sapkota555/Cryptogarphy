package main;

public class MonoAlpabetic {

    private String key;

    public MonoAlpabetic(String key){
        this.key=key;
    }

    public String encrypt(String plainText){
        char[] a= plainText.toUpperCase().toCharArray();
        for(int i=0;i<a.length;i++){
            int charindex= a[i] - 65;
            a[i]= key.charAt(charindex);
        }
        return new String(a);
    }

    public String decrypt(String cipherText){
        char[] a= cipherText.toUpperCase().toCharArray();
        for(int i=0;i<a.length;i++){
            a[i]= (char) (65+key.indexOf(a[i]));
        }
        return new String(a);
    }

}
