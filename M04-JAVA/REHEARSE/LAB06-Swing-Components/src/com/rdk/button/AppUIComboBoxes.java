package com.rdk.button;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class AppUIComboBoxes {
    public static void displayUI() {
        String countries[] = { "MX", "EU", "CN", "DE", "PE" };
        String people[] = { "Student", "Employee", "Unemployed" };
        JFrame appFrame = new JFrame();
        JComboBox comboBoxOne = new JComboBox( countries );
        JComboBox comboBoxTwo = new JComboBox( people );
        comboBoxOne.setBounds( 50, 50, 180, 20 );
        comboBoxTwo.setBounds( 50, 200, 180, 20 );

        appFrame.add( comboBoxOne );
        appFrame.add( comboBoxTwo );
        appFrame.setSize( 400, 500 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
