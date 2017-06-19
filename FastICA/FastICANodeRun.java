package org.LYG.node.sound.FastICA;
import imageProcessor.ReadWritePng;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

import pp.util.BLAS;

import soundProcessor.ButterworthPro;
import soundProcessor.BytestoAIS;
import soundProcessor.Guassian2dPro;
import soundProcessor.MedianPro;
import soundProcessor.soundAttribute;
import soundProcessor.soundPlay;
import wavelet.bss.ica.CFastICA;
import wavelet.bss.ica.ICAResult;
import wavelet.bss.util.SpectralAnalyzer;
import wavelet.bss.util.Util;
public class FastICANodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public FastICANodeRun( ) throws IOException
 	{	
 	}
	public void run(final FastICANodeView thisview) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		toplygin.toHead();
		
		double[][] rs,rx,mix,ry;
		Complex[][]	cx,cy;
		CFastICA app;
		ICAResult icares;
		
		
		    rs=new double[1][toplygin.adataFrame.audioArray.length];
		    
		    rs[0]=toplygin.adataFrame.audioArray;

		
		
		
			/*
			 * generate input signals
			 */
			//rs=Util.loadSignals(new File("data/demosig.txt"),Util.Dimension.COLUMN);
			//rs=Util.loadSignals(new File("data/mix.txt"),Util.Dimension.COLUMN);
			mix=BLAS.randMatrix(6,1);
			rx=BLAS.multiply(mix,rs,null);
		
			cx=new Complex[rx.length][];
			for(int i=0;i<cx.length;i++) cx[i]=SpectralAnalyzer.fft(rx[i]);
			
		
			
			
			/*
			 * apply ica
			 */	
			app=new CFastICA();
			icares=app.ica(cx);
			cy=icares.getEstimatedSignals();
			
			/*
			 * transform back to real signal
			 */
			ry=new double[cy.length][];
			for(int i=0;i<ry.length;i++) ry[i]=SpectralAnalyzer.ifftReal(cy[i]);
			
			Util.plotSignals(ry);
				    
		
		
	    while(toplygin.adataFrame.next!=null)
	    {
	    	toplygin.adataFrame=toplygin.adataFrame.next;
	     	
	    	
					    
	   	
	    }
		
	    
	    
	    
	    
		
		

		
		thisview.lygout=toplygin;
	}
}
