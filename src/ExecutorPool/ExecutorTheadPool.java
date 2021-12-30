package ExecutorPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 17:54 2021/3/10
 * @Modifued By:
 */
public class ExecutorTheadPool {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=1; i<=10; i++){
            final int ii = i;

            try {
                Thread.sleep(ii*1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(()-> System.out.println("线程名称："+Thread.currentThread().getName()+"执行"+ii));

        }
    }


}