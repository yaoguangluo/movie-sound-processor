package org.LYG.node.sound.GuassianWav2DFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class GuassianWav2DFilterNodeInterface extends objectInterface
{	
	public GuassianWav2DFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("gaosi.jpg"));
		thisname=new String("GuassianWaveFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new GuassianWav2DFilterNodeView();
		thisrun=new GuassianWav2DFilterNodeRun();
		thispanel=new GuassianWav2DFilterNodePanel((GuassianWav2DFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((GuassianWav2DFilterNodeRun) thisrun).run((GuassianWav2DFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new GuassianWav2DFilterNodeInterface();   
	        return stu;  
	}
}
