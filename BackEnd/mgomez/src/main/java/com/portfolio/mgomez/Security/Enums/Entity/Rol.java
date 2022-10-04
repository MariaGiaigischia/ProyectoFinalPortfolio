/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgomez.Security.Enums.Entity;

import com.portfolio.mgomez.Security.Enums.RNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mamag
 */
@Entity
public class Rol {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RNombre getRnombre() {
        return rnombre;
    }

    public void setRnombre(RNombre rnombre) {
        this.rnombre = rnombre;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RNombre rnombre;

    public Rol() {
    }

    public Rol(RNombre rnombre) {
        this.rnombre = rnombre;
    }
    
    
    
    
    
}
