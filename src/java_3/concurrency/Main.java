package java_3.concurrency;

public class Main {
   
    public static void main(String[] args) throws InterruptedException {
         //run all of your threads from this main class.
        Reasoning reasoning = new Reasoning();
        reasoning.start();

        Sync syncThread = new Sync("sync thread");
        syncThread.start();
        syncThread.join();
        System.out.println(syncThread.getNums());  //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up here.
        /*
            -Create 5 sync threads
            -Allow the list of nums to be a shared resource amongst all of the threads.
            -Protect the List from thread interference using a thread blocking technique, such as synchronization or an Atomic data structure.
        */

        /*
            Kick off a Team Thread here.
            Set the name of the thead to be your agile team name.
        */

        Sync syncOne = new Sync("Sync 1");
        syncOne.start();
        Thread.sleep(1000);
        System.out.println(syncOne.getNums());


        Sync syncTwo = new Sync("Sync 2");
        syncTwo.start();
        Thread.sleep(1000);
        System.out.println(syncTwo.getNums());


        Sync syncThree = new Sync("Sync 3");
        syncThree.start();
        Thread.sleep(1000);
        System.out.println(syncThree.getNums());


        Sync syncFour = new Sync("Sync 4");
        syncFour.start();
        Thread.sleep(1000);
        System.out.println(syncFour.getNums());


        Sync syncFive = new Sync("Sync 5");
        syncFive.start();
        Thread.sleep(1000);
        System.out.println(syncFive.getNums());

        Team codeKillers = new Team("Code Killers");
        Thread teamThread = new Thread(codeKillers);
        teamThread.start();
    }
}