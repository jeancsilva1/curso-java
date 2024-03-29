/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Jean
 */
public class Seller implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;
    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.birthDate);
        hash = 37 * hash + Objects.hashCode(this.baseSalary);
        hash = 37 * hash + Objects.hashCode(this.department);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seller other = (Seller) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Objects.equals(this.baseSalary, other.baseSalary)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary=" + baseSalary + ", department=" + department + '}';
    }

    
    
}
