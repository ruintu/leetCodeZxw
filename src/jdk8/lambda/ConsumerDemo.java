package jdk8.lambda;

import java.util.function.Consumer;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 10:05 2021/3/10
 * @Modifued By:
 */
public class ConsumerDemo {

    public static void main(String[] args) {

        consumer((String s) -> {
                String s1 = s.toUpperCase();
                System.out.println(s1);
            },(String s) -> {
                    String s1 = s.toUpperCase();
                    System.out.println(s1);
            }
        );

    }

    public static void consumer(Consumer<String> consumer1,Consumer<String> consumer2){
        consumer1.andThen(consumer2).accept("hello,world");
    }

}