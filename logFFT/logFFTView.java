package org.LYG.node.sound.logFFT;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Vector;

import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;

import soundProcessor.BytestoAIS;
import soundProcessor.soundWaveVector;
public class logFFTView extends objectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public Vector lines = new Vector();
	public logFFTView()
	{
 	}
	public void view() throws Exception
	{
		jsp = new ScrollPane();
		//show graph
		soundWaveVector sv = new soundWaveVector();
		lines = sv.getVectorLines(lygout);

		jp=new Panel()
		{
			private static final long serialVersionUID = 1L;

			public void paint(Graphics g) {

		     	  Dimension d = this.getSize();
		          int w = 1024;
		          int h = 600;
		         // System.out.println(d.width+"**"+d.height);
		          int INFOPAD = 15;
		          //Graphics g= getGraphics();  
		          Graphics2D g2 = (Graphics2D) g;
		          g2.setBackground(Color.white);
		          g2.clearRect(0, 0, w, h);
		          g2.setColor(Color.white);
		          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		          if (lygout != null) {
	                  // .. render sampling graph ..
	                
	                  for (int i = 1; i < lygout.adataFrame.logfftarray[0].length; i++)
	                  {
	                	  //for (int j = 1; i < lygout.adataFrame.logfftarray[i].length; i++)
		                  {  
	                	  
	                	  g2.setColor(Color.black);
	                	  g2.drawLine((i-1),300-(int)lygout.adataFrame.logfftarray[0][i-1],
	                			          i,300-(int)lygout.adataFrame.logfftarray[0][i]);
	                	  
		                  }
	                  
	                  }
	              }
		     }
		};	
		//
		jsp.add(jp);
		add(jsp);
		close=false;
		this.setClosable(true);	
		this.resizable=true;
	}
	    @Override  
	    public objectView clone() {   
	        addr = (objectView)super.clone();  
	        return addr;  
	    }  
	
	
}
