package org.LYG.node.sound.GuassianWav2DFilter;
import imageProcessor.ReadWritePng;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.ButterworthPro;
import soundProcessor.BytestoAIS;
import soundProcessor.Guassian2dPro;
import soundProcessor.MedianPro;
import soundProcessor.soundAttribute;
import soundProcessor.soundPlay;
public class GuassianWav2DFilterNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GuassianWav2DFilterNodeRun( ) throws IOException
 	{	
 	}
	public void run(final GuassianWav2DFilterNodeView thisview) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 Guassian2dPro gs2=new Guassian2dPro();
		 Vector lines = gs2.getVectorLines(toplygin);
		 thisview.lygout=toplygin;
	}
}
