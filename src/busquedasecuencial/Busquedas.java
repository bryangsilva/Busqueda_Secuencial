/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;
public class Busquedas {
    public static void main(String[] args) {
        int [] arreglo={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        int dato = 70;
        BusquedaSecuencial secuencial = new BusquedaSecuencial();
        BusquedaBinariaIterativo iterativo = new  BusquedaBinariaIterativo();
        BusquedaBinariaRecursivo recursivo= new BusquedaBinariaRecursivo();
        if(recursivo.busquedaBinaria(arreglo, dato,0,arreglo.length-1)==-1){
            System.out.println("El dato no existe en el arreglo");
        }
        else{
            System.out.println("El dato esta en la posición: "+recursivo.busquedaBinaria(arreglo, dato, 0, arreglo.length-1));
        }
    }
 
}
