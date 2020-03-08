package com.api.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoOracle implements Conexao {
	
	 private static ConexaoOracle INSTANCE;
	    private Connection conn;
	    private Statement stmt;
	    private ResultSet rs;

	    private ConexaoOracle() {

	    	 String server = "localhost";
	         String port = "1521";               
	         String database = "conexos";

	         // Configuração dos parâmetros de autenticação
	         String user = "david";
	         String passwd = "022420";

	        connect(server, port, database, user, passwd);
	    }

	    public static ConexaoOracle getInstance() {
	        if (INSTANCE == null) {
	            INSTANCE = new ConexaoOracle();
	            return INSTANCE;
	        }
	        return INSTANCE;
	    }

	    private boolean connect(String server, String port, String database, String user, String passwd) {
	    	
	    	try {
	    	String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + database;

            // Abre-se a conexão com o Banco de Dados
	    	  Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
	    	  Statement stmt = (Statement) con.createStatement();
	        } catch (SQLException ex) {
	            // handle any errors
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        }
	        return true;

	    }

	    public Statement getStatment() {
	        return this.stmt;
	    }

	    public Connection getConexao() {
	        return this.conn;
	    }

	    public ResultSet consultar(String query) {
	        try {
	            rs = stmt.executeQuery(query);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return rs;
	    }

	    public void desconect() {
	        try {
	            stmt.close();
	        } catch (SQLException sqlEx) {
	            stmt = null;
	        }
	        try {
	            conn.close();
	        } catch (SQLException sqlEx) {
	            conn = null;
	        }
	    }

}
