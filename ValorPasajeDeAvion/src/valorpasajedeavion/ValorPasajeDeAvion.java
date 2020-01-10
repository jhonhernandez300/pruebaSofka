/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorpasajedeavion;

import java.util.Scanner;


/**
 *
 * @author prueba
 */
public class ValorPasajeDeAvion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distanciaARecorrer = 9.9;
        int numeroDiasEstancia = 0;
        double valorDescuento = 0.0;
        final double PRECIOPORKILOMETRO = 35.00;
        double valorPasajeDeAvion = 9.9;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor Pasaje De Avión");
        System.out.println("Ingrese distancia a recorer en cantidad de kilómetros");
        //distanciaARecorrer = Integer.ParseInt(scan.nextDouble());
        distanciaARecorrer = scan.nextDouble();
        System.out.println("Ingrese número de días de la estancia");
        numeroDiasEstancia = scan.nextInt();
        valorPasajeDeAvion = distanciaARecorrer * 35.00;
        
        if(distanciaARecorrer > 1000 && numeroDiasEstancia > 7){            
            valorDescuento = 0.3 * valorPasajeDeAvion;
            
        }
        valorPasajeDeAvion = valorPasajeDeAvion - valorDescuento;            
        System.out.println("Valor pasaje de avión" + valorPasajeDeAvion);
        
        
    }
    
}
