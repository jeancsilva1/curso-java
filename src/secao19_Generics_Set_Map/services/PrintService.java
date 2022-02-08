/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao19_Generics_Set_Map.services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean
 */
public class PrintService<T> {

    List<T> list = new ArrayList();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");

        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));

        }

        System.out.print("]");

    }

}
