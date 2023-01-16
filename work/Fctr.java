package work;


public class Fctr {


    int result =1;
    int i=1;
    public int  doFactorial(int number ){
        do {
            result *= i;
            i++;}
            while (i<=number);
        return result;


        }


    public int whileFactorial (int n) {
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
