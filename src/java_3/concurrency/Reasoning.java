package java_3.concurrency;

class Reasoning  extends Thread{
    //set up this class so it can become a valid thread. Reasoning should be created by inheriting from the Thread class.

    @Override
    public void run() {
        distinguish();
    }

    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out what you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
    }
}

