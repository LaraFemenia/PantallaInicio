package model;

import Util.dataBaseConection;
import java.sql.SQLException;

public class registerModel {

    //Global attritubes.
    private String Usuario;
    private String Email;
    private String Contraseña;
    dataBaseConection conector;

    //Constructors
    public registerModel() {
    }

    //Setters and Getters methods.
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

    /**
     * This method sends the statement with username, password and email information to the dataBaseConection class;
     *
     * @throws SQLException
     */
    public void Insert() throws SQLException {

        conector = new dataBaseConection();

        conector.Insert("INSERT INTO `cajero`.`usuario` (`Usuario`,`Email`, `Contraseña`) VALUES ('" + this.Usuario + "','" + this.Email + "', '" + this.Contraseña + "');");

    }

}
