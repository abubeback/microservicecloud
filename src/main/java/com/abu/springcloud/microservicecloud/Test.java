package com.abu.springcloud.microservicecloud;

public class Test extends Thread {

    private Object obj = new Object();

    @Override
    public void run() {

        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }

    public void mymethod(){
        synchronized (obj){
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
