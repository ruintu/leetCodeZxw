package jdk8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 11:07 2021/3/10
 * @Modifued By:
 */
public class StreamApi {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,4,5);

        list.forEach((Integer i)->{
            System.out.println(i);
        });

        long count = list.stream().count();

        System.out.println("count:"+count);

        list.stream().filter(num -> num>3).forEach((Integer i)->{
            System.out.println(i);
        });

        System.out.println("----------------");


        list.stream().limit(3)
                .forEach(i-> System.out.println(i));


    }


}