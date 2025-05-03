package com.rdk.utils;

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
        System.out.println( "taskInput...." );
        return "";
    }
    public static void taskWrite() {
        System.out.println( "taskWrite...." );
    }
    public static void taskRead() {
        utilityReader.fileRead();;
        System.out.println( "taskRead...." );
    }
    public static void taskDisplayToggle() {
        System.out.println( "taskDisplayToggle...." );
    }


}
