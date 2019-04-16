package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector_DB {

    final String direccion = "jdbc:mysql://127.0.0.1/cajero";
    final String usuarioBD = "root";
    final String passwordBD = "";
    Connection Conexion;

    public Conector_DB() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Conexion = DriverManager.getConnection(direccion, usuarioBD, passwordBD);

            System.out.println("La conexión se realizó exitosamente.");

        } catch (ClassNotFoundException ex) {

            System.out.println("La conexion ha fallado.");
            Logger.getLogger(Conector_DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }

    public void Insert(String consulta) throws SQLException {

        Statement Sentencia = this.Conexion.createStatement();
        Sentencia.executeUpdate(consulta);

    }

}
