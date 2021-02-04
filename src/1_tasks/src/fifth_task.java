import java.util.Arrays;
import java.util.Scanner;

    public class fifth_task {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значение для факториала: ");
            int x1 = sc.nextInt();
            System.out.println(Arrays.toString(isExact(x1)));
        }
        public static long[] isExact(long n) {
            long start = 1;
            return check(start, n);
        }

        private static long[] check(long start, long n) {
            if (factorial(start) == n) {
                return new long[] {n, start};
            }
            if (factorial(start) > n) {
                return new long[] {};
            }
            return check(++start, n);
        }

        private static long factorial(long num) {
            if (num > 1) {
                return num * factorial(--num);
            }
            return num;
        }
}
