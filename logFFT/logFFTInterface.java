package org.LYG.node.sound.logFFT;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class logFFTInterface extends objectInterface
{	
	public logFFTInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisname=new String("logFFT");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new logFFTView();
		thisrun=new logFFTRun();
		thispanel=new logFFTPanel((logFFTRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((logFFTRun) thisrun).run((logFFTView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new logFFTInterface();   
	        return stu;  
	}
}
