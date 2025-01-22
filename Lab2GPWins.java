import java.util.Scanner;
/** 
 * ACS-1904 Lab 2
 * @author  Sveinson
 */

public class Lab2GPWins{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String driverName = "";         // search key
        int driverIndex = -1;           // index of driver search
        int nthWin = -1;                // win search key
        // Prallel arrays
        String[] drivers = {"Hamilton", "Verstaepen", "Perez", "Norris",
                "Sainz", "Chandock","Ocon"};

        String[][] wins = {{"Germany", "Canada", "Mexico", "Singapore"},
                {"Canada", "Austria", "France", "China"},
                {"Bahrain"},
                {"Nepal", "Australia"},
                {"Spain", "Vietnam"},
                {"Brazil"},
                {"Belgium", "Italy"}};

        // print the table of gp wins
        //printTable(drivers, wins);

        // get gp wins for a specific driver
        System.out.println();
        System.out.println("GP Driver Info:\n");
        System.out.println("enter a driver name:");
        driverName = scanner.next();
        //System.out.println("driver to search: " + driverName);

        // get the index of the driver search key
        driverIndex = -1;
        driverIndex = getDriverIndex(drivers, driverName);
        //System.out.println(driverIndex);

        // print the list of wins
        if(driverIndex >= 0)
            printWins(wins, driverIndex);
        else
            System.out.println("Driver not found.");

        // print the nth win
        System.out.println("Enter n (1-7)");
        nthWin = scanner.nextInt();

        while(nthWin != 0){

            printNthWins(wins, drivers, nthWin);
            System.out.println("********************\n");
            // get the next win number
            System.out.println("Enter n (1-7)");
            nthWin = scanner.nextInt(); 
        }
        // end of program message
        System.out.println("end of program");
    }//end main
    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    /*****************************************
     * Description: print the nth gp of each driver if the nth win exists
     * 
     * @param        String[][] w the 2d-array of gp wins
     * @param        Sting[] d array of drivers
     * @param        int n the nth win
     * ****************************************/        
    public static void printNthWins(String[][] w, String[] d, int n){
        System.out.println("Win #" + n + ":");
        for(int i = 0; i < w.length; i++){
            if(w[i].length >= n)
                System.out.println(d[i] + ": " + w[i][n - 1]);
        }// end for
    }// end printNthWin

    /*****************************************
     * Description: print all of the gp wins of a specific driver

     * @param        String[][] 2d array of gp wins
     * @param        int dIndex index of specific driver
     * ****************************************/    
    public static void printWins(String[][] w, int dIndex){
        for(int j = 0; j < w[dIndex].length; j++)
            System.out.print(w[dIndex][j] + " ");

        System.out.println("\n");       
    }// end pirntWins

    /*****************************************
     * Description: return the index of the driver search key
     * 
     * @param        String[] d array of driver names
     * @param        String key driver to search for
     * 
     * @return       int: index of driver search key
     * ****************************************/    
    public static int getDriverIndex(String[] d, String key){
        int dIndex = -1;
        //System.out.println(key.toLowerCase());

        for(int i = 0; i < d.length; i++){
            //System.out.println(d[i].toLowerCase());
            if(d[i].toLowerCase().equals(key.toLowerCase()))
                dIndex = i;
            //System.out.println(dIndex);
        }// end for

        return dIndex;
    }// end getDriverIndex

    public static void printTable(String[] d, String[][] gp){
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + ": ");
            for(int j = 0; j< gp[i].length; j++){
                System.out.print(gp[i][j] + " ");
            }// end for j

            System.out.println();           
        }// end for i
    }// end print table
}
