import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 18:25 2021/3/10
 * @Modifued By:
 */

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

public class JVMtest {

    public static void main(String[] args) {

        while(true){

            List<Person> arrayList = new ArrayList<>();

            Person p1 = new Person("xx",11);
            Person p2 = new Person("xx2",22);


            arrayList.add(p1);
            arrayList.add(p2);

            p1=null;
            p2=null;

        }

    }

}