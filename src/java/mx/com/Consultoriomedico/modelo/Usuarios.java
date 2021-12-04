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
public class Usuarios{
    int idUsuarios;
    String NickName;
    String Password;

    public Usuarios(int idUsuarios, String NickName, String Password) {
        
        this.idUsuarios = idUsuarios;
        this.NickName = NickName;
        this.Password = Password;
    }
    public Usuarios(String NickName, String Password) {
        
        this.NickName = NickName;
        this.Password = Password;
    }
    
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
   

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuarios=" + idUsuarios + ", NickName=" + NickName + ", Password=" + Password + '}';
    }



    
}
