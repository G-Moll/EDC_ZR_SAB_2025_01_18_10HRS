package com.rdk.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConfigDatabase {
    public static Connection connection =  null;

    public static Connection getConnection() {
        try {
            InputStream input = ConfigDatabase.class.getClassLoader().getResourceAsStream( "resources/db.properties" );
            // FileInputStream input = new FileInputStream( "resources/db.properties" );
            Properties dbProperties = new Properties();
            dbProperties.load( input );

            String url = dbProperties.getProperty( "db.url" );
            String user = dbProperties.getProperty( "db.user" );
            String password = dbProperties.getProperty( "db.password" );

            connection = DriverManager.getConnection( url, user, password );
            System.out.println( "DB connected..!" );
        }
        catch( IOException | SQLException e ) {
            e.printStackTrace();
        }
        return connection;
    }

}
