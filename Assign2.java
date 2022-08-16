/**
 * Original program contains errors.
 * Add your name to this comment.
 @author Jorge Soto-Ventura
 * Document (i.e., describe) the problems you found in comments.
 * Comment out the original and write the corrected code.  Add any
 * additional comments that help you explain what you did to fix the
 * code.
 * 
 * You may want to run this program with multiple command-line arguments, e.g., 
 *      java Assign2 cat dog bird
 *      java Assign2 cow
 */

 //forgot to add import statement for util.array
 
import java.util.Arrays;

public class Assign2 {

    public static void main(String[] args) {  
        System.out.println("The length of command-line args is " + args.length);

        if ( args.length > 2 ) {
            System.out.println("You have more than 2 arguments.");
        }

        //for( i=0; i < args.length; i++ ) { No data type assigned to i. Fixed by adding data type int
        for ( int i=0; i < args.length; i ++) {
            //System.out.println("arg["+ i+ "] is " + args[i] + " with length " + args.length); would not correctly state size of element. Fixed by using [i].length()
            System.out.println("arg["+ i+ "] is " + args[i] + " with length " + args[i].length());
        }

        Arrays.sort(args);
        boolean hasACow = false;
        // added boolean here to create variable
        System.out.println("The sorted command-line arguments are ");
        //for( i=0; i < args.length; i++ ) { No data type assigned to i. Fixed by adding data type int
         for ( int i=0; i < args.length; i ++) {

            System.out.println("\t" + args[i] );
            //if args[i] == "cow" Removed and changed to .equals
            if ( args[i].equals("cow"))  {
                hasACow = true;
                
            }
            
         }
        System.out.print("You ");

        
        if( ! hasACow) {
            System.out.print("don't ");
        }
        System.out.println("have a cow, man.");
        
    

 }
} 
