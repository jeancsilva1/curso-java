/*
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Codigo do combustivel:");
        int codCombustivel = in.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codCombustivel != 4) {
            if (codCombustivel == 1) {
                alcool++;
            } else if (codCombustivel == 2) {
                gasolina++;
            } else if (codCombustivel == 3) {
                diesel++;
            
            }
            System.out.print("Codigo do combustivel:");
            codCombustivel = in.nextInt();

        }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }

}
