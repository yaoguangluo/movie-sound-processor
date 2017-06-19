package org.LYG.node.sound.MedianFilter;
import imageProcessor.ReadWritePng;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.BytestoAIS;
import soundProcessor.MedianPro;
import soundProcessor.soundAttribute;
import soundProcessor.soundPlay;
public class MedianFilterNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MedianFilterNodeRun( ) throws IOException
 	{	
 	}
	public void run(final MedianFilterNodeView thisview) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
				 MedianPro gs=new MedianPro();
				 Vector lines = gs.getVectorLines(toplygin);
				 thisview.lygout=toplygin;
	}
}
