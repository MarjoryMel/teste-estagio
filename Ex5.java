import java.util.Scanner;

public class Ex5 {

    public static String inverteString(String palavra){
        char[] caracteres = palavra.toCharArray();
        int inicioString = 0;
        int fimString = caracteres.length - 1; //array começa em 0

        while (inicioString < fimString) {
            char temp = caracteres[inicioString];
            caracteres[inicioString] = caracteres[fimString];
            caracteres[fimString] = temp;
            
            inicioString++;
            fimString--;
        }
        
        return new String(caracteres);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = inverteString(palavra);

        System.out.println("");
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);

        scanner.close();
    }
}
