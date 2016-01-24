/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.exercicio2.cdp;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ricardo
 */
public class ArCondicionado implements Observer {
    
    private static final int temperaturaAlertar = 25;
    
    private Integer numeroPessoas;
    private Integer temperatura;
    
    private ArrayList<Sensor> sensores;

    public ArCondicionado() {
        this.sensores = new ArrayList<Sensor>();        
    }
        
    @Override
    public void update(Observable o, Object arg) {
        
        Sensor sensor = (Sensor) o;
        sensores.add(sensor);
        this.numeroPessoas = this.calculaMediaPessoas();
        this.temperatura = this.calculaMediaTemperatura() + this.numeroPessoas;
        // Para saber a temperatura exata ele calcula a media da temperatura dos sensores
        // e acrescenta com a media obtida na temperatura
        System.out.printf("Temperatura %d graus, esta %s\n", this.temperatura, this.temperatura > temperaturaAlertar ? "acima do limite" : "ideal");
    }

    private Integer calculaMediaPessoas() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getNumeroPessoas();
        }
        return soma / totalsensores;
    }

    private Integer calculaMediaTemperatura() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getTemperaturaAmbiente();
        }
        return soma / totalsensores;                        
    }
    
    

    
    
}
