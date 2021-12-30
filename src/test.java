/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 16:05 2021/2/28
 * @Modifued By:
 */
public class test {

    public static void main(String[] args) {
        int arr[] = {1,2};
        swap(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }


}