//package day2;

import java.util.ArrayList;
import java.util.List;

public class check_double_generic {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList();
        List<Integer> b = new ArrayList();
        b.add(78);
        b.add(8);
        b.add(45);
        a.add(b);
        b.clear();
        b.add(758);
        b.add(18);
        b.add(745);
        a.add(b);
        b.clear();
        b.add(1);
        b.add(2);
        b.add(3);
        a.add(b);
        List<Integer> diagonal1Sum = new ArrayList<>();
        List<Integer> diagonal2Sum = new ArrayList<>();
        for (List<Integer> list : a) {
            int j = 0;
            for (int i : list) {
                System.out.println(list.get(i));
                if (i == j)
                    diagonal1Sum.add(list.get(i));
                if (i == j + list.size())
                    diagonal2Sum.add(list.get(i));

            }
            j++;
        }
    }
}
