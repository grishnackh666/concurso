
package concurso;

import static concurso.Concurso.envios_equipos_participantes;
import static concurso.Concurso.equipos_participantes;
import java.util.List;



public class Envios {
    private final String nombre_de_equipo;
    private final int num_problema;
    private final String respuesta_al_problema;

    public Envios(String nombre_de_equipo, int num_problema, String respuesta_al_problema) {
        this.nombre_de_equipo = nombre_de_equipo;
        this.num_problema = num_problema;
        this.respuesta_al_problema = respuesta_al_problema;
    }
    
    public List<Envios> registrar_envios(String nombre_del_equipo,int el_numero_de_problema,String respuesta){
        
        if(equipos_participantes.contains(nombre_del_equipo)==true && el_numero_de_problema>=0 && respuesta != null && !respuesta.equals("")){
            Envios p=new Envios(nombre_del_equipo,el_numero_de_problema,respuesta);
            envios_equipos_participantes.add(p);
            
            return envios_equipos_participantes;
        }
        
        return null;
    }

    public String getNombre_de_equipo() {
        return nombre_de_equipo;
    }
}
