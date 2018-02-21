import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.util.regex.*;

class Round2A
{	
	int total=101;
	int qn=1;
	
	//Frame, Label, TextArea, Button and String declaration
	JFrame JF1,JF2;
	JLabel JL1,JL2,timecounter,img,img2,area,area1,area2,area3,area4,area5;
	JTextArea JTA1;
	JButton JB1,JB2,JB3,start;
	int TimeLimit=1;
	boolean strt=false;
	int minutes,seconds=0;
	String[] splitted=new String[50];
	String answer_low_case, split_low_case, temp,temp2,temp3,newtemp;
	public int flag=0,count=0,ans,score=0;
	public String name="notapplicable";
	int ar[]=new int[31];
	int i;
	int rank[]=new int[30];
	String qw="";
	String ansr;	
	public int quesNo=1;
	
	// Questions 
	
	static String []question =new String[] {"No of innings Rahul Dravid played in test?",
"1)Bubble power works under the principle of sonofusion , which is technically known as:__ __ ___ ___ ",
"2)What is the cost of first eyephone?? (not iPhone)(Only Number)",
"3)United States deployed an experimental e-bomb on _____(dd/mm/yyyy)",
"4)OS Version of iTV : ",
"5)Initial general name of Apple's logo ?",
"6)Who assisted in making the first computer mouse ?",
"7)What is the input device used to track the emotions of a user by a simple touch on it?",
"8)James Gosling team for developing Java (sun Microsystem) was known as? ",
"9)What is the command to print data on the webpage?",
"10)Sessions are stored on the ----, and ----- are stored on the user's computers in text file format",
"11)If a computer provides database services to other, then it will be known as ?",
"12)Verification is process of ?",
"13)In hub polling, also referred to as token polling, each element polls the next element in some _______ sequence",
"14)Snapdragon 801 has the highest bandwidth of ______GB/s",
"15)Andiod is licensed under which licensing license?",
"16)Error detection at the data link level is achieved by___",
"17)Unmodulated signal coming from a transmitter is know as?",
"18) What was previous job of the director of museum of failure?",

"19) Which firm invested 3 million dollars in the company zip2?",

"20) Of which comapny's pc was Mark Zuckerberg's first pc?", 

"21) What did Mark Zuckerberg named his first messenger software?",

"22)From whom did Michael Sayman got the idea to create 4Snaps app?",

"23)For how many years did Nikola Tesla lived in New York?(Only Number)",

"24)Under what name the founder of wiki leaks started hacking?",

"25)What name for linux had inventor of linux considered before linux?",

"26)From which books did author of Game of Thrones got inspiration to write Game of Thrones?",
"27)When did the word bicycle apeared?(yyyy)",
"28)Domain registration was free until when? Use (dd/mm/yyyy) format",
"29)How to create a new element node in XML ?",
				
};
static String [] Answer = new String[]{	"286",
	
//1
"acoustic inertial confinement fusion",
//2
"500",
//3
"24/03/2003",
//4
"OS X Tiger",
//5
"Rainbow logo",
//6
"Bill English",
//7
"Emotion mouse",
//8
"Green Team",
//9
"echo",
//10
"server cookies",
//11
"Database server",
//12
"Authentication",
//13
"Fixed",
//14
"14.9",
//15
"Apache MIT",
//16
"Cyclic Redundancy Code",
//17
"Baseband signal",
//18
"Clinical psychologist",

//19
"Mohr Davidow ventures",

//20
"Quantex",

//21
"Zucknet",

//22
"sister",

//23
"60",

//24
"Mendax",

//25
"Freax",

//26
"Lord of the Rings",
//27
"1868",
//28
"14/09/1995",
//29
"createElement()"

};

		
	Round2A()
	{
	        // JFrame definition
		JF1= new JFrame();
		JF1.setBounds(0,0,1366,768);
		JF1.setLayout(null);
		JF1.setBounds(0,0,1366,778);
		
		
		
		img=new JLabel(new ImageIcon("hd2.jpg"));
		img.setBounds(0,0,1366,778);
		JF1.add(img);
		img.setLayout(null);
		
		
		img2=new JLabel(new ImageIcon("logo.png"));
		img2.setBounds(1100,30,80,100);
		JF1.add(img2);
		img2.setLayout(null);
		
		// Rules definition
		area = new JLabel("Round 2 rules : ");
		area.setFont(new Font("Verdana ", Font.BOLD, 20));
		area.setForeground(Color.white);
		area.setBounds(50,100,1366,200);
		
		// Rule 1 
		area1 = new JLabel("1. The time limit will be of 10 minutes.");
		area1.setFont(new Font("Verdana ", Font.BOLD, 20));
		area1.setForeground(Color.white);
		area1.setBounds(50,140,1366,200);
		
		// Rule 2 
		area2 = new JLabel("2. Copy pasting the question in the search engine is strictly prohibited.");
		area2.setFont(new Font("Verdana ", Font.BOLD, 20));
		area2.setForeground(Color.white);
		area2.setBounds(50,165,1366,200);
		
		// Rule 3 
		area3 = new JLabel("3. You can copy paste the answer into the text area from the search engine. ");
		area3.setFont(new Font("Verdana ", Font.BOLD, 20));
		area3.setForeground(Color.white);
		area3.setBounds(50,190,1366,200);
		
		// Rule 4 
                area4 = new JLabel("4. Participants should answer maximum questions within the given time only.");
		area4.setFont(new Font("Verdana ", Font.BOLD, 20));
		area4.setForeground(Color.white);
		area4.setBounds(50,215,1366,200);
		
		// Rule 5 
                area5 = new JLabel("5. After pressing exit call any volunteer to your station.");
		area5.setFont(new Font("Verdana ", Font.BOLD, 20));
		area5.setForeground(Color.white);
		area5.setBounds(50,240,1366,200);
		
		// Pro-Googler Label 
		JL1 = new JLabel("PRO-GOOGLER : ROUND 2");
		JL1.setFont(new Font("Verdana ", Font.BOLD, 50));
		JL1.setForeground(Color.white);
		JL1.setBounds(100,30,1000,50);
		
		// Questions label 
		JL2 = new JLabel("");
		JL2.setFont(new Font("Verdana", Font.BOLD, 20));
		JL2.setForeground(Color.white);
		JL2.setBounds(45,140,1366,160);
		
		// Time counter
		timecounter=new JLabel();
		timecounter.setFont(new Font("Courier New",Font.BOLD,20));
		timecounter.setBounds(735,150,1366,400);
		timecounter.setForeground(Color.white);
		
		// Next Button definition
		JB2 = new JButton("Next");
		JB2.setBounds(210,610,150,50);
		JB2.addActionListener(new Action());
		JB2.setVisible(false);
		
		// Exit Button definition
		JB3 = new JButton("Exit");
		JB3.setBounds(800,610,150,50); 
		JB3.addActionListener(new Action());
		
		
		// Start Button definition 
		start=new JButton("Start");
		start.setBounds(450,610,250,50);
		start.addActionListener(new Action());
		
		
		
		
		
		
		
		// Border 
		Border border = BorderFactory.createLineBorder(Color.gray,5);
		
		// Text Area for answers
		JTA1 = new JTextArea();
		JTA1.setBorder(border);
		JTA1.setBounds(45,250,500, 200);
		JTA1.setFont(new Font("Verdana",Font.BOLD,25));
		
		
		// Adding everything on the background image		
		img.add(JL1);                   // Progoogler
		img.add(JL2);                   // Questions
		img.add(area);                  // Rules
		img.add(area1);
		img.add(area2);
		img.add(area3);
		img.add(area4);
		img.add(area5);
		img.add(start);                 // Start Button
		img.add(JB2);                   // Next Button 
		img.add(JB3);                   // Exit Button
		img.add(img2);
		
		
		JF1.setVisible(true);           // Frame
		
		for(i=1; i<=29; i++)
		{
			rank[i]=i;
		}
		
		
		// Random function for generating random questions
		Random rm = new Random();
		int temp, ind1, ind2;
		for(i=29; i>0; i--)
		{
			ind1= rm.nextInt(i);
			//System.out.println("\n------------"+ind1+"\n-------------\n"); 
			temp = rank[ind1];
			rank[ind1] = rank[i];
			rank[i] = temp;
		}	
		
	}
	
	// Action listener class
	public class Action implements ActionListener
	{	

		public void actionPerformed(ActionEvent ae)
		{
			try
			{
				String  event = ae.getActionCommand();
				if(event.equals("Exit")) 
				{	

                    int confirmed = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit the program?", "Exit   Program",JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) 
            {   
                savedata();
                System.exit(0);
                 
            }
            else
            {
               return;
            }
    
					                    // Save the data and return score 
					 
					
				}
				else if(event.equals("Start"))
				{	
					
					try 
   					{	
   					    Object studentname = JOptionPane.showInputDialog(JF1, "Enter your Full Name without spaces :");
						name=studentname.toString();
						int aq=name.length();
						if(aq < 1) 
						{
							name = "Anonymous";                     // Test case for name. If no name entered 
						}                                               // Anonymous is taken. 
						else 
						{
							name = name;
						}

 						Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
			   			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy2","root","root");
                                System.out.println ("Database connection established"); 
	            		Statement st = cn.createStatement();
	            		String a="CREATE TABLE IF NOT EXISTS  ";
	            		a = a.concat(name);
	            		a =	a.concat(" (qno int, answer varchar(250))");		
                		st.executeUpdate(a);
                		
                	}      // Try block ends here 
                	
                	catch(NullPointerException e)
					{ 	
						System.exit(0); 
					}   // Catch block ends here 
					
					//JB2.addActionListener(new Action());
					//img.add(JB2);
					  
   					
					
					
					JB2.setVisible(true);           // Next button visible
					area.setVisible(false);         // Rules invisible
					area1.setVisible(false);
					area2.setVisible(false);
					area3.setVisible(false);
					area4.setVisible(false);	
					area5.setVisible(false);
					start.setVisible(false);        // Start button invisible
					strt=true;
					seconds=59;
					minutes=9;
					img.add(JTA1);                  // Text area for answers visible
					if(TimeLimit >0)new Timer();
					img.add(timecounter);           // Timer visible
					JL2.setText(question[rank[quesNo]]);    // Questions displayed
					
				}//start end
					
						if(strt)
						{
							if (event.equals("Next")) 
							{	
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
	    	i++;
	        
	        if(ansr!=null)
	       	{
	        	try
	        	{	
	        		
	        	Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy2","root","root");
		        Statement st = cn.createStatement();
                	
                	// Insert the answers in the table with name as the name entered by the participant
                	String s1="insert into ";
                	s1= s1.concat(name);
                	s1= s1.concat(" values('"+rank[quesNo]+"','"+ansr+"')");
                	st.executeUpdate(s1);
                	
                	// Logic to return answers from the database according to the question number
	            	String check1= "select * from ";
	            	check1=check1.concat(name);
	            	check1=check1.concat(" where qno='"+rank[quesNo]+"'");
			ResultSet r1=st.executeQuery(check1);
					
					while(r1.next())
					{
						qw = r1.getString(2);		
					}
					
					JTA1.setText("");
					if(qw == null) 
					{
				   		String temp="insert into ";
				   		temp=temp.concat(name);
				   		temp=temp.concat(" values('"+rank[quesNo]+"','"+ansr+"')");
	            		                st.executeUpdate(temp);
	            		                JTA1.setText("");
	            	                }

					else
					{
						String updat="update ";
						updat=updat.concat(name);
						updat=updat.concat(" set answer='"+ansr+"'where qno='"+rank[quesNo]+"'");
						st.executeUpdate(updat);
						JTA1.setText("");

					}
					check();
					quesNo++;	
					if (quesNo<total)                               // Check if total questions attempted is less
					{	                                        // than the total questions and display new q.
						JL2.setText(question[rank[quesNo]]);
					
					}

					else
					{
						throw new Exception();
					}

									}
					
	        	catch(SQLException e)
	        	{
					JOptionPane.showMessageDialog(null, e);         // Display SQL Exceptions              
	        	    
	        	} 
	        	catch (ClassNotFoundException ex) 
	        	{
	        	     Logger.getLogger(Round2A.class.getName()).log(Level.SEVERE, null, ex);
	    		}
	    		catch (Exception e) 
	    		{
	    			        JTA1.setVisible(false);
					JL2.setVisible(false);
					JB2.setVisible(false);
					
					// Exit Label 
					JLabel Exit=new JLabel("Game over please click on EXIT.....");
					timecounter.setVisible(false);	
					Exit.setBounds(45,300,500,400);
					Exit.setFont(new Font("Verdana",Font.BOLD,25));
					Exit.setForeground(Color.white);
					img.add(Exit);
	    		}
			}
		} //next button end
		

                
                // Function to calculate the score
                
		public void check()                     
		{
			splitted = Answer[rank[quesNo]].split("\\s+");
			answer_low_case=ansr.toLowerCase();
				for(int index=0; index < splitted.length ; index++)
				{	
					temp = splitted[index];
					 if(answer_low_case.contains(temp.toLowerCase()))
					{
							ans=1;
							flag = flag | ans;
					}
			}

			if(flag==1)
			{       
			        
				score++;
				flag=0;
			}			
		}//check end
		
		
		// Function for the timer
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
					if(seconds==0)
					{
						minutes--;
    	                seconds=59;
	 				}
					if(minutes<0 || seconds==0)
					{
						savedata();
					}
					timecounter.setText(" "+minutes+" minutes " +seconds+" seconds");
			    }
   	         catch(InterruptedException ex)  { System.out.print(ex); }
			}
   	 	}
	}
	

	public void savedata()
{	
	qn++;
	
	int sum=0;

	/*for(int j=0;j<30;j++)
	{
		sum=sum+ar[j];


	}

	String a=Integer.toString(sum);*/
	try
	{	
			if(name.equals("notapplicable"))
                        {
                           System.exit(0);
                        }
                        else
                        {
	    		Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy2","root","root");
	            	Statement st = cn.createStatement();
	            	//String s1="insert into ";
	            	//s1=s1.concat(name);
	                //s1=s1.concat(" values('"+qn+"','"+a+"')");
	                //st.executeUpdate(s1);
	                //qn++;
	                
	                // Store the score in the database
	                
	            	String s2="insert into ";
	            	s2=s2.concat(name);
	            	s2=s2.concat(" values('"+qn+"','"+score+"')");
	            	st.executeUpdate(s2);
			JOptionPane.showMessageDialog(JF1,"YOUR SCORE IS : "+score+"\n THANKYOU FOR PLAYING");
			System.exit(0);
			}
	            }
	            catch(SQLException e)
	        	{
					JOptionPane.showMessageDialog(null, e);                    
	        	    
	        	} 
	        	catch (ClassNotFoundException ex) 
	        	{
	        	     Logger.getLogger(Round2A.class.getName()).log(Level.SEVERE, null, ex);
	    		}
	JF1.dispose();
	//System.exit(0);
}
	
}
	public static void main(String args[])
	{	
		Round2A F = new Round2A();
	}

}
