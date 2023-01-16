package work;

public class Administrator {
    int algorithmIdInt = 0;
    int loopTypeIdInt = 0;
    int numberInt = 0;


    Fibonacci fibonacci = new Fibonacci();


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
                } else {
                    throw new IncorrectLoopTypeExeption();
                }

            }  if (algorithmIdInt == 2) {
                return getFactorial(loopTypeIdInt, numberInt);
            }

        } else {
            throw new IncorrectLoopTypeExeption();
        }
        return new int[0];

    }

    private void checkParameters(String algorithmId, String loopTypeId, String number) {
        try {
             algorithmIdInt = Integer.parseInt(algorithmId);
             loopTypeIdInt = Integer.parseInt(loopTypeId);
             numberInt = Integer.parseInt(number);


        } catch (NumberFormatException ex) {
            throw new IlegalImputData();
        }
    }
    public int [] getFactorial (int loopTypeId, int number ){
        if (loopTypeId>0 && loopTypeId < 4){
            int[] array=new int[1];
            Fctr Factorial = new Fctr();
            if (loopTypeId==1){
                array[0]=Factorial.whileFactorial(number);
            }else if(loopTypeId == 2 ) {
                array[0] = Factorial.doFactorial(number);
            }else if (loopTypeId == 3){
                array[0]=Factorial.forFactorial(number);

            }
            return array;
        }else {
            throw new IncorrectLoopTypeExeption();

        }
    }


}
