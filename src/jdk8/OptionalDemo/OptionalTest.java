package jdk8.OptionalDemo;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 11:33 2021/3/10
 * @Modifued By:
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("lucy");

        System.out.println(op1);

        Optional<String> op3 = Optional.ofNullable("luck");

        Optional<String> o = Optional.ofNullable(null);

        System.out.println(op3);
        System.out.println(o);
    }


}

class Person{
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
