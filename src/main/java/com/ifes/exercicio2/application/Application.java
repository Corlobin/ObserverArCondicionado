/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifes.exercicio2.application;

import com.ifes.exercicio2.cdp.ArCondicionado;
import com.ifes.exercicio2.cdp.Sensor;

/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String ricardo[]){
        ArCondicionado ar = new ArCondicionado();
        Sensor sensor1 = new Sensor();
        sensor1.addObserver(ar);
        Sensor sensor2 = new Sensor();
        sensor2.addObserver(ar);
        Sensor sensor3 = new Sensor();
        sensor3.addObserver(ar);
        
        sensor1.setNumeroPessoas(3);
        sensor1.setTemperaturaAmbiente(20);
        sensor2.setNumeroPessoas(2);
        sensor2.setTemperaturaAmbiente(10);
        sensor3.setNumeroPessoas(1);
        sensor3.setTemperaturaAmbiente(20);
    }
}
