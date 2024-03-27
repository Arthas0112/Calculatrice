
public class Main {

    public static double Addition(double a ,  double b){
        return a + b ;
    }
    public static double Soustraction(double a ,  double b){
        return a - b ;
    }
    public static double Multiplication(double a ,  double b){

        return a * b ;
    }
    public static double Division(double a ,  double b){
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut être zéro");

        } else {
            return a / b;
        }

    }
}

