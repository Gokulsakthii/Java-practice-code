//explain nested loop
//A nested loop is a programming construct that consists of one loop inside another loop. The outer loop runs first, and for each iteration of the outer loop, the inner loop runs completely. This allows for more complex iterations and is often used when working with multi-dimensional data structures, such as arrays or matrices.
//In a nested loop, the outer loop controls the number of times the inner loop will execute. For example, if the outer loop runs 5 times and the inner loop runs 3 times for each iteration of the outer loop, the inner loop will execute a total of 15 times (5 * 3).
     /*public class NestedLoopExample {  
        
         public static void main(String[] args) {  
             // Outer loop  
             for (int i = 1; i <= 2; i++) {  
                 System.out.println("gokul");  
                 
                 // Inner loop  
                 for (int j = 1; j <= 5; j++) {  
                     System.out.println(" ravi");  
                 }  
             }  
         }  
     }
    
*/
public class NestedLoopExample {  
        
    public static void main(String[] args) {  
        // Outer loop  
        for (int j = 1; j <= 3; j++) {  
             
            
            // Inner loop  
            for (int i = 1; i <= j; i++) {  
                System.out.print("*");  
            }  
            System.out.println(); // Move to the next line after each row
        }  
    }  
}