package jdk8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 1:01 2021/3/10
 * @Modifued By:
 */
public class SupplierDemo {

    public static void main(String[] args) {

        int max = printMax(() -> {
            int[] arr = {19,63,15,84,56,39};
            Arrays.sort(arr);
            return arr[arr.length-1];
        });

        System.out.println("max supplier"+max);

    }

    public static int printMax(Supplier<Integer> supplier){
        int max = supplier.get();

        return max;

    }

}