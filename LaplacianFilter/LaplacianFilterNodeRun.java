package org.LYG.node.sound.LaplacianFilter;
import imageProcessor.ReadWritePng;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.ButterworthPro;
import soundProcessor.BytestoAIS;
import soundProcessor.LaplacianPro;
import soundProcessor.MedianPro;
import soundProcessor.soundAttribute;
import soundProcessor.soundPlay;
public class LaplacianFilterNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public LaplacianFilterNodeRun( ) throws IOException
 	{	
 	}
	public void run(final LaplacianFilterNodeView thisview) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 LaplacianPro gs=new LaplacianPro();
		 Vector lines = gs.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(gs.laplacian,topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 thisview.aisout=topaisin;
	}
}
