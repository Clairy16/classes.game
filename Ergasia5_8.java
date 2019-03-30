
package ergasia5_8;

import java.util.ArrayList ;
import java.util.Scanner;

public class Ergasia5_8 {
public static int p,k, pektis1, s,f,g;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList() ;
         ArrayList<String> l2 = new ArrayList() ;
          ArrayList<String> l3 = new ArrayList ();
        
          for(int i=0;i<3;i++){
        
        l1.add(" ");
        l2.add(" ");
        l3.add(" ");
        
      }
          do{
              System.out.println(l1);
              System.out.println(l2);
              System.out.println(l3);
              System.out.println("orizontia");
              p =in.nextInt();
              System.out.println("ka8eta");
              k= in.nextInt();
              if(pektis1 == 0){
              if (p==1){
                  if (k==1){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(0,"x");
                  }else if (k==2){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(1,"x");
                  }else if(k==3){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(2,"x");
                  }
                  
              }
              
               if (p==2){
                  if (k==1){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l2.set(0,"x");
                  }else if (k==2){
                      s+=1;
                      pektis1=1;
                      l2.set(1,"x");
                  }else if(k==3){
                      s+=1;
                      pektis1=1;
                      l2.set(2,"x");
                  }
                  
              }
               if (p==3){
                  if (k==1){
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(0,"x");
                  }else if (k==2){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(1,"x");
                  }else if(k==3){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(2,"x");
                  }
                  
              }
              }else{
                  if (p==1){
                  if (k==1){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(0,"o");
                  }else if (k==2){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(1,"o");
                  }else if(k==3){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l1.set(2,"o");
                  }
                  
              }
              
               if (p==2){
                  if (k==1){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l2.set(0,"o");
                  }else if (k==2){
                      s+=1;
                      pektis1=0;
                      l2.set(1,"o");
                  }else if(k==3){
                      s+=1;
                      l2.set(2,"o");
                      pektis1=0;
                  }
                  
              }
               if (p==3){
                  if (k==1){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(0,"o");
                  }else if (k==2){
                      s+=1;
                      if (pektis1==0){
                          
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(1,"o");
                  }else if(k==3){
                      s+=1;
                      if (pektis1==0){
                          pektis1=1;
                          
                      }else if (pektis1==1){
                          pektis1=0;
                      }
                      l3.set(2,"o");
                  }
                  
              }
              
              }
              if (l1.get(0)=="x" && l1.get(1)=="x" && l1.get(2)=="x" ||l2.get(0)=="x" && l2.get(1)=="x" && l2.get(2)=="x" || l3.get(0)=="x" && l3.get(1)=="x" && l3.get(2)=="x" || l1.get(2)=="x" && l2.get(2)=="x" && l3.get(2)=="x" || l1.get(0)=="x" && l2.get(0)=="x" && l3.get(0)=="x" || l1.get(1)=="x" && l2.get(1)=="x" && l3.get(1)=="x" || l1.get(0)=="x" && l2.get(1)=="x" && l3.get(2)=="x" || l1.get(2)=="x" && l2.get(1)=="x" && l3.get(0)=="x"){
              f=2;
             
              
              }
              if (l1.get(0)=="o" && l1.get(1)=="o" && l1.get(2)=="o" ||l2.get(0)=="o" && l2.get(1)=="o" && l2.get(2)=="o" || l3.get(0)=="o" && l3.get(1)=="o" && l3.get(2)=="o" || l1.get(2)=="o" && l2.get(2)=="o" && l3.get(2)=="o" || l1.get(0)=="o" && l2.get(0)=="o" && l3.get(0)=="o" || l1.get(1)=="o" && l2.get(1)=="o" && l3.get(1)=="o" || l1.get(0)=="o" && l2.get(1)=="o" && l3.get(2)=="o" || l1.get(2)=="o" && l2.get(1)=="o1" && l3.get(0)=="o"){
              f=3;
              
              
              }
                  if ( s== 8){
                      if ( f==0){
                  f=1;
                      }
              }
          }while( f==0);
          System.out.println(l1);
          System.out.println(l2);
          System.out.println(l3);
        if ( f==1){
            System.out.println(" isopalia");
        }else if ( f==2){
            System.out.println(" kerdise o 1 pektis");
        }else{
            System.out.println ("kedise o 2 pekths");
        }
        
    }
    
}
