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
public class Cita {

    int idCita;
    String Dia;
    String Mes;
    String Anio;
    String Hora;
    String MotivoCita;

    String Nombre;

    String Apellidos;

    String Telefono;

    String Edad;

    String Email;

    String Sexo;
    int idRecepcion;

    public Cita(String nombre, String apellido, String edad, String sexo, String telefono, String email, String dia, String mes, String anio, String hora, String motivo, int IdRecepcion) {

        this.Dia = dia;
        this.Mes = mes;
        this.Anio = anio;
        this.Hora = hora;
        this.MotivoCita = motivo;
        this.Nombre = nombre;
        this.Apellidos = apellido;

        this.Telefono = telefono;
        this.Edad = edad;
        this.Email = email;
        this.Sexo = sexo;
        this.idRecepcion = IdRecepcion;
    }

    public Cita(int IdCita,String nombre, String apellido, String edad, String sexo, String telefono, String email, String dia, String mes, String anio, String hora, String motivo, int IdRecepcion) {
        this.idCita=IdCita;
        this.Dia = dia;
        this.Mes = mes;
        this.Anio = anio;
        this.Hora = hora;
        this.MotivoCita = motivo;
        this.Nombre = nombre;
        this.Apellidos = apellido;

        this.Telefono = telefono;
        this.Edad = edad;
        this.Email = email;
        this.Sexo = sexo;
        this.idRecepcion = IdRecepcion;
    }
   public Cita(int IdCita,String nombre, String apellido, String edad, String sexo, String telefono, String email, String dia, String mes, String anio, String hora, String motivo) {
        this.idCita=IdCita;
        this.Dia = dia;
        this.Mes = mes;
        this.Anio = anio;
        this.Hora = hora;
        this.MotivoCita = motivo;
        this.Nombre = nombre;
        this.Apellidos = apellido;

        this.Telefono = telefono;
        this.Edad = edad;
        this.Email = email;
        this.Sexo = sexo;
       
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdRecepcion() {
        return idRecepcion;
    }

    public void setIdRecepcion(int idRecepcion) {
        this.idRecepcion = idRecepcion;
    }
    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getMotivoCita() {
        return MotivoCita;
    }

    public void setMotivoCita(String MotivoCita) {
        this.MotivoCita = MotivoCita;
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
        return "Cita{" + "Dia=" + Dia + ", Mes=" + Mes + ", Anio=" + Anio + ", HoraCita=" + Hora + ", MotivoCita=" + MotivoCita + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + ", Edad=" + Edad + ", Email=" + Email + ", Sexo=" + Sexo + '}';
    }

}
