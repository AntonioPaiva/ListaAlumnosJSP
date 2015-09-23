<%@page  import="py.lista.alumnos.modelos.Alumno" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<% List<Alumno> lista = (List<Alumno>) session.getAttribute("alumnos");%>
<% Iterator<Alumno> it = lista.iterator();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <h1>Lista de alumnos</h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (it.hasNext()) {
                            Alumno a = it.next();
                    %>
                    <tr id="row">
                        <td>
                            <span>
                                <%= a.getNombre()%>
                            </span>
                        </td>
                        <td>
                            <span>
                                <%= a.getApellido()%>
                            </span>
                        </td>
                        <td>
                            <form action="AlumnoServlet" method="get">
                                <input type="hidden" name="id" value="<%= a.getId()%>">
                                <input type="submit" name="accion" value="modificar" class="btn btn-warning">
                            </form>
                            <form action="AlumnoServlet" method="get">
                                <input type="hidden" name="id" value="<%= a.getId()%>">
                                <input type="submit" name="accion" value="eliminar" class="btn btn-danger" value="eliminar">
                            </form>
                        </td>
                    </tr>
                    <%
                        }
                    %>


                </tbody>
            </table>
        </div>
    </body>
</html>
