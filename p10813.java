import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class p10813 {
    public static void main(String[] args) {
        Map<Integer, Integer> basket = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i = 1; i < N+1; i++){
            basket.put(i, i);
        }

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = basket.get(a);
            basket.put(a, basket.get(b));
            basket.put(b, tmp);
        }

        for(int i = 1; i < N+1; i++){
            System.out.print(basket.get(i)+" ");
        }
    }
}
