package org.LYG.node.sound.lygSlaveFilter;
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
public class lygSlaveFilterView extends objectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public Vector lines = new Vector();
	public lygSlaveFilterView()
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
		          int w = 800;
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
	                
	                  for (int i = 1; i < lygout.adataFrame.master.length; i++) {
	                	  g2.setColor(Color.black);
	                	  g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.orge[i-1]/30, i*5, 300-(int)lygout.adataFrame.orge[i]/30);
	                	  g2.setColor(Color.blue);
	                      g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.master[i-1]/30, i*5, 300-(int)lygout.adataFrame.master[i]/30);
	                      g2.setColor(Color.RED);
	                      g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.slave[i-1]/30, i*5, 300-(int)lygout.adataFrame.slave[i]/30);
	                  
	                  
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
