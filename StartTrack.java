import java.io.*;
public class StartTrack
{
   String np1;
   String np2;
   
           String x="   ____     ";    String rx="     ____   ";
           String y=" _/|--|)___ ";    String ry=" ___(|--|/_ ";
           String z="'--@---@---'";    String rz="'---@---@--'";
     
           String B="            ";
           
         String Trk[][]=new String[13][13]; 
  
      StartTrack(String x1,String x2)
      {
           np1=x1;
           np2=x2;
          
          
        }
        
    
        String Start(int I,int J)
        {
            String s="";
            
            if(J==0)
            {
                 switch(I)
                 {
                     case 1:s=np1;break;
                     case 8:s=np2;break;
                     
                     case 2:
                     case 9:s=x;break;
                     
                     case 3:
                     case 10:s=y;break;
                     
                     case 4:
                     case 11:s=z;break;
                     
                     default:s=B;
                    }
                }
                     
         
           else if(J==1)
           {
               switch(I)
               {
                   case 1: s=" |S|";break;
                   case 4: s=" |T|";break;
                   case 7: s=" |A|";break;
                   case 10:s=" |R|";break;
                   case 12:s=" |T|";break;
                   
                   default:s=" |#|";
                }
            }
            
            else if(J==12)
            {
                s=" |#|";
            }
        
        return(s);
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        void Display()
    {
        
        
       
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
                
                if(j==0||j==1||j==12)
                Trk[i][j]=Start(i,j);
                
                
               
                
            }
        }
    }
    
    
    void Print()
    {
        
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
             Trk[i][j]=B;
                
            }
            
        }
        
        
        
        Display();
        
        System.out.println( "____________________________________________________________________________________________________________________________________"+"\n"+
                            "_____________________________________________________________________________________________________________________________________"+"\n"+"\n"+"\n");
          
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
               System.out.print(Trk[i][j]);
                
            }
            System.out.println();
        }
        
        System.out.println( "____________________________________________________________________________________________________________________________________"+"\n"+
                            "_____________________________________________________________________________________________________________________________________"+"\n"+"\n"+"\n");
          
    }
}

    
    
    