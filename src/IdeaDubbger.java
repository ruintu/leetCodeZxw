import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 22:43 2021/3/28
 * @Modifued By:
 */
public class IdeaDubbger {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }

        //saveRecourse();

        System.out.println("keys");

        //step over
        System.out.println("step over");

        // step into  |  step out
        System.out.println("step into | step out");
        IService service = new IServiceImpl();

        service.execute();


        System.out.println("I am here!");

    }

    public static void evaluate(){

        System.out.println("evaluate");

        Person p = new Person("bywind",35);

        List<Integer> list = Arrays.asList(1,2,3,4)
                .stream().map(x -> x * 2).collect(Collectors.toList());

    }

    public static void saveRecourse(){
        System.out.println("shit happens");

        System.out.println("save to db");

        System.out.println("save to redis");

        System.out.println("send message to mq for money payout");
    }



}