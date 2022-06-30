import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void fakTest(){

    //given
        int fak=3;

        //when

        int actual=Main.whileFakultät(fak);

        //then

        int expected=6;
        Assertions.assertEquals(expected,actual);

    }
}
