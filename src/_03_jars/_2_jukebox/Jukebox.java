package _03_jars._2_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.advanced.AdvancedPlayer;

/*   If you don't have javazoom.jar in your project, you can download it from here: http://bit.ly/javazoom
 *   Right click your project and add it as a JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
JButton error = new JButton();
JButton startup = new JButton();
//2. Create a Song object for that mp3
Song startupxp = new Song("windows-xp-startup.mp3");
Song errorxp = new Song("windowsXPErrorSOUND.mp3");
    public void run() {

		// 1. Find an mp3 on your computer or on the Internet.
		
    	
		// 3. Play the Song
		/*
		 * 4. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
JFrame f = new JFrame();
JPanel p = new JPanel();
startup.setText("Windows XP Startup");
error.setText("del C:\\Windows\\System32");
f.setVisible(true);
p.add(startup);
p.add(error);
f.add(p);
startup.addActionListener(this);
error.addActionListener(this);
f.pack();
    }
    
    
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startup) {
			startupxp.play();
		}
		if(e.getSource()==error) {
			errorxp.play();
		}
		
	}

}



