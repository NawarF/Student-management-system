
package vector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector {

   
    public static void main(String[] args) {
           
        University uni = new University();
        
         int operation = 0;
            while (operation != 6) {

                System.out.println("What Operation do you want to do?");
                System.out.println("1- add Student");
                System.out.println("2- view Students");
                System.out.println("3- search Student");
                System.out.println("4- edit Student info");
                System.out.println("5- delete Student");
                System.out.println("6- End Programm");

                try{
                Scanner r = new Scanner(System.in);
                operation = r.nextInt();
                

                switch (operation) {
                    case 1: 
                     uni.Add(r);
                            break;
                    case 2:
                        uni.Display();
                        break;
                    case 3:
                       uni.Search(r);
                        break;
                    case 4:
                        uni.Edit(r);
                        break;
                    case 5:
                          uni.Delete(r);
                          break;
                    case 6:
                        return;
                        
                }
   
            }catch(InputMismatchException e ){
                    System.out.println("Please enter a correct operation");
                }
            }
    }
    
}
