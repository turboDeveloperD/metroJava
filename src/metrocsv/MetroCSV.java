/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author VILAN
 */
public class MetroCSV {

    public static final String delimiter = ",";
    public static final String csv = "C:\\Users\\VILAN\\Documents\\Tesis\\Metro\\Nuevo con Adalberto y Gerardo\\Afluencia del metro\\afluenciastc_desglosado_02_2022.csv";
    
    public static void main(String[] args) {
        
        fileCSV archivo = new fileCSV(csv, delimiter);
        
        archivo.readFile();
        
        /*System.out.println("Distribution Normal");
        distributionNormal d = new distributionNormal(19);
        d.findCutPointGauss();
        d.imprimirArray();
        System.out.println();
        
        System.out.println("Distribution Poisson");
        distributionPoisson p = new distributionPoisson(19);
        double array[]=p.poissonDis();
        System.out.println("array = "+Arrays.toString(array));
        System.out.println();
        
        System.out.println("Distribution Uniform");
        distributionUniformReal u = new distributionUniformReal(19);
        double array2[] = u.uniformDistribution();
        System.out.println("array2 = "+ Arrays.toString(array2));*/
        
        /*for(int i =0; i < 10; i++){
            double arreglo[];
            
            arreglo = optionRandom();
            System.out.println("arreglo = "+ Arrays.toString(arreglo));
        }*/
    }
    
}
