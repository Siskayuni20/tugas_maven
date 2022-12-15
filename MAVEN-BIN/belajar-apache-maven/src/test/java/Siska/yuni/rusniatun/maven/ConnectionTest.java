package Siska.yuni.rusniatun.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    @Test
    void testConnection() {
        String jdbcUrl ="jdbc:mysql://localhost:3306/belajar-apache-maven";
        String username ="root";
        String passwaord ="";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, passwaord);

            System.out.println("Sukses koneksi ke database");
            connection.close();
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
}
