package work;

public class Fibonacci {


    public int [] forFibonacci(int number) {
        if (number>=0){
            int [] fibonacci = new int[number];
            if (number>1){
                fibonacci[1]=1;
                for (int i = 2;i< number;i++){
                    fibonacci[i]=fibonacci[i-1] + fibonacci[i-2];


                }

        }return fibonacci;
        }else {
            throw new IncorrectLoopTypeExeption();
        }

        }
    public int [] whileFibonacci(int number){
        if (number>=0){
            int [] fibonacci = new int[number];
            if (number>1){
                fibonacci[1]=1;
            }int i=2;
            while (i<number){
                fibonacci[i]=fibonacci[i-1] + fibonacci[i-2];
                i++;
            }
            return fibonacci;

        }else {
            throw new IncorrectLoopTypeExeption();
        }
    }

    public int[] dowhileFibonacci(int number){
        if (number>=0){
            int i =2;
            int [] fibonacci = new int[number];
            do {

                if (number>1){
                    fibonacci[1]=1;
                }
                fibonacci[i]=fibonacci[i-1] + fibonacci[i-2];
                i++;

            } while (i< number);
            return fibonacci;

        }else {
            throw new IncorrectLoopTypeExeption();
        }


    }


}
