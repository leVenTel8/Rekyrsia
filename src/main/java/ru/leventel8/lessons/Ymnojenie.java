package ru.leventel8.lessons;

class Ymnojenie {

    public static void main (String [] args){

        int x = 3;                                  //поля метода main
        int y = 4;


        int res = mult(x,y);
        System.out.println("x"+" * "+"y"+" = "+ res);  // вывод умножения

        int a = 2;
        int b = 3;

        int step = power(a, b);
        System.out.println("a"+" ^ "+"b"+" = "+ step);  // вывод возведения в степень

    }//end main()

    /**
     * рекусривный метод принимает
     * @param x, y
     *           и умножает их
     * @return x, x + mult(x, y-1)
     */
    public static int mult(int x, int y){

        if(y==1)
            return x;
        else
            return x + mult(x, y-1);

    }//end mult()

    /**
     * рекусривный метод принимает
     * @param a, b
     *           и возводит в степень
     * @return a,power(a*a, b/2),a * power(a, b-1)
     */
    public static int power(int a, int b){

        if(b==1)
            return a;
        else if (b%2 == 0) return power(a*a, b/2);	//exponent is even
        else return a * power(a, b-1);

    }//end power()


}//end class Ymnojenie
