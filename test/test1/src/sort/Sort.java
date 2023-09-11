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
    //快速排序
    //挖坑法
    public static void quickSort(int[] arr){
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr,int start,int end){
        if (start>=end){
            return;
        }
        if(end-start+1<=14){
            //插入排序
            insertSort2(arr, start, end);
            return;
        }
        //三数取中法
        int index=midThree(arr,start,end);
        int tmp=arr[start];
        arr[start]=arr[index];
        arr[index]=tmp;
        int pivot=partition1(arr,start,end);
        quick(arr,start,pivot-1);
        quick(arr,pivot+1,end);
    }


    public static void insertSort2(int[] arr,int start,int end){
        for (int i = start; i <= end; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    private static int midThree(int[] arr,int left,int right){
        int mid=(left+right)/2;
        if (arr[left]<right){
            if (arr[mid]<arr[left]){
                return left;
            }else if (arr[mid]>arr[right]){
                return right;
            }else {
                return mid;
            }
        }else {
            //arr[left]>right
            if (arr[mid]<arr[right]){
                return right;
            }else if (arr[mid]>arr[left]){
                return left;
            }else {
                return mid;
            }
        }
    }

    private static int partition(int[] arr,int left,int right ){
        int tmp=arr[left];
        while (left<right){
            while (left<right&&arr[right]>=tmp){
                right--;
            }
            arr[left]=arr[right];
            while (left<right&&arr[left]<=tmp){
                left++;
            }
            arr[right]=arr[left];
        }

        arr[left]=tmp;

        return left;
    }
    private static int partition1(int[] arr,int left,int right ){
        int tmp=arr[left];
        int i=left;
        while (left<right){
            while (left<right&&arr[right]>=tmp){
                right--;
            }
            while (left<right&&arr[left]<=tmp){
                left++;
            }
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
        }
        int temp=arr[left];
        arr[left]=arr[i];
        arr[i]=temp;


        return left;
    }


    
}
