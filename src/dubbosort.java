/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 16:36 2021/2/28
 * @Modifued By:
 */
public class dubbosort {

    public static void main(String[] args) {
        int arr[] = {2,1,3};
        QuickSort(arr,0,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

//    public static int[] myQuickSort(int arr[],int start,int end){
//        if(start > end || start<0 || end > arr.length) return null;
//
//    }



    public static int[] dubboHelper(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }

        return arr;
    }

    public static int[] chooseHelper(int arr[]){
        if(arr.length == 0) return arr;

        for(int i = 0; i < arr.length-1 ; i++){
            int index = i;
            //找到此次循环的最小的数
            for(int j = i; j < arr.length; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }

            //交换
            if(index != i){
                arr[i] = arr[i] + arr[index];
                arr[index] = arr[i] - arr[index];
                arr[i] = arr[i] - arr[index];
            }

        }


        return arr;
    }

    /**
     * 快速排序方法
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}