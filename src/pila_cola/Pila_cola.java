/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_cola;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author HP
 */
public class Pila_cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack generar_pila = new Stack();
       
       ArrayList<Integer> list= new ArrayList<>();
        while(list.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            list.add(random);
        }
         System.out.println("Metodo Cola");
         System.out.println("Hay: "+list.size()+" numeros en el array");
         //System.out.println(list);
         
         
         generar_pila.push(list);
         //System.out.println(generar_pila);
         if(generar_pila.empty() == false){
             System.out.println("Se ingresaron los numeros a la pila");
             generar_pila.pop();
             if(generar_pila.empty() == true){
                 System.out.println("Se vacio la pila");
             }
         }
         
        
         
         Queue cola = new LinkedList<>();
         System.out.println("Metodo Pila:");
         System.out.println("Hay: "+list.size()+" numeros en el array");
         cola.offer(list);
         //System.out.println(cola); 
         if(!cola.isEmpty()) {
             System.out.println("Se ingresaron los numeros a la cola");
             cola.poll();
             if(cola.isEmpty()){
                 System.out.println("Se vacio la cola");
             }
        } 
    
}
}
