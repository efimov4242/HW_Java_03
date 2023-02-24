/*
3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 12, 123, 1234, 12345));
        int min = list.get(0);
        int max = list.get(0);
        int average = 0;
        int count = 0;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            average += i;
            count ++;
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + average/count);

    }
}
