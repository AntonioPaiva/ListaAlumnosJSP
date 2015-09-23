<%-- 
    Document   : mostrar2
    Created on : 07/09/2015, 11:40:06 AM
    Author     : apaiva


--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="py.lista.alumnos.modelos.Alumno"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>         
        <%List<Alumno> listAlum = new ArrayList<Alumno>();%>
        
        <% Alumno al = new Alumno(1, "1", "2", "3", "4", "5");%>
        <h1>Hello World!</h1
    <tr>
        <td>Nombre:</td>
        <td><input type="text" size="20" name="nombre" value="<%= al%>"></td>
    </tr>
</body>
</html>
