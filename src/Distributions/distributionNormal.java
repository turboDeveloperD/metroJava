package Distributions;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;

/**
 *
 * @author VILAN
 */
public class distributionNormal {
    
    // atributos
    private int tam;
    private double array[];

    /**
     * @param _tam
     */
    public distributionNormal(int _tam) {
        this.tam = _tam;
        this.array = new double[_tam];
    }
    
    /**
     * Descripcion: Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto NormalDistribution
     * @return this.array
     */
    public double[] findCutPointGauss(){
        NormalDistribution nd = new NormalDistribution();
        
        /*double part = (100.0 / (double) this.tam) / 100;
        
        for(int i =0; i < this.tam -1; i++){
            double result = nd.inverseCumulativeProbability(part*(i+1));
            
            this.array[i]= result;
        }*/
        
        //function Normal
        double k = 3;
        int n =this.tam;
        double interval = k/(2*n+1);
        
        //double c = nd.probability( interval);
        double c = 0.0;
            for(int i =0; i <n; i++){
                double x0 = (2*i+1) * interval;
                double x1 = (2*i+3) * interval;
                this.array[i] = nd.probability(x0,x1);
                c += this.array[i];
            }
        
        //System.out.println("total = "+c);
        return this.array;
    }
    
    /**
     * Descripcion: Imprime los elementos del arreglo
     */
    public void imprimirArray(){
        for(int i=0; i < this.tam; i++){
            System.out.println(i+"="+this.array[i]);
        }
    }
}
