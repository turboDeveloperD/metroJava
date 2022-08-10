/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;


import Distributions.distributionBinomial;
import Distributions.distributionNormal;
import Partitions.DataCSV;
import Partitions.Partition;
import Partitions.Percentage;
//import Partitions.porcetajes;
import distributionuniform2.distributionUniformRealNew;
import graficas.JFreeArrays;
import org.jfree.ui.RefineryUtilities;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author VILAN
 */
public class MetroCSV {

    public static final String delimiter = ",";
    public static final String csv = "C:\\Users\\VILAN\\Documents\\NetBeansProjects\\MetroCSV_1\\afluenciastc_desglosado_02_2022.csv";
    
    public static void main(String[] args) {
        
        fileCSV archivo = new fileCSV(csv, delimiter);
        
        archivo.readFile();
        
        // Generar grafica de distribucion Normal
        
        /*System.out.println("Distribution Normal");
        distributionNormal d = new distributionNormal(19);
        JFreeXY chartNormal = new JFreeXY("Distribution Normal", d.findCutPointGauss(), 19);
        chartNormal.pack();
        RefineryUtilities.centerFrameOnScreen(chartNormal);
        chartNormal.setVisible(true);*/
        
        // generar arreglo
        //d.findCutPointGauss();
        
        //d.imprimirArray();
        //System.out.println();
        
        // Generar grafica de distribucion Poisson
        /*System.out.println("Distribution Poisson");
        distributionPoisson dp = new distributionPoisson(19);
        JFreeXY chartPoisson = new JFreeXY("Distribution Poisson", dp.poissonDis(), 19);
        //double array[]=dp.poissonDis();
        chartPoisson.pack();
        RefineryUtilities.centerFrameOnScreen(chartPoisson);
        chartPoisson.setVisible(true);*/
        //System.out.println("array = "+Arrays.toString(array));
        //System.out.println();
       
        //Generar grafica de distribucion Uniform
        /*System.out.println("Distribution Uniform");
        distributionUniformReal u = new distributionUniformReal(19);
        JFreeXY chartUniform = new JFreeXY("Distribution Uniform", u.uniformDistribution(), 19);
        chartUniform.pack();
        RefineryUtilities.centerFrameOnScreen(chartUniform);
        chartUniform.setVisible(true);*/
        //double array2[] = u.uniformDistribution();
        
        //System.out.println("array2 = "+ Arrays.toString(array2));*/
        
        /*for(int i =0; i < 10; i++){
            double arreglo[];
            
            arreglo = optionRandom();
            System.out.println("arreglo = "+ Arrays.toString(arreglo));
        }*/
        
        
        /*Menu*/
        
        Scanner read = new Scanner(System.in);
        Scanner itemRead = new Scanner(System.in);
        int option;
        do{
            System.out.println("Menu");
            System.out.println("1 Generar grafica");
            System.out.println("2 Varias graficas");
            System.out.print("0 Salir:");
            option=read.nextInt();
            
            switch(option){
                case 0:
                    System.out.println("\tFin del programa\n\n");
                break;
                
                case 1:
                    System.out.print("\tPruebas case1");
                    //System.out.print("\tIngrese el numero de elemento para graficar [1 - 82680]:");
                    //int item = itemRead.nextInt();
                    
                    /*Partition itemPartititon = archivo.arrayPartition.get(item);
                    System.out.println(itemPartititon.toString());
                    String name = itemPartititon.getName();
                    JFreeXY chart = new JFreeXY(name, itemPartititon.getArrayhour(), 19);
                    chart.pack();
                    RefineryUtilities.centerFrameOnScreen(chart);
                    chart.setVisible(true);*/
                break;
                
                case 2:
                    System.out.print("\tPruebas case2");
                    System.out.print("\tIngrese el numero de elemento para graficar [0 - 82680]:");
                    int item2 = itemRead.nextInt();
                    
                    do{
                        if( item2 < 0 ){
                            System.out.print("\tError ingrese numeros en el intervalo [0 - 82680]:");
                            item2 = itemRead.nextInt();
                        }
                    }while( item2 < 0 );
                    
                    Partition itemPartititon2 = archivo.arrayPartition.get(item2);
                    DataCSV itemSelect = archivo.arrayData.get(item2);
                    
                    /* Datos*/
                    int idItem = itemSelect.getId();
                    String stationItem = itemSelect.getStation();
                    int totalItem = itemSelect.getA_total();
                    
                    System.out.println("idItem:"+idItem+"\n"+"stationItem:" + stationItem+ "\n" + "totalItem:" + totalItem);
                    
                    /* Generar arreglos */
                    distributionNormal n = new distributionNormal(19);
                    distributionUniformRealNew uU = new distributionUniformRealNew(19, totalItem);
                    distributionBinomial b = new distributionBinomial(19);
                    
                    double arrayn[] = n.findCutPointGauss();
                    double arrayuu[] = uU.uniformDistributionMe();
                    double arrayb[] = b.findCutPointDistribution();
                    
                    /*Generar Particiones*/
                    Partition pn = new Partition(idItem, stationItem, totalItem, arrayn);
                    Partition pUU = new Partition(idItem, stationItem, totalItem, arrayuu);
                    Partition pb = new Partition(idItem, stationItem, totalItem, arrayb);
                    
                    pn.generateData();
                    //pUU.generateData();
                    pb.generateData();
                    
                    /*double aan[] = pn.getArrayhour();
                    double aab[] = pb.getArrayhour();
                    
                    double uniforme=0;
                    double binomial=0;
                    
                    for(int cont = 0; cont < 19; cont++)
                    {
                        uniforme += aan[cont];
                        binomial += aab[cont];
                    }
                    
                    System.out.println("total normal:" + uniforme);
                    System.out.println("total binomial:" + binomial + "\n");
                    
                    System.out.println("normal: " + Arrays.toString(pn.getArrayhour()) );
                    System.out.println("uniformeU: " + Arrays.toString(pUU.getPercentajes()) );
                    System.out.println("binomial: " + Arrays.toString(pb.getArrayhour()) );*/
                    
                    
                    
                    JFreeArrays charts = new JFreeArrays(stationItem,
                                                                     pn.getArrayhour(), "Normal",
                                                                     pUU.getPercentajes(), "Uniform",
                                                                     pb.getArrayhour(), "Binomial",
                                                        19);
                    charts.pack();
                    RefineryUtilities.centerFrameOnScreen(charts);
                    charts.setVisible(true);
                    
                    /*Partition pd = new Partition(option, csv, option, arrayb);
                    
                    
                    System.out.println(itemPartititon2.toString());
                    String name2 = itemPartititon2.getName();
                    List<Partition> itemPartitionGraph = archivo.getArrayPartitionGraph(itemPartititon2.getId());
                    JFreeArrays charts = new JFreeArrays(name2, 
                                                                itemPartitionGraph.get(0).getPercentajes(), "Normal", 
                                                                itemPartitionGraph.get(1).getPercentajes(), "Binomial", 
                                                                itemPartitionGraph.get(2).getPercentajes(), "Uniform", 
                                                        19);
                    charts.pack();
                    RefineryUtilities.centerFrameOnScreen(charts);
                    charts.setVisible(true);*/
                break;

                
                default:
                    System.out.println("Seleccione una opcion porfavor\n\n");
                break;
            }
            
        }while(option != 0);
        
    }
    
}
