/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 20:38 2021/3/10
 * @Modifued By:
 */
public class A {

    private B b;

//    public A(B b) {
//        this.b = b;
//    }


    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public static void main(String[] args) {
        B b = new B();

        A a = new A();

    }

}