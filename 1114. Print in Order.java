1114. Print in Order
https://leetcode.com/problems/print-in-order/

using variables:
class Foo {
    
    private volatile boolean onePrinted;
    private volatile boolean twoPrinted;

    public Foo() {
        onePrinted = false;
        twoPrinted = false;        
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        onePrinted = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(!onePrinted) {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        twoPrinted = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(!twoPrinted) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
Runtime: 10 ms, faster than 52.79% of Java online submissions for Print in Order.
Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Print in Order.


using semaphore:
import java.util.concurrent.*;
class Foo {
    Semaphore run2, run3;

    public Foo() {
        run2 = new Semaphore(0);
        run3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        run2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        run2.acquire();
        printSecond.run();
        run3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        run3.acquire(); 
        printThird.run();
    }
}
Runtime: 9 ms, faster than 80.07% of Java online submissions for Print in Order.
Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Print in Order.