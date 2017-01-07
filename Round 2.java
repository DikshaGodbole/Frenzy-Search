import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.util.regex.*;
class Round2
{	
	//public int qno=0;
	int total=50;
	int qn=1;
	JFrame JF1,JF2;
	JLabel JL1,JL2,timecounter,img;
	JTextArea JTA1;
	JButton JB1,JB2,JB3,start;
	int TimeLimit=1;
	boolean strt=false;
	int minutes,seconds=0;
	String[] splitted=new String[50];
	String answer_low_case, split_low_case, temp,temp2,temp3,newtemp;
	public int flag=0,count=0,ans,score=0;
	public String name;
	int ar[]=new int[30];
	int i;

	String qw="";
	String ansr;	
	public int quesNo=1;
	//public int count=0;
	static String []question =new String[]{"",
		"1) Who assisted in making first computer mouse ?",

		
		"2)OS Version of iTV",

		
		"3)who suggested to built the first steam-powered vehicle", 
	 

		"4)what is used for making an experimental model of an electric circuit.?",
	
				
		"5)The smell of rain is due to-------------",
 

		"6)what was the First type of steam engine for separate condenser?",


		"7)What is used to treat malaria which Willam Harvey demonstrated ?",


		"8).which considered by most researchers to be the first successful microcomputer ?",


		"9)Initial general name of apple's logo ?",


		"10)Tcp/ip was adopted as what standard in 1980?",

		
		"11)what is the role C3S in cement",
		
		"12)Both indoor and outdoor heat pump units contain moving mechanical components which produce----------",
		

		"13)base on which type of design Marcel Bich introduce  ballpaint pen in american marketplace",
		

		"14)what is the cost of first eyephone?? (not iPhone)",
			

		"15)which technology is used by keyboard to send electronic impulses to computer",
		

		"16)what did cooper co founded in 1983",
		

		"17)who proposed CableCARD replacement",


		"18)which heat pumps operate on mechanical energy",


		"19)the granular noice is reduce by",
		
		
		"20)Who is the Best Goalkeeper in 2010 FIFA World Cup?",
		
		
		"21)Give name of Football club of a player who is winner of Ballon D'Or  award in 1970.",
		
		
		"22)Name of second Marathi movie nominated for Oscar?",
		
				
		"23)Who is the writer of novel 'Amruta'?",
			
		
		"24)Where the first Indian bollywood movie is release?",
		
		
		"25)According to Iamblichus in The life of Pythagoras, translated by -----------",
		

		"26)The animal that can change color and take shapes of other animals is ______",
		

		"27)India's president who took only 50% of his salary is ______",
		

		"28)What is the total number of words in english language that end with '-ous'?",
		

		"29)On December 17,1903,Wright Brothers made a record lasting flight,this record flight lasted for how many seconds?",
		
				
		"30) Who first produced playing cards (hanafuda) ?" 
				
		};
	
	
	static String []Answer =new String[]{"",
		//1
		"Bill English",

		//2
		"OS X Tiger",
	
		//3 
		"Ferdinand Verbiest", 

		//4
		"Breadboard",
		
		//5
		"actinomycetes", 

		//6
		"Watt steam engine",

		//7
		"Quinine",

		//8
		"Osborne 1",

		//9
		"Rainbow logo",

		//10
		"U.S.  Department of Defense (DoD)",
		
		//11
		"initial set and early strength",

		//12
		"Noise",

		//13
		"Argentine designs",
		
		//14
		"$ 500",	

		//15
		"VDT tehnology",

		//16
		"Cellular Business Systems , Inc. (CBSI)",

		//17
		"U.S Federal Communications Commission (FCC)",
			
		//18
		"Compression",
			

		//19
		"redusing the step size",
		
		//20
		"Iker Casillas",

		//21
		"Bayern Munich",
		
		//22
		"Harishchandra's Factory",
		
		//23
		"Raghuveer Chaudhari",	
		
		//24
		"Olympia Theatre , Grant Road",
		
		//25
		"Thomas Taylor",

		//26
		"Mimic Octopus",

		//27
		"Dr Rajendra Prasad",

		//28
		"1201",

		//29
		"59",	
		
		//30 
		"Nintendo"

};
	Round2()
	{
		JF1= new JFrame();
		JF1.setBounds(0,0,1366,768);
		JF1.setLayout(null);
		JF1.setBounds(0,0,1366,778);
		img=new JLabel(new ImageIcon("/home/priyanka/a.jpg"));
		img.setBounds(0,0,1366,778);
		JF1.add(img);
		img.setLayout(null);

		
		
		JL1 = new JLabel("Frenzy Search");
		JL1.setForeground(Color.white);
		JL1.setFont(new Font("URW Chancery ", Font.BOLD+Font.ITALIC, 40));

		JL2 = new JLabel("Welcome to Frenzy Search!!!!!!!!!!!!!");
		JL2.setFont(new Font("Verdana", Font.ITALIC, 20));
		JL2.setForeground(Color.white);

		timecounter=new JLabel();
		timecounter.setFont(new Font("Courier New", Font.ITALIC+Font.BOLD,25));

		//JL2.setText(question[1]);
		System.out.println(question[1]);
		//JB1 = new JButton("Previous");
		JB2 = new JButton("Next");
		JB3 = new JButton("Exit");
		start=new JButton("Start");
		
		JTA1 = new JTextArea();
		
		timecounter.setBounds(700,80,600,150);
		JL1.setBounds(500,30,600,50);
		JL2.setBounds(100,250,1200,25);

	
		JTA1.setBounds(100,300,700,200);

		JTA1.setFont(new Font("Verdana", Font.ITALIC, 20));

		start.setBounds(450,500,250,50);
		start.addActionListener(new Action());
		//JB1.setBounds(400,610,150,50);
		//JB1.addActionListener(new Action());
		JB2.setBounds(600,610,150,50);
		//JB2.addActionListener(new Action());
		JB3.setBounds(1100,610,100,50); 
		JB3.addActionListener(new Action());
		
		img.add(JL1);
		img.add(JL2);
		
		//JF1.add(JTA1);

		img.add(start);
		//JF1.add(JB1);
		//JF1.add(JB2);
		img.add(JB3);
		
		//JF1.setLayout(null);
		JF1.setVisible(true);
	}
	public class Action implements ActionListener
	{	

		public void actionPerformed(ActionEvent ae)
		{
			try
			{
				String  event = ae.getActionCommand();
				//String s=event.getLabel();
				if(event.equals("Exit")) 
				{	

					savedata();
					
					//clearData();
					
				}
				else if(event.equals("Start"))
				{	
					
					try 
   					{	
   						Object studentname = JOptionPane.showInputDialog(JF1, "Enter your Full Name without spaces :");
						name=studentname.toString();
						//studentname = JOptionPane.showInputDialog("Enter your name: ");
						int aq=name.length();
						if(aq < 1) 
						{
							name = "Anonymous";
						}
						else 
						{
							name = name;
						}

 						Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
			   			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Round_2","root","root");
	       				System.out.println("Connection established...");
	            		Statement st = cn.createStatement();
	            		//con();
	            		//String a="CREATE TABLE IF EXISTS '"+name+"' (Sr_No int,Que varchar(250),Ans varchar(250),urAns varchar(300),Output int)";
	            		String a="CREATE TABLE IF NOT EXISTS  ";
	            		a = a.concat(name);
	            		a =	a.concat(" (qno int, answer varchar(250))");
	            		
	            		System.out.println(a);
						//String DB ="CREATE TABLE IF NOT EXISTS '"+name+"' (Sr_No int,QN varchar(250),AN varchar(250),YA varchar(300),Output int)"; 
                		st.executeUpdate(a);
                		String s1="insert into ";
                		s1= s1.concat(name);
                		s1= s1.concat("(qno) values(1)");
                		System.out.println("Start button Clicked...\n"+s1);
                		st.executeUpdate(s1);
                		
                	}
                	catch(NullPointerException e)
					{ 	
						System.exit(0); 
					}
					
					JB2.addActionListener(new Action());
					img.add(JB2);
					JB2.setVisible(true);
					
					
					//JL2.setText("Please click on next button");
					start.setVisible(false);
					strt=true;
					seconds=60;

					img.add(JTA1);
					if(TimeLimit >0)new Timer();
					img.add(timecounter);

					JL2.setText(question[quesNo]);
					System.out.println(strt);
							//ansr=JTA1.getText();

					
				}//stsrt end
					//if(strt)
					//{	
						
						//JF1.add(JTA1);
						//JF1.add(JB1);
						//JF1.add(JB2);

						
						/*if (event.equals("Previous")) 
						{	
							PrevButton();
							 if (quesNo!=0) 
							{
								quesNo--;
			
							}
							else if(quesNo==0)
							{
								quesNo=1;
								JL2.setText(question[quesNo]);
							}
							
							JL2.setText(question[quesNo]);
		

							

					
						}
						*/if(strt)
						{
							if (event.equals("Next")) 
							{	
								seconds=0;
								NextButton();
								
							
							}
					}

					


				
			}//outer try end
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}//actionperformed close

		public void NextButton()
		{
			
	    	ansr=JTA1.getText();
	    	System.out.println("Array seconds at "+i+":"+ar[i]);
	    	i++;
	        
	        if(ansr!=null)
	       	{
	        	try
	        	{	

	    			Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Round_2","root","root");
	        		System.out.println("Connection established...");
	            	Statement st = cn.createStatement();
	            	//int QN=quesNo;
	            	System.out.println("Question "+quesNo);
	            	System.out.println("Next Button Clicked...");

	            	String check1= "select * from ";
	            	check1=check1.concat(name);
	            	check1=check1.concat(" where qno='"+quesNo+"'");
	            	System.out.println(check1);
					ResultSet r1=st.executeQuery(check1);
					
					while(r1.next())
					{
						qw= r1.getString(2);
						System.out.println(qw);		
					}
					
					
					if(qw ==null) 
					{
					 	//ansr=JTA1.getText();
						System.out.println(qw);						
				   		String temp="insert into ";
				   		temp=temp.concat(name);
				   		temp=temp.concat(" values('"+quesNo+"','"+ansr+"')");
				   		System.out.println(temp);
	            		st.executeUpdate(temp);
	            		JTA1.setText("");
	            	}

					else
					{

						//String ab1=JTA1.getText();
						String updat="update ";
						updat=updat.concat(name);
						updat=updat.concat(" set answer='"+ansr+"'where qno='"+quesNo+"'");
						System.out.println(updat);
						st.executeUpdate(updat);
						JTA1.setText(qw);

					}
					check();


					quesNo++;	
					if (quesNo<=total) 
					{	
						

						JL2.setText(question[quesNo]);
						System.out.println(strt);
						System.out.println("Question number:"+quesNo);
	
					}

					else
					{
						JL2.setText(question[1]);
					}

					qn=qn+1;
					System.out.println("value of qn"+qn);
					seconds=60;

									}
					
	        	catch(SQLException e)
	        	{
					JOptionPane.showMessageDialog(null, e);                    
	        	    
	        	} 
	        	catch (ClassNotFoundException ex) 
	        	{
	        	     Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
	    		}
			}
		}//next button end

		public void check()
		{
			System.out.println("Answer[quesNo]::"+Answer[quesNo]+"\n QN::"+(quesNo));
			
			System.out.println("Answer ka question"+(quesNo));
			splitted = Answer[(quesNo)].split("\\s+");
			answer_low_case=ansr.toLowerCase();
			System.out.println("\nUser Input::"+answer_low_case);
			for(int i=0; i < splitted.length ; i++)
			{	
				System.out.println("Splitted array::"+splitted[i]);
			}
			
				for(int index=0; index < splitted.length ; index++)
				{	
					temp = splitted[index];

						

					if(temp.startsWith("(") && temp.endsWith(")"))
					{
	
							temp2=temp.substring(1);
							temp3=temp2.substring(0,temp2.length()-1);

							if(answer_low_case.contains(temp3.toLowerCase()))
							{
								ans=1;
								flag = flag | ans;
								System.out.println("FLAG = "+flag);
							}
	
					}	
			
					else if(temp.startsWith("("))
					{
	
							temp2=temp.substring(1);


							if(answer_low_case.contains(temp2.toLowerCase()))
							{
								ans=1;
								flag = flag | ans;
								System.out.println("FLAG = "+flag);
							}			
	
					}
					else if(temp.endsWith(")"))
					{
	
							temp2=temp.substring(0,temp.length()-1);


							if(answer_low_case.contains(temp2.toLowerCase()))
							{
								ans=1;
								flag = flag | ans;
								System.out.println("FLAG = "+flag);
							}
	
					}

			
					else if(answer_low_case.contains(temp.toLowerCase()))
					{
							ans=1;
							flag = flag | ans;
							System.out.println("FLAG = "+flag);
					}

			}

			if(flag==1)
			{
				score++;
				flag=0;
			}			
			System.out.println("\nSCORE:"+score+"\nEND");

		}//check end
		

        
		public class Timer extends Thread implements Runnable
        {
			public Timer()
			{
				new Thread(this).start();
			}

    	public void run() 
    	{
			while(strt)
			{
    	        try 
    	        {
    	           Thread.sleep(1000);
    	           seconds--;
    	           ar[i]=(60-seconds);
					if(seconds==0)
					{

    	                NextButton();
    	                seconds=60;
					}
					timecounter.setText("    Time Counter: "+seconds+" secs ");

					/*if(minutes==TimeLimit)
					{
						strt=false;
						JF1.remove(timecounter);
						NextButton();
						//timecounter.setText("Time Over!!!!!!!!!!!! Please press Exit button");

					}*/
					if(qn==30)
					{
						
						JTA1.setVisible(false);
						JL2.setVisible(false);
						JB2.setVisible(false);
						timecounter.setText("Game over please click on EXIT.....");
						//savedata();

					}
			    }
   	         catch(InterruptedException ex)  { System.out.print(ex); }
			}
   	 	}
	}
	public void savedata()
{	

	qn++;
	System.out.println("\n\nThe value of qn"+qn);
	int sum=0;

	for(int j=0;j<30;j++)
	{
		
		System.out.println("\nSeconds:"+ar[j]);

	}

	for(int j=0;j<30;j++)
	{
		sum=sum+ar[j];

	}

	String a=Integer.toString(sum);
	System.out.println("\n value of sum:"+a);

	System.out.println("You have solved questions within time: "+sum+"seconds");

	try
	       		{	

	    			Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Round_2","root","root");
	        		System.out.println("Connection established...");
	            	Statement st = cn.createStatement();
	            	String s1="insert into ";
	            	s1=s1.concat(name);
	            	s1=s1.concat(" values('"+qn+"','"+a+"')");
	            	System.out.println("\n\nsave question:: "+s1);
	            	st.executeUpdate(s1);
	            	
	            	qn++;

	            	String s2="insert into ";
	            	s2=s2.concat(name);
	            	s2=s2.concat(" values('"+qn+"','"+score+"')");
	            	System.out.println("\n\nsave question:: "+s2);
	            	st.executeUpdate(s2);


	            	//int QN=quesNo;
	            }
	            catch(SQLException e)
	        	{
					JOptionPane.showMessageDialog(null, e);                    
	        	    
	        	} 
	        	catch (ClassNotFoundException ex) 
	        	{
	        	     Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
	    		}
	    		System.out.println("\n\nThe value of qn"+qn);


	JF1.dispose();
	System.exit(0);
}
	

	
}
	public static void main(String args[])
	{	
		Round2 F = new Round2();
	}

}


