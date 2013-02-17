package com.diycomputerscience.minesweeper.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class UI extends JFrame {
	
	public static UI build() {
		UI ui = new UI();

		// TODO: Set the size of the UI		
		
		// TOOD: Make the UI visible		
		
		// TODO: Set the default close operation to EXIT_ON_CLOSE so the JFrame exits when we click on the 'x' button on the title pane
		
		
		return ui;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				build();
			}
					
		});		
	}

}
