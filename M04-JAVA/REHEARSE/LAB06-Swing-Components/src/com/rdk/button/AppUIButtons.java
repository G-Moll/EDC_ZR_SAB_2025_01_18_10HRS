package com.rdk.button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppUIButtons {
    public static void displayUI() {
        JFrame appFrame = new JFrame();
        JButton buttonOne = new JButton( "Click" );
        buttonOne.setBounds( 130, 100, 100, 40 );

        appFrame.add( buttonOne );
        appFrame.setSize( 400, 500 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
