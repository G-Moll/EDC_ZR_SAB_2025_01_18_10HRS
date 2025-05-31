package com.rdk.text;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppUILabels {

    public AppUILabels() {
        JFrame appFrame = new JFrame( "App UI Labels" );
        JLabel labelOne, labelTwo;

        labelOne = new JLabel( "Label One" );
        labelOne.setBounds( 50, 50, 100, 30 );
        labelTwo = new JLabel( "Label Two" );
        labelTwo.setBounds( 50, 100, 100, 30 );

        appFrame.add( labelOne );
        appFrame.add( labelTwo );
        appFrame.setSize( 300, 300 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
