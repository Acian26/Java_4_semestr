import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);
        System.out.println("Введите строки: ");
        String t = in.nextLine();
        String d = in.nextLine();
        System.out.println(hiddenAnagram(t,d));
    }
        public static String hiddenAnagram(String t, String p) {
        t = t.toLowerCase().replaceAll("[^a-z]", "");
        p = p.toLowerCase().replaceAll(" ", "");

        for(int i = 0; i < t.length() - p.length() +1; i++){
            if(p.indexOf(t.charAt(i)) > -1){
                String subT = t.substring(i, i + p.length());
                if(isAnagram(subT, p)){ return subT;}
            }
        }
        return "noutfond";
    }

    private static boolean isAnagram(String str1, String str2){
        StringBuilder s = new StringBuilder(str2);
        for(int i=0; i<str1.length(); i++){
            int in = s.indexOf(String.valueOf(str1.charAt(i)));
            if(in == -1){
                return false;
            }

            s.setCharAt(in, '-');
        }

        return true;
    }
}
