package test;

import main.MonoAlpabetic;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MonoAlpabeticTest {

    private MonoAlpabetic monoAlpabetic = new MonoAlpabetic("HTKCUOISJYARGMZNBVFPXDLWQE");

    @Test
    public void encrypt() {
        String plainText ="CIPHER";
        String cipherText ="KJNSUV";
        Assertions.assertEquals(cipherText,monoAlpabetic.encrypt(plainText));
    }

    @Test
    public void decrypt() {
        String plainText ="CIPHER";
        String cipherText ="KJNSUV";
        Assertions.assertEquals(plainText,monoAlpabetic.decrypt(cipherText));
    }
}
