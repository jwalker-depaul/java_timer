package java_timer; /**
 * Created by Joseph on 6/13/2017.
 */

import java.util.Calendar;

public class timer {
    /**
     * These two variables are used to differentiate
     * between when the java_timer.timer starts and stops
     */
    private military_time ticTime = new military_time();
    private military_time tocTime = new military_time();

    /**
     * This constructor will initialize
     * the ticTime and tocTime to 0
     */
    public timer()
    {
        this.reset();
    }

    /**
     * return the current time
     * @return
     */
    private military_time getTime()
    {
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        military_time currentTime = new military_time();
        currentTime.hours = hours;
        currentTime.minutes = minutes;
        currentTime.seconds = seconds;

        return currentTime;
    }

    /**
     * Start the java_timer.timer
     */
    public void tic()
    {
        ticTime = this.getTime();
        //System.out.println("Start time is " + ticTime.hours + ":" + ticTime.minutes + ":" + ticTime.seconds);
    }

    /**
     * End the java_timer.timer
     */
    public void toc()
    {
        tocTime = this.getTime();
        //System.out.println("End time is " + tocTime.hours + ":" + tocTime.minutes + ":" + tocTime.seconds);
    }

    /**
     * This method will calculate the time and print it
     */
    public void calculateTime(String print)
    {
        military_time runTime = new military_time();
        runTime.hours = tocTime.hours - ticTime.hours;
        runTime.minutes = tocTime.minutes - ticTime.minutes;
        runTime.seconds = tocTime.seconds - ticTime.seconds;

        System.out.println("runtime = " + runTime.hours + ":" + runTime.minutes + ":" + runTime.seconds);
    }

    /**
     * This method will calculate the runtime and
     * return it as type java_timer.military_time
     * @return
     */
    public military_time calculateTime()
    {
        military_time runTime = new military_time();
        runTime.hours = tocTime.hours - ticTime.hours;
        runTime.minutes = tocTime.minutes - ticTime.minutes;
        runTime.seconds = tocTime.seconds - ticTime.seconds;

        return runTime;
    }

    /**
     * This resets the timers to 0
     */
    public void reset()
    {
        //ticTime = new java_timer.military_time();
        ticTime.hours   = 0;
        ticTime.minutes = 0;
        ticTime.seconds = 0;

        tocTime.hours   = 0;
        tocTime.minutes = 0;
        tocTime.seconds = 0;

    }
}
