package org.LYG.node.sound.HoughWavFilter;
import imageProcessor.ReadWritePng;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.ButterworthPro;
import soundProcessor.BytestoAIS;
import soundProcessor.HoughPro;
import soundProcessor.LaplacianPro;
import soundProcessor.MedianPro;
import soundProcessor.soundAttribute;
import soundProcessor.soundPlay;
public class HoughWavFilterNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public HoughWavFilterNodeRun( ) throws IOException
 	{	
 	}
	public void run(final HoughWavFilterNodeView thisview) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 HoughPro gs=new HoughPro();
		 Vector lines = gs.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(gs.audioData,topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 thisview.aisout=topaisin;
	}
}
