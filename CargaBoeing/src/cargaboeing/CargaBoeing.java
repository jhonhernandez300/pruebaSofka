/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaboeing;

import java.util.Scanner;

/**
 *
 * @author prueba
 */
public class CargaBoeing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bContinuar = true;
        double pesoBulto = 0.0;
        double valorPorKiloDelBulto = 0.0;
        int numeroTotalDeBultos = 0;
        double pesoBultoMasPesado = 0.0;
        double pesoBultoMasLiviano = 9999999.0;
        double pesoPromedioDeLosBultos = 0.0;
        double ingresoEnPesosPorCarga = 0.0;
        double ingresoEnDolaresPorCarga = 0.0;
        double capacidadDeCarga = 0.0;
        double pesoTotalDeBultos = 0.0;
        double[] tablaDeSeguimiento = new double[15];

        System.out.println("Carga Boeing");
        //System.out.println("Para salir digite cinco nueves: 99999");
        Scanner scan = new Scanner(System.in);

        //while (bContinuar == true) {
        for (int i = 1; i <= 15; i++) {
            pesoBulto = pesoBulto + 5;
            //System.out.println("Ingresar peso del bulto en kilos");
            //pesoBulto = scan.nextDouble();

            //if (pesoBulto != 99999) {
            if (capacidadDeCarga <= 18000) {
                if (pesoBulto <= 500) {
                    if (pesoBulto >= 0 && pesoBulto <= 25) {
                        valorPorKiloDelBulto = 0.0;
                    } else if (pesoBulto >= 26 && pesoBulto <= 300) {
                        valorPorKiloDelBulto = 1500 * pesoBulto;
                    } else if (pesoBulto >= 301 && pesoBulto <= 500) {
                        valorPorKiloDelBulto = 2500 * pesoBulto;
                    }
                    numeroTotalDeBultos += 1;

                    if (pesoBultoMasPesado < pesoBulto) {
                        pesoBultoMasPesado = pesoBulto;
                    }//
                    if (pesoBultoMasLiviano > pesoBulto) {
                        pesoBultoMasLiviano = pesoBulto;
                    }
                    //System.out.println("valorPorKiloDelBulto " + valorPorKiloDelBulto);
                    ingresoEnPesosPorCarga = ingresoEnPesosPorCarga + valorPorKiloDelBulto;
                    pesoTotalDeBultos = pesoTotalDeBultos + pesoBulto;
                    System.out.println("Peso bulto " + pesoBulto);

                } else {
                    System.out.println("El peso no puede superar 500 kg");
                }
            } else {
                System.out.println("No se pudo ingresar porque se llegó a la capacidad máxima: 18000 kg");
            }
        }

        //}else{bContinuar = false;}
        pesoPromedioDeLosBultos = pesoTotalDeBultos / numeroTotalDeBultos;
        ingresoEnDolaresPorCarga = ingresoEnPesosPorCarga / 3500;

        System.out.println(
                "número total de bultos " + numeroTotalDeBultos);
        System.out.println(
                "Peso del bulto más pesado " + pesoBultoMasPesado);
        System.out.println(
                "peso del bulto más liviano " + pesoBultoMasLiviano);
        System.out.println(
                "peso promedio de los bultos " + pesoPromedioDeLosBultos);
        System.out.println(
                "Ingreso en pesos " + ingresoEnPesosPorCarga);
        System.out.println(
                "Ingreso en dólares " + ingresoEnDolaresPorCarga);

    }
    
}
