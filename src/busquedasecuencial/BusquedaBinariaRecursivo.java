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
public class BusquedaBinariaRecursivo {
    public int busquedaBinaria(int arreglo[],int dato, int i, int j){
        int medio;
        if (i>j) return -1;
            medio = (i+j) / 2;
            if (arreglo[medio] < dato) return busquedaBinaria(arreglo,dato,medio+1,j);
            else if (arreglo[medio] > dato) return busquedaBinaria(arreglo,dato,i,medio-1);
            else return medio;
     }
}
