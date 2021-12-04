<%-- Pantalla principal de Medico
muestra los registros de la base de datos correspondiente a los Medicos registrados
    Document   : index
    Created on : 6/11/2021, 05:16:41 PM
    Author     : Jossue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medico</title>
        <link rel="stylesheet" href="css/tabla.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="principal">

            <div id="header">
                <div><form action="MedicoControl?accion=insert" method="POST" autocomplete="off">

                    <button class="boton" id="nuevoMedico" name="nuevoMedico" type="submit">Nuevo Registro</button>
                </form></div>
                
                <div id="search"> <input class="control" type="text" name="nombreD" id="nombreD" placeholder="Buscar"></div>

            </div>


            <h1 class="label">Registro de Medicos</h1>




            <!-- Tabla de registros que devuelve la base de datos -->
            <div id="main-container">
                <table border="1" width="80%">
                    <thead>
                        <tr>
                            <th>Id Medico</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>Edad</th>
                            <th>Sexo</th>
                            <th>Telefono</th>
                            <th>Email</th>
                            <th>Especialidad</th>
                            <th>Dias Atencion</th>
                            <th>Turno Atencion</th>
                            <th>Cedula</th>
                            <th>Cedula especialidad</th>
                            <th>Id Usuario</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>

                    </thead>
                    <thead>

                    </thead>
                    <tbody>
                        <c:forEach var="medico" items="${listaMedico}" >
                            <tr>
                                <td><c:out value="${medico.idMedico}"></c:out></td>
                                <td><c:out value="${medico.nombre}"></c:out></td>
                                <td><c:out value="${medico.apellidos}"></c:out></td>
                                <td><c:out value="${medico.edad}"></c:out></td>
                                <td><c:out value="${medico.sexo}"></c:out></td>
                                <td><c:out value="${medico.telefono}"></c:out></td>
                                <td><c:out value="${medico.email}"></c:out></td>
                                <td><c:out value="${medico.especialidad}"></c:out></td>
                                <td><c:out value="${medico.diasAtencion}"></c:out></td>
                                <td><c:out value="${medico.turnoAtencion}"></c:out></td>
                                <td><c:out value="${medico.cedula}"></c:out></td>
                                <td><c:out value="${medico.cedulaEspecialidad}"></c:out></td>
                                <td><c:out value="${medico.idUsuarios}"></c:out></td>
                                <td><form  action="MedicoControl?accion=update&idD=<c:out value="${medico.idMedico}"></c:out>" method="POST" autocomplete="off"><button class="btnModificar" id="modificarD" name="modificarD" type="submit">Modificar</button></form></td>
                                <td><form  action="MedicoControl?accion=delete&idD=<c:out value="${medico.idMedico}"></c:out>" method="POST" autocomplete="off"><button class="btnEliminar" id="eliminarD" name="eliminarD" type="submit">Eliminar</button></form></td>



                                </tr>
                        </c:forEach>              
                    </tbody>

                </table>

            </div>

        </div>
    </body>
</html>
