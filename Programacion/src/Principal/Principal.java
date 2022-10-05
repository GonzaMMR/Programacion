/*
    Trabajando con enumeraciones
 */
package Principal;

import enumeracion.Continentes;
import enumeracion.Dias;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        //SaberDia();
        System.out.println("Mi primer dia de la semana es el: "+ Dias.LUNES);
        DiasSanti(Dias.MARTES);
        
        //Asignacion directa a traves de un enum
        Dias miDia = Dias.JUEVES;
        
        //asignacion de un dia en base a un String a traves de ValueOf
        Dias miSegundoDia = Dias.valueOf("VIERNES");
        
        //declaracion de un listado de dias inicializado con los values de mi Enum
        Dias [] todosMisDias = Dias.values();
        
        //imprimo el contenido de mi listado de dias
        for (Dias d: todosMisDias) {
            System.out.println("d = " + d);
        }
        
        //Visualizando un pais
        System.out.println("Continente... " + Continentes.AMERICA);
        System.out.println("Numero de paises de America: "+ Continentes.AMERICA.getNumPaises());
        
    }
    public static void SaberDia(){
        int num;
        System.out.print("Introduzca un número(dia de la semana)  ");
        num = ent.nextInt();
        if (num==1) {
            System.out.println("Es "+ Dias.LUNES);
        }else if (num==2) {
            System.out.println("Es "+ Dias.MARTES);
        }else if (num==3) {
            System.out.println("Es "+ Dias.MIERCOLES);
        }else if (num==4) {
            System.out.println("Es "+ Dias.JUEVES);
        }else if (num==5) {
            System.out.println("Es "+ Dias.VIERNES);
        }else if (num==6) {
            System.out.println("Es "+ Dias.SABADO);
        }else if (num==7) {
            System.out.println("Es "+ Dias.DOMINGO);
        }else{
            System.out.println("SOLO HAY 7 DIAS EN LA SEMANA");
        }
        
    }
     
    public static void DiasSanti(Dias dias){
        switch (dias) {
            case LUNES:
                    System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                    System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                    System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                    System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                    System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                    System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                    System.out.println("Septimo dia de la semana");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
