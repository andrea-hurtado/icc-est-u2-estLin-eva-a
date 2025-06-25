package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public static void invertirColaNombres (Queue<String> colaNombres){

        Stack<String> pila = new Stack<>();
        
        while (!colaNombres.isEmpty()) {
            pila.push(!colaNombres.isEmpty());
        }
        while (!pila.isEmpty()){
            colaNombres.add(pila.pop());
        }
                    colaNombres.add(pila.pop());
                }
                System.out.println("Salida esperada (Impresa):" + colaNombres);

        return new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Queue<String> nombres = LinkedList<>();
               nombres.add("Ana");
               nombres.add("Luis");
               nombres.add("Marta");

               invertirColaNombres(nombres);
        
        return false;
    }

}
