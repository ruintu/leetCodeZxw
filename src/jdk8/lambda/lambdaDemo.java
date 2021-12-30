package jdk8.lambda;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 23:51 2021/3/9
 * @Modifued By:
 */
public class lambdaDemo {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("感觉有压力了！");
            }
        }).start();

    }

}