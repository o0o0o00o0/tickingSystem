import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigInteger;
import java.util.SplittableRandom;
import java.lang.Class;
import  java.lang.reflect.*;
import java.util.*;

public class Server {
    public static void main(String... args) {

        HelloImp1 hello = new HelloImp1();
        MyInvocationHandler handler = new MyInvocationHandler(hello);
        // 构造代码实例
        Hello proxyHello = (Hello) Proxy.newProxyInstance(HelloImp1.class.getClassLoader(), HelloImp1.class.getInterfaces(), handler);
        // 调用代理方法
        System.out.println(proxyHello.sayHello());
    }
}

//        Station station = new Station();
//        TicketThread ticketThread1 = new TicketThread(station);
//        TicketThread ticketThread2 = new TicketThread(station);
//        ticketThread1.start();
//        ticketThread2.start();


