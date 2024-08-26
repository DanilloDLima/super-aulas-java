import java.util.Arrays;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        while (true) {
            System.out.println("Digite o 1º número inteiro: ");
            num1 = sc.nextInt();
            System.out.println("Digite o 2º número inteiro: ");
            num2 = sc.nextInt();
            System.out.println("Digite o 3º número inteiro: ");
            num3 = sc.nextInt();

            if (num1 != num2 && num1 != num3 && num2 != num3) {
                break; // Os números são diferentes, sair do loop
            } else {
                System.out.println("Os números devem ser diferentes. Tente novamente.");
            }
        }

        int[] nums = {num1, num2, num3};

        Arrays.sort(nums);

        for (int x = nums.length - 1; x >= 0; x--){
            System.out.print(nums[x]);
            if (x > 0) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
