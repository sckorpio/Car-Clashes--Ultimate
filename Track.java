import java.io.*;
public class Track
{
   String np1;
   String np2;
   
   int p1; int p2;
   
           String x="   ____     ";    String rx="     ____   ";
           String y=" _/|--|)___ ";    String ry=" ___(|--|/_ ";
           String z="'--@---@---'";    String rz="'---@---@--'";
     
           String B="            ";
           
         String Trk[][]=new String[13][13]; 
         
         String c1; String c2;
         
         String s;
  
      Track(String x1,String x2,int P1,int P2,String K1,String K2)
      {
           np1=x1;
           np2=x2;
          
           p1=P1;
           p2=P2;
           
           c1=K1;
           c2=K2;
          
        }
        
    
        String Lines(int I,int J)
        {
            String s="";
         
            if(J==1||J==12)
           {
               s="#";
                }
       
        return(s);
    }
    
        String placeCar1(int I,String C1)
        {
            
            if(C1=="R")
            {
                 switch(I)
                 {
                     case 1:s=np1;break;
                     case 2:s=x;break;
                     case 3:s=y;break;
                     case 4:s=z;break;
                   }
                }
        
            else
           {
                switch(I)
                 {
                     case 1:s=np1;break;
                     case 2:s=rx;break;
                     case 3:s=ry;break;
                     case 4:s=rz;break;
                   }
             }
           return(s);
         }
           
        
         
         String placeCar2(int I,String C2)
        {
            
            if(C2=="R")
            {
                 switch(I)
                 {
                     case 8:s=np2;break;
                     case 9:s=x;break;
                     case 10:s=y;break;
                     case 11:s=z;break;
                   }
                }
        
            else
           {
                switch(I)
                 {
                     case 8:s=np2;break;
                     case 9:s=rx;break;
                     case 10:s=ry;break;
                     case 11:s=rz;break;
                   }
                }
           return(s);
         }
        
        
        
        
        
        
        
        
        void Create()
    {
        
        
       
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
                
                if(j==1||j==12)
                Trk[i][j]=Lines(i,j);
                
                
                
                if(j==p1)
                {
                   if((i>=1)&&(i<=4))
                   { 
                       Trk[i][j]=placeCar1(i,c1);
                    }
                }
                
                
                if(j==p2)
                {
                   if((i>=8)&&(i<=11))
                   { 
                       Trk[i][j]=placeCar2(i,c2);
                    }
                }
                
                
               
                
            }
        }
    
    }
    
    
    
    
    
    void print()
    {
        
        for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
             Trk[i][j]=B;
                
            }
            
        }
        
        
        
        Create();
        
        
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------"); 
        
         for(int i=0;i<13;i++)
        {
            for(int j=0;j<13;j++)
            {
               System.out.print(Trk[i][j]);
                
            }
            System.out.println();
        }
        
        
       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------"+"\n"+"\n"+"\n");
    }
}

    
    
    