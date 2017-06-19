package org.LYG.node.sound.WavRead;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class WavReadNodeInterface extends objectInterface
{	
	public WavReadNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("MUSIC.jpg"));
		thisname=new String("WAVRead");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new WavReadNodeView();
		thisrun=new WavReadNodeRun();
		thispanel=new WavReadNodePanel((WavReadNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((WavReadNodeRun) thisrun).run((WavReadNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new WavReadNodeInterface();   
	        return stu;  
	}
}
