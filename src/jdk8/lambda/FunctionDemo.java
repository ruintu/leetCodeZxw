package jdk8.lambda;

import java.util.function.Function;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 10:04 2021/3/10
 * @Modifued By:
 */
public class FunctionDemo {

    public static void main(String[] args) {

        String res = FunctionIm((String str) -> {
           return str.toUpperCase();
        },(String str) -> {
            return str.toLowerCase();
        });

        System.out.println(res);

        System.out.println("---------------------");

        int i = FunctionTest((String str) -> {
            return Integer.parseInt(str);
        }, (Integer str) -> {
            return str * 5;
        });
        System.out.println(i);
    }

    public static String FunctionIm(Function<String,String> function1,Function<String,String> function2){
        String res = function1.andThen(function2).apply("Hello world");
        return res;
    }

    public static int FunctionTest(Function<String,Integer> function1,Function<Integer,Integer> function2){
        Integer apply = function1.andThen(function2).apply("1");
        return apply;
    }


}