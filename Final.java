
/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Final
{

    String w;
    
    Final(String x)
    {
        w=x;
    }
    
    void FinalDisplay()throws IOException
    {
        System.out.println("___________________________________________________________________"+"\n"+"\n"+
        
                           "     -------<<<<<< C O N G R A T U L A T I O N S >>>>>>-------     "+"\n"+
                           "___________________________________________________________________"+"\n"+
                           "                     "+w+" ..Won !!!!!!!!" +"\n"+"\n"+"\n"+"\n"+
                           "____________________________________________________________________________________________________________________________________________"+"\n"+"\n");
                           
                           
         Run ob=new Run();
         ob.run();
        }
    }