package py.lista.alumnos.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.lista.alumnos.controladores.connection.Conexion;
import py.lista.alumnos.dao.AlumnoDao;
import py.lista.alumnos.modelos.Alumno;

public class AlumnosImpl implements AlumnoDao {

    @Override
    public void insertar(Alumno dao) {
        // TODO Auto-generated method stub
    }

    @Override
    public void actualizar(Alumno dao) {
        // TODO Auto-generated method stub
    }

    @Override
    public void borrar(Alumno dao) {
        // TODO Auto-generated method stub
    }

    @Override
    public  List<Alumno> buscar() {
        List<Alumno> listAlumnos = new ArrayList<Alumno>();
        Connection conn;
        ResultSet resulset;
        Statement state;
        Alumno alumno = new Alumno();
        Integer id;
        String nroCedula;
        String nombre;
        String apellido;
        String carrera;
        String edad;
        
        // retorna la lista de los datos de la base de datos 

        try {
            String sql = "select * from alumno";
            conn = Conexion.getConexion();
            
            state= conn.createStatement();
            resulset = state.executeQuery(sql);
            Alumno nAlumno = new Alumno();
            while (resulset.next()) {
               // alumno.setId(Integer.valueOf(resulset.getString("id")));
               id = Integer.valueOf(resulset.getString("id"));
               nroCedula = resulset.getString("nrocedula");
               nombre = resulset.getString("nombre");
               apellido = resulset.getString("apellido");
               carrera = resulset.getString("carrera");
               edad = resulset.getString("edad");
               nAlumno = new Alumno(id,nroCedula,nombre,apellido,carrera,edad);
                //System.out.println(" nAlumno " + nAlumno);
                //listAlumnos.add(alumno);
               listAlumnos.add(nAlumno); 
               
               //System.out.println(listAlumnos.toString());
            }
             conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(" lista alumnos " + listAlumnos);
        return listAlumnos;
    }

    public Alumno buscarAlumno() {
        Alumno alumno = new Alumno();
        Connection conn;
        ResultSet resulset;
        Statement state;
        // retorna la lista de los datos de la base de datos 

        try {
            //String sql = "select * from alumno";
            conn = Conexion.getConexion();
            String query = "select * from alumno";
            conn = Conexion.getConexion();
            state= conn.createStatement();
            resulset = state.executeQuery(query);
            while (resulset.next()) {
               // alumno.setId(Integer.valueOf(resulset.getString("id")));
                alumno.setCedulaI(resulset.getString("nrocedula"));
                alumno.setNombre(resulset.getString("nombre"));
                alumno.setApellido(resulset.getString("apellido"));
                alumno.setCarrera(resulset.getString("carrera"));
                break;
            }
             conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(alumno.toString());
        return alumno;
    }

    public static void main(String[] args) {
        AlumnosImpl alp = new AlumnosImpl();
        List<Alumno> listaAlumnos = null;
        listaAlumnos = alp.buscar();
        System.out.println("lista alumnos  " + listaAlumnos);
    }
    

}
