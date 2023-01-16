package work; //у тебя было 2 задания в домашке, создавай свою папку для каждого подзадания, например папка homework2_1 для для формулы, homework2_2 для факториала-фибоначи

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter AlgoritmID"); // следи за правописанием, идея подчёркивает слова которых она не понимает
        System.out.println("1 - get Fibonacchi " + " 2 - calculate Factorial"); // тоже самое
        String algorithmId = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Enter looptype"); // каждое новое слово в переменной начинается с большой буквы, но в сауте слова можно разделять пробелом
        System.out.println("1 - while ;2 - do-while ;3 - for"); // пробел ставится до ; а не после
        String loopTypeId = scanner1.nextLine();
        System.out.println(" Number"); // почему какие то сауты начинаются с пробела а какие то нет? зачем вообще начинать с пробела
        Scanner scanner2 = new Scanner(System.in);
        String number = scanner2.nextLine();


        Administrator administrator = new Administrator();
        System.out.println(Arrays.toString(administrator.getResult(algorithmId,loopTypeId,number)));





    }
}
