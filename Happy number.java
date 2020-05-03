import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {

        int num=199;
        int n=0,tempnum=0,count=0;
        Set<Integer> s=new HashSet<Integer>();

        while(num>0)
        {
            n=num%10;
            tempnum+=n*n;
            num=num/10;

            if(num<=0)
            {
                if(tempnum==1)
                {
                    System.out.println("Happy number");
                    break;
                }
                else
                {
                    System.out.println(tempnum);

                    if(s.contains(tempnum))
                    {
                        System.out.println("Set->" + tempnum);
                        System.out.println("Not Happy");
                        break;
                    }
                    s.add(tempnum);

                    num=tempnum;
                    n=0;tempnum=0;

                }
            }

        }
        //System.out.println(tempnum);
    }
}
