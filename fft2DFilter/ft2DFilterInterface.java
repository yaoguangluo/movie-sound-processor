package org.LYG.node.sound.fft2DFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class ft2DFilterInterface extends objectInterface
{	
	public ft2DFilterInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisname=new String("fft2D");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new ft2DFilterView();
		thisrun=new ft2DFilterRun();
		thispanel=new ft2DFilterPanel((ft2DFilterRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((ft2DFilterRun) thisrun).run((ft2DFilterView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new ft2DFilterInterface();   
	        return stu;  
	}
}
