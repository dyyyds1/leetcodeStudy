package sort;

public class Sort {
    //插入排序
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    //希尔排序
    public static void shellSort(int[] arr){
        int gap=arr.length;
        while (gap>1){
            shell(arr,gap);
            gap/=2;
        }
        shell(arr,1);
    }
    public static void shell(int[] array,int gap){
        for (int i = 1; i < array.length; i++) {
            int tmp=array[i];
            int j=i-gap;
            for (; j >=0; j-=gap) {
                if (array[j]>tmp){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    //选择排序
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            
        }
    }
}
