class Demo{
       public static void main (String[]args){
               int num=1234;
               int rem;
               int rev=0;
               
                while(num>0){
                rem=num%10;
                 rev=rev*10+rem;                 
                   num=num/10;
                   }
                  while(rev>0){
                 int revrem=rev%10;
                 System.out.print(revrem);
                  rev=rev/10;
                }
              }
           }     