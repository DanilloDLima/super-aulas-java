import java.util.Scanner;

public class Atividade6 {
    //atividade 5 -> ler um valor , reajustar em 5%
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        double resultado = valor + (valor * 0.05);
        String resultadoFormatado = String.format("%.2f", resultado);


        System.out.println("O reajuste do valor: "+valor+" em 5% é: "+resultadoFormatado );

        sc.close();
    }

}
