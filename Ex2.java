import java.util.Scanner;

public class Ex2 {

    public static boolean verificaNumero(int numero){
        int num1 = 0, num2 = 1;

        while (num2 < numero) {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
        
        return num2 == numero;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (verificaNumero(numero)) {
            System.out.println("O número " + numero + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não faz parte sequência de Fibonacci.");
        }

        scanner.close();
    }
}

