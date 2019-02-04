package main;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class VigenereTest {

    private Vigenere vigenere =new Vigenere("HTKCUOISJYARG");

    @Test
    public void encrypt() {
        String plainText ="CIPHER";
        String cipherText ="JBZJYF";
        Assertions.assertEquals(cipherText,vigenere.encrypt(plainText));
    }

    @Test
    public void decrypt() {
        String plainText ="CIPHER";
        String cipherText ="JBZJYF";
        Assertions.assertEquals(plainText,vigenere.decrypt(cipherText));
    }
}
