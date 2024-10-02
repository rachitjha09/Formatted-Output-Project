import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);
        String line=scan.nextLine(); //read the "3"
        int n=Integer.parseInt(line); //converting "3" to 3
        for(int i=0; i<n; i++){
            line=scan.nextLine();//read the next line
            String[] tokens=line.split(" ");
            double num1 = Double.parseDouble(tokens[0]);
            double num2 = Double.parseDouble(tokens[1]);
            double sum=num2+num1;
            //System.out.println("num1 = " + num1 + " num2 = " + num2);
            System.out.printf("$%12.2f", + num1);
            System.out.printf("%10s", "$");
            System.out.printf("%,12.2f", + num2);
            System.out.printf("%10s", "$");
            System.out.printf("%,12.2f", + sum);
            System.out.println();
        }
    }
}