import java.util.Scanner;

public class Atividade5 extends Main {
    public static void main(String[] args) {
        //faca um algoritimo que leia o valor do salario minimo e o valor do salario do usuario
        //calcule quantos salarios minimos esse usuario ganha

        Scanner sc = new Scanner(System.in);

        tx("Digite o valor do sálario minímo");
        double salarioMinimo = sc.nextDouble();

        tx("Digite o valor do seu sálario");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        //cria uma string com o texto formatado
        String resultadoFormatado = String.format("%.1f", quantidadeSalariosMinimos);

        tx("Você ganha: "+resultadoFormatado+" sálarios minímos.");
    }
}
