
package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado"})
public class ServletEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");//esto no loo tiene la prof
        
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String direccion = request.getParameter("direccion");
    String cargo = request.getParameter("cargo");
    int edad = Integer.parseInt(request.getParameter("edad"));
    //desque a qui voy a mandar los datos a usuario (login y password)
    String login = request.getParameter("login");
    String contrasena = request.getParameter("contrasena");
    
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("direccion", direccion);
        request.getSession().setAttribute("cargo", cargo);
        request.getSession().setAttribute("edad", edad);
        //desde aqui voy a mandarle los datos a usuario (login y password)
        request.getSession().setAttribute("login", login);
        request.getSession().setAttribute("contrasena", contrasena);
        
        
        response.sendRedirect("empleadoRegistrado.jsp");
        
        Controladora control = new Controladora();
        
         //desde aqui voy a crear el usuario
        //yo lo tenia puro control.crearUsuario(login,contrasena);
        
        
        Usuario usua = control.crearUsuario(login, contrasena);
        
        //cambie de posicion primero iba el crearEmpleado
        //control.crearEmpleado(nombre, apellido, direccion, cargo, edad);
        control.crearEmpleado(nombre, apellido, direccion, cargo, edad, usua);
       
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
