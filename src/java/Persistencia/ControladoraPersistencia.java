
package Persistencia;

import Logica.Empleado;
import Logica.Usuario;


public class ControladoraPersistencia {
    
    EmpleadoJpaController jpaEmple = new EmpleadoJpaController();
    //cree en la controladoraPersistencia un objeto jpaUsu de UsuarioJpaController
    UsuarioJpaController jpaUsu = new UsuarioJpaController();
    ClienteJpaController jpaCli = new ClienteJpaController();
    EntradaJpaController jpaEntr = new EntradaJpaController();
    HorarioJpaController jpaHor = new HorarioJpaController();
    JuegoJpaController jpaJue = new JuegoJpaController();
    
    
    //cambie el orden de los metodos para crear empleao y usuario. antes estaban
    //crearEmpleado primero y luego crearUsuario y andaba.
    
    //esto lo creo directamente yo lo q coloque fue el jpaUsu.create(usu);
    public void crearUsuario(Usuario usu) {
        
        jpaUsu.create(usu);
    }
    
    public void crearEmpleado(Empleado emple){
        
        jpaEmple.create(emple);
        
    }

    
    
    
    
}
