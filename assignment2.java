import java.util.Scanner;
class weather{
    int day_of_month;
    int high_temp;
    int low_temp;
    int amount_rain;
    int amount_snow;
    weather(int b,int c,int d,int e,int f)
    {
     day_of_month=b;
     high_temp=c;
     low_temp=d;
     amount_rain=e;
     amount_snow=f;
        
    }
    
    void display()
    {
         System.out.println("**********");
       
		    System.out.println("date:"+day_of_month);
		     System.out.println("high_temprature:"+high_temp);
		      System.out.println("low_temprature:"+low_temp);
		       System.out.println("amount of rain:"+amount_rain);
		        System.out.println("amount of snow:"+amount_snow);
		
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    weather obj[]=new weather[31];
	    int count=0;
		System.out.println("for how many days u have to enter the data:");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		   System.out.println("enter date:");
		   int b=sc.nextInt();
		   System.out.println("enter the high temprature(in celcius):");
		   int c=sc.nextInt();
            System.out.println("enter the low temprature(in celcius):");
		   	int d=sc.nextInt();
          System.out.println("enter the amount of rain(in mm):");
           int e=sc.nextInt();
          System.out.println("enter the amount of snow(in inches):");
           int f=sc.nextInt();
		    weather temp=new weather(b,c,d,e,f);
		    obj[count]=temp;
		    count++;
		    
		}
		System.out.println("***********************DISPLAY*************************");

	    for(int i=0;i<a;i++)
		{
		    obj[i].display();
		}
		int sum1=0,sum2=0,sum3=0,sum4=0;
		for(int i=0;i<a;i++)
		{
		    sum1+=obj[i].high_temp;
		    sum2+=obj[i].low_temp;
		    sum3+=obj[i].amount_rain;
		    sum4+=obj[i].amount_snow;
		}
		sum1=sum1/a;
		sum2=sum2/a;
		sum3=sum3/a;
		sum4=sum4/a;
		System.out.println("**********average values**********");
		System.out.println("average high temprature is:"+sum1);
		System.out.println("average low temprature is:"+sum2);
      	System.out.println("average amount pf rain is:"+sum3);
    	System.out.println("average amount of snow is:"+sum4);


		
	}
}
