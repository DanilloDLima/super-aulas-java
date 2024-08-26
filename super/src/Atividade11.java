import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
//        11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a
//        média das nota obtidas, imprima na tela o nome do aluno e
//        se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua
//        média final deve ser maior ou igual a 7.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double num4 = sc.nextDouble();

        double media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 7) {
            System.out.printf("%s Sua média é: %.2f você está aprovado.", nome, media);
        } else {
            System.out.printf("%s Sua média é: %.2f você está reprovado.", nome, media);
        }
    }
}
