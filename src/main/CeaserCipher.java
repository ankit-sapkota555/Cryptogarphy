package main;

public class CeaserCipher {
    private int key;

    public CeaserCipher(int key){
        this.key=key;
    }

    public String encrypt(String string){
        char[] c= string.toUpperCase().toCharArray();
        for (int i=0;i<c.length;i++){
            int x = c[i]-64;
            int y = (x+key)%26;
            int w= y+64;
            char z = (char) w;
            c[i]= z;
        }
        return new String(c);
    }

    public String decrypt(String string){
        char[] c= string.toUpperCase().toCharArray();
        for (int i=0;i<c.length;i++){
            int x = c[i]-64;
            int y = (x-key+26)%26;
            int w= y+64;
            char z = (char) w;
            c[i]= z;
        }
        return new String(c);
    }
}
