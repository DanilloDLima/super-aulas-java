import java.util.Scanner;

public class Atividade7 {
    //atividade 6 -> ler dois valores boleanos, determine se ambos sao verdadeiros ou falsos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano (true/false): ");
        boolean valor1 = sc.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true/false): ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são verdadeiros.");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são falsos.");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}
