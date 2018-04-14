
/**
 * Write a description of class display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayDice
{
    
    void one()
    {
        System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |           |  "+"\n"+
                           "  |     @     |  "+"\n"+
                           "  |           |  "+"\n"+
                           "  |___________|  ");
                              
                           
      }
      
      
      void two()
      {
          
        System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |   @       |  "+"\n"+
                           "  |           |  "+"\n"+
                           "  |       @   |  "+"\n"+
                           "  |___________|  ");
                              
                           
      }
      
      
      void three()
      {
          System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |   @       |  "+"\n"+
                           "  |     @     |  "+"\n"+
                           "  |       @   |  "+"\n"+
                           "  |___________|  ");
                              
          }
          
          
          void four()
          {
              System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |   @   @   |  "+"\n"+
                           "  |           |  "+"\n"+
                           "  |   @   @   |  "+"\n"+
                           "  |___________|  ");
                              
            }
            
            void five()
            {
                System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |  @     @  |  "+"\n"+
                           "  |     @     |  "+"\n"+
                           "  |  @     @  |  "+"\n"+
                           "  |___________|  ");
              }
              
              void six()
              {
                  System.out.println("              "+"\n"+
                           "   ___________   "+"\n"+
                           "  |           |  "+"\n"+
                           "  |   @   @   |  "+"\n"+
                           "  |   @   @   |  "+"\n"+
                           "  |   @   @   |  "+"\n"+
                           "  |___________|  ");
                }                
                              
           void displaydice(int s)
           {
               switch(s)
               {
                   case 1:one();break;
                   case 2:two();break;
                   case 3:three();break;
                   case 4:four();break;
                   case 5:five();break;
                   case 6:six();break;
                }
            }
                   
                
            
            
            
            
            }