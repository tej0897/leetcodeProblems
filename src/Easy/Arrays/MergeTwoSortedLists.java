package Easy.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        listOne.add(2);
        listOne.add(1);
        listOne.add(3);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(2);
        listTwo.add(1);

        List<Integer> newList = Stream.concat(listOne.stream(), listTwo.stream())
                .sorted()
                .toList();
        System.out.println(newList);

    }
}
