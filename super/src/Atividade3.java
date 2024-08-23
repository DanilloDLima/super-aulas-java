import java.util.Scanner;

public class Atividade3 extends Main{
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e
        //B forem iguais, deverá somar os dois valores,caso contrário devera multiplicar A por B. Ao final de qualquer um dos
        //cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultado = 0;

        tx("Digite o primeiro número: ");
        num1 = sc.nextInt();

        tx("Digite o segundo número: ");
        num2 = sc.nextInt();

        if(num1 == num2){
            resultado = num1 + num2;
            System.out.println("Soma de "+num1+ " + "+num2+": "+resultado);
        }else{
            resultado = num1 * num2;
            System.out.println("Multiplicação de "+num1+ " + "+num2+": "+resultado);
        }
    }
}
