/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao19_Generics_Set_Map.Application;

import java.util.LinkedHashMap;
import java.util.Map;
import secao19_Generics_Set_Map.entities.Pessoa;

/**
 *
 * @author Jean
 */
public class Program11 {

    public static void main(String[] args) {
        Map<String, String> dados = new LinkedHashMap<>();
        Map<String, String> infos = new LinkedHashMap<>();
        Pessoa pessoa = new Pessoa();
        String nome = "Jean Carlos";
        String codigo = "2468";

        dados.put(nome, codigo);
        infos.put("Joao", codigo);

        for (String key : dados.keySet()) {
            System.out.println(key + " - " + dados.get(key));

        }
        System.out.println("===================================================");
        System.out.println("Verifica chave existente: " + nome + " - " + dados.containsKey(nome));
        System.out.println("Verifica valor existente: " + codigo + " - " + dados.containsValue(codigo));
        System.out.println("Compara 2 MAPS = " + dados.equals(infos));
        System.out.println("HASHCODE dados: " + dados.hashCode());
        System.out.println("HASHCODE infos: " + infos.hashCode());
        System.out.println("UNIÃO DE MAPS (dados + info)");
        dados.putAll(infos);
           
        for (String key : dados.keySet()) {
            System.out.println(key + " - " + dados.get(key));

        }
        

    }
    

}
