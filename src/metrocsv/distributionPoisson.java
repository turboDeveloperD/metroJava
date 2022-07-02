/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import org.apache.commons.math3.distribution.PoissonDistribution;

/**
 *
 * @author VILAN
 */
public class distributionPoisson {
    // atributos
    private int tam;
    private double array[]; 
    
    distributionPoisson(int _tam){
        this.tam = _tam;
        this.array = new double[tam];
    }
    
    public double[] poissonDis(){
        int n = 0;
        double numero = (double) (Math.random() * n ) +1;
        PoissonDistribution p = new PoissonDistribution(numero);
        
            for(int i =0; i < this.tam; i++){
                double value = p.sample();
                this.array[i]=value;
            }
        
        return this.array;
    }
}
