package ReviewClass;

import java.util.Scanner;

public class review04Loops {
    public static void main(String[] args) {

        //while loop od do while loop. Used when we don't know how many times we need to repeat the block of code
        int i=0;
        while(i<=3){
            System.out.println("Hello World");
            i++;
        }

        //do while
        int b=1;
        do{
            System.out.println("at least one execution");
            b++;
        }while(b>=3);

        //Ask students if they understand loops
        //if they dont > tell them to practice more on loops
        //if they understand > you are good move to array concept
        Scanner scan=new Scanner(System.in);
       String answer = null;
        do {
            System.out.println("Do you understand loops?");
             answer=scan.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));



    }
}
