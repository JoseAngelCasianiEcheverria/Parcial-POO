package Proyecto_Censo;

import java.util.*;

public class Censo {

    public static void main(String[] args) {
        Sistema_Censo sistema = new Sistema_Censo();
        
        Provincia prov = new Provincia(1, "Provincia de Bolivar", "13");
        Municipio muni = new Municipio(1, "Cartagena", "13034");
        
        Persona person = new Persona(1, "Jose", "Casiani", new Date(), muni, 18, 1.60, "M","Universitario","Reservista", "10043558", new Date());
        sistema.registrarPersona(person);
        
        System.out.println("Bienvenido al sistema de Censo");
        person.mostrarInfo();
       
        Persona buscar = sistema.buscar_Persona("10043558");
        if(buscar != null){
            buscar.mostrarInfoPBuscada();
        }else{
            System.out.println("La persona no fue encontrada");
        }
    }
}
