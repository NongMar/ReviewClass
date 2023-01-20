package ReviewClass;

public class ForLoopReview {
    public static void main(String[] args) {
        //best loop-used when we know how many times we want to repaet block of code

        for(int i=2;i<=20;i+=5){
            System.out.println(i);
        }

        //break and continue
        //we usualy use break inside of if statement whenever specific condition will be met

        for(int i=2;i<=20;i+=5){
            System.out.println(i);
            if(i==12){
                System.out.println("i is equal 12-break");
                break;
            }
        }
        //continue
        for(int i=1;i<=10;i++){
            if(i%3==0){
                System.out.println(i);
                continue;//java goes to the begginig of the loop and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
        }
    }
}
