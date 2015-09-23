/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.lista.alumnos.controladores.connection;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author beastieux
 */
public class Conexion {

    public static Connection getConexion() {
        String pass = "";
        String user = "";
        String url = "";
        String host = "";
        String puerto = "";
        String bd = "";
        String sql = "";
        Connection conn = null;
        ResultSet resultado;
        Statement state;
        Properties propert = new Properties();
        FileInputStream fileInput;
        File file;
        String urla = "";
        
        try {
           // file = new File("BDconfig.properties");
            //fileInput = new FileInputStream(file);
           // propert.load(fileInput);
            //user = propert.getProperty("User");
//            pass = propert.getProperty("Pass");
//            host = propert.getProperty("HostName");
//            puerto = propert.getProperty("Puerto");
//            bd = propert.getProperty("DBname");
            //url = "jdbc:postgresql://127.0.0.1:5432/SistBDAlumno";
            //url = "jdbc:postgresql://" + host + ":" + puerto + "/" + bd;
            Class.forName("org.postgresql.Driver");
            //conn = DriverManager.getConnection(url, user, pass);
            urla = "jdbc:postgresql://localhost:5432/SistBDAlumno";
            conn = DriverManager.getConnection(urla, "postgres", "secreto");
           // System.out.println(" " + conn);

//            state= conn.createStatement();
//            sql = "select * from alumno";
//
//            state.execute(sql);
//            resultado = state.executeQuery(sql);
//           // obtiene los datos de la base de datos 
//            while (resultado.next()) {
//                System.out.println(" Nombre: " + resultado.getString("nombre"));
//                System.out.println(" Apellido: " + resultado.getString("apellido"));
//                System.out.println(" Edad: " + resultado.getString("edad"));
//                System.out.println(" Carrera: " + resultado.getString("carrera"));
//                System.out.println(" Numero Cedula: " + resultado.getString("nrocedula"));
//                
//            }
//            
            //conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        Conexion conn;
        System.out.println(" " + Conexion.getConexion());
    }
}
