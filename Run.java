
/**
 * Write a description of class Run here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Run
{
   int ch;
   Run()
   {
       ch=0;
    }
    
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    
    
    
   
    
   
private void Menu()throws IOException
{
    System.out.println("__________________________________________________________________________________________"+"\n"+"\n"+
    
                       "|-------------------------------------|"+"\n"+
                       "|             M E N U                 |"+"\n"+
                       "|-------------------------------------|"+"\n"+
                       "|                                     |"+"\n"+
                       "|  Enter 1 to .......PLAY             |"+"\n"+
                       "|  Enter 2 to........HELP             |"+"\n"+
                       "|  Enter 3 to........EXIT             |"+"\n"+
                       "|-------------------------------------|"+"\n"+"\n"+
                       
                       "   Enter your choice here.................");
                       
                     ch=Integer.parseInt(br.readLine());
      
    System.out.println("_________________________________________________________________________________________");
    }
    




void run()throws IOException
 {
     Graphics gh=new Graphics();
     gh.HomePage();
     
     
     
     Menu();
     
     if(ch==1)
     {
          Ask ak=new Ask();
          ak.Start();
     }
     
     else if(ch==2)
     {
         Help hp=new Help();
         hp.Print();
        run();
      }
      
      else if(ch==3)
      {
          Exit ex=new Exit();
          ex.exit();
        }
        
        else
        run();
        
        
}
}