package controller;

import model.registerModel;
import java.sql.SQLException;

public class registerController {

    //Globals Attributes.
    registerModel ControladorModelo;

    /**
     * This method receives the username, password and email information from the homeView class and sends it to the registerModel class.
     *
     * @param Usuario
     * @param Email
     * @param Contraseña
     * @throws SQLException
     */
    public void Insertar(String Usuario, String Email, String Contraseña) throws SQLException {

        ControladorModelo = new registerModel();

        ControladorModelo.setUsuario(Usuario);
        ControladorModelo.setEmail(Email);
        ControladorModelo.setContraseña(Contraseña);

        /* Call the insert method from registerModel */
        ControladorModelo.Insert();

    }

}
