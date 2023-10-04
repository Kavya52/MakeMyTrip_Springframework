package anudip.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
   public static void main(String args[])
   {
	   ApplicationContext apcon=new ClassPathXmlApplicationContext("Config.xml");
   
	  Bus b=(Bus)apcon.getBean("bus");

       b.journey();
       b.cost();
       System.out.println();
	   
	   
	   Train t=(Train)apcon.getBean("train");

       t.journey();
       t.cost();
       System.out.println();
       
      Plain p=(Plain)apcon.getBean("plain");

       p.journey();
       p.cost();
       System.out.println();
   }
}
       
       
       
   


   


