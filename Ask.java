
import java.io.*;
public class Ask
{
   
    int l;  int k=0;  int f; int t;
    String np1; String np2;
    
    Ask()
    {
        l=0;k=0;
        np1=np2="";
    }
    
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    
    private void AskPlayers()throws IOException
    {
        System.out.println("___________________________________________________________________"+"\n"+
                           "Enter 1 for Single Player........."+"\n"+
                           "Enter 2 for Double Player........."+"\n"+
                           "---------------------------------------------"+"\n"+
                           "         Enter your choice............");
                           
         k=Integer.parseInt(br.readLine());
           
     }
     
     private void AskLapsLength()throws IOException
     {
         System.out.println("--------------------------------------------"+"\n"+
                            "Enter the number of laps...");
                            
             l=Integer.parseInt(br.readLine());
                 
            
         System.out.println("--------------------------------------------");
      }
      
      private void AskSingle()throws IOException
      {
          System.out.println("Enter your name...");
          np1=(br.readLine());
          
         
          f=np1.length();
          if(f<12)
          {
              t=12-f;
              for(int w=1;w<=t;w++)
              {
                  if(w%2==0)
                  np1=np1+" ";
                
                  else
                  np1=" "+np1;
                }
            }
          
         
            
            np2="   BlueJ    ";
        }
        
       
        
        
        
        private void AskDouble()throws IOException
        {
            System.out.println("Enter the name...Player1");
            np1=(br.readLine());
            
            
            f=np1.length();
          if(f<12)
          {
              t=12-f;
              for(int w=1;w<=t;w++)
              {
                  if(w%2==0)
                  np1=np1+" ";
                
                  else
                  np1=" "+np1;
                }
            }
            
            
            
            
            System.out.println("Enter the name...Player2");
            np2=(br.readLine());
            
            
            f=np2.length();
          if(f<12)
          {
              t=12-f;
              for(int w=1;w<=t;w++)
              {
                  if(w%2==0)
                  np2=np2+" ";
                
                  else
                  np2=" "+np2;
                }
            }
        }
      
      
      
      
      
      
      void Start()throws IOException
      {
          AskPlayers();
          
         
              if(k==1)
             AskSingle();
          
            else if(k==2)
            AskDouble();
          
          else
          Start();
          
          AskLapsLength();
          
          
          if(k==1)
          {
              StartTrack ST1=new StartTrack(np1,np2);
              ST1.Print();
              
              Play1 ob1=new Play1(np1,np2,l);
              ob1.Start();
            }
            
            else
            {
                StartTrack ST2=new StartTrack(np1,np2);
                ST2.Print();
              
                Play2 ob2=new Play2(np1,np2,l);
                ob2.Start();
            }
        }
    }
                            
     
                           
    
    