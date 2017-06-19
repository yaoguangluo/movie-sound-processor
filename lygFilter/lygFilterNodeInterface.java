package org.LYG.node.sound.lygFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class lygFilterNodeInterface extends objectInterface
{	
	public lygFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisname=new String("lygFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new lygFilterNodeView();
		thisrun=new lygFilterNodeRun();
		thispanel=new lygFilterNodePanel((lygFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((lygFilterNodeRun) thisrun).run((lygFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new lygFilterNodeInterface();   
	        return stu;  
	}
}
