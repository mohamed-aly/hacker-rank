package io.hackerrank.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    public static void main(String[] args) {
        List<String> item1 = Arrays.asList("item1", "10", "15");
        List<String> item2 = Arrays.asList("item2", "3", "4");
        List<String> item3 = Arrays.asList("item3", "17", "8");

        List<List<String>> list = Arrays.asList(item1, item2, item3);

        System.out.println(fetchItemsToDisplay(list, 0, 1, 3));
    }

    private static List<List<String>> fetchItemsToDisplay(List<List<String>> list, int sortParameter,
                                                          int sortOrder, int itemsToDisplay) {

        Comparator<List<String>> comparator = sortParameter == 0
                ? Comparator.comparing(o -> o.get(sortParameter))
                : Comparator.comparing(o -> Integer.parseInt(o.get(sortParameter)));

        if(sortOrder > 0) comparator = comparator.reversed();

        list.sort(comparator);

        return list.subList(0, itemsToDisplay);
    }

}
