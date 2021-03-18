package java_3.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Team implements Runnable{

    private String teamName;
    private List<String> team = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    /*
        -This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.
        -In the run method of this thread, push each member of your team to the team list.
        -After pushing each member to the team, print a message to the console, "{name} was added to the team."  There should be a pause of 1 second before each message is printed to the console.
        -After all the names have been pushed to this list, print out the entire list of all the members of your team.
        -All of these steps should be done whenever the thread is started.  (i.e. it can be done in the run() method of the thread itself).
        Kick off the thread in the LambdaMain class of the concurrency package.
        Set the name of the thead to be your agile team name.
     */

    @Override
    public void run() {
        Thread.currentThread().setName(this.teamName);
        List<String> teammates = new ArrayList<>(Arrays.asList("Jaleel", "Treat", "Williams"));
         for (String teammate : teammates) {
             team.add(teammate);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        System.out.println(Thread.currentThread().getName() + " " + team);
    }


    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", team=" + team +
                '}';
    }
}