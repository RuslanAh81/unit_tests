package seminars.third.hw;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task2Test {
    private MainHW mainHW;
    @BeforeEach
    void setUp () {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 50 , 99})
    public void testNumberInIntervalInside(int number) {
        assertTrue(mainHW.numberInInterval(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {0, 24, 100, 110})
    public void testNumberInIntervalOutside(int number) {
        assertFalse(mainHW.numberInInterval(number));
    }

}
