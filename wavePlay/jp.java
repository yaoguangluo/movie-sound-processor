package org.LYG.node.sound.wavePlay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

import movieProcessor.lygFileIO;

import soundProcessor.soundPlay;

public class jp extends JPanel implements Runnable
{
	lygFileIO cur;
	Thread t1;
	int reg=0;
	public jp (lygFileIO toplygin)
	{
		cur = toplygin;	 
		JButton j = new JButton("play bytes");
		j.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				  reg=1;
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j.setSize(100,30);
		
		JButton j1=new JButton("close");
		j1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				  reg=0;
				  t1.stop();
				  t1=null;
			}
		});
		j1.setSize(100,30);
		
		
		JButton j2 = new JButton("play array");
		j2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				  reg=2;
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j2.setSize(100,30);
		
		
		JButton j3 = new JButton("play master");
		j3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				  reg=3;
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j3.setSize(100,30);
		
		JButton j4 = new JButton("play slave");
		j4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				  reg=4;
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j4.setSize(100,30);
		
		
		JButton j5 = new JButton("play fftarray");
		j5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				  reg=5;
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j5.setSize(100,30);
		
		
		this.add(j);	
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
	} 
	
	public void run()
	{
		 if(reg==1)
		 {
			 cur.toHead();	 
			 if(cur.adataFrame!=null)
			{
				try {
					new soundPlay().Play(cur.adataFrame);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 cur.toHead();
			 return;
		 }
		 if(reg==2)
		 {
			 cur.toHead();	 
			 if(cur.adataFrame!=null)
			{
				new soundPlay().PlayArray(cur.adataFrame);
			}
			 cur.toHead();
			 return;
		 }
		 
		 
		 if(reg==3)
		 {
			 cur.toHead();	 
			 if(cur.adataFrame!=null)
			{
				new soundPlay().PlayMasterArray(cur.adataFrame);
			}
			 cur.toHead();
			 return;
		 }
		 
		 
		 if(reg==4)
		 {
			 cur.toHead();	 
			 if(cur.adataFrame!=null)
			{
				new soundPlay().PlaySlaveArray(cur.adataFrame);
			}
			 cur.toHead();
			 return;
		 }
		 
		 if(reg==5)
		 {
			 cur.toHead();	 
			 if(cur.adataFrame!=null)
			{
				new soundPlay().PlayFftArray(cur.adataFrame);
			}
			 cur.toHead();
			 return;
		 }
		 
		 
	}

}
