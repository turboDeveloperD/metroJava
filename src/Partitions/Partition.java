/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partitions;

import java.util.Arrays;

/**
 *
 * @author VILAN
 */
public class Partition {
    
    //Attributes
    private int id;
    private String name;
    private int total;
    private double percentajes[];
    private double arrayhour[]; // arreglo con los valores 
    
    public Partition(int _id, String _name, int _total, double[] _array){
        this.id = _id;
        this.name = _name;
        this.total = _total;
        this.percentajes = _array;
        this.arrayhour = new double[19];// arreglo con los valores 
    }
    
    public void generateData(){
        for(int i =0; i<this.percentajes.length; i++ ){
            double value = total * this.percentajes[i];
            this.arrayhour[i] = value;
        }   
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public double[] getPercentajes() {
        return percentajes;
    }

    public double[] getArrayhour() {
        return arrayhour;
    }

    public int getTotal() {
        return total;
    }
    
    @Override
    public String toString() {
        return "Partition{" + "id=" + id + ", Station Name=" + name +", total=" + total + ", percentajes=" + Arrays.toString(this.percentajes) + ", arrayhour=" + Arrays.toString(this.arrayhour) + '}';
    }
    
}
