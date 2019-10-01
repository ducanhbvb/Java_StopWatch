
import java.util.Random;


public class Main {

    public static void createRandom(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
    }

    public static void main(String[] args) {
        StopWatch thoiGian = new StopWatch();
        thoiGian.Start();
        int[] arr = new int[10000];
        createRandom(arr);
        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        thoiGian.Stop();
        System.out.println("thoi gian= " + (thoiGian.getElapsedTime()));
    }
}
