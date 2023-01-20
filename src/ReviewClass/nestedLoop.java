package ReviewClass;

public class nestedLoop {
    public static void main(String[] args) {
        //nested loop- loops inside another loop
        // inner loop has always depend on outer loop
        //outer loop controls number of executions for inner loop
        for(int i=1;i<=3;i++){
            System.out.println(i);
            for(int j=1;j<=4;j++){
                System.out.println(j);
            }
        }
        System.out.println("______________________");


    }
}
