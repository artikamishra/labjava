public class Division {
    public static void main(String[] args) {

        double a = 10;
        double b = 5;
        double result;

        if(b != 0) {
            result = a / b;
            System.out.println("First number = " + a);
            System.out.println("Second number = " + b);
            System.out.println("Division = " + result);
        } else {
            System.out.println("Error! Division by zero.");
        }
    }
}

