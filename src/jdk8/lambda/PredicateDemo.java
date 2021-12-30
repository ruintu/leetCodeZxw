package jdk8.lambda;

import java.util.function.Predicate;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 10:30 2021/3/10
 * @Modifued By:
 */
public class PredicateDemo {

    public static void main(String[] args) {
        boolean flag = flag((Integer num) -> {
            return num > 20;
        });
        System.out.println(flag);
    }

    public static boolean flag(Predicate<Integer> predicate){
        boolean flag = predicate.test(15);
        return flag;
    }
}