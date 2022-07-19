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
public class DataCSV {
    
    // atributos
    int id;
    String date;  // fecha
    int day;   // dia
    String month; // mes
    int year;  // año
    String line;  // linea
    String station;  // estación
    int a_boleto;    // afluencia boleto
    int a_prepago;   // afluencia prepago
    int a_gratuidad; // afluencia gratuitad 
    int a_total;     // total de afluencia en el dia

    // Constructor
    public DataCSV(int id, String date, int day, String month, int year, String line, 
                   String station, int a_boleto, int a_prepago, int a_gratuidad, 
                   int a_total) {
        this.id = id;
        this.date = date;
        this.day = day;
        this.month = month;
        this.year = year;
        this.line = line;
        this.station = station;
        this.a_boleto = a_boleto;
        this.a_prepago = a_prepago;
        this.a_gratuidad = a_gratuidad;
        this.a_total = a_total;
    }

    @Override
    public String toString() {
        return "DataCSV{" +"id = " + id + "date=" + date + ", day=" + day + ", month=" + month 
                + ", year=" + year + ", line=" + line + ", station=" + station 
                + ", a_boleto=" + a_boleto + ", a_prepago=" + a_prepago 
                + ", a_gratuidad=" + a_gratuidad + ", a_total=" + a_total + '}';
    }
}
