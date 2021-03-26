package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.mirror.Mirror;


public class GHappyTest {
    // Crea el objeto happy para que pueda ser usado en todas las pruebas sin necesidad de crearlo en cada uno
    private GHappy happy;

    @BeforeEach
    public void initialize(){
        this.happy=new GHappy();
    }

    // Inicio de pruebas
    @Test
    public void test1() {
        boolean result = happy.gHappy("xggx");
        Assertions.assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = happy.gHappy("xgx");
        Assertions.assertFalse(result);
    }

    @Test
    public void test3() {
        boolean result = happy.gHappy("xggxgx");
        Assertions.assertFalse(result);
    }
}
