/*
 Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

RENDA                       IMPOSTO DE RENDA
de 0.00 a 2000.00                 ISENTO
de 2000.01 a 3000.00              8%
de 3000.01 a 4500.00              18%
acima de 4500.00                  28%
 */
package secao05_Estrutura_Condicional;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;
        System.out.print("Salario: ");
        salario = in.nextDouble();

        if (salario > 0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario > 2000.01 && salario <= 3000.00) {
            System.out.println("R$ " + salario * 0.08);
        } else if (salario > 3000.01 && salario <= 4500.00) {
            System.out.println("R$ " + salario * 0.18);
        } else if (salario > 4500) {
            System.out.println("R$ " + salario * 0.28);
        }
    }

}
