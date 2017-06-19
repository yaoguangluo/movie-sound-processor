package org.LYG.node.sound.HoughWavFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class HoughWavFilterNodeInterface extends objectInterface
{	
	public HoughWavFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("hutans.jpg"));
		thisname=new String("HoughWavFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new HoughWavFilterNodeView();
		thisrun=new HoughWavFilterNodeRun();
		thispanel=new HoughWavFilterNodePanel((HoughWavFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((HoughWavFilterNodeRun) thisrun).run((HoughWavFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new HoughWavFilterNodeInterface();   
	        return stu;  
	}
}
