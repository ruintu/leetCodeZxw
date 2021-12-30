package jdk8.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 10:59 2021/3/10
 * @Modifued By:
 */
public class StreamTestUser {

    public static void main(String[] args) {

        //对于list的使用
        List<String> list = new ArrayList<>();
        list.stream();

        //对于set的使用
        Set treeSet = new TreeSet<>();
        treeSet.stream();

        //对于map的使用
        Map<String,String> hashMap = new HashMap<>();
        hashMap.values().stream();
        hashMap.keySet().stream();

        //对字符串
        Stream<String> stream = Stream.of("aa","bb","cc");
        
        String[] strs = {"aa","bb","cc"};

        Stream.of(strs);


    }

}