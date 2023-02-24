/*
2.Пусть дан произвольный список целых чисел, удалить из него четные числа
*/

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        oddArray(arr);
        oddArrayIter(arr);
    }

    private static void oddArray(int[] arr) {
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i : arr) {
            if (i % 2 != 0) {
                list.add(Integer.valueOf(i));
            }
        }
        System.out.println(list);
    }

    private static void oddArrayIter(int[] arr) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.removeIf(item -> item % 2 == 0);
        System.out.println(list);

    }
}
