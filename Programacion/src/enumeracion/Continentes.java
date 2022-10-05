/*
*   Enumerando los continentes
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Continentes {
    AFRICA(53, 700),
    EUROPA(46, 500),
    ASIA(44, 800),
    AMERICA(34, 900),
    OCEANIA(14, 200);
    
    //Propiedades numero de paises de cada continiete
    private final int continentes;
    private final int superficie;
    
    
    //CONSTRUCTOR DE ENUM
    private Continentes(int continentes, int superficie) {
      this.continentes = continentes;
      this.superficie = superficie;
   }


    public int getNumPaises(){
        return continentes;
    }
    
}
