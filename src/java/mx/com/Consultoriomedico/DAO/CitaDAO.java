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
import mx.com.Consultoriomedico.modelo.Cita;

/**
 *
 * @author Jossue
 */
public class CitaDAO {

    Connection conexion;

    public CitaDAO() throws ClassNotFoundException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public List<Cita> listarCita() {//mostrar los registros de la base de datos en la tabla principal
        ResultSet rs;
        PreparedStatement ps;
        List<Cita> listaCita = new ArrayList<>();

        try {

            ps = conexion.prepareStatement("SELECT * FROM Cita");
            rs = ps.executeQuery();

            while (rs.next()) {

                 
                int    idCita = rs.getInt("idCita");
                String Nombre = rs.getString("Nombre");
                String Apellidos = rs.getString("Apellidos");

                String Edad = rs.getString("Edad");
                String Sexo = rs.getString("Sexo");
                String Telefono = rs.getString("Telefono");
                String Email = rs.getString("Email");

                String Dia = rs.getString("Dia");
                String Mes = rs.getString("Mes");
                String Anio = rs.getString("Anio");
                String MotivoCita = rs.getString("MotivoCita");
                String Hora = rs.getString("Hora");
                Integer IdRecepcion = rs.getInt("Recepcion_idRecepcion");
                Cita cita= new Cita(idCita,Nombre,Apellidos,Edad,Sexo,Telefono,Email,Dia,Mes,Anio,MotivoCita,Hora,IdRecepcion);
                listaCita.add(cita);
            }
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
        return listaCita;

    }

    public Cita mostrarCita(int idC) { //Buscar registro de la base de datos
        ResultSet rs;
        PreparedStatement ps;
        Cita cita = null;
        try {

            ps = conexion.prepareStatement("SELECT * FROM Cita WHERE idCita=?");
            ps.setInt(1, idC);

            rs = ps.executeQuery();

            while (rs.next()) {

                
                int    idCita = rs.getInt("idCita");
                String Nombre = rs.getString("Nombre");
                String Apellidos = rs.getString("Apellidos");

                String Edad = rs.getString("Edad");
                String Sexo = rs.getString("Sexo");
                String Telefono = rs.getString("Telefono");
                String Email = rs.getString("Email");

                String Dia = rs.getString("Dia");
                String Mes = rs.getString("Mes");
                String Anio = rs.getString("Anio");
                String MotivoCita = rs.getString("MotivoCita");
                String Hora = rs.getString("Hora");
                Integer IdRecepcion = rs.getInt("Recepcion_idRecepcion");
                cita= new Cita(idCita,Nombre,Apellidos,Edad,Sexo,Telefono,Email,Dia,Mes,Anio,MotivoCita,Hora,IdRecepcion);
             

            }

            return cita;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }

    }

    public boolean insertarCita(Cita cita) {//Nuevo registro de Medico

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("INSERT INTO Cita (Nombre,Apellidos,Edad,Sexo,Telefono,Email,Dia,Mes,Anio,MotivoCita,Hora,Recepcion_idRecepcion)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getApellidos());
            ps.setString(3, cita.getEdad());
            ps.setString(4, cita.getSexo());
            ps.setString(5, cita.getTelefono());
            ps.setString(6, cita.getEmail());
            ps.setString(7, cita.getDia());
            ps.setString(8, cita.getMes());
            ps.setString(9, cita.getAnio());
            ps.setString(10,cita.getMotivoCita());
            ps.setString(11,cita.getHora());
            ps.setInt(12, cita.getIdRecepcion());
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString() + "Error al insertar en MYSQL tabla Cita");
            return false;
        }

    }

    public boolean actualizarCita(Cita cita) { //Actualizar registro de medico 

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("UPDATE Cita SET Nombre=?,Apellidos=?,Edad=?,Sexo=?,Telefono=?,Email=?,Dia=?,Mes=?,Anio=?,MotivoCita=?,Hora=? WHERE idCita = ?");
            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getApellidos());
            ps.setString(3, cita.getEdad());
            ps.setString(4, cita.getSexo());
            ps.setString(5, cita.getTelefono());
            ps.setString(6, cita.getEmail());
            ps.setString(7, cita.getDia());
            ps.setString(8, cita.getMes());
            ps.setString(9, cita.getAnio());
            ps.setString(10, cita.getMotivoCita());
            ps.setString(11, cita.getHora());
            ps.setInt(12, cita.getIdCita());
            
            ps.execute();

            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }

    public boolean eliminarCita(int Id) {

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("DELETE FROM Cita WHERE idCita= ?");
            ps.setInt(1,Id);
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }
}
