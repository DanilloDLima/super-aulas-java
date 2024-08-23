import java.util.Scanner;

public class Atividade1 extends Main {
    public static void main(String[] args) {
        //leia A B C e imprima na tela se a soma e menor que C
        Scanner sc = new Scanner(System.in);

        int numA = 0, numB = 0, numC = 0, resultadoSoma = 0;

        tx("Digite o primeiro número: ");
        numA = sc.nextInt();

        tx("Digite o segundo número: ");
        numB = sc.nextInt();

        tx("Digite o terceiro número: ");
        numC = sc.nextInt();

        resultadoSoma = numA + numB;

        if (resultadoSoma < numC){
            tx("A soma entre o número "+numA+" + "+numB+ " = "
                    +resultadoSoma+" :: é menor que o terceiro número digitado: "+numC);
        }else if (resultadoSoma > numC){
            tx("A soma entre o número "+numA+" + "+numB+ " = "
                    +resultadoSoma+" :: é maior que o terceiro número digitado: "+numC);
        }else {
            tx("A soma entre o número " + numA + " + " + numB + " = "
                    + resultadoSoma + " :: é igual ao terceiro número digitado: " + numC);
        }
    }
}
