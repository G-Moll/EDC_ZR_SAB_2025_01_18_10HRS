package com.rdk.utils;

import java.text.MessageFormat;
import java.util.Scanner;

public class FileUtility {
    static String filePath = "data/file.txt";
    static Scanner scanner = new Scanner( System.in );
    static UtilityWriter utilityWriter = new UtilityWriter( filePath );
    static UtilityReader utilityReader = new UtilityReader( filePath );

    public static void taskStart() {
        String startMessage = "" +
            "OPCIONES" +
            " - Registar (1)" +
            " - Mostrar (2)" +
            " - Salir (0)";
        System.out.println( startMessage );
        
        int choice = scanner.nextInt();

        switch( choice ) {
            case 0:
                taskEnd();
                break;
            case 1:
                taskWrite();
                break;
            case 2:
                taskRead();
                break;
            default:
                taskRetry();
                break;
        }
    }
    public static void taskRetry() {
        String retryMessage = "" +
            "REINTENTAR" +
            " - SI (1)" +
            " - NO (0)";
        System.out.println( retryMessage );

        int choice = scanner.nextInt();

        switch( choice ) {
            case 0:
                taskEnd();
                break;
            case 1:
                taskStart();
                break;
            default:
                taskRetry();
        }
    }
    public static void taskEnd() {
        System.out.println( "taskEnd...." );
        scanner.close();
    }
    public static String taskInput() {
        String name;
        String lastname;
        String age;
        String dataString;

        System.out.println( "NUEVO REGISTRO" );
        System.out.print( "Nombre: " );
        name = scanner.next();
        
        System.out.print( "Apellido: " );
        lastname = scanner.next();

        System.out.print( "Edad: " );
        age = scanner.next();

        dataString = MessageFormat.format( "{0}, {1}, {2}", name, lastname, age );

        return dataString;
    }
    public static void taskWrite() {
        utilityWriter.fileWrite( taskInput() );
        taskStart();
    }
    public static void taskRead() {
        utilityReader.fileRead();
        taskStart();
    }
    public static void taskDisplayToggle() {
        System.out.println( "taskDisplayToggle...." );
    }


}
