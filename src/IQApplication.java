import java.util.*;

public class IQApplication
{
        Scanner scr = new Scanner(System.in);
        int score=0;
	public void attempt()
	{
		int attemptNo;
		System.out.println("Enter The Attempt You Are Giving:- ");
		attemptNo = scr.nextInt();
		
		if(attemptNo==1)
		{
			test();
		}
                else
                {
                    System.out.println("You are not eligible.");
                }
	}
        
        public void test()
        {
            
        
            int option=0;
            int choice;
            System.out.println("You are eligible for this test. Kindly choose any one subject.");
            System.out.println("1. Aptitude");
            System.out.println("2. English");
            System.out.println("3. Maths");
            System.out.println("4. GK");
            System.out.println("5. Exit");
            option = scr.nextInt();
            
            if(option==1)
            {
                System.out.println("Aptitude Test");
                System.out.println("1.A person crosses a 600 m long street in 5 minutes. What is his speed in km per hour?");
                System.out.println("1. 3.6");
                System.out.println("2. 7.2");
                System.out.println("3. 8.4");
                System.out.println("4. 10");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
   
                System.out.println("2. If a person walks at 14 km/hr instead of 10 km/hr, he would have walked 20 km more. The actual distance travelled by him is:");
                System.out.println("1. 50 KM");
                System.out.println("2. 56 KM");
                System.out.println("3. 70 KM");
                System.out.println("4. 80 KM");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==1)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("3. Excluding stoppages, the speed of a bus is 54 kmph and including stoppages, it is 45 kmph. For how many minutes does the bus stop per hour?");
                System.out.println("1. 9");
                System.out.println("2. 10");
                System.out.println("3. 12");
                System.out.println("4. 20");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("4. The reflex angle between the hands of a clock at 10.25 is:");
                System.out.println("1. 180 Degree");
                System.out.println("2. 192.5 Degree");
                System.out.println("3. 195 Degree");
                System.out.println("4. 197.5 Degree");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==4)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
            } else if(option==2){
                System.out.println("English Test");
                System.out.println("1.The small child does whatever his father was done.");
                System.out.println("1. Has done");
                System.out.println("2. Did");
                System.out.println("3. Does");
                System.out.println("4. No Correction Required");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==3)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
   
                System.out.println("2.To keeps one's temper");
                System.out.println("1. To become hungry");
                System.out.println("2. To be in good mood");
                System.out.println("3. To preserve ones energy");
                System.out.println("4. None of this");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("3. To Drive Home");
                System.out.println("1. To find one's roots");
                System.out.println("2. To return to place of rest");
                System.out.println("3. Back to original position");
                System.out.println("4. To Emphasise");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==4)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("4. Find correctly spelled word");
                System.out.println("1. Foreign");
                System.out.println("2. Foreine");
                System.out.println("3. Fariegn");
                System.out.println("4. Forein");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==1)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
        } else if (option==3){
            System.out.println("Maths Test");
                System.out.println("1.1+1");
                System.out.println("1. 2");
                System.out.println("2. 3");
                System.out.println("3. 4");
                System.out.println("4. None of the above");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==1)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
   
                System.out.println("2. 20 x 7");
                System.out.println("1. 200");
                System.out.println("2. 160");
                System.out.println("3. 140");
                System.out.println("4.400");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==3)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("3.10*10");
                System.out.println("1. 20");
                System.out.println("2. 100");
                System.out.println("3. 0");
                System.out.println("4. 50");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("4.100-100");
                System.out.println("1. 200");
                System.out.println("2. 0");
                System.out.println("3. -100");
                System.out.println("4. -10");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
        } else if(option==4)
        {
            System.out.println("General Knowledge Test");
                System.out.println("1.Grand Central Terminal, Park Avenue, New York is the world's");
                System.out.println("1. Largest Railway Station");
                System.out.println("2. Highest Railway Station");
                System.out.println("3. Longest Railway Station");
                System.out.println("4. None of above");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==1)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
   
                System.out.println("2. B. C. Roy Award is given in the field of");
                System.out.println("1. Music");
                System.out.println("2. Journalism");
                System.out.println("3. Medicine");
                System.out.println("4. Environment");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==3)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("3. '.MOV' extension refers usually to what kind of file?");
                System.out.println("1. Image File");
                System.out.println("2. Animation/Movie File");
                System.out.println("3. Audio File");
                System.out.println("4. MS Office Document");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==2)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
                
                System.out.println("4.The nucleus of an atom consists of");
                System.out.println("1. Electrons and neutrons");
                System.out.println("2. Electrons and protons");
                System.out.println("3. Protons and neutrons");
                System.out.println("4. All of the above");
                System.out.println("Enter The Answer:- ");
                choice = scr.nextInt();
                if(choice==3)
                {
                    System.out.println("Right Answer.");
                    score+=10;
                }
                else
                {
                    System.out.println("Wrong Answer.");
                }
            }
           score();
          
        }
        public void score()
        {
            System.out.println("Score is:- "+score);
            if(score==0)
            {
                System.out.println("You need to reappear the test");
            }
            else if(score==10)
            {
                System.out.println("Your IQ level is below average");
            }
            else if(score==22)
            {
                System.out.println("Your IQ level is average");
            }
            else if(score==35)
            {
                System.out.println("You are intelligent");
            }
            else if(score==40)
            {
                System.out.println("You are genius");
            }
        }
        
        public static void main(String args[])
        {
            IQApplication object = new IQApplication();
            object.attempt();
            object.test();
            object.score();
        }
}