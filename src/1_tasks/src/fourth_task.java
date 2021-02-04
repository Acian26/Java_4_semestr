import java.util.*;

public class fourth_task {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Scanner inp = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размерность массива: ");
        int size = inp.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] x2 = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            x2[i] = inp.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Введите значение произведения: ");
        int y2 = sc.nextInt();
        System.out.println(Arrays.toString(twoProduct(x2, y2)));
    }
    public static int[] twoProduct(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=0;j--){
                if(arr[i]*arr[j]==n){
                    return new int[]{arr[j],arr[i]};
                }
            }
        }
        return new int[]{};
    }
}