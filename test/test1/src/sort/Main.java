package sort;

import java.util.Arrays;

public class Main {
    public static void main1(String[] args) {
        int[] arr={15,27,19,18,10,8};
        Sort.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={15,27,19,18,10,8};
        Sort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
