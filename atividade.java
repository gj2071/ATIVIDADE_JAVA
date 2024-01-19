import java.util.Scanner;


class Calculadora {
   
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Erro");
            return Double.NaN;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

  
        System.out.print("número:");
        double n1 = scanner.nextDouble();

        System.out.print("segundo número:");
        double num2 = scanner.nextDouble();


        System.out.println("+" + calculadora.somar(n1, n2));
        System.out.println("-" + calculadora.subtrair(n1, n2));
        System.out.println("*" + calculadora.multiplicar(n1, n2));
        System.out.println("/" + calculadora.dividir(n1, n2));

        scanner.close();
    }
}
