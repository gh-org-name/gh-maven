package com.jcg.maven;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


    public class Demo {
        private static final String DRIVER_CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private final Connection connection;

        public Demo(String msSqlServerUri) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER_CLASS_NAME);
            connection = DriverManager.getConnection(msSqlServerUri);
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "AppLogin", "");
            Connection conn2 = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true?user=user&password=");


            String ip = "192.168.12.42"; // Noncompliant
            try {
                Socket socket = new Socket(ip, 6667);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
