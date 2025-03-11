package Proyecto_Censo;

import java.util.ArrayList;
import java.util.List;


public class Sistema_Censo {
    private List<Persona> personas = new ArrayList<>();
    private List<Municipio> municipios = new ArrayList<>();
    private List<Distrito> distritos = new ArrayList<>();
    private List<Residencia> residencias = new ArrayList<>();
    private List<Provincia> provincias = new ArrayList<>();
    
    public void registrarPersona(Persona persona){
        personas.add(persona);
    }
    
    public void registrarMunicipio(Municipio municipio){
        municipios.add(municipio);
    }
    
    public void registrarResidencia(Residencia residencia){
       residencias.add(residencia);
    }
    
    public void registrarProvincincia(Provincia provincia){
        provincias.add(provincia);
    }
    
    public Persona buscar_Persona(String dni){
        for(Persona p : personas){
            if((p.getDni()).equals(dni)){
                return p;
            }
        }
        return null;
    }
}
