<%-- 
    Document   : Dashboard
    Created on : 12/11/2021, 10:17:56 PM
    Author     : Jossue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.88.1">
        <title>Dashboard Template · Bootstrap v5.1</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/dashboard/">



        <!-- Bootstrap core CSS -->
        <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }



            table{
                background-color: white; 
                text-align: left; 
                border-collapse: collapse; 
                width: 40%; 
                box-shadow: 7px 13px 37px #000;
            }

            th, td{
                padding: 10px;
            }

            thead{
                background-color: #0DCAF0;
                border-bottom: solid 3px #45c0e6;
                color: white;
                align-items: center;

            }

            tr:nth-child(even){
                background-color:white;
            }

            tr:hover td{
                background-color: #d6fffc;
                color: white;
            }

            .label{
                color:white;
                width: auto;
            }

            header{
                box-shadow: 7px 13px 37px #000;
                font-family: Calibri;
                background-color: #24303c;   
                width:5000;
                height: 70px;
                color: white;

            }

            .form-signin input[type="text"] {
                margin-bottom: 10px;
                font-size: 18px;
                font-family: Calibri;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
            }

            .lb{
                font-family: Calibri;
                font-size: 18px;
                color:#667070;


            }
        </style>


        <!-- Custom styles for this template -->
        <link href="../css/dashboard.css" rel="stylesheet">
        <link href="../css/formularios.css" rel="stylesheet">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>

        <header class="navbar navbar-dark sticky-top bg-info flex-md-nowrap p-0 shadow" style="height: 70px">
            <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="#">
                <h1>MedicalSys</h1>
            </a>



            <div class="navbar-nav">
                <div class="nav-item text-nowrap">

                    <button class="w-100 btn btn-sm btn-info" style="font-size:19px;" id="home" name="home" type="submit">
                        <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-box-arrow-right" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0v2z"/>
                        <path fill-rule="evenodd" d="M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z"/>
                        </svg>
                        Sign out 
                    </button>
                </div>
            </div>
        </header>

        <div class="container-fluid">
            <div class="row">
                <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
                    <div class="position-sticky pt-3">
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <form action="MedicoControl?accion=medico" method="POST" autocomplete="off">


                                    <button class="w-100 btn btn-lg btn-light" style="font-size:19px;" id="home" name="home" type="submit">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-house-door" viewBox="0 0 16 16">
                                        <path d="M8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4.5a.5.5 0 0 0 .5-.5v-4h2v4a.5.5 0 0 0 .5.5H14a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146zM2.5 14V7.707l5.5-5.5 5.5 5.5V14H10v-4a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v4H2.5z"/>
                                        </svg>
                                        Home 
                                    </button>

                                </form>
                            </li>
                            <li class="nav-item">
                                <form action="MedicoControl?accion=buscar" method="POST" autocomplete="off">


                                    <button class="w-100 btn btn-lg btn-light" style="font-size:19px;" id="buscar" name="buscar" type="submit">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                                        <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                                        </svg>
                                        Buscar Registro
                                    </button>

                                </form>
                            </li>

                            <li class="nav-item">
                                <form action="MedicoControl?accion=insert" method="POST" autocomplete="off">


                                    <button class="w-100 btn btn-lg btn-light" style="font-size: 19px;" id="nuevoMedico" name="nuevoMedico" type="submit">  
                                        <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                        <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                        </svg>
                                        Nuevo Registro
                                    </button>
                                </form>
                            </li>

                        </ul>
                    </div>
                </nav>

                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 style="font-size:28px;">Medicos

                        </h1>


                    </div>
                    <h1 style="font-size:26px;">Buscar Registro</h1>
                    <div id="barra de buscar">

                        <div class="form-floating">
                            <input type="text" class="form-control" style="font-size:19px; width: 300px; height: 50px" id="floatingInput" name="buscarD">
                            
                            <div style="position:fixed; margin-left: 370px; margin-top:20px;"><!-- Apartado de Boton Buscar -->
                                
                                <button class="w-100 btn btn-sm btn-light" style="font-size: 17px;" id="nuevoMedico" name="nuevoMedico" type="submit">  
                                    
                                    Buscar
                                </button>
                            </div>
                        </div>
                        <br/>
                        <div id="Panel opciones de busqueda">
                            <div class="form-check" style="margin-left: 200px; position:fixed;">
                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                <label class="form-check-label" for="flexRadioDefault1">
                                    Nombre
                                </label>
                            </div>
                            <div>
                                <div class="form-check" >
                                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                                    <label class="form-check-label" for="flexRadioDefault2">
                                        Especialidad
                                    </label>
                                </div>
                            </div>
                        </div>  

                        <div >
                            <div class="form-check" style="margin-left: 200px; position:fixed;">
                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                <label class="form-check-label" for="flexRadioDefault1">
                                    Id Medico
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                                <label class="form-check-label" for="flexRadioDefault2">
                                    Cedula
                                </label>
                            </div>
                        </div>



                    </div>

                    <br/><!-- comment -->
                    <br/><!-- comment -->


                    <h2 style="font-size:28px;" >Registro Medico
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-person-rolodex" viewBox="0 0 16 16">
                        <path d="M8 9.05a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5Z"/>
                        <path d="M1 1a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h.5a.5.5 0 0 0 .5-.5.5.5 0 0 1 1 0 .5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5.5.5 0 0 1 1 0 .5.5 0 0 0 .5.5h.5a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H6.707L6 1.293A1 1 0 0 0 5.293 1H1Zm0 1h4.293L6 2.707A1 1 0 0 0 6.707 3H15v10h-.085a1.5 1.5 0 0 0-2.4-.63C11.885 11.223 10.554 10 8 10c-2.555 0-3.886 1.224-4.514 2.37a1.5 1.5 0 0 0-2.4.63H1V2Z"/>
                        </svg>

                    </h2>
                    <div class="table-responsive">
                        <table class="table table-striped table-sm">

                            <thead >
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
                                        <td><form  action="MedicoControl?accion=update&idD=<c:out value="${medico.idMedico}"></c:out>" method="POST" autocomplete="off"> <button class="w-100 btn btn-sm btn-success" id="modificarD" name="modificarD" type="submit">Modificar</button></form></td>
                                        <td><form  action="MedicoControl?accion=delete&idD=<c:out value="${medico.idMedico}"></c:out>" method="POST" autocomplete="off"> <button class="w-100 btn btn-sm btn-danger" id="eliminarD" name="eliminarD" type="submit">Eliminar</button></form></td>



                                        </tr>
                                </c:forEach>              
                            </tbody>

                        </table>
                        </table>
                    </div>

                </main>
            </div>
        </div>


    </body>
</html>
