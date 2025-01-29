package SingaltonDesignPattern;

import java.util.concurrent.locks.Lock;

public class SingletonDesignPattern {
    //  Implementation SingletonDesignPatten in single thread environment


//    private static SingletonDesignPattern sdp = null;
//
//    private SingletonDesignPattern() {
//
//    }
//
//    public static SingletonDesignPattern createInstance (){
//        if (sdp == null){
//            sdp = new SingletonDesignPattern();
//
//        }
//
//          return  sdp;
//    }

//  --------------------------------------------------------------------------------------------------------
    //   Implementing SingletonDesignPattern in multithreaded environment at runtime

//    private static SingletonDesignPattern sdp = new SingletonDesignPattern();
//

//    private SingletonDesignPattern() {
//
//    }
//     public  static SingletonDesignPattern createInstance (){
//         return sdp;
//     }

//---------------------------------------------------------------------------------------------------
    //   Implementing SingletonDesignPattern in multithreaded environment at compile time


    private  static SingletonDesignPattern  sdp = null;

    private SingletonDesignPattern() {

    }
     public static SingletonDesignPattern createInstance (){
           if (sdp == null){
               synchronized (SingletonDesignPattern.class){
                     if (sdp == null){
                         sdp = new SingletonDesignPattern();
                     }

               }

           }
         return sdp;
     }
}
