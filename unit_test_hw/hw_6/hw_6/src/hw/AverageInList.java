package hw;
import java.util.List;

public class AverageInList {
    public Double averageInList(List<Integer> list) throws IllegalArgumentException {
        if (list == null) {
            throw new IllegalArgumentException("List is null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return list.stream().mapToInt(i -> i).average().orElse(0);
    }


    public String compareAverageInLists(List<Integer> list1, List<Integer> list2) throws IllegalArgumentException {
        if (list1 == null) {
            throw new IllegalArgumentException("First list is null");
        }
        if (list1.isEmpty()) {
            throw new IllegalArgumentException("First list is empty");
        }
        if (list2 == null) {
            throw new IllegalArgumentException("Second list is null");
        }
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("Second list is empty");
        }
        if (averageInList(list1) > averageInList(list2)) {
            return "Первый список имеет большее среднее значение";
        }else if (averageInList(list1) < averageInList(list2)) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
