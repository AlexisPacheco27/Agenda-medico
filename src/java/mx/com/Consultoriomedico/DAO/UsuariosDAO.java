/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.Consultoriomedico.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.com.Consultoriomedico.config.Conexion;
import mx.com.Consultoriomedico.modelo.Medico;

/**
 *
 * @author Jossue
 */
public class UsuariosDAO {

    Connection conexion;

    public UsuariosDAO() throws ClassNotFoundException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public List<Medico> listarMedico() {//mostrar los registros de la base de datos en la tabla principal
        ResultSet rs;
        PreparedStatement ps;
        List<Medico> listaMedico = new ArrayList<>();

        try {

            ps = conexion.prepareStatement("SELECT * FROM Doctor");
            rs = ps.executeQuery();

            while (rs.next()) {

                 
                int    idMedico = rs.getInt("idDoctor");
                String Nombre = rs.getString("Nombre");
                String Apellidos = rs.getString("Apellidos");

                String Edad = rs.getString("Edad");
                String Sexo = rs.getString("Sexo");
                String Telefono = rs.getString("Telefono");
                String Email = rs.getString("Email");

                String Especialidad = rs.getString("Especialidad");
                String Diasatencion = rs.getString("DiasAtencion");
                String Turnoatencion = rs.getString("TurnoAtencion");
                String Cedula = rs.getString("Cedula");
                String Cedulaespecialidad = rs.getString("CedulaEspecialidad");
                Integer IdUsuarios = rs.getInt("Usuarios_idUsuarios");
                Medico medico = new Medico(idMedico, Nombre, Apellidos, Edad, Sexo, Telefono, Email, Especialidad, Diasatencion, Turnoatencion, Cedula, Cedulaespecialidad,IdUsuarios);
                listaMedico.add(medico);
            }
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
        return listaMedico;

    }

    public Medico mostrarMedico(int idD) { //Buscar registro de la base de datos
        ResultSet rs;
        PreparedStatement ps;
        Medico medico = null;
        try {

            ps = conexion.prepareStatement("SELECT * FROM Doctor WHERE idDoctor=?");
            ps.setInt(1, idD);

            rs = ps.executeQuery();

            while (rs.next()) {

                int    idMedico = rs.getInt("idDoctor");
                String Nombre = rs.getString("Nombre");
                String Apellidos = rs.getString("Apellidos");

                String Edad = rs.getString("Edad");
                String Sexo = rs.getString("Sexo");
                String Telefono = rs.getString("Telefono");
                String Email = rs.getString("Email");

                String Especialidad = rs.getString("Especialidad");
                String Diasatencion = rs.getString("DiasAtencion");
                String Turnoatencion = rs.getString("TurnoAtencion");
                String Cedula = rs.getString("Cedula");
                String Cedulaespecialidad = rs.getString("CedulaEspecialidad");
                Integer IdUsuarios = rs.getInt("Usuarios_idUsuarios");

                medico = new Medico(idMedico, Nombre, Apellidos, Edad, Sexo, Telefono, Email, Especialidad, Diasatencion, Turnoatencion, Cedula, Cedulaespecialidad,IdUsuarios);

            }

            return medico;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }

    }

    public boolean insertarMedico(Medico medico) {//Nuevo registro de Medico

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("INSERT INTO Doctor (Nombre,Apellidos,Edad,Sexo,Telefono,Email,Especialidad,DiasAtencion,TurnoAtencion,Cedula,CedulaEspecialidad,Usuarios_idUsuarios)VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, medico.getNombre());
            ps.setString(2, medico.getApellidos());
            ps.setString(3, medico.getEdad());
            ps.setString(4, medico.getSexo());
            ps.setString(5, medico.getTelefono());
            ps.setString(6, medico.getEmail());
            ps.setString(7, medico.getEspecialidad());
            ps.setString(8, medico.getDiasAtencion());
            ps.setString(9, medico.getTurnoAtencion());
            ps.setString(10, medico.getCedula());
            ps.setString(11, medico.getCedulaEspecialidad());
            ps.setInt(12, medico.getIdUsuarios());
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString() + "Error al insertar en MYSQL");
            return false;
        }

    }

    public boolean actualizarMedico(Medico medico) { //Actualizar registro de medico 

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("UPDATE Doctor SET Nombre=?,Apellidos=?,Edad=?,Sexo=?,Telefono=?,Email=?,Especialidad=?,DiasAtencion=?,TurnoAtencion=?,Cedula=?,CedulaEspecialidad=? WHERE idDoctor = ?");
            ps.setString(1, medico.getNombre());
            ps.setString(2, medico.getApellidos());
            ps.setString(3, medico.getEdad());
            ps.setString(4, medico.getSexo());
            ps.setString(5, medico.getTelefono());
            ps.setString(6, medico.getEmail());
            ps.setString(7, medico.getEspecialidad());
            ps.setString(8, medico.getDiasAtencion());
            ps.setString(9, medico.getTurnoAtencion());
            ps.setString(10, medico.getCedula());
            ps.setString(11, medico.getCedulaEspecialidad());
            ps.setInt(12, medico.getIdMedico());
            
            ps.execute();

            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }

    public boolean eliminarMedico(int Id) {

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("DELETE FROM Doctor WHERE idDoctor= ?");
            ps.setInt(1,Id);
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }
}
