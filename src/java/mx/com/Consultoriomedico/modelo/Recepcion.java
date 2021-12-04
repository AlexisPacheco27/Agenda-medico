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
public class Recepcion {

    int idRecepcion;

    String Nombre;

    String Apellidos;

    String Edad;

    String Sexo;

    String Telefono;

    String Email;
    String Horario;
    String Turno;
    int idUsuarios;

    public Recepcion(int IdRecepcion, String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Horario, String Turno, int IdUsuarios) {
        this.idRecepcion = IdRecepcion;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Horario = Horario;
        this.Turno = Turno;

        this.idUsuarios = IdUsuarios;

    }

    public Recepcion(String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Horario, String Turno, int IdUsuarios) {

        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Horario = Horario;
        this.Turno = Turno;

        this.idUsuarios = IdUsuarios;

    }

    public Recepcion(int IdRecepcion, String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Horario, String Turno) {
        this.idRecepcion = IdRecepcion;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Horario = Horario;
        this.Turno = Turno;

    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getIdRecepcion() {
        return idRecepcion;
    }

    public void setIdRecepcion(int idRecepcion) {
        this.idRecepcion = idRecepcion;
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

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    @Override
    public String toString() {
        return "Recepcion{" + "idRecepcion=" + idRecepcion + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Telefono=" + Telefono + ", Email=" + Email + ", Horario=" + Horario + ", Turno=" + Turno + ", idUsuarios=" + idUsuarios + '}';
    }

}
