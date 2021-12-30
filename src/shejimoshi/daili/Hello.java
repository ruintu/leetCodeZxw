package shejimoshi.daili;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 9:54 2021/3/17
 * @Modifued By:
 */
public class Hello implements HelloInterface{

    private String a;


    @Override
    public void sayHai() {
        System.out.println("say hello!");
    }
}