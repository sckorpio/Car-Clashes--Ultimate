import java.io.*;
public class ThrowDice
{
   int s;
   
   ThrowDice()
   {  
       s=0;
    }
    
    int Throw(String x)throws IOException
    {
        
       
         System.out.print(x+" Scored..=");
        for(double a=0;a<500000000;a++)
        {
            
        }
        
        
        s=(int)(Math.random()*(6-1)+1);
        System.out.print(s);
        
        return(s);
    }
}