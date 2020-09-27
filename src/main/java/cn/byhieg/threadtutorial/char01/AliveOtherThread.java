package cn.byhieg.threadtutorial.char01;

/**
 * Created by byhieg on 16/12/27.
 * Mail to byhieg@gmail.com
 */
public class AliveOtherThread extends Thread{

    public AliveOtherThread(){
        System.out.println("AliveOtherThread--------begin");
        // 当前正在执行的线程 运行的线程名Thread-run
        System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()=" + Thread.currentThread().isAlive());
        // 当前对象的线程名Thread-0
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("AliveOtherThread--------end");
    }


    @Override
    public void run() {
        super.run();
        System.out.println("run---------begin");
        System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run---------end");

    }
}
