
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_juego;
    @Basic
    String nombre_juego;
    @OneToMany
    List <Usuario> listUsuario;
    @OneToMany
    List <Horario> listHorario;

    public Juego() {
    }

    public Juego(int id_juego, String nombre_juego, List<Usuario> listUsuario, List<Horario> listHorario) {
        this.id_juego = id_juego;
        this.nombre_juego = nombre_juego;
        this.listUsuario = listUsuario;
        this.listHorario = listHorario;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public List<Horario> getListHorario() {
        return listHorario;
    }

    public void setListHorario(List<Horario> listHorario) {
        this.listHorario = listHorario;
    }
    
    
    
}
