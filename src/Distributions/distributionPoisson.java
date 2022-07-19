package Distributions;

import org.apache.commons.math3.distribution.PoissonDistribution;

/**
 *
 * @author VILAN
 */
public class distributionPoisson {
    // atributos
    private int tam;
    private double array[]; 
    
    /**
     * Constructor
     * @param _tam
     */
    public distributionPoisson(int _tam){
        this.tam = _tam;
        this.array = new double[tam];
    }
    
    /**
     * Descripcion:  Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto PoissonDistribution
     * @return this.array
     */
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
