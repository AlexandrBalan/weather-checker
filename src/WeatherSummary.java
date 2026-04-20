import java.util.Scanner;



public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {

        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scan = new Scanner(System.in);


        //define the variables needed
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double total = 0;
        int count = 0;


        //use a while loop, since hasnextDouble()...

        while(scan.hasNextDouble()) {
            double temp = scan.nextDouble();

            System.out.println(temp);

            if(temp > max) {
                max = temp;
            }

            if(temp < min) {

                min = temp;
            }

            total += temp;

            count++;
        }

        System.out.println("Max: " + max);

        System.out.println("Min: " + min);

        System.out.println("Average: " + (total / count));


    }
}
