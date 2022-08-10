/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partitions;

/**
 *
 * @author VILAN
 */
public class Percentage {
    
    private double array[];
    private int tam;
    private int total;
    
    public Percentage(double[] _a, int _tam, int _total){
        this.tam = _tam;
        this.total = _total;
        this.array = _a;
    }
    
    public double[] percentageToAmount(){
        for(int i =0; i < this.tam; i++){
            this.array[i] =this.array[i]*this.total;
        }
        return array;
    }
    
    public double[] amountToPercentage(){
        for(int i =0; i < this.tam; i++){
            this.array[i] = (this.array[i]*this.total)/100;
        }
        return this.array;
    }
}
