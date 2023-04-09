/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.supermarket_31_03_2023;

/**
 *
 * @author LabSispc13
 */
public class Supplier {
    private String name;
    private String ID;
    private boolean active;

    public Supplier() {
    }

    public Supplier(String name, String ID, boolean active) {
        this.name = name;
        this.ID = ID;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Supplier{" + "[name=" + name + "], [ID=" + ID + "], [active=" + active + "]"+'}'+"\n";
    }
    
    
    
    
}
