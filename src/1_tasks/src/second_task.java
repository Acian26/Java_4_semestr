import java.util.*;

public class second_task {
    public static void main(String arg[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        System.out.println("Введите число для срезов: ");
        int n = sc.nextInt();
        System.out.println(collect(s, n));
    }
    public static String[] collect(String s, int n) {
        String[] result = new String[s.length()/n];
        for (int i = 0, j=0, k=n; i < result.length; i++, j+=n, k+=n) {
            result[i] = s.substring(j, k);
        }
        Arrays.sort(result);
        return result;
    }
}
