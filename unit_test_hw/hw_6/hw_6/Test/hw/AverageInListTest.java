package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AverageInListTest {
    AverageInList averageInList;

    @BeforeEach
    void setUp() {
        averageInList = new AverageInList();
    }

    @Test
    void AverageInListTest() {
        List<Integer> list = Arrays.asList(1, 2, 3);

        assertThat(averageInList.averageInList(list)).isEqualTo(2);
    }

    @Test
    void AverageInListNullTest() {
        assertThatThrownBy(()->
                averageInList.averageInList(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("List is null");
    }

    @Test
    void averageInListEmptyTest() {
        List<Integer> list = new ArrayList<>();
        assertThatThrownBy(()->
                averageInList.averageInList(list))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("List is empty");
    }

    @Test
    void firstListAverageIsGreaterTest() {
        List<Integer> list1 = Arrays.asList(2, 4, 7);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = averageInList.compareAverageInLists(list1, list2);

        assertThat(result).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void secondListAverageIsGreaterTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        String result = averageInList.compareAverageInLists(list1, list2);

        assertThat(result).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void listAverageIsEqualTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 2, 0);

        String result = averageInList.compareAverageInLists(list1, list2);

        assertThat(result).isEqualTo("Средние значения равны");
    }

    @Test
    void firstListIsNullTest() {

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        assertThatThrownBy(()->
            averageInList.compareAverageInLists(null, list2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("First list is null");
    }

    @Test
    void secondListIsNullTest() {

        List<Integer> list1 = Arrays.asList(2, 4, 0);
        assertThatThrownBy(()->
                averageInList.compareAverageInLists(list1, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Second list is null");
    }

    @Test
    void firstListIsEmptyTest() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        assertThatThrownBy(()->
                averageInList.compareAverageInLists(list1, list2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("First list is empty");
    }

    @Test
    void secondListIsEmptyTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        assertThatThrownBy(()->
                averageInList.compareAverageInLists(list1, list2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Second list is empty");
    }
}
