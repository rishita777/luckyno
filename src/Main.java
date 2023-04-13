public class Main

{
    public static void main(String[] args)

    {
     int n=28091999;
     int r,sum=0;
    do
     {
         sum=0;
         while(n>0)
         {
       r= n%10;
       sum=sum+r;
       n=n/10;
         }
         n=sum;
     } while(n>9);

        System.out.println("...your lucky no is :" +sum);
    }
}