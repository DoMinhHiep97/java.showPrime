import java.util.Scanner;
public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter amount number you want:");
        int number=scanner.nextInt();
        int count=0;
        //int n=0;//chạy đến khi nó là số nguyên tố

        for(int n=0;count<number; n++){
            boolean check=true;
            if (n < 2) {
                check = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                count++;
                System.out.println(n + " ");
            }


        }
    }
}
