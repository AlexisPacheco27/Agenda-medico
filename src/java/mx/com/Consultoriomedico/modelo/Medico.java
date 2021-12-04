/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.Consultoriomedico.modelo;

/**
 *
 * @author Jossue
 */
public class Medico {

    int idMedico;

    String Nombre;

    String Apellidos;

    String Edad;

    String Sexo;

    String Telefono;

    String Email;
    String Especialidad;
    String DiasAtencion;
    String TurnoAtencion;
    String Cedula;
    String CedulaEspecialidad;
    int idUsuarios;

    public Medico(int IdMedico, String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Especialidad, String Diasatencion, String Turnoatencion, String Cedula, String Cedulaespecialidad, int IdUsuarios) {
        this.idMedico = IdMedico;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Especialidad = Especialidad;
        this.DiasAtencion = Diasatencion;
        this.TurnoAtencion = Turnoatencion;
        this.Cedula = Cedula;
        this.CedulaEspecialidad = Cedulaespecialidad;
        this.idUsuarios = IdUsuarios;

    }

    public Medico(String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Especialidad, String Diasatencion, String Turnoatencion, String Cedula, String Cedulaespecialidad, int IdUsuarios) {

        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Especialidad = Especialidad;
        this.DiasAtencion = Diasatencion;
        this.TurnoAtencion = Turnoatencion;
        this.Cedula = Cedula;
        this.CedulaEspecialidad = Cedulaespecialidad;
        this.idUsuarios = IdUsuarios;

    }

    public Medico(int IdMedico, String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Especialidad, String Diasatencion, String Turnoatencion, String Cedula, String Cedulaespecialidad) {
        this.idMedico = IdMedico;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Especialidad = Especialidad;
        this.DiasAtencion = Diasatencion;
        this.TurnoAtencion = Turnoatencion;
        this.Cedula = Cedula;
        this.CedulaEspecialidad = Cedulaespecialidad;

    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getDiasAtencion() {
        return DiasAtencion;
    }

    public void setDiasAtencion(String DiasAtencion) {
        this.DiasAtencion = DiasAtencion;
    }

    public String getTurnoAtencion() {
        return TurnoAtencion;
    }

    public void setTurnoAtencion(String TurnoAtencion) {
        this.TurnoAtencion = TurnoAtencion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedulaEspecialidad() {
        return CedulaEspecialidad;
    }

    public void setCedulaEspecialidad(String CedulaEspecialidad) {
        this.CedulaEspecialidad = CedulaEspecialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + idMedico + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Telefono=" + Telefono + ", Email=" + Email + ", Especialidad=" + Especialidad + ", DiasAtencion=" + DiasAtencion + ", TurnoAtencion=" + TurnoAtencion + ", Cedula=" + Cedula + ", CedulaEspecializacion=" + CedulaEspecialidad + ", idUsuarios=" + idUsuarios + '}';
    }

}
