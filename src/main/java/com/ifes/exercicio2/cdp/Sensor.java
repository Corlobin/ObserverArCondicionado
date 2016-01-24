/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.exercicio2.cdp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ricardo
 */
public class Sensor extends Observable {
    private int numeroPessoas;
    private float temperaturaAmbiente;
    public Sensor() {
    }     

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        
        this.numeroPessoas = numeroPessoas;
        setChanged();
        notifyObservers();
    }

    public float getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    public void setTemperaturaAmbiente(float temperaturaAmbiente) {
        this.temperaturaAmbiente = temperaturaAmbiente;
        setChanged();
        notifyObservers();
    }

    
}
