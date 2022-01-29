/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10_Vetores_Arrays.entities;

/**
 *
 * @author Jean
 */
public class Employee {
    private Integer id;
    private String nome;
    private Double salario;

    public Employee(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

  public void increaseSalary(double percent){
      salario+= salario * percent/100;
  }

    @Override
    public String toString() {
        return id + ", " + nome + ", R$" + salario;
    }
    
    
    
    
}
