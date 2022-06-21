/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import java.util.Arrays;

/**
 *
 * @author VILAN
 */
public class Partition {
    
    //Attributes
    private int id;
    private double total;
    private double percentajes[];
    private double arrayhour[]; // arreglo con los valores 
    
    Partition(int _id, double _total, double[] _array){
        this.id = _id;
        this.total = _total;
        this.percentajes = _array;
        this.arrayhour = new double[19];// arreglo con los valores 
    }
    
    void generateData(){
        //System.out.println("tam"+ this.percentajes.length);
        //System.out.println("total "+ this.total);
        for(int i =0; i<this.percentajes.length; i++ ){
            double value = total * this.percentajes[i];
            this.arrayhour[i] = value;
        }   
            //
    }
    
    @Override
    public String toString() {
        return "Partition{" + "id=" + id + ", total=" + total + ", percentajes=" + Arrays.toString(this.percentajes) + ", arrayhour=" + Arrays.toString(this.arrayhour) + '}';
    }
    
}
