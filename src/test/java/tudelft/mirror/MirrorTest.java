package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    // Crea el objeto mirror para que pueda ser usado en todas las pruebas sin necesidad de crearlo en cada uno
    private Mirror mirror;

    @BeforeEach
    public void initialize(){
        this.mirror=new Mirror();
    }

    // Inicio de pruebas
    @Test
    public void test1() {
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void test2() {
        String result = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void test3() {
        String result = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }

}
