/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13_Enum_Composicao_03.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jean
 */
public class Client {

    private String name;
    private String email;
    private Date birthDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ");
        sb.append(name);
        sb.append("(");
        sb.append(sdf.format(birthDate));
        sb.append(")");
        sb.append(" - ");
        sb.append(email);
        sb.append("\n");

        return sb.toString();
    }

}
