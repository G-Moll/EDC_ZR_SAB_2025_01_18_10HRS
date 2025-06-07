package com.rdk.button;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class AppUIRadioButtons {
    public static void displayUI() {
        JFrame appFrame = new JFrame();
        JRadioButton radioButtonOne, radioButtonTwo, radioButtonThree, radioButtonFour;
        ButtonGroup groupOne, groupTwo;

        radioButtonOne = new JRadioButton( "Group A: Option One" );
        radioButtonTwo = new JRadioButton( "Group A: Option Two" );
        radioButtonThree = new JRadioButton( "Group B: Option One" );
        radioButtonFour = new JRadioButton( "Group B: Option Two" );

        groupOne = new ButtonGroup();
        groupTwo = new ButtonGroup();

        radioButtonOne.setBounds( 75, 50, 200, 30 );
        radioButtonTwo.setBounds( 75, 80, 200, 30 );
        radioButtonThree.setBounds( 75, 150, 200, 30 );
        radioButtonFour.setBounds( 75, 180, 200, 30 );

        groupOne.add( radioButtonOne );
        groupOne.add( radioButtonTwo );
        groupTwo.add( radioButtonThree );
        groupTwo.add( radioButtonFour );

        appFrame.add( radioButtonOne );
        appFrame.add( radioButtonTwo );
        appFrame.add( radioButtonThree );
        appFrame.add( radioButtonFour );
        appFrame.setSize( 400, 500 );
        appFrame.setLayout( null );
        appFrame.setVisible( true );
    }
}
