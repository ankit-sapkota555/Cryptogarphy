package test;

import main.CeaserCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CeaserCipherTest {

    private CeaserCipher ceaserCipher = new CeaserCipher(2);

    @Test
    void encrypt() {
        String plainText = "ANKIT";
        String encrypted = "CPMKV";
        Assertions.assertEquals(encrypted, ceaserCipher.encrypt(plainText));
    }

    @Test
    void decrypt(){
        String plainText="QJIHLJDIHQ";
        String cipherText="slkjnlfkjs";
        Assertions.assertEquals(plainText,ceaserCipher.decrypt(cipherText));
    }
}
