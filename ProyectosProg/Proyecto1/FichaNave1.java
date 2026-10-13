/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 * Clase principal que genera la ficha oficial de estado de la nave "Astra-9" 
 * y de su piloto antes del despegue, leyendo los datos por consola.
 * 
 * @author Alumno A (Oficial de Vuelo) y Alumno B (Oficial de Telecomunicaciones)
 * @version 2.0
 */
public class FichaNave1 {

    public static void main(String[] args) {
        
        // Objeto Scanner para la lectura de datos por teclado
        Scanner teclado = new Scanner(System.in);

        final double CAPACIDAD_MAXIMA_LITROS = 2000.0;
        final double CONSUMO_POR_AÑO_LUZ = 180.5;


        System.out.print("Introduce el nombre del piloto: ");
        String nombrePiloto = teclado.nextLine();

        System.out.print("Introduce el rango del piloto (ej: C para Capitán): ");
        char rangoPiloto = teclado.next().charAt(0);

        System.out.print("Introduce el nivel de experiencia inicial (ej: 5): ");
        int nivelExperiencia = teclado.nextInt();

        System.out.print("Introduce el combustible actual en litros (ej: 1450.75): ");
        double combustibleActual = teclado.nextDouble();

        System.out.print("¿Están los sistemas listos? (true/false): ");
        boolean sistemasListos = teclado.nextBoolean();
        
        nivelExperiencia++;
        
// Cálculo de los años luz (con decimales)
double anosLuzDecimal = combustibleActual / CONSUMO_POR_AÑO_LUZ;

// Cálculo del porcentaje de tanque lleno
double porcentajeTanque = (combustibleActual / CAPACIDAD_MAXIMA_LITROS) * 100;


int anosluzEnteros = (int) anosLuzDecimal;

       

        
