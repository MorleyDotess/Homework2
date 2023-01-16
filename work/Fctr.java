package work;

//не уместное сокращение, называй классы полным именем
public class Fctr {


    int result =1;
    int i=1; // счётчик цикла должен инициализироваться в самом цикле
    public int  doFactorial(int number ){
        do {
            result *= i;
            i++;} //следи за положением скобок, опять же форматирование, плюс много лишних пустых строк и лишних пробелов
            while (i<=number);
        return result;

        }


    public int whileFactorial (int n) { // название переменной
        while (i<=n){
            result=result*i;
            i++;
        }
        return result;

    }
    public  int forFactorial(int number) {
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
