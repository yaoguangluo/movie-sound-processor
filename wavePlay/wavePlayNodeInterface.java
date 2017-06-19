package org.LYG.node.sound.wavePlay;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class wavePlayNodeInterface extends objectInterface
{	
	public wavePlayNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("play.jpg"));
		thisname=new String("WavePlay");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new wavePlayNodeView();
		thisrun=new wavePlayNodeRun();
		thispanel=new wavePlayNodePanel((wavePlayNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException, InterruptedException
	{
		((wavePlayNodeRun) thisrun).run((wavePlayNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new wavePlayNodeInterface();   
	        return stu;  
	}
}
