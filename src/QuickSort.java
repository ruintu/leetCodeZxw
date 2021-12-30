import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] a = {8,6,8,7,3,5,16,4,8,36,13,44};
        QKSourt(a,0,a.length-1);
        for (int i:a) {
            System.out.print(i + " ");
        }
    }
    private static void QKSourt(int[] a, int start, int end) {
        if (a.length < 0){
            return ;
        }
        if (start >= end){
            return ;
        }
        int left = start;
        int right = end;
        int temp = a[left];
        System.out.println("temp"+temp);
        while (left < right){
            //找到第一个小于于tempd数
            while (left < right && a[right] >= temp){
                right -- ;
            }
            a[left] = a[right];
            //找到第一个小于tempd数
            while (left < right && a[left] <= temp){
                left ++ ;
            }
            a[right] = a[left];
        }
        a[left] = temp;
       // System.out.println(Arrays.toString(a));
        QKSourt(a, start, left -1);
        QKSourt(a,left+1,end);
    }


    public static void myQuickStart(int arr[],int start,int end){
        int left = start;
        int right = end;
        int temp = arr[left];

        while(left < right){

            while(left < right && arr[right] >= arr[left]){
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = temp;
        myQuickStart(arr,start,left-1);
        myQuickStart(arr,left+1,end);

    }
}