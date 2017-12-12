/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

/**
 *
 * @author Bryan
 */
public class BusquedaBinariaIterativo {
     public int busquedaBinaria(int  arreglo[], int dato){
        int n = arreglo.length;
        int centro,inf=0,sup=n-1;
        while(inf<=sup){
             centro=(sup+inf)/2;
            if(arreglo[centro]==dato) return centro;
            else if(dato < arreglo [centro] ){
               sup=centro-1;
             }
            else {
              inf=centro+1;
            }
            }
        return -1;
    }
}
