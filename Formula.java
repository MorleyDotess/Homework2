public class Formula {

    // названия переменных и методов должны начинаться с маленькой буквы
    // у метода отсутствует возвращаемый тип переменной
    public  Formula (int a, int p, double m1, double m2) {

        // названия переменных и методов должны начинаться с маленькой буквы
        // слишком длинная строка, строка не должна выходить за линюю в идее
        double G =(4*Math.pow(Math.PI,2)*(Math.pow(Double.parseDouble(String.valueOf(a)),3)/(Math.pow(Double.parseDouble(String.valueOf(p)),2)*(Double.parseDouble(String.valueOf(m1))+Double.parseDouble(String.valueOf(m2))))));
        // никаких саутов вне мэйн класса
        System.out.println("" + G + "");
    }







    }




