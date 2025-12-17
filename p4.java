class Demo{
       public static void main(String[]args){
              int num=234;
              int multi=1;
                     while(num>0){
                     int rem=num%10;
                     multi=multi*rem;
                     num=num/10;
                    }
                  System.out.println(multi);
                  } 
               }