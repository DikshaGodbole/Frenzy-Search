import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.util.regex.*;

class Round1A
{	
	int total=101;
	int qn=1;
	
	//Frame, Label, TextArea, Button and String declaration
	JFrame JF1,JF2;
	JLabel JL1,JL2,timecounter,img,area,area1,area2,area3,area4,area5;
	JTextArea JTA1;
	JButton JB1,JB2,JB3,start;
	int TimeLimit=1;
	boolean strt=false;
	int minutes,seconds=0;
	String[] splitted=new String[50];
	String answer_low_case, split_low_case, temp,temp2,temp3,newtemp;
	public int flag=0,count=0,ans,score=0;
	public String name="notapplicable";
	int ar[]=new int[30];
	int i;
	int rank[]=new int[102];
	String qw="";
	String ansr;	
	public int quesNo=1;
	
	// Questions 
	
/*	static String []question =new String[] { "No of innings Rahul Dravid played in test?",
	
		"1) Where was the idea of cellular communication invented",
		
		"2) Name of Bajirao Peshwa younger brother?",

		"3) A group of owls is called as ?", 
		
		"4) In communication satellite multiple repeaters are known as",
				 
		"5) A 300-lb load can be raised by a pull of how much lb on the free end of the rope ",
				
		"6) The worlds smallest bird is the 'bee hummingbird' found in ?", 
			
		"7) Capital of Macedonia?",
			
		"8) Country having largest sheep population ?", 
			
		"9) The great Victoria Desert is located in",
			
		"10) Who is first person in space?",
		
		"11) When the 1st microprocessor design was started by Intel?",
				
		"12) Ustad Mansur was a famous painter in the region of",

		"13) Which query language is used for Neo4j?",

		"14) The original name of Bank of America was ?", 
				
		"15) Which country in the world has the highest automobile production since 2009?",
				

		"16) The lowermost and the oldest epoch of the Tertiary Period of geologic time is",
			

		"17) R.S. Pressman & Associates, Inc. has assembled over how many software engineering resources",
		

		"18) The maximum length in DOS commands ",
		

		"19)The world's smallest mammal is (scientific name)?", 
		 

		"20)'Neighbors Envy , Owners Pride' is the taglline of...",
			

		"21) The USB 3.1 Specification released on July 26, 2013 was approved when?",


		"22)Who first produced playing cards (hanafuda) ?",
		

		"23) Currency of Eritrea?",
		

		"24) Which book publishes notable record?",


		"25)	Which is shortest complete sentence in English?",
		

		"26) In which programming language we cannot able to use friend function?",
			

		"27. Main reason in which Intranet differs from other websites?",
		

		"* 28).In Ncp reply Message for what purpose 0x3333 is used?",
			

		"29)The largest gold producing country in the world(in 2006) is",
		

		"30)your ______ is the largest organ making up the human body ?", 
		

		"31)The hardest substance in the human body is ?", 
		

		"32)Previous name of LOC",
		

		"* 33)	What force is dependent on displacement, force and angle?",
			

		"34) Where did golf originate?",
		

		"* 35) Who is the first person to become a billionaire (U.S. dollars) by writing books?	",	

		"36) Which is world's first university in India?",
			

		"37) Where is ENTC Northwest Office located?",
		

		"38)Only mammal that can't jump (most appropriate) ?",
		

		"39)The Olympic flag was designed in ?", 
		

		"40) Which is the fastest car in the world in 2014-2015?",
		
		
		"* 41) Where did the world's first website and server go live?",
				

		"42)Who developed first portable computer?",
		

		"43)Universities in the Presidency towns in India were established in",
		

		"44) Which was the first search engine?",
		

		"45)When were bar code scanners invented?",
		

		"46)A group of frogs is called as ?", 
		

		"47)who is current Hon'ble Chief Minister of AP?",
		

		"48)which is the first graphical game?",
		

		"49) CMAS does not recognize which records?",
		  

		"50) First computer mouse was made up of?",
		

		"51)The Titanic was built in which city ?", 

		
		"52)What did  Frank Whittle invent?",
		

		"53)Who invented Bicycle?",
				

		"54)The longest day (shortest night) in the southern hemisphere is(date and month e.g.3 August)",
			

		"55)	What is enthalpy of homogeneous substance?",
				

		"56)How much power does Beagle bone requires?",
				

		"57)What is the default port for MySQL Server?",
			

		"58)Whether you are looking for a pizzeria that is open now or a coffee shop nearby which is your local guide to finding? This software uses code of FFmpeg (628http://ffmpeg.org) licensed under the LGPLv2.1 .",
				

		"59)The first portable CD player was ?",
				

		"60)The only continent with no active volcanoes is ?",
				

		"* 61) The planet that takes the highest time for completing a rotation is",
				

		"62) In Nov 2014 which Palm Island was complete?",
				

		"* 63) What did cooper co founded in 1983",
		

		"* 64)Which technology is used by keyboard to send electronic impulses to computer?",
		

		"65)Hawaii was originally called as ?", 
				

	    "66) Who built an oil-fired steam car?",
				

		"67)What invention caused most deaths while testing it?",
				

		"68) Where computer add and compare the data?",
				

		"69)The most sung song on earth is ?", 
				

		"70)which is ancient historic civil engineering constructions water management system? Before 3000 years.",
				

		"71) Size of NVIDIA Force Ware Drivers for Windows XP (32-bit) 362.00",
				

		"72) What is the prehistoric period of India?",
			

		"73)  World's first mobile phone call was made on April 3, 1973, by whom and where did he work for which post?",
				
		"* 74)Fear of music ?",
				

		"75)Who invented the BALLPOINT PEN?",
				

		"76) Where novotel Wireless introduced the first MiFi device?",
				

		"77)your foot has _______ bones in it?", 
				

		"78)Which  company is nicknamed  'Big Blue' ?",
				

		"79) Which is first digital electronic computer?",
				

		"80) For which company did narayan murthy work excelling in software design?",

		
		"* 81).Latest book of Bjarne Stroustrup?",
				

		"* 82)	Paper money was first used in which country ?",
		
		
		"*83)Who proposed CableCARD Replacement?",
		

		"*84) For Neural Networks, in Linear Units, the output activity is proportional to what?",
				

		"85)Which method is used for Data transfer in bluetooth?",
				

		"86) Memory access in RISC architecture is limited to which instructions?",
				

		"87)Only mammal that can fly ?", 
				

		"88)When was the toothbrush invented?",
				

		"89)In what year was the '@' chosen for its use in e-mail addresses?",
				

		"90) No of innings Rahul Dravid played in test?",
			

		"91) Which company has produced first commercial graphing calculator?",
				

		"92) What was the exact release date of mobile application 'VIBER'?",
				

		"93)In which decade was the telegraph invented?",
		

		"94)What protocol is used by DNS name servers?",
				

		"95) Which Lang do phidgets used?",
				

		"96)The second largest island (next to Greenland) in the world is",
				

		"97) What is the low speed that is mostly used for Human Input Devices (HID) such as keyboards, mice? Joysticks and often the buttons on higher speed devices such as printers or scanners;",
				

		"98) In which year did Akbar came to throne?",
				

		"99) When was first bollywood movie produced?",
				

		"100)What drink was invented by Charles Leiper Grigg in 1929?",
				

		"101)How many years did it take for Leonardo Da Vinci to paint Mona Lisa ?", 
				

		"102)When were blue jeans invented?",
				

		"*103) The granular noice is reduce by",
				
		};
	
	// Answers
	
	static String [] Answer = new String[]{"286",
		//1
		"Bell Labs"	,
		
		//2
		"Chimaji Appa",
		
		//3
		"parliament",
		
		//4
		"Transponders",
		
		//5
		"100 lb",
		
		//6
		"Cuba",
		
		//7
		"Skopje",
		
		//8
		"Australia",
		
		//9
		"Australia",
		
		//10
		"Yuri Gagarin",
		
		//11
		"1970",
		
		//12
		"Jahangir",
		
		//13
		"Cypher Query Language",
		
		//14
		"Bank of Italy",
		
		//15
		"China",
		
		//16
		"Palaeocene",
		
		//17
		"1800",
		
		//18
		"127 chars",
		
		//19
		"Craseonycteris thonglongyai",
		
		//20
		"Onida",
		
		//21
		"August 11, 2014",
		
		//22
		"Nintendo",
		
		//23
		"Nakfa",
		
		//24
		"Guinness World Records",
		
		//25
		"I am ",
		
		//26
		"java",
		
		//27
		"Firewall",
		
		//28
		"Service Reply",
		
		//29
		"South Africa",
		
		//30
		"skin",
		
		//31
		"enamel",
		
		//32
		"Cease fire Line",
		
		//33
		"Torque",
		
		//34
		"Eastern coast of Scotland.",
		
		//35
		"Rowling",
		
		//36
		"Nalanda International University.",
		
		//37
		"7040 Smoke Ranch Road Las Vegas, NV 89128",
		
		//38
		"Elephant",
		
		//39
		"1913",
		
		//40
		"Hennessey Venom GT",
		
		//41
		"CERN",		
		
		//42
		"Adam Osborne",
		
		//43
		"1857",
		
		//44
		"archie",
 
		//45
		"1970",
		
		//46 
		"army",

		//47
		"Sri N Chandrababu Naidu",

		//48
		"OXO",

		//49
		"short course",  

		//50
		"Wood",

		//51 
		"Belfast",

		//52
		"Jet propulsion",

		//53
		"Kirkpatrick Macmillan",

		//54
		"22 December",

		//55
		"H = U + pV",

		//56
		"210 - 460 mA @ 5V",

		//57
		"3306",

		//58
		"Yelp",

		//59
		"Sony Discman",

	        //60
		"Australia",

		//* 61
		"Venus",

		//62
		"Palm Jumeirah",

		//* 63
		"Cellular Business Systems , Inc . (CBSI)",

		//* 64
		"VDT tehnology",

		//65 
		"Sandwich Islands",

		//66
		"Josef Bozek",

		//67
		"Parachute",

		//68
		"CPU chip",

		//69 
		"Happy Birthday to You",

		//70
		"Qunat",

		//71
		"211.49 MB",

		//72
		"400000 BC - 1000 BC",

		//73
		"Martin Cooper, a senior engineer at Motorola",

		//* 74
		"melophobia",

		//75
		"Biro Brothers",

		//76
		"United States",

		//77 
		"26",

		//78
		"IBM",

		//79
		"the ABC computer of Atanasoff and Berry",

		//80
		"SESA",

		//* 81
		"Tour of C plus plus", 

		//* 82
		"China",
				
		//*83
		"U.S Federal Communications Commission (FCC)",

		//*84
		"total weighted output", 

		//85
		"Asynchronous Connectionless (ACL)",

		//86
		"STA and LDA",

		//87 
		"Bat",

		//88
		"1770",

		//89
		"1972",

		//90
		"286",

		//91
		"Casio",

		//92
		"December 2 , 2010",

		//93
		"1840",

		//94
		"UDP",

		//95
		"C/C++ or  Java or  Actionscript",

		//96
		"New Guinea",

		//97
		"1.5 Mbit per second",

		//98
		"1556",

		//99
		"1913",

		//100
		"7 - UP",

		//101
		"4 years",

		//102
		"1850",

		//*103
		"reducing the step size", 


};	*/

	static String []question =new String[]{"",
		"1)The receiver of the first bitcoin transaction was _______",

		"2)What is the system used in cryptomining based on?",

		"3)The first wallet program – simply named Bitcoin – was released in 2009 by ________ as open-source code.",

		"4)What is the pH of the soil on Mars?",

		"5)Which of the following would you use to test a variable for five different values?",

		"6)Who was first to observe the pollen tubes?",

		"7)Controlling acces to a network by analyzing the incoming and outgoing packets is called ?",

		"8)Which interface would you use to handle the event of a user clicking inside a textbox?",
		"9)[Ctrl] + [Alt] + [Delete] sequence was written by ?",

		"10)ISRO has till date launched __consecutive successful PSLV launches",

		"11)The scientific name of the red fox is .",		 

		"12)Ustad Mansur was a famous painter in the region of",
		

		"13)Which query language is used for Neo4j?",

		"14)The original name of Bank of America was ?", 
				

		"15)Which country in the world has the highest automobile production since 2009?",
				

		"16)The lowermost and the oldest epoch of the Tertiary Period of geologic time is",
			

		"17)R.S. Pressman & Associates, Inc. has assembled over how many software engineering resources",
		

		"18)The maximum length in DOS commands(Mention number only)",
		

		"19)The world's smallest mammal is (scientific name)?", 
		 

		"20)'Neighbors Envy , Owners Pride' is the taglline of...",
			

		 "21)The ___________ are believed to be the first to grow cocoa beans as a domestic crop.",


		"22)Who first produced playing cards (hanafuda) ?",
		

		"23)Who patented the idea of the qwerty keyboard pattern?",
		

		"24)Which book publishes notable record?",


		"25)Which is shortest complete sentence in English?",
		

		"26)In which programming language we cannot able to use friend function?",
			

		"27)Main reason in which Intranet differs from other websites?",
		

		"28)In Ncp reply Message for what purpose 0x3333 is used?",
			

		"29)The largest gold producing country in the world(in 2006) is",
		

		"30)your ______ is the largest organ making up the human body ?", 
		

		"31)The hardest substance in the human body is ?", 
		

		"32)Previous name of LOC",
		

		"33)What force is dependent on displacement, force and angle?",
			

		"34)Where did golf originate?",
		

		"35)Who is the first person to become a billionaire (U.S. dollars) by writing books?	",	

		"36)Which is world's first university in India?",
			

		"37)Where is ENTC Northwest Office located?",
		

		"38)Only mammal that can't jump (most appropriate) ?",
		

		"39)The Olympic flag was designed in ?", 
		

		"40)Which is the fastest car in the world in 2014-2015?",
		
		
		"41)Where did the world's first website and server go live?",
				

		"42)Who developed first portable computer?",
		

		"43)Universities in the Presidency towns in India were established in",
		

		"44)Which was the first search engine?",
		

		"45)When were bar code scanners invented?",
		

		"46)A group of frogs is called as ?", 
		

		"47)who is current Hon'ble Chief Minister of AP?",
		

		"48)which is the first graphical game?",
		

		"49)CMAS does not recognize which records?",
		  

		"50)First computer mouse was made up of?",
		

		"51)The Titanic was built in which city ?", 

		
		"52)What did  Frank Whittle invent?",
		

		"53)Who invented Bicycle?",
				

		"54)The longest day (shortest night) in the southern hemisphere is(date and month e.g.3 August)",
			

		"55)What is enthalpy of homogeneous substance?(Write the Equation)",
				

		"56)____________ process started by fixing the images onto a sheet of silver-plated copper",
				

		"57)What is the default port for MySQL Server?",
			

		"58)In Nov 2014 which Palm Island was complete?",
				

		"59)The first portable CD player was ?",
				

		"60)The only continent with no active volcanoes is ?",
				

		"61) The planet that takes the highest time for completing a rotation is",
				

		"62) In Nov 2014 which Palm Island was complete?",
				

		"63) What did cooper co founded in 1983",
		

		"64)Which technology is used by keyboard to send electronic impulses to computer?",
		

		"65)Hawaii was originally called as ?", 
				

	    	"66) Who built an oil-fired steam car?",
				

		"67)What invention caused most deaths while testing it?",
				

		"68) Where computer add and compare the data?",
				

		"69)The most sung song on earth is ?", 
				

		"70)which is ancient historic civil engineering constructions water management system? Before 3000 years.",
				

		"71)Size of NVIDIA Force Ware Drivers for Windows XP (32-bit) 362.00(In MB only Number)",
				

		"72)Brass gets discoloured in air because of the presence of which of the following gases in air?",
			

		"73)World's first mobile phone call was made on April 3, 1973, by whom?",
			
		"74)Fear of music?",
				

		"75)Bitcoins are created as a reward for a process known as ______",
				

		"76)Where novotel Wireless introduced the first MiFi device?",
				

		"77)your foot has _______ bones in it?", 
				

		"78)In which river is the devil's pool located?",

		"79)In the flag folding procedure for flag of America what is the first fold symbol of?",

		"80)In which film was the aircraft Avro Vulcan featured?",

		"81)What was the early name of project for iphone?",

		"82)What was samsung's first technical product?",

		"83)Who patented the idea of the qwerty keyboard pattern?",

		"84)When was the last appearance of the yellow kid noted?(yyyy)",
		

		"85)Which method is used for Data transfer in bluetooth?",
				

		"86)Memory access in RISC architecture is limited to which instructions?",
				

		"87)Only mammal that can fly ?", 
				

		"88)Most modern TV's draw power even if turned off. The circuit the power is used in does what function?",
 
 
 		"89)Which is a type of Electrically-Erasable Programmable Read-Only Memory?",
 
 
 		"90)The lowest mountain range in the world is the _________",
 
 
 		"91)The city of Bonn is situated in ________",

 
 		"92)What is always coming, but never arrives?" ,

		"93)What was the name of short cartoons created by Walt Disney in his early career?",

		
		"94)What is the origin of the assasin from video game Assasins Creed Unity?",

		
		"95)Which was the new programming language recently introduced for android development?",

		
		"96)what was the name of project Chris Lattner formed after joining apple?",		

		
		"97)What was the first message sent over the internet?",
				

		"98)In which year did Akbar came to throne?",
				

		"99)When was first bollywood movie produced?",
				

		"100)What drink was invented by Charles Leiper Grigg in 1929?",
				

		"101)How many years did it take for Leonardo Da Vinci to paint Mona Lisa?(Only Number)", 
				

		"102)When were blue jeans invented?",
				

		"103)The granular noice is reduce by",
				
		};
	
	
	static String []Answer = new String[]{"",
		//1
		"cypherpunk Hal Finney",

		//2
		"Hashcash",

		//3
		"Satoshi Nakamoto",

		//4
		"7.7",

		//5
		"switch",

		//6
		"Giovanni Battista Amici",

		//7
		"Packet filtering",

		//8
		"FocusListener",

 		//9
 		"David Bradley",
 
		//10
 		"23",
 
 		//11
  		"Vulpes vulpes",

		//12
		"Jahangir",
		
		//13
		"Cypher Query Language",
		
		//14
		"Bank of Italy",
		
		//15
		"China",
		
		//16
		"Palaeocene",
		
		//17
		"1800",
		
		//18
		"127",
		
		//19
		"Craseonycteris thonglongyai",
		
		//20
		"Onida",
		
		//21
		"Olmec Indians",
		
		//22
		"Nintendo",
		
		//23
		"Christopher Latham Sholes",
		
		//24
		"Guinness World Records",
		
		//25
		"I am ",
		
		//26
		"java",
		
		//27
		"Firewall",
		
		//28
		"Service Reply",
		
		//29
		"South Africa",
		
		//30
		"skin",
		
		//31
		"enamel",
		
		//32
		"Cease fire Line",
		
		//33
		"Torque",
		
		//34
		"Eastern coast of Scotland.",
		
		//35
		"Rowling",
		
		//36
		"Nalanda International University.",
		
		//37
		"7040 Smoke Ranch Road Las Vegas, NV 89128",
		
		//38
		"Elephant",
		
		//39
		"1913",
		
		//40
		"Hennessey Venom GT",
		
		//41
		"CERN",		
		
		//42
		"Adam Osborne",
		
		//43
		"1857",
		
		//44
		"archie",
 
		//45
		"1970",
		
		//46 
		"army",

		//47
		"Sri N Chandrababu Naidu",

		//48
		"OXO",

		//49
		"short course",  

		//50
		"Wood",

		//51 
		"Belfast",

		//52
		"Jet propulsion",

		//53
		"Kirkpatrick Macmillan",

		//54
		"22 December",

		//55
		"H = U + pV",

		//56
		"Daguerre's daguerreotype",

		//57
		"3306",

		//58
		"Palm Jumeirah",

		//59
		"Sony Discman",

	    	//60
		"Australia",

		//61
		"Venus",

		//62
		"Palm Jumeirah",

		//63
		"Cellular Business Systems Incorporation",

		//64
		"VDT tehnology",

		//65 
		"Sandwich Islands",

		//66
		"Josef Bozek",

		//67
		"Parachute",

		//68
		"CPU chip",

		//69 
		"Happy Birthday to You",

		//70
		"Qunat",

		//71
		"211.49",

		//72
		"Hydrogen sulphide",

		//73
		"Martin Cooper",

		//74
		"melophobia",

		//75
		"Mining",

		//76
		"United States",

		//77 
		"26",

		//78
		"Zambezi",

		//79
		"Symbol of life",

		//80
		"Thunderball",

		//81
		"Project Purple",

		//82
		"black and white television set",

		//83
		"Christopher Latham Sholes",

		//84
		"1898",

		//85
		"Asynchronous Connectionless",

		//86
		"STA and LDA",

		//87 
		"Bat",

		//88
		"Remote control",

		//89
		"Flash",

		//90
		"Buena Bhaile",

		//91
		"Germany",

		//92
		"Tomorrow",

		//93
		"Newman's Laugh-O-Grams",

		//94
		"French-Austrian",

		//95
		"kotlin",

		//96
		"Clang",

		//97
		"login",

		//98
		"1556",

		//99
		"1913",

		//100
		"7UP",

		//101
		"4",

		//102
		"1850",

		//103
		"reducing the step size", 


};	
	Round1A()
	{
	        // JFrame definition
		JF1= new JFrame();
		JF1.setBounds(0,0,1366,768);
		JF1.setLayout(null);
		JF1.setBounds(0,0,1366,778);
		
		
		
		img=new JLabel(new ImageIcon("hd5.jpg"));
		img.setBounds(0,0,1366,778);
		JF1.add(img);
		img.setLayout(null);
		
		// Rules definition
		area = new JLabel("Round 1 rules : ");
		area.setFont(new Font("Verdana ", Font.BOLD, 20));
		area.setForeground(Color.white);
		area.setBounds(50,100,1366,200);
		
		// Rule 1 
		area1 = new JLabel("1. The time limit will be of 20 minutes.");
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
		JL1 = new JLabel("PRO-GOOGLER : ROUND 1");
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
		timecounter.setBounds(900,100,1366,400);
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
		
		
		JF1.setVisible(true);           // Frame
		
		for(i=0; i<=100; i++)
		{
			rank[i]=i;
		}
		
		
		// Random function for generating random questions
		Random rm = new Random();
		int temp, ind1, ind2;
		for(i=100; i>50; i--)
		{
			ind1= rm.nextInt(i); 
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
			   			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy1","root","root");
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
					minutes=19;
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
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy1","root","root");
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
	        	     Logger.getLogger(Round1A.class.getName()).log(Level.SEVERE, null, ex);
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
                                        else{
	    			Class.forName("com.mysql.jdbc.Driver");    // check for feasibility
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Frenzy1","root","root");
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
	        	     Logger.getLogger(Round1A.class.getName()).log(Level.SEVERE, null, ex);
	    		}
	JF1.dispose();
	//System.exit(0);
}
	
}
	public static void main(String args[])
	{	
		Round1A F = new Round1A();
	}

}
