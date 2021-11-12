package com.unmsm.backfisialumnocurso.repository.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

  private static Connection instance;

  public static Connection getConnection(){
    try{
      if(instance == null) {
        Runtime.getRuntime().addShutdownHook(new ClosingHook());

        String url = "jdbc:sqlserver://unmsm-server.database.windows.net:1433;databaseName=universidad";
        String driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String username = "yanpieer";
        String password = "Romerosalazar13";

        Class.forName(driverClassName);
        instance = DriverManager.getConnection(url, username, password);
      }
      return instance;
    }
    catch(Exception ex){
      ex.printStackTrace();
      throw new RuntimeException("Error al conectarse con la base de datos.");
    }
  }

  static class ClosingHook extends Thread{
    public void run(){
      try{
        Connection connection = getConnection();
        connection.close();
      }
      catch(Exception ex){
        ex.printStackTrace();
        throw new RuntimeException();
      }
    }
  }
  
}
