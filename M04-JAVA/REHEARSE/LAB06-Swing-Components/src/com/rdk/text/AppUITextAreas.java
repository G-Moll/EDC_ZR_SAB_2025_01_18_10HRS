package com.rdk.text;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AppUITextAreas {

    public AppUITextAreas() {
        JFrame appFrame = new JFrame( "App UI TextAreas" );
        JTextArea textAreaOne, textAreaTwo;

        textAreaOne = new JTextArea( "TextArea One" );
        textAreaOne.setBounds( 50, 50, 200, 120 );
        textAreaTwo = new JTextArea( "TextArea Two" );
        textAreaTwo.setBounds( 50, 180, 200, 120 );

        appFrame.add( textAreaOne );
        appFrame.add( textAreaTwo );
        appFrame.setSize( 300, 400 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
