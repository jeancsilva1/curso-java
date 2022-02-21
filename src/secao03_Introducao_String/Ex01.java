/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao03_Introducao_String;

/**
 *
 * @author Jean
 */
public class Ex01 {

    public static void main(String[] args) {

        String a = "Jean Carlos Silva";
        String c  = " Thomas Silva";
        //transformando String atribuída a variável 'a' em lower case(minusculas)
        String b = a.toLowerCase();
        System.out.println(b);

        /*substitui a primeira "string" encontrada(informada no primeiro argumento do parametro) 
        pela string segunda string informada no segundo argumento.  
         */
        b = a.replaceFirst("a", "g");
        System.out.println(b);
        /* substitui todos os elementos da String informada, pelo elemento passado 
como segundo argumento do parametro
         */
        b = a.replaceAll("a", "u");
        System.out.println(b);
        
        //concatena Strings
        c = a.concat(c);
        System.out.println(c);
        
    }

}
