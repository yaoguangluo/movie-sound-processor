package org.LYG.node.sound.MedianFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class MedianFilterNodeInterface extends objectInterface
{	
	public MedianFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisname=new String("MedianFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new MedianFilterNodeView();
		thisrun=new MedianFilterNodeRun();
		thispanel=new MedianFilterNodePanel((MedianFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((MedianFilterNodeRun) thisrun).run((MedianFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new MedianFilterNodeInterface();   
	        return stu;  
	}
}
