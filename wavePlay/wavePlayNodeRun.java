package org.LYG.node.sound.wavePlay;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import org.LYG.GUI.OSGI.*;

public class wavePlayNodeRun extends objectRun 
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	jp jj;
	public wavePlayNodeRun( ) throws IOException
 	{	
 	}
	public void run(final wavePlayNodeView thisview) throws IOException, UnsupportedAudioFileException, InterruptedException
	{ 			
		 jj=new jp(toplygin);			
		 JFrame ff=new JFrame();
		 ff.add(jj);
		 //ff.addWindowListener(this);
		 //.setDefaultCloseOperation(JFrame..EXIT_ON_CLOSE);
	     ff.setSize(500, 200);
	     ff.setVisible(true);
		 thisview.lygout = toplygin;
		 System.out.println("end");
				 //anasys
	}
}
