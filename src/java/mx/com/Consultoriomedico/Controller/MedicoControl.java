/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.Consultoriomedico.Controller;

import mx.com.Consultoriomedico.DAO.MedicoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import mx.com.Consultoriomedico.DAO.CitaDAO;
import mx.com.Consultoriomedico.modelo.Cita;
import mx.com.Consultoriomedico.modelo.Medico;

/**
 *
 * @author Jossue
 */
@WebServlet(name = "MedicoControl", urlPatterns = {"/MedicoControl"})
public class MedicoControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet MedicoControl</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet MedicoControl at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CitaDAO citaDAO = null;
        MedicoDAO medicoDAO = null;
        try {
            medicoDAO = new MedicoDAO();
            citaDAO = new CitaDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");
        if ("medico".equals(accion)) {
            System.out.println("Panel MEDICO CONTROL");
            dispatcher = request.getRequestDispatcher("Doctor/Dashboard.jsp");
            List<Medico> listaMedico;
            listaMedico = medicoDAO.listarMedico();
            System.out.println(listaMedico.toString());
            accion=null;
            request.setAttribute("listaMedico", listaMedico);
        } else if ("insert".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Doctor/NuevoMedico.jsp");
            accion=null;
        } else if ("insertar".equals(accion)) {
            String Nombre = request.getParameter("nombreD");
            String Apellidos = request.getParameter("apellidosD");
            String Edad = request.getParameter("edadD");
            String Sexo = request.getParameter("sexoD");
            String Telefono = request.getParameter("telefonoD");
            String Email = request.getParameter("emailD");
            String Especialidad = request.getParameter("especialidadD");
            String DiasAtencion = request.getParameter("diasatencionD");
            String TurnoAtencion = request.getParameter("turnoatencionD");
            String Cedula = request.getParameter("cedulaD");
            String CedulaEspecialidad = request.getParameter("cedulaespecialidadD");

            System.out.println(Apellidos + "valor del formulario");
            Medico medico = new Medico(Nombre, Apellidos, Edad, Sexo, Telefono, Email, Especialidad, DiasAtencion, TurnoAtencion, Cedula, CedulaEspecialidad,5);

            medicoDAO.insertarMedico(medico);
            dispatcher = request.getRequestDispatcher("Doctor/Dashboard.jsp");
            List<Medico> listaMedico;
            listaMedico = medicoDAO.listarMedico();
            System.out.println(listaMedico.toString());
            accion=null;
            request.setAttribute("listaMedico", listaMedico);
            

        } else if ("update".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Doctor/UpdateMedico.jsp");
            int Id = Integer.parseInt(request.getParameter("idD"));
            accion=null;
            Medico medico = medicoDAO.mostrarMedico(Id);
            System.out.println(medico.toString());
            request.setAttribute("medico", medico);

        } else if ("buscar".equals(accion)) { 
            dispatcher = request.getRequestDispatcher("Doctor/BuscarMedico.jsp"); //cambiar a vista para Buscar 
            

        } else if ("actualizar".equals(accion)) {
            int Id=Integer.parseInt(request.getParameter("idD"));
            String Nombre = request.getParameter("nombreD");
            String Apellidos = request.getParameter("apellidosD");
            String Edad = request.getParameter("edadD");
            String Sexo = request.getParameter("sexoD");
            String Telefono = request.getParameter("telefonoD");
            String Email = request.getParameter("emailD");
            String Especialidad = request.getParameter("especialidadD");
            String DiasAtencion = request.getParameter("diasatencionD");
            String TurnoAtencion = request.getParameter("turnoatencionD");
            String Cedula = request.getParameter("cedulaD");
            String CedulaEspecialidad = request.getParameter("cedulaespecialidadD");

            System.out.println(Apellidos + "valor del formulario");
            Medico medico = new Medico(Id,Nombre, Apellidos, Edad, Sexo, Telefono, Email, Especialidad, DiasAtencion, TurnoAtencion, Cedula, CedulaEspecialidad, 3);

            medicoDAO.actualizarMedico(medico);
            dispatcher = request.getRequestDispatcher("Doctor/Dashboard.jsp");
            List<Medico> listaMedico;
            listaMedico = medicoDAO.listarMedico();
            System.out.println(listaMedico.toString());
            accion=null;
            request.setAttribute("listaMedico", listaMedico);
        } else if ("cancelar".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Doctor/Dashboard.jsp");
            List<Medico> listaMedico;
            listaMedico = medicoDAO.listarMedico();
            System.out.println(listaMedico.toString());
            accion=null;
            request.setAttribute("listaMedico", listaMedico);
        } else if ("delete".equals(accion)) {
            
            int Id=Integer.parseInt(request.getParameter("idD"));
            medicoDAO.eliminarMedico(Id);
            dispatcher = request.getRequestDispatcher("Doctor/Dashboard.jsp");
            List<Medico> listaMedico;
            listaMedico = medicoDAO.listarMedico();
            accion=null;
            request.setAttribute("listaMedico", listaMedico);
        }else if ("cita".equals(accion)){
            System.out.println("Panel Cita CONTROL");
            dispatcher = request.getRequestDispatcher("Cita/Dashboard.jsp");
            List<Cita> listaCita;
            listaCita = citaDAO.listarCita();
            System.out.println(listaCita.toString());

            request.setAttribute("listaCita", listaCita);
        } else if ("insertCita".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Cita/NuevaCita.jsp");
            accion = null;
        } else if ("insertarCita".equals(accion)) {
            String NombreC = request.getParameter("nombreC");
            String ApellidosC = request.getParameter("apellidosC");
            String EdadC = request.getParameter("edadC");
            String SexoC = request.getParameter("sexoC");
            String TelefonoC = request.getParameter("telefonoC");
            String EmailC = request.getParameter("emailC");
            String DiaC = request.getParameter("diaC");
            String MesC = request.getParameter("mesC");
            String AnioC = request.getParameter("anioC");
            String MotivoCitaC = request.getParameter("motivocitaC");
            String HoraC = request.getParameter("horaC");

            Cita cita = new Cita(NombreC, ApellidosC, EdadC, SexoC, TelefonoC, EmailC, DiaC, MesC, AnioC, MotivoCitaC, HoraC, 1);
            System.out.println(cita.toString());
            citaDAO.insertarCita(cita);
            dispatcher = request.getRequestDispatcher("Cita/index.jsp");
            List<Cita> listaCita;
            listaCita = citaDAO.listarCita();
            System.out.println(listaCita.toString());
           
            request.setAttribute("listaCita", listaCita);

        } else if ("updateCita".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Cita/ActualizarCita.jsp");
            int Id = Integer.parseInt(request.getParameter("idC"));

            Cita cita = citaDAO.mostrarCita(Id);
            request.setAttribute("cita", cita);

        } else if ("buscarCita".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Cita/BuscarCita.jsp"); //cambiar a vista para Buscar 
            int Id = Integer.parseInt(request.getParameter("idC"));
            accion = null;
            Cita cita = citaDAO.mostrarCita(Id);
            request.setAttribute("cita", cita);

        } else if ("actualizarCita".equals(accion)) {
            int Id = Integer.parseInt(request.getParameter("idC"));
            String Nombre = request.getParameter("nombreC");
            String Apellidos = request.getParameter("apellidosC");
            String Edad = request.getParameter("edadC");
            String Sexo = request.getParameter("sexoC");
            String Telefono = request.getParameter("telefonoC");
            String Email = request.getParameter("emailC");
            String Dia = request.getParameter("diaC");
            String Mes = request.getParameter("mesC");
            String Anio = request.getParameter("anioC");
            String MotivoCita = request.getParameter("motivocitaC");
            String Hora = request.getParameter("horaC");

            Cita cita = new Cita(Id, Nombre, Apellidos, Edad, Sexo, Telefono, Email, Dia, Mes, Anio, MotivoCita, Hora, 3);

            citaDAO.actualizarCita(cita);
            dispatcher = request.getRequestDispatcher("Cita/index.jsp");
            List<Cita> listaCita;
            listaCita = citaDAO.listarCita();

            request.setAttribute("listaCita", listaCita);
        } else if ("cancelarCita".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Cita/index.jsp");
            List<Cita> listaCita;
            listaCita = citaDAO.listarCita();

            request.setAttribute("listaCita", listaCita);
        } else if ("deleteCita".equals(accion)) {

            int Id = Integer.parseInt(request.getParameter("idC"));
            System.out.println("eliminar idCita" + Id);
            citaDAO.eliminarCita(Id);
            dispatcher = request.getRequestDispatcher("Cita/index.jsp");
            List<Cita> listaCita;
            listaCita= citaDAO.listarCita();
            
            request.setAttribute("listaCita", listaCita);
        }
       
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
