import java.util.HashMap;
import java.util.Map;

public class task4 {
    public static void main(String[] args) {
        System.out.println(F(2, 25000));
    }

    static int F(int a, int b) {
        int count = 1;  // Число путей на старте
        Map<Integer,Integer> array = new HashMap<Integer,Integer>();    // Словарь, который хранит значения "а" и число путей "count"
        int k1 = 1;     //  сложение
        int k2 = 2;     //  умножение
        while (a != b) {
            array.put(a, count);
            a = a + k1;
            if (a % 2 == 0)
                count = count + array.get(a/k2);
        }
        return count;
    }
}