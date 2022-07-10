/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import java.util.Arrays;
import java.util.Random;
import org.jfree.ui.RefineryUtilities;

import graficas.JFreeXY;
/**
 *
 * @author VILAN
 */
public class MetroCSV {

    public static final String delimiter = ",";
    public static final String csv = "C:\\Users\\VILAN\\Documents\\Tesis\\Metro\\Nuevo con Adalberto y Gerardo\\Afluencia del metro\\afluenciastc_desglosado_02_2022.csv";
    
    public static void main(String[] args) {
        
        //fileCSV archivo = new fileCSV(csv, delimiter);
        
        //archivo.readFile();
        
        // Generar grafica de distribucion Normal
        
        System.out.println("Distribution Normal");
        distributionNormal d = new distributionNormal(19);
        JFreeXY chartNormal = new JFreeXY("Distribution Normal", d.findCutPointGauss(), 19);
        chartNormal.pack();
        RefineryUtilities.centerFrameOnScreen(chartNormal);
        chartNormal.setVisible(true);
        
        // generar arreglo
        //d.findCutPointGauss();
        
        //d.imprimirArray();
        //System.out.println();
        // Generar grafica de distribucion Poisson
        System.out.println("Distribution Poisson");
        distributionPoisson dp = new distributionPoisson(19);
        JFreeXY chartPoisson = new JFreeXY("Distribution Poisson", dp.poissonDis(), 19);
        //double array[]=dp.poissonDis();
        chartPoisson.pack();
        RefineryUtilities.centerFrameOnScreen(chartPoisson);
        chartPoisson.setVisible(true);
        //System.out.println("array = "+Arrays.toString(array));
        //System.out.println();
       
        // Generar grafica de distribucion Uniform
        System.out.println("Distribution Uniform");
        distributionUniformReal u = new distributionUniformReal(19);
        JFreeXY chartUniform = new JFreeXY("Distribution Uniform", u.uniformDistribution(), 19);
        chartUniform.pack();
        RefineryUtilities.centerFrameOnScreen(chartUniform);
        chartUniform.setVisible(true);
        //double array2[] = u.uniformDistribution();
        
        //System.out.println("array2 = "+ Arrays.toString(array2));*/
        
        /*for(int i =0; i < 10; i++){
            double arreglo[];
            
            arreglo = optionRandom();
            System.out.println("arreglo = "+ Arrays.toString(arreglo));
        }*/
    }
    
}
