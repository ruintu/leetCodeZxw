package jdk8.lambda;

import javax.sound.midi.Track;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 23:53 2021/3/9
 * @Modifued By:
 */
public class ModifyToLambda {

    public static void main(String[] args) {

        new Thread( () ->

            {System.out.println("感觉有压力了");}

        ).start();

    }

}