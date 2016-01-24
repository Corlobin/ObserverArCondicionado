/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ifes.exercicio2.cdp.ArCondicionado;
import com.ifes.exercicio2.cdp.Sensor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class Exercicio2TestUnit {
    
    @Test
    public void testPessoas() {
        Sensor sensor = new Sensor();
        sensor.setNumeroPessoas(1);
        assertEquals(sensor.getNumeroPessoas(), 1);      
    }
    
    @Test
    public void testTemperatura() {
        Sensor sensor = new Sensor();
        sensor.setTemperaturaAmbiente(25);
        assertEquals(sensor.getTemperaturaAmbiente(), 25);
    }
        
}
