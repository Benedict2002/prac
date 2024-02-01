import java.util.Scanner;

public class inputchalng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true){
            int order = counter +1;
            System.out.println("Enter number #"+order+": ");


            boolean isAnint = scanner.hasNextInt();
            if(isAnint){
                int number= scanner.nextInt();
                counter++;
                sum+=number;
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
         scanner.nextLine();

        }
        System.out.println("Sum = "+sum);
    }
}
