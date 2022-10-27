package com.watch;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame{
	
	private JLabel heading;
	private JLabel clockLabel;
	private Font font = new Font("",Font.BOLD,35);
	
	MyWindow(){
		super.setTitle("Noise");
		super.setSize(400, 400);
		super.setLocation(300, 300);
		createGUI();
		this.startClock();
		super.setVisible(true);
	}
	public void createGUI() {
		heading = new JLabel("Noise ColorFit Ultra");
		clockLabel = new JLabel("Smart Watch");
		heading.setFont(font);
		clockLabel.setFont(font);
		this.setLayout(new GridLayout(5,3));
		this.setBackground(Color.black);
		this.add(heading);
		this.add(clockLabel);
	}
	public void startClock() {
		Timer timer = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
				String dateTime = sfd.format(d);
				clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}

}
