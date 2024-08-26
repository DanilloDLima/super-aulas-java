import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        //10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = sc.nextDouble();

        double media = (num1+num2+num3) / 3;

        System.out.printf("Sua media é: %.2f%n", media);

    }
}
