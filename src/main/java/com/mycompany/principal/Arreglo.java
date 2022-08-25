/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author MargaritaT
 */
public class Arreglo {
    private int indice;
    private String nombreAlumno;//Valor
    private int tamanioArreglo=5;
   

    //Constructor
    public Arreglo(int tamanioArreglo)
    {
        this.tamanioArreglo=tamanioArreglo;
       
    }
    
    //Obtenemos el tamaño del arreglo 
    public int getTamanio()
    {
        return tamanioArreglo;
    }
    
    
    //Estableceros los valores y posicion de datos para rellenar el arreglo 
    public void setElemento(int indice,String nombreAlumno)
    {
        
        this.indice=indice;
        this.nombreAlumno=nombreAlumno;
        
    }
    
    //Obtenemos el tamaño del arreglo 
    public int getIndice()
    {
        return indice;
    }
    
    
        //Limpia el valor que tiene el arreglo (en este caso el nombre)
    public String limpiar(String nombreAlumno)
    {
        return this.nombreAlumno=nombreAlumno;//Regresara el campo de nombre en blanco
        
    }
    
    //establece el orden en el que aparece los datos del arreglo
    @Override
    public String toString()
    {
        return "Indice: "+indice+"\nNombre del alumno: "+nombreAlumno;
    }
    
}
