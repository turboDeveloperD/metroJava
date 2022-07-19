package Distributions;

import org.apache.commons.math3.distribution.UniformRealDistribution;

public class distributionUniformReal {
    // atributos
    private int tam;
    private double array[];

    /**
     * Descripcion:  Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto UniformRealDistribution
     * @param _tam 
     */
    public distributionUniformReal(int _tam) {
        this.tam = _tam;
        this.array = new double[tam];
    }
    
    /**
     * Descripcion:  Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto UniformRealDistribution
     * @return this.array
     */
    public double[] uniformDistribution(){
        UniformRealDistribution u = new UniformRealDistribution(0,1);
        
        for(int i=0; i < this.tam; i++)
        {
            this.array[i] = u.sample();
        }

        return this.array;
    }
    
            
}
