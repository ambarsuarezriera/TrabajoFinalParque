
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_entrada;
    @OneToOne
    Cliente clie;
    @OneToOne
    Juego jue;

    public Entrada() {
    }

    public Entrada(int id_entrada, Cliente clie, Juego jue) {
        this.id_entrada = id_entrada;
        this.clie = clie;
        this.jue = jue;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public Juego getJue() {
        return jue;
    }

    public void setJue(Juego jue) {
        this.jue = jue;
    }
    
    
}
