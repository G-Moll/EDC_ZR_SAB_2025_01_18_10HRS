package com.rdk.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class UtilityReader extends UtilityBase {
    String filePath;
    FileReader fileReader;
    BufferedReader bufferedReader;

    UtilityReader( String filePath ) {
        this.filePath = filePath;
    }

    void fileRead() {
        try {
            this.timestampStart();
            this.fileReader = new FileReader( this.filePath );
            this.bufferedReader = new BufferedReader( this.fileReader );
            String currentLine = this.bufferedReader.readLine();

            int numberLine = 1;
            while( currentLine != null ) {
                System.out.println( "Line " + numberLine + ": " + currentLine );
                currentLine = this.bufferedReader.readLine();
                numberLine ++;
            }
            this.bufferedReader.close();
            this.timestampStop();
            this.timestampDescription( "Reading time" );
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }
}
