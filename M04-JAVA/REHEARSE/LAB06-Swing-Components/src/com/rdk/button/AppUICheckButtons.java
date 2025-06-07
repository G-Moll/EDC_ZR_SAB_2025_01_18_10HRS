package com.rdk.button;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class AppUICheckButtons {
    public static void displayUI() {
        JFrame appFrame = new JFrame();
        JCheckBox checkBoxOne, checkBoxTwo;

        checkBoxOne = new JCheckBox( "C++" );
        checkBoxTwo = new JCheckBox( "Java", true );
        checkBoxOne.setBounds( 100, 100, 100, 50 );
        checkBoxTwo.setBounds( 100, 150, 100, 50 );

        appFrame.add( checkBoxOne );
        appFrame.add( checkBoxTwo );
        appFrame.setSize( 400, 500 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
