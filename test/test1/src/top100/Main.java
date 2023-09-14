package top100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] a=new int[n];
        int[] angry=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scanner.nextInt();
        }
        int[][] f=new int[m][2];
        for (int i = 0; i < m; i++) {
            f[i][0]=scanner.nextInt();
            f[i][1]= scanner.nextInt();

        }
        int count=0;
        for (int[] fs:f){
            int l=fs[0],r=fs[1];
            while (l<r){
                angry[l-1]++;
                angry[r-1]++;
                if (angry[l-1]>a[l-1]||angry[r-1]>a[r-1]){
                    System.out.println(count);
                    return;
                }
                l++;r--;
            }
            count++;
        }
        System.out.println(m);
    }
}
