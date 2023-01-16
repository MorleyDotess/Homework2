package work;

public class Fibonacci {

    // массивы обозначаются без пробела int[]
    public int [] forFibonacci(int number) {
        if (number>=0){ // повторение кода, заворачивай проверку в отдельный метод
            int [] fibonacci = new int[number];
            if (number>1){
                fibonacci[1]=1;
                for (int i = 2;i< number;i++){
                    fibonacci[i]=fibonacci[i-1] + fibonacci[i-2];


                }

        }return fibonacci;
        }else {
            throw new IncorrectLoopTypeExeption(); // не правильная ошибка, ты проверяешь число а не номер цикла
        }

        }
    public int [] whileFibonacci(int number){
        if (number>=0){ // повторение кода, заворачивай проверку в отдельный метод
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
            throw new IncorrectLoopTypeExeption(); // не правильная ошибка, ты проверяешь число а не номер цикла
        }
    }

    public int[] dowhileFibonacci(int number){ // каждое новое слово в названии переменных и методов начинается с большой буквы
        if (number>=0){ // повторение кода, заворачивай проверку в отдельный метод
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
            throw new IncorrectLoopTypeExeption();// не правильная ошибка, ты проверяешь число а не номер цикла
        }


    }


}
