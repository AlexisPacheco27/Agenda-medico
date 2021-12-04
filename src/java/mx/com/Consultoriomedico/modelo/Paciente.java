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
public class Paciente{
    int idPaciente;
    String Diagnostico;
    String Peso;
    String Temperatura;
    String Sintomas;
    String Tratamiento;
    String Estudios;
    int idCita;
    
        public Paciente(int IdPaciente, String Diagnostico, String Peso, String Temperatura, String Sintomas, String Tratamiento, String Estudios,int IdCita) {
        this.idPaciente= IdPaciente;
        this.Diagnostico = Diagnostico;
        this.Peso = Peso;
        this.Temperatura = Temperatura;
        this.Sintomas = Sintomas;
        this.Tratamiento = Tratamiento;
        this.Estudios = Estudios;
       
        this.idCita = IdCita;

    }

 public Paciente(String Diagnostico, String Peso, String Temperatura, String Sintomas, String Tratamiento, String Estudios,int IdCita) {
        
        this.Diagnostico = Diagnostico;
        this.Peso = Peso;
        this.Temperatura = Temperatura;
        this.Sintomas = Sintomas;
        this.Tratamiento = Tratamiento;
        this.Estudios = Estudios;
       
        this.idCita = IdCita;

    }

//    public Medico(int IdMedico, String Nombre, String Apellidos, String Edad, String Sexo, String Telefono, String Email, String Especialidad, String Diasatencion, String Turnoatencion, String Cedula, String Cedulaespecialidad) {
//        this.idMedico = IdMedico;
//        this.Nombre = Nombre;
//        this.Apellidos = Apellidos;
//        this.Edad = Edad;
//        this.Sexo = Sexo;
//        this.Telefono = Telefono;
//        this.Email = Email;
//        this.Especialidad = Especialidad;
//        this.DiasAtencion = Diasatencion;
//        this.TurnoAtencion = Turnoatencion;
//        this.Cedula = Cedula;
//        this.CedulaEspecialidad = Cedulaespecialidad;
//
//    }
    
    
    
    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public String getEstudios() {
        return Estudios;
    }

    public void setEstudios(String Estudios) {
        this.Estudios = Estudios;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }



    @Override
    public String toString() {
        return "Paciente{" + "Diagnostico=" + Diagnostico + ", Peso=" + Peso + ", Temperatura=" + Temperatura + ", Sintomas=" + Sintomas + ", Tratamiento=" + Tratamiento + ", Estudios=" + Estudios + '}';
    }
    
    
}
