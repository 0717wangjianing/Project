package cn.byhieg.threadtutorial.char01;

/**
 * Created by byhieg on 16/12/27.
 * Mail to byhieg@gmail.com
 */
public class AliveThread extends Thread{

    @Override
    public void run() {
        super.run();
        // 因为thread和this都是当前线程所以都是true
        System.out.println("run方法中是否存活" + "   "  + Thread.currentThread().isAlive());
    }
}
