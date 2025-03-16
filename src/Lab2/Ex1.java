package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void invert(int [] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int aux = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = aux;
        }
    }
}
