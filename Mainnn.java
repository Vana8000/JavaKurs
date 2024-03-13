import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mainnn {
    public static void main(String[] args) {
        int[] massiv = new int[20];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = ((int) (Math.random() * 15) + 1);
            System.out.println("Содержимое массива: " + massiv[i]);
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : massiv) {
            countMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
            }
        }
    }
}