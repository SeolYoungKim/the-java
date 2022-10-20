package bytecode;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {

//        try {
//            new ByteBuddy().redefine(Hat.class) // 변경되기 전에 Hat Class 를 읽음
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/seolyoungkim/Desktop/study/thejava/out/production/classes/")); // 변경
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(new Hat().pullOut());  // 변경되기 전 Hat Class 정보를 사용. 다시 Class를 읽어오지 않음!

        System.out.println(new Hat().pullOut());
    }
}
