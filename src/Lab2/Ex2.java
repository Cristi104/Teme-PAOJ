package Lab2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] arr1 = {1, 7, 4, 3, 9, 1};
        int [] arr2 = {6, 4, 2, 8};

        System.out.println("Arr1 initial: " + Arrays.toString(arr1));
        System.out.println("Arr2 initial: " + Arrays.toString(arr2));
        sort(arr1);
        sort(arr2);
        System.out.println("Arr1 sortat: " + Arrays.toString(arr1));
        System.out.println("Arr2 sortat: " + Arrays.toString(arr2));
        System.out.println("Interclasare: " + Arrays.toString(interclasare(arr1, arr2)));
    }

    private static void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    private static int [] interclasare(int [] arr1, int [] arr2) {
        int [] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
}
