
import java.util.Scanner;

public class Atividade4 extends Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu
        //antecessor e o seu sucessor
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        tx("Digite um número para saber seu sucesso e antecessor: ");
        numero = sc.nextInt();

        tx("O antecessor do número: "+numero+" é: "+(numero-1)+", é o sucessor é: "+(numero+1)+"!");
    }
}
