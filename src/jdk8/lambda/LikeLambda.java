package jdk8.lambda;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 0:04 2021/3/10
 * @Modifued By:
 */
public class LikeLambda {

    public static void goSwing(ISwim iSwim){
        iSwim.swimming();
    }

    public static void iSmoke(ISmoke iSmoke){
        int i = iSmoke.iSmoke(1);
        System.out.println("返回值"+i);
    }

    public static void main(String[] args) {

//        goSwing(new ISwim() {
//            @Override
//            public void swimming() {
//                System.out.println("正常游泳！");
//            }
//        });

        goSwing(() ->{
            System.out.println("lambda 游泳！");
        });

//        iSmoke(new ISmoke() {
//            @Override
//            public int iSmoke(int a) {
//                return 1;
//            }
//        });
//
//        iSmoke((int a) -> {
//            return 2;
//        });

    }

}