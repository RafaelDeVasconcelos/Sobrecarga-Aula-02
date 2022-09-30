
/* Métodos com sobrecarga */

public class Quadrilatero {

    //Área do quadrado
    public static void area(double lado1) {
        System.out.println("A área do quadrado é: " + (lado1 * lado1));
    }

    //Área do retângulo
    public static void area(double lado1, double lado2) {
        System.out.println("Á area do retângulo é: " + (lado1 * lado2));
    }

    //Área do trapézio
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio é: " + ((baseMaior * baseMenor) * altura) / 2);
    }

    //Área do losango
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A área do losango é: " + (diagonal1 * diagonal2) / 2);
    }
}
