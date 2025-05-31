package com.rdk.text;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AppUITextFields {

    public AppUITextFields() {
        JFrame appFrame = new JFrame( "App UI TextFields" );
        JTextField textFieldOne, textFieldTwo;

        textFieldOne = new JTextField( "TextField One" );
        textFieldOne.setBounds( 50, 50, 200, 30 );
        textFieldTwo = new JTextField( "TextField Two" );
        textFieldTwo.setBounds( 50, 100, 200, 30 );

        appFrame.add( textFieldOne );
        appFrame.add( textFieldTwo );
        appFrame.setSize( 300, 300 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
