package com.example.practicagenerarpruebas;

import java.text.DecimalFormat;

public class Operaciones {

    /**
     * Función para pasar de Millas a Kilómetros, recibe un string, le eliminamos las letras para después devolverlo una vez hecha la operación
     * @param num es un parámetro que llega como string y después lo parseamos
     * @return Devuelve el resultado como string
     */
    public static String MaK(String num) {
        num=num.replaceAll("[*a-zA-Z]", "");
        if (num.compareTo("")==0){
            return String.valueOf("Error");
        }
        else{
            double resultado= Double.parseDouble(num)*1.60934;
            DecimalFormat df = new DecimalFormat("0.00");
            return String.valueOf(df.format(resultado));
        }
    }

    /**
     * Función para pasar de Kilómetros a Millas, recibe un string, le eliminamos las letras para después devolverlo una vez hecha la operación
     * @param num es un parámetro que llega como string y después lo parseamos
     * @return Devuelve el resultado como string
     */
    public static String KaM(String num) {
        num=num.replaceAll("[*a-zA-Z]", "");
        if (num.compareTo("")==0){
            return String.valueOf("Error");
        }
        else{
            double resultado= Double.parseDouble(num)*0.621371;
            DecimalFormat df = new DecimalFormat("0.00");
            return String.valueOf(df.format(resultado));
        }
    }

    /**
     * Función para pasar de Celsius a Fahrenheit, recibe un string, le eliminamos las letras para después devolverlo una vez hecha la operación
     * @param num es un parámetro que llega como string y después lo parseamos
     * @return Devuelve el resultado como string
     */
    public static String CaF(String num) {
        num=num.replaceAll("[*a-zA-Z]", "");
        if (num.compareTo("")==0){
            return String.valueOf("Error");
        }
        else{
            double resultado= Double.parseDouble(num)*1.8+32;
            DecimalFormat df = new DecimalFormat("0.00");
            return String.valueOf(df.format(resultado));
        }
    }

    /**
     * Función para pasar de Fahrenheit a Celsius, recibe un string, le eliminamos las letras para después devolverlo una vez hecha la operación
     * @param num es un parámetro que llega como string y después lo parseamos
     * @return Devuelve el resultado como string
     */
    public static String FaC(String num) {
        num=num.replaceAll("[*a-zA-Z]", "");
        if (num.compareTo("")==0){
            return String.valueOf("Error");
        }
        else{
            double resultado= (Double.parseDouble(num)-32)/1.8;
            DecimalFormat df = new DecimalFormat("0.00");
            return String.valueOf(df.format(resultado));
        }
    }

    /**
     * Función para pasar de KB a MB, recibe un string, le eliminamos las letras para después devolverlo una vez hecha la operación
     * @param num es un parámetro que llega como string y después lo parseamos
     * @return Devuelve el resultado como string
     */
    public static String pasarKBaMB(String num) {
        num=num.replaceAll("[*a-zA-Z]", "");
        if (num.compareTo("")==0){
            return String.valueOf("Error");
        }
        else {
            double resultado = Double.parseDouble(num) / 1024;
            DecimalFormat df = new DecimalFormat("0");
            return String.valueOf(df.format(resultado));
        }
    }
}
