/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class TestingQuickSort {
    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo = {5,11,7,15,4,12,4,45,1,3,5,7,6};
        Arreglo a = new Arreglo();
        a.ordenarQuicksort(arreglo);
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
