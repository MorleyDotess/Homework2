package work;

public class Administrator {
    int algorithmIdInt = 0;
    int loopTypeIdInt = 0;
    int numberInt = 0;


    Fibonacci fibonacci = new Fibonacci();

    // массивы обозначаются без пробела int[]
    public int [] getResult(String algorithmId, String loopTypeId, String number) {

        checkParameters(algorithmId, loopTypeId, number);

        if (algorithmIdInt >= 0 && algorithmIdInt <=2) {

            if (algorithmIdInt == 1) {
                if (loopTypeIdInt > 0 && loopTypeIdInt<=4) {
                    if (loopTypeIdInt == 1) {
                        return fibonacci.whileFibonacci(numberInt);
                    } else if (loopTypeIdInt == 2) {
                        return fibonacci.dowhileFibonacci(numberInt);
                    } else if (loopTypeIdInt == 3) {
                        return fibonacci.forFibonacci(numberInt);
                    }
                    // почему вычисление факториала завёрнуто в отдельный метод, а вычисление фибоначи нет
                } else {
                    throw new IncorrectLoopTypeExeption(); // повторение кода, заворачивай проверку в отдельный метод
                }

            }  if (algorithmIdInt == 2) { // это можно было завернуть в else, не нужен лишний if
                return getFactorial(loopTypeIdInt, numberInt);
            }

        } else {
            throw new IncorrectLoopTypeExeption(); // не правильная ошибка, тут будет не корректный алгоритм а не цикл
        }
        return new int[0]; // зачем возвращать пустой массив?

    }

    private void checkParameters(String algorithmId, String loopTypeId, String number) {
        try {
             algorithmIdInt = Integer.parseInt(algorithmId);
             loopTypeIdInt = Integer.parseInt(loopTypeId);
             numberInt = Integer.parseInt(number);
            // внутри метода пустыми строками могут отделятся какие то части логики, или вызовы других методов, смотри строку 13-15, удаляй пустые строки там где они не обоснованы

        } catch (NumberFormatException ex) {
            throw new IlegalImputData(); //iNput
        }
    }
    // методы отделяются друг от друга пустой строкой
    // массивы обозначаются без пробела int[]
    public int [] getFactorial (int loopTypeId, int number ){
        if (loopTypeId>0 && loopTypeId < 4){
            int[] array=new int[1]; // форматируй код постоянно, а вообще лучше привыкай писать в правильном формате, пробелы до и после знака =, и прочее
            Fctr Factorial = new Fctr(); // названия переменных и методов должны начинаться с маленькой буквы
            if (loopTypeId==1){
                array[0]=Factorial.whileFactorial(number);
            }else if(loopTypeId == 2 ) {
                array[0] = Factorial.doFactorial(number);
            }else if (loopTypeId == 3){ // это выражение всегда true, else if не нужен
                array[0]=Factorial.forFactorial(number);

            }
            return array;
        }else {
            throw new IncorrectLoopTypeExeption(); // повторение кода, заворачивай проверку в отдельный метод

        }
    }


}
