package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CaesarShiftCipherTest {
    // Crea el objeto caesar para que pueda ser usado en todas las pruebas sin necesidad de crearlo en cada uno
    private CaesarShiftCipher caesar;

    @BeforeEach
    public void initialize(){
        this.caesar=new CaesarShiftCipher();
    }

    // Inicio de pruebas
    @Test
    public void test1() {
        String result = caesar.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def",result);
    }

    @Test
    public void test2() {
        String result = caesar.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc",result);
    }

    @Test
    public void test3() {
        String result = caesar.CaesarShiftCipher("/.,",2);
        Assertions.assertEquals("invalid",result);
    }
}
