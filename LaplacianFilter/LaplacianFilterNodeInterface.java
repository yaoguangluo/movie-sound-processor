package org.LYG.node.sound.LaplacianFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class LaplacianFilterNodeInterface extends objectInterface
{	
	public LaplacianFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("laplas.jpg"));
		thisname=new String("LaplacianWavFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new LaplacianFilterNodeView();
		thisrun=new LaplacianFilterNodeRun();
		thispanel=new LaplacianFilterNodePanel((LaplacianFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LaplacianFilterNodeRun) thisrun).run((LaplacianFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new LaplacianFilterNodeInterface();   
	        return stu;  
	}
}
