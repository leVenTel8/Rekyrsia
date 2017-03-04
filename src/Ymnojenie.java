class Ymnojenie {

    public static void main (String [] args){

        int x = 3;
        int y = 4;


        int res = mult(x,y);
        System.out.println("x"+" * "+"y"+" = "+ res);

        int a = 2;
        int b = 3;

        int step = power(a, b);
        System.out.println("a"+" ^ "+"b"+" = "+ step);


    }
    public static int mult(int x, int y){

        if(y==1)
            return x;
        else
            return x + mult(x, y-1);





    }
    public static int power(int a, int b){

        if(b==1)
            return a;
        else if (b%2 == 0) return power(a*a, b/2);	//exponent is even
        else return a * power(a, b-1);

    }


}
