
package Logica;

import static Logica.Empleado_.usua;//esto lo puse quitar si no sale bien
import Persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia cotrolPersist = new ControladoraPersistencia();
    
    //desde el servlet cree esto control.crearUsuario(login, contrasena); y directamente
    //me creo en la controladora este metodo
    //para poder hacer la relacion cambie el orden crearUsuario primero y luego empleado
    //si anda mal cambiar
    public Usuario crearUsuario(String login, String contrasena) {
        
        Usuario usu = new Usuario();
        usu.setLogin(login);
        usu.setContrasena(contrasena);
        
        cotrolPersist.crearUsuario(usu);
        
        return usu;
    }
    

    public void crearEmpleado(String nombre, String apellido, String direccion, String cargo, int edad, Usuario usua) {
       
        Empleado emp = new Empleado();
        
        emp.setNombre(nombre);
        emp.setApellido(apellido);
        emp.setDireccion(direccion);
        emp.setCargo(cargo);
        emp.setEdad(edad);
        emp.setUsua(usua);
        
        
        
        
        cotrolPersist.crearEmpleado(emp);
        
        //esto me lo arrojo netbean me decia crear una variable local e inicializarla
        //si no da tendria q hacer una variable afuera 
        //Usuario usu = null;
        //emp.setUsua(usu);
    }
    
    
}
