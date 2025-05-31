package com.rdk.text;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class AppUIPasswordFields {

    public AppUIPasswordFields() {
        JFrame appFrame = new JFrame( "App UI PasswordFields" );
        JPasswordField passwordFieldOne, passwordFieldTwo;

        passwordFieldOne = new JPasswordField( "PasswordField One" );
        passwordFieldOne.setBounds( 50, 50, 200, 30 );
        passwordFieldTwo = new JPasswordField( "PasswordField Two" );
        passwordFieldTwo.setBounds( 50, 100, 200, 30 );

        appFrame.add( passwordFieldOne );
        appFrame.add( passwordFieldTwo );
        appFrame.setSize( 300, 300 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
