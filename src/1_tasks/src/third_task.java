import java.util.*;

public class third_task {
    public static void main(String arg[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите message: ");
        String x = sc.nextLine();
        System.out.println("Введите key word: ");
        String  y = sc.nextLine();
        System.out.println(nicoCipher(x, y));
    }
    public static String nicoCipher(String x, String y){
        int len = x.length();
        int ylen = y.length();
        int r = (len-len%ylen)/ylen;
        if (len%ylen != 0) {
            r++;
        }
        for (int i = len; i < r*ylen; i++) {
            x += " ";
        }
        char[][][] v = new char[r][ylen][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                v[i][j][0] = x.charAt(i*ylen+j);
                v[i][j][1] = y.charAt(j);
            }
            Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);
        }
        String s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                s += v[i][j][0];
            }
        }
        return s;
    }
}
