package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conexao = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "usuario", "senha");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
        
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}