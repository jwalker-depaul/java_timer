package java_timer; /**
 * Created by Joseph on 6/13/2017.
 */

public class main {

    /**
     * This class is used to test
     * the timing mechanism
     */
    public static void main (String[] args)
    {
        // Set three timers
        timer t1 = new timer();

        // Start java_timer.timer 1
        t1.tic();

        // Run obnoxious loop to run down time
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                for (int k = 0; k < 100; k++)
                {
                    System.out.println(i*j+j*k+k*i);
                }
            }
        }

        // End java_timer.timer 1
        t1.toc();

        // Print out runtime of java_timer.timer 1
        t1.calculateTime("");

    }
}
