/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distributions;

import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;


public class distributionBinomial {
     // atributos
    private int tam;
    private double array[];

    /**
     * @param _tam
     */
    public distributionBinomial(int _tam) {
        this.tam = _tam;
        this.array = new double[_tam];
    }
    
    /**
     * Se genera de manera de porcentaje
     * Descripcion: Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto NormalDistribution
     * @return this.array
     */
    public double[] findCutPointDistribution(){
        
        int n = 17;
        double p = 0.75;
        double t= 0;
            for(int i=0; i < this.tam; i++)
            {
                double probability = binomialProbability(n, i, p);
                this.array[i] = probability;
                t += probability;
            }
        
            //System.out.println("total Binomial = "+t);
            
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

    public int getTam() {
        return tam;
    }

    public double[] getArray() {
        return array;
    }
    
    // function to calculate nCr i.e., number of 
    // ways to choose r out of n objects
    public int nCr(int n, int r)
    {
        // Since nCr is same as nC(n-r)
        // To decrease number of iterations
        if (r > n / 2)
            r = n - r;
      
        int answer = 1;
        for (int i = 1; i <= r; i++) {
            answer *= (n - r + i);
            answer /= i;
        }
      
        return answer;
    }
    
     // function to calculate binomial r.v. probability
    public double binomialProbability(int n, int k, double p)
    {
        return nCr(n, k) * (double)Math.pow(p, k) * 
                        (double)Math.pow(1 - p, n - k);
    }
}
