package seminars.third.hw;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainHWTest {
    MainHW mainHW;
    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 100})
    public void testEvenNumber(int number) {
        assertTrue(mainHW.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 9})
    public void testOddNumber(int number) {
        assertFalse(mainHW.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void testZero(int number) {
        assertTrue(mainHW.evenOddNumber(number));
    }


}
