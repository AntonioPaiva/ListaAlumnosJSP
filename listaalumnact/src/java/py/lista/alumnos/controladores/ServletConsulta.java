/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.lista.alumnos.controladores;

import py.lista.alumnos.impl.AlumnosImpl;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import py.lista.alumnos.modelos.Alumno;

public class ServletConsulta extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ServletConsulta() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String alumno = request.getParameter("alumno");// nombre del index 
          AlumnosImpl alumnoImpl = new AlumnosImpl();
          List<Alumno> listAlumnos = alumnoImpl.buscar();       
          HttpSession session = request.getSession();
        
          //Alumno listAlumnos = alumnoImpl.buscarAlumno();
            //request.getRequestDispatcher("/MainServlet");
        if (listAlumnos != null) {
             
            out.println(" lista " + listAlumnos.toString());
            
            session.setAttribute("alumnos", listAlumnos);
            
            request.getRequestDispatcher("/mostrar.jsp").forward(request, response);
            
            
        } else {
            
            out.println("Error.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    public static void main(String[] args) {
        AlumnosImpl alumnoImpl = new AlumnosImpl();
        List<Alumno> listAlumnos = alumnoImpl.buscar();
        
    }
}
