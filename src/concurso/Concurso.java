
package concurso;

import java.util.ArrayList;
import java.util.List;

public class Concurso {

    private String nombre;
    private final int num_problemas;
    static List<String> equipos_participantes = new ArrayList<String>();
    private int numero_equipos;
    static List<Envios> envios_equipos_participantes = new ArrayList<Envios>();

    public Concurso(String nombre, int num_problemas) {
        this.nombre = nombre;
        this.num_problemas = num_problemas;
    }

    public Concurso(String nombre) {
        this.num_problemas = 5;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_problemas() {
        return num_problemas;
    }
    
    
    
    public void añadir_equipo(String... equipos){
        int j=0;
        for (int i = 0; i <= equipos_participantes.size() - 1; i++) {
            	
                if(equipos_participantes.contains(equipos[j])==false){
                    equipos_participantes.add(equipos[j]);
                }
            j++;
        }
    }
    
    public boolean eliminar_equipo(String equipo){
        
        if(equipos_participantes.contains(equipo)==true){
            Envios p;
            equipos_participantes.remove(equipo);
                for(Envios cadena : envios_equipos_participantes){
                    if(cadena.getNombre_de_equipo()==equipo){
                        envios_equipos_participantes.remove(cadena);
                    }
                }
            
            return true;
        }
            
        
        
        return false;
    }
     
    
    public static void main(String[] args) {
       
       Concurso concurso1 = new Concurso("Sesión 1",2);  
       Concurso concurso2 = new Concurso("Sesión 2",3); 
       Concurso concurso3 = new Concurso("Sesión 3",3); 
       
       ArrayList lista = new ArrayList();
       lista.add(concurso1);
       lista.add(concurso2);
       lista.add(concurso3);
       
       for(Concurso cadena: lista){
          System.out.println(cadena);
            Equipo equipos1 = new Equipo(1,2);  
            Equipo equipos2 = new Equipo(1,2); 
            Equipo equipos3 = new Equipo(1,2); 
            ArrayList Equipo = new ArrayList();
            Equipo.add(equipos1);
            Equipo.add(equipos2);
            Equipo.add(equipos3);
       }
       
       
       
       
}
        
}
    

