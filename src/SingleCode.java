/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 16:53 2021/2/25
 * @Modifued By:
 */
public class SingleCode {


}

// 饿汉式单例
class Singleton1{

    //指向自己实例的私有化静态引用，主动创建
    private static Singleton1 singleton1 = new Singleton1();

    //私有的构造方法
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton1;
    }


}


//懒汉式单例
class Singleton2{
    //指向自己实例的私有静态引用
    private static Singleton2 singleton2;

    private Singleton2(){}

    private static Singleton2 getSingleton2(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

class Singleton3{
    private static Singleton3 singleton3;

    private Singleton3(){}


}