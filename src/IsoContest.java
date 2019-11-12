/*******
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ***/
import java.util.*;

// This is a simple exemple on how to read inputs and write results
public class IsoContest {
    public static void main( String[] argv ) throws Exception {
        String  line;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            line = sc.nextLine();
            // Use System.err.println to debug information
        }
        // Use System.out.println to print the result
        System.out.println("result");
    }
}