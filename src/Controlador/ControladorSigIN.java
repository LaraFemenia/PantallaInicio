package Controlador;

import Modelo.ModeloSigIN;
import java.sql.SQLException;

public class ControladorSigIN {

    ModeloSigIN ControladorModelo;

    public void Insertar(String Usuario, String Email, String Contraseña) throws SQLException {

        ControladorModelo = new ModeloSigIN();

        ControladorModelo.setUsuario(Usuario);
        ControladorModelo.setEmail(Email);
        ControladorModelo.setContraseña(Contraseña);

        //Método para llamar al método insert del controlador
        ControladorModelo.Insert();

    }

}
