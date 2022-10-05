/*
*   TIPOS DE JUGADORES
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum FIFA {//cuantos jugadores hay en cada posicion
    Portero(1),
    Lateral(2),
    DefensaCentral(2),
    MedioCentro(3),
    Extremo(2),
    Delantero(1);
    
    private final int numJugadores;
    
    //CONSTRUCTOR DE ENUM
    private FIFA(int numJugadores) {
      this.numJugadores = numJugadores;
   }
    
    
}
