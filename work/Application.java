package work;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter AlgoritmID");
        System.out.println("1 - get Fibonacchi " + " 2 - calculate Factorial");
        String algorithmId = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Enter looptype");
        System.out.println("1 - while ;2 - do-while ;3 - for");
        String loopTypeId = scanner1.nextLine();
        System.out.println(" Number");
        Scanner scanner2 = new Scanner(System.in);
        String number = scanner2.nextLine();


        Administrator administrator = new Administrator();
        System.out.println(Arrays.toString(administrator.getResult(algorithmId,loopTypeId,number)));





    }
}
