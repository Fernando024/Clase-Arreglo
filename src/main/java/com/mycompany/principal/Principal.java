/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import java.util.Scanner;

/**
 *
 * @author MargaritaT
 */
public class Principal {

    public static void main(String[] args) {
        int condicion=1;
        
        Scanner entrada =new Scanner(System.in);
        //Arreglo  alumno=new Arreglo(2);
        Arreglo  alumno[] ={new Arreglo(5)};//se le asigna el tamaño del arreglo y se crea el objeto 
        
        
        //Se le asigna el tamaño desde el contructor que inicializa 
        
        System.out.println("Tamanio del Arreglo");
        System.out.println(alumno[0].getTamanio());
        
        //se le asigna el indice y el valor 
           for(int i=0;i<5;i++)
    {
        if(i==0)
        {
             alumno[i].setElemento(1,"Fernando");
        System.out.println(alumno[0]);
        }
        if(i==1)
        {
            alumno[i].setElemento(2,"Gabriel");
        System.out.println(alumno[1]);
        }
       if(i==2)
       {
           alumno[i].setElemento(3,"Celena");
        System.out.println(alumno[2]);
       }
       if(i==3)
       {
           alumno[i].setElemento(4,"Mariana");
        System.out.println(alumno[3]);
       }
        if(i==4)
        {
            
              alumno[i].setElemento(5,"Francisco");
        System.out.println(alumno[4]);
        }
      
    }
       
        System.out.println("Si deseaa limpiar el arreglo tecle 1");
        System.out.println("====================================");
        condicion =entrada.nextInt();
        if(condicion==1)
        {
            //Limpia cada uno de los campos que se les asigno el nombre 
            alumno[0].limpiar(null);
            alumno[1].limpiar(null);
            alumno[2].limpiar(null);
            alumno[3].limpiar(null);
            alumno[4].limpiar(null);
           
            
            System.out.println("Vaciado con exito");
            System.out.println(alumno[0]);
            System.out.println(alumno[1]);
            System.out.println(alumno[2]);
            System.out.println(alumno[3]);
            System.out.println(alumno[4]);
        }
    }
}
