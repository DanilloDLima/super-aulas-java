import java.util.Scanner;

public class Atividade2 extends Main{

    public static void main(String[] args) {
    //Faça um algoritmo para receber um número qualquer e imprimir na tela se
    // o número é par ou ímpar, positivo ou negativo.
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String resultado1 = "", resultado2 = "";

        tx("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0){
            resultado1 = "Número informado é negativo!";
        } else if (numero == 0) {
            resultado1 = "Número digitado e 0!";
        } else{
            resultado1 = "Número digitado e positivo";
        }

        if (numero % 2 == 0){
            resultado2 = "Este número e par.";
        }else{
            resultado2 = "Este número e impar.";
        }

        tx(resultado1 + " " + resultado2);
    }
}