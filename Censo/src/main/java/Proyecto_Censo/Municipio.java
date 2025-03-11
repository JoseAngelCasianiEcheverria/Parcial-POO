
package Proyecto_Censo;

public class Municipio {
    int id;
    private String nombre;
    private String codigoUnico;


    public Municipio() {
    }

    public Municipio(int id, String nombre, String codigoUnico) {
        this.id = id;
        this.nombre = nombre;
        this.codigoUnico = codigoUnico;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + codigoUnico + ")";
    }
}
