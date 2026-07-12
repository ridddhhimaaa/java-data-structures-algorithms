public class arithematic {
    public static void main (String[] args) {
        int x = 10;
        int y = 3;
        // arithmetic operators
        System.out.println("Arithmetic operators");
        System.out.println( x + y);
        System.out.println( x - y);
        System.out.println( x * y);
        System.out.println( x / y);
        System.out.println( x % y);

        // increment and decrement operators
        int z = 5;
        System.out.println("Increment and Decrement operators");
        ++z;
        //value is 5 so it will print 5
        System.out.println(z);
        //now the value of z is 6
        --z;
        //so it will print 6
        System.out.println(z);
        
        //also for decimal values
        double a = 10.0d;
        double b = 3.0d;
        System.out.println("Decimal values");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }    
}
