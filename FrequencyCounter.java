import java.util.Scanner;
import java.util.Random;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class FrequencyCounter{
    final static int UPPERLIMIT = 5;
    
    public static void main(String[] args) {

        final int ROWS = 10;
        final int COLUMNS = 10;

        int table[][] = new int[ROWS][COLUMNS];
        int frequency[] = new int[UPPERLIMIT];

        // load the table
        loadTable(table, ROWS, COLUMNS);
        
        // Print the table so we can verify that the sum is correct
        //printTable(table, ROWS, COLUMNS);

        // count the frequencies of the values in the table
        findFrequencies(table, ROWS, COLUMNS, frequency);

        // print the list of frequencies
        printList(frequency, frequency.length);
        

        System.out.println("end of program");
    }

    public static void findFrequencies(int[][] t, int rows, int columns, int [] f){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                // increment the value in the frequency array
                f[t[i][j] - 1]++;
            }// end for j
        }// end for i
    }// end find fequencies
    
    public static void loadTable(int[][] t, int rows, int columns){
    
        Random r = new Random();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[i][j] = r.nextInt(UPPERLIMIT) + 1;
            }// end for j
        }// end for i    
    }// end load tab le

    public static void printList(int[] list, int size){
        for(int i = 0; i < size; i++){
            System.out.println(i + 1 + "'s: " + list[i] + " times.");
        }//end i
    }// end print list

    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }// end printtable
}
