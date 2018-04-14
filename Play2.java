import java.io.*;
public class Play2
{
   String np1;
   String np2;
   int l;int k;
   int s1,s2;
   int t1,t2;
   String ch;String ch2;
   String w;
    
   int l1=1; int l2=1;
   String n1;String n2;
   String w1;String w2;
   String c1;String c2;
   int p1;int p2;
   
   int pos1; int pos2;
   
   Play2(String x,String y,int p)
    {
        np1=x;
        np2=y;
        l=p;

        k=l*10;
        s1=s2=0;
        t1=t2=1;
        w="";
    }
    
    int Calculate1()
    {
        
            
            if(t1<=10)
        {
            l1=1;
            c1="R";
            p1=(t1+1);
        }
        
        else
        {
            if(t1>(10*l1))
            l1++;
            
            {
                if(l1%2==0)    
                c1="L";
            
               else
               c1="R";
            }
            
            p1=(t1%10);
                                if(p1==0)
                                { p1=10;}
            
            if(c1=="L")
            p1=((10-p1)+1);
            
            else
            p1=p1;
            
            p1++;
        }
        return(p1);
    }
   
    
    int Calculate2()
    {
            
            if(t2<=10)
        {
            l2=1;
            c2="R";
            p2=(t2+1);
        }
        
        else
        {
            if(t2>(10*l2))
            l2++;
            
            {
                if(l2%2==0)    
                c2="L";
            
               else
               c2="R";
            }
            
            p2=(t2%10);
                                if(p2==0)
                                { p2=10;}
            
            if(c2=="L")
            p2=((10-p2)+1);
            
            else
            p2=p2;
            
            p2++;
        }
        return(p2);
    }

    
    
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    
    
    private void Player1()throws IOException
    {
        System.out.println(np1+".....Enter 'T/t' to throw Dice....");
         
        ch=(br.readLine());
        
          if(ch.equalsIgnoreCase("T"))
          {
              ThrowDice TD=new ThrowDice();
              s1=TD.Throw(np1);
              
              
              DisplayDice DD=new DisplayDice();
              DD.displaydice(s1);
              
              System.out.println("------------------------------------------------------"+"\n"+"\n"+"\n");
              
             t1+=s1;
             
             pos1=Calculate1();
             pos2=Calculate2();
             
             for(double a=0;a<500000000;a++)
        {
            
        }   
             Track TR1=new Track(np1,np2,pos1,pos2,c1,c2);
             TR1.print();
             
             for(double b=0;b<500000000;b++)
        {
            
        }
           
      }
      }
      
      
     
      private void Player2()throws IOException
      {
         System.out.println(np2+".....Enter 'T/t' to throw Dice....");
         
        ch2=(br.readLine());
        
          if(ch2.equalsIgnoreCase("T"))
          {
              ThrowDice TD2=new ThrowDice();
              s2=TD2.Throw(np2);
              
              DisplayDice DD2=new DisplayDice();
              DD2.displaydice(s2);
              
              System.out.println("------------------------------------------------------"+"\n"+"\n"+"\n");
              
             t2+=s2;
             
             pos1=Calculate1();
             pos2=Calculate2();
             
             
                 for(double a=0;a<500000000;a++)
        {
            
        }   
         
             Track TR2=new Track(np1,np2,pos1,pos2,c1,c2);
             TR2.print();
             
                for(double b=0;b<500000000;b++)
        {
            
        } 
            }          
         }
         
         
         
         void Start()throws IOException
         {   
             
             while((t1<=k)&&(t2<=k))
             {
                 Player1();
                 ch="";
                 Player2();
                 ch="";
              }
             
              if(t1>t2)
              w=np1;
              
              else
              w=np2;
             
              Final fn=new Final(w);
              fn.FinalDisplay();
           }
  }
      
      
      
 
    
            