package org.LYG.node.sound.MaxMiniFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class MaxMiniFilterNodeInterface extends objectInterface
{	
	public MaxMiniFilterNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisname=new String("ÂÞÑþ¹âFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new MaxMiniFilterNodeView();
		thisrun=new MaxMiniFilterNodeRun();
		thispanel=new MaxMiniFilterNodePanel((MaxMiniFilterNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((MaxMiniFilterNodeRun) thisrun).run((MaxMiniFilterNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new MaxMiniFilterNodeInterface();   
	        return stu;  
	}
}
