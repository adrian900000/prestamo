/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.
Valores borde
Caso 1.1:Entrada 1000. Resultado: Prestamo condecido . 
Caso 1.2: Entrada 15000. Resultado: Prestamo concedido.
Prueba equivalencia 
Caso 2.1: Entrada 500. Resultado: Prestamo no condecido carece de interes.
Caso 2.2: Entrada 2000. Resultado:Felicidades, préstamo concedido.
Caso 2.3: Entrada 16000. Resultado:Préstamo no concedido es una operación con demasiado riesgo

*/