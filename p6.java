class Demo{
       public static void main (String[]args){
               int num=1023;
               int rem;
               boolean isducknumber=false;
                 while(num>0){
                  rem=num%10;
                  if(rem==0){
                   isducknumber=true;
                    
                  }
                 num=num/10;
            }
         if(isducknumber){
          System.out.println("yes it is duck number");
          }else{
           System.out.println("it is not dfuck number");
           }
          }
         }
           
     