package jdk8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 0:16 2021/3/10
 * @Modifued By:
 */
public class CollectionsLambdaDemo {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("刘德华",58,174));
        list.add(new Person("张学友",56,176));
        list.add(new Person("郭富城",54,171));
        list.add(new Person("黎明",53,178));

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Collections.sort(list, (Person o1, Person o2) -> {
                return o1.getAge()-o2.getAge();
            }
        );

        for(Person p:list){
            System.out.println(p.toString());
        }

    }



}