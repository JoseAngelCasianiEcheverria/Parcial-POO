
package Proyecto_Censo;


import java.util.Date;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private Municipio lugar_nacimiento;
    private int edad;
    private double estatura;
    private String sexo;
    private String nivel_estudios;
    private String situacion_militar; 
    private String dni;
    private Date fecha_registro;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, Date fecha_nacimiento, Municipio lugar_nacimiento, int edad, double estatura, String sexo, String nivel_estudios, String situacion_militar, String dni, Date fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.nivel_estudios = nivel_estudios;
        this.situacion_militar = situacion_militar;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
    public void mostrarInfo(){
    System.out.println("\nSU INFROMACION");
    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Fecha de Nacimiento: " + fecha_nacimiento);
    System.out.println("Lugar de Nacimiento: " + lugar_nacimiento);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Estatura: " + estatura + " cm");
    System.out.println("Sexo: " + sexo);
    System.out.println("Nivel de Estudios: " + nivel_estudios);
    System.out.println("Situacion Militar: " + situacion_militar);
    System.out.println("DNI: " + dni);
    System.out.println("Fecha de Registro: " + fecha_registro);
    }
    
    public void mostrarInfoPBuscada(){
    System.out.println("\nLA INFORMACION DE LA PERSONA QUE BUSCO ES: ");
    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Fecha de Nacimiento: " + fecha_nacimiento);
    System.out.println("Lugar de Nacimiento: " + lugar_nacimiento);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Estatura: " + estatura + " cm");
    System.out.println("Sexo: " + sexo);
    System.out.println("Nivel de Estudios: " + nivel_estudios);
    System.out.println("Situacion Militar: " + situacion_militar);
    System.out.println("DNI: " + dni);
    System.out.println("Fecha de Registro: " + fecha_registro);
    }
    
}
