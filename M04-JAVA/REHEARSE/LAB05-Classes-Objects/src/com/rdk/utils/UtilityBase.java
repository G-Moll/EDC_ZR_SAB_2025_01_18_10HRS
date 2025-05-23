package com.rdk.utils;

import java.text.MessageFormat;

class UtilityBase {
    private long timeStart;
    private long timeEnd;
    private long timeElapsed;
    private boolean timeDisplay = false;

    public void timestampStart() {
        this.timeStart = System.currentTimeMillis();
        if( this.timeDisplay ) System.out.println( ":: STARTING TIMESTAMP ::" );
    }

    public void timestampStop() {
        this.timeEnd = System.currentTimeMillis();
        this.timeElapsed = this.timeEnd - this.timeStart;
        if( this.timeDisplay ) System.out.println( ":: STOPPING TIMESTAMP ::" );
    }

    public void timestampDescription( String timestampMessage ) {
        String timestampString = MessageFormat.format( "{0}: {1}ms", timestampMessage, this.timeElapsed );
        System.out.println( timestampString );
    }

    public void timestampDisplayToggle() {
        this.timeDisplay = ! this.timeDisplay;
    }


}
