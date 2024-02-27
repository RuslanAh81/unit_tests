package hw;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        AverageInList averageInList = new AverageInList();
        List<Integer> list1 = Arrays.asList(2, 4);
        List<Integer> list2 = Arrays.asList(1, 5);

        Logger logger = Logger.getLogger(Main.class.getName());
        String result = averageInList.compareAverageInLists(list1, list2);
        logger.info(result);
    }
}