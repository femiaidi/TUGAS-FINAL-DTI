/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkgfinal.dtio;

/**
 *
 * @author HP
 */
public class TUGASFINALDTIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    if(j==5)
                    System.out.print("  ");
                    else if(j==1||j==4||i==1||i==n)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=5;j++)
                {
                    if(j==5)
                    System.out.print("  ");
                    else if(j==1&&i>3)
                    System.out.print("  ");
                    else if(j==4||i==3||j==1||i==1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=n;j++)
                 {
                    if(j==1||j==n||j==i)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
    }
    }

                
            
           
    


                
            
        
            
    



    
    
  

    
                                
                    
                        
                
            
        }
    

      
                }

    


