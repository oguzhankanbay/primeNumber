import java.util.Scanner;

public class primeNumber {


    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int Gvalue= data.nextInt();
        for (int i=2;i<=Gvalue;i++){
            boolean primeNumber=true;
            for (int j =2; j<i;j++){
                if (i%j==0){
                    primeNumber=false;
                    break;
                }

            }
            if (primeNumber){
                System.out.print(","+i);
            }
        }









    }
}
