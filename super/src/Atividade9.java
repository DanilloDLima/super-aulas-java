import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            condicao = "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            condicao = "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            condicao = "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            condicao = "Obesidade grau II (severa)";
        } else {
            condicao = "Obesidade grau III (mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Condição: " + condicao);

        sc.close();
    }
}
