import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("la suma de ambos numeros es: "+sumar(num1,num2));
        System.out.println("la resta de ambos numeros es: "+restar(num1,num2));
        System.out.println("la multiplicacion de ambos numeros es: "+multiply(num1,num2));

    }
    public static int sumar(int x, int y){
        System.out.println("Usando método sumar, creado por Sofia Medina");
        int sum = x+y;
        return sum;
    }
    public static int multiply(int a, int b){
        System.out.println("Método Multiplicar creado por Benjamín Salamanca");
        return a*b;
    }
    public static int restar(int numero, int cantARestar){
        System.out.println("usando metodo restar, creado por mario laurie");
        return numero-cantARestar;
    }
}
