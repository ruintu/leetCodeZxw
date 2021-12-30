package jdk8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 10:48 2021/3/10
 * @Modifued By:
 */
public class StreamTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","杨逍","张强","张三丰","赵敏");

        list.stream().filter(name -> name.contains("张"))
                .filter(name -> name.length()==3)
                .forEach(name-> System.out.println("name"+name));
    }

}