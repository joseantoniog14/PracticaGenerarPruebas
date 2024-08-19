package com.example.practicagenerarpruebas;

import junit.framework.TestCase;

import org.junit.Test;

public class OperacionesTest extends TestCase {
    private Operaciones operaciones;

    public void setUp() throws Exception {
        operaciones=new Operaciones();
    }

    @Test
    public void carga(){
        assertNotNull(operaciones);
    }

    /**
     * Funcion de TEST para la funcion que convierte de Millas a Kilómetros
     */
    public void testMaK() {
        assertEquals("1,61",operaciones.MaK("1"));
        assertEquals("160,93",operaciones.MaK("100"));
        assertEquals("32,19",operaciones.MaK("20"));
        assertEquals("-160,93",operaciones.MaK("-100"));
        assertEquals("12,87",operaciones.MaK("8"));
        assertEquals("Error",operaciones.MaK("Texto"));
    }

    /**
     * Funcion de TEST para la funcion que convierte de Kilómetros a Millas
     */
    public void testKam() {
        assertEquals("1,00",operaciones.KaM("1.60934"));
        assertEquals("100,00",operaciones.KaM("160.934"));
        assertEquals("20,00",operaciones.KaM("32.1869"));
        assertEquals("-100,00",operaciones.KaM("-160.934"));
        assertEquals("8,00",operaciones.KaM("12.8748"));
        assertEquals("Error",operaciones.KaM("Texto"));
    }

    /**
     * Funcion de TEST para la funcion que convierte de Celsius a Fahrenheit
     */
    public void testCaF() {
        assertEquals("32,00",operaciones.CaF("0"));
        assertEquals("212,00",operaciones.CaF("100"));
        assertEquals("68,00",operaciones.CaF("20"));
        assertEquals("-148,00",operaciones.CaF("-100"));
        assertEquals("46,40",operaciones.CaF("8"));
        assertEquals("Error",operaciones.CaF("Texto"));
    }

    /**
     * Funcion de TEST para la funcion que convierte de Fahrenheit a Celsius
     */
    public void testFaC() {
        assertEquals("0,00",operaciones.FaC("32"));
        assertEquals("100,00",operaciones.FaC("212"));
        assertEquals("20,00",operaciones.FaC("68"));
        assertEquals("-100,00",operaciones.FaC("-148"));
        assertEquals("8,00",operaciones.FaC("46.4"));
        assertEquals("Error",operaciones.FaC("Texto"));
    }

    /**
     * Funcion de TEST para la funcion que convierte de KB a MB
     */
    public void testKBaMB() {
        assertEquals("0",operaciones.pasarKBaMB("100"));
        assertEquals("1",operaciones.pasarKBaMB("1024"));
        assertEquals("2",operaciones.pasarKBaMB("2048"));
        assertEquals("9",operaciones.pasarKBaMB("9216"));
    }
}
