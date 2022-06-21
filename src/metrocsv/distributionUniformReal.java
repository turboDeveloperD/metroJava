/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import org.apache.commons.math3.distribution.UniformRealDistribution;

/**
 *
 * @author VILAN
 */
public class distributionUniformReal {
    
    // atributos
    private int tam;
    private double array[];

    distributionUniformReal(int _tam) {
        this.tam = _tam;
        this.array = new double[tam];
    }
    
    public double[] uniformDistribution(){
        UniformRealDistribution u = new UniformRealDistribution(0,1);
        
        for(int i=0; i < this.tam; i++)
        {
            this.array[i] = u.sample();
        }

        return this.array;
    }
    
            
}
