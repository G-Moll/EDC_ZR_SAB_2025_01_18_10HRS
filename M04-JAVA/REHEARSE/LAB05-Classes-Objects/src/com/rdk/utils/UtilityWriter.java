package com.rdk.utils;

import java.io.FileWriter;
import java.io.IOException;

class UtilityWriter extends UtilityBase {
    String filePath;
    FileWriter fileWriter;

    UtilityWriter( String filePath ) {
        this.filePath = filePath;
    }

    public void fileWrite( String fileData ) {
        try {
            this.timestampStart();
            this.fileWriter = new FileWriter( this.filePath, true );
            this.fileWriter.write( fileData + "\n" );
            this.fileWriter.close();
            this.timestampStop();
            this.timestampDescription( "Writing time" );
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }
}
