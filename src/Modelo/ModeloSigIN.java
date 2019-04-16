package Modelo;

import Util.Conector_DB;
import java.sql.SQLException;

public class ModeloSigIN {

    private String Usuario;
    private String Email;
    private String Contraseña;
    Conector_DB conector;

    public ModeloSigIN() {
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    //Método Insert
    public void Insert() throws SQLException {

        conector = new Conector_DB();

        conector.Insert("INSERT INTO `cajero`.`usuario` (`Usuario`,`Email`, `Contraseña`) VALUES ('" + this.Usuario + "','" + this.Email + "', '" + this.Contraseña + "');");

    }

}
