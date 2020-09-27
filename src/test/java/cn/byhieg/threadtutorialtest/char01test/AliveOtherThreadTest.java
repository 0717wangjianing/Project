package cn.byhieg.threadtutorialtest.char01test;

import cn.byhieg.threadtutorial.char01.AliveOtherThread;
import junit.framework.TestCase;

/**
 * Created by byhieg on 16/12/27.
 * Mail to byhieg@gmail.com
 */
public class AliveOtherThreadTest extends TestCase {
    // 这是测试的例子
    public void testRun() throws Exception {
        AliveOtherThread run = new AliveOtherThread();
        System.out.println("12");
        Thread thread = new Thread(run);
        System.out.println("main begin thread isAlive=" + thread.isAlive());
        thread.setName("byhieg");
        thread.start();
        // this.isAlive()指本对象Thread-0，Thread.currentThread().isAlive()指运行run方法的线程对象
        // thread.start()异步执行，执行完成之后执行异步run方法
        System.out.println("main end thread isAlive=" + thread.isAlive());
        //线程休眠
        Thread.sleep(3000);
    }

}