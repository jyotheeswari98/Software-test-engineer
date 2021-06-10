import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KMIT234 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().browserPath("91.0.4472.77").setup();
	    WebDriverManager.chromedriver().setup();
	    WebDriver w=new ChromeDriver();
	    w.get("https://kmit.in/");
		w.manage().window().maximize();   
		System.out.println(w.getTitle());    
        System.out.println(w.getCurrentUrl());
	
	
       //To check the functionality of Department               
       
       Actions Department=new Actions(w);
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();                //Department
       
       //To check functionality of CSE 
       
       Actions CSE=new Actions(w);
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();     //CSE
       
       //To check the functionality of About CSE
       
       w.findElement(By.xpath("//a[contains(text(),'about cse')]")).click();                                                                        //About cse
       w.navigate().back();
       Thread.sleep(2000);
       
       //To check functionality of new specialization 
       
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       Actions new_specialization=new Actions(w);
       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
      
       
       //To check functionality of CSM in New specialization section 
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
       
       Thread.sleep(2000);
       w.findElement(By.xpath("//a[contains(text(),'CSM')]")).click();
       Thread.sleep(2000);
       w.navigate().back();
       
       
       //To check functionality of CSD in new specialization section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       Thread.sleep(2000);
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
       Thread.sleep(2000);
       w.findElement(By.linkText("CSD")).click();
       Thread.sleep(2000);
       w.navigate().back();
       
       
       //To check functionality of Faculty in CSE section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       Thread.sleep(2000);
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();        //Faculty
       Thread.sleep(2000);
       w.navigate().back();
       
       
       //To check functionality of Achievements in CSE section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       Actions achievements=new Actions(w);      
       achievements.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/a[1]"))).build().perform();       
       Thread.sleep(2000);
       
       //To check functionality of Student achievements in achievements section 
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();     //Students achievements
       
       
       //To check functionality of "2018-19" button in Student achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();
       
       
       //To check functionality of "2017-18" button in Student achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();
       
       
       //To check functionality of "2016-17" button in Student achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();
      
       
       //To check functionality of "2015-16" button in Student achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();
       
       
       //To check functionality of "2014-15" button in Student achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();
       Thread.sleep(1000);
       w.navigate().back();
       
       
       //To check functionality of Faculty Achievements in achievements section
       
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
       achievements.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/a[1]"))).build().perform();       
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();         //Faculty achievements
       
       
       //To check functionality of "2019-20" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();
       
       
       //To check functionality of "2018-19" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();
       
       
       //To check functionality of "2017-18" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();
      
       
       //To check functionality of "2016-17" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();
       
       
       //To check functionality of "2015-16" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();
      
       
       //To check functionality of "2014-15" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();
       
       
       //To check functionality of "2013-14" button in Faculty Achievements section
       Thread.sleep(1000);
       w.findElement(By.xpath("//a[contains(text(),'2013-14')]")).click();
       Thread.sleep(1000);
       w.navigate().back();
       
       
       
       //To check functionality of Academics in CSE section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE     
       Actions academics=new Actions(w);
       academics.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
       Thread.sleep(2000);
       
       
       //To check functionality of E-Resources in academics section
       w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[7]/ul/li[1]/ul/li[5]/ul/li[1]/a")).click();      //E-Source
       Thread.sleep(2000);
       
       
       //To check functionality of "https://www.geeksforgeeks.org/data-structures/" link
       w.findElement(By.linkText("https://www.geeksforgeeks.org/data-structures/")).click();
       Thread.sleep(3000);
       Set <String> windows=w.getWindowHandles();
	   Iterator <String> it=windows.iterator();
		
	   String parent_window=it.next();
	   String child_window=it.next();
		 // w.switchTo().window(parent_window);
		  //Thread.sleep(3000);
	   w.switchTo().window(child_window);
	   Thread.sleep(3000);
	   w.switchTo().window(parent_window);
		  
	   Thread.sleep(3000);
		 
	   //To check functionality of "http://www.ccsu.edu/cs/" link
		w.findElement(By.linkText("http://www.ccsu.edu/cs/")).click();
		Thread.sleep(3000);
		Set<String> windows1=w.getWindowHandles();
		  
		Iterator <String> it1=windows1.iterator();
		String parent_window1=it1.next();
		String child_window1=it1.next();
				  
		  //w.switchTo().window(parent_window1);
		  //Thread.sleep(3000);
		  w.switchTo().window(child_window1);
		  Thread.sleep(3000);
		  w.switchTo().window(parent_window1);
		  
		  
		  Thread.sleep(3000);
		  
		  //To check functionality of Lecture Notes button
		  w.findElement(By.linkText("Lecture Notes")).click();
		  Thread.sleep(3000);
		  
		  
		  //To check functionality of I-I Semester(R18) in lecture notes section
		  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[1]/div[2]/h4/a")).click();
		
		  Thread.sleep(3000);
		  
		  //To check functionality of English in I-I Semester (R18) section
		  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[1]/div[3]/div/ul/li[1]/p/a")).click();
		  Set<String> windows2=w.getWindowHandles();
		  Thread.sleep(2000);
		  Iterator <String> it2=windows2.iterator();
		  String parent_window2=it2.next();
		  String child_window2=it2.next();
		  
		  //  w.switchTo().window(parent_window2);
		  //Thread.sleep(3000);
		  w.switchTo().window(child_window2);
		  Thread.sleep(5000);
		  w.switchTo().window(parent_window2);
		  
		  Thread.sleep(3000);
		  
		  
		  //To check functionality of II-I Semester (R18) link
		  
		  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[2]/div[1]/h4/a")).click();       //II-I Semester (R18)
	     
		  Thread.sleep(3000);
		  
		  //To check functionality of unit I in II-I Semester (R18)
		  w.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/p[1]/a[1]")).click();  //Unit 1
	      Set<String> windows3=w.getWindowHandles();
	      Iterator <String> it3=windows3.iterator();
		  String parent_window3=it3.next();
		  String child_window3=it3.next();
		  
		 // w.switchTo().window(parent_window3);
		  //Thread.sleep(3000);
		  w.switchTo().window(child_window3);
		  Thread.sleep(5000);
		  w.switchTo().window(parent_window3);
	      
		  Thread.sleep(3000);
	     
		  JavascriptExecutor js = (JavascriptExecutor) w;      //Scroll
	      Thread.sleep(3000);
	      js.executeScript("window.scrollBy(0,1000)");
	     
	      //To check functionality of unit 3 in II-I Semester (R18)
	      w.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[5]/li[5]/p[1]/a[1]")).click();    //Unit 3
	      Thread.sleep(3000);
	      Set<String> windows4=w.getWindowHandles();
	      Iterator <String> it4=windows4.iterator();
		  String parent_window4=it4.next();
		  String child_window4=it4.next();
		  
		  //w.switchTo().window(parent_window4);
		  //Thread.sleep(2000);
		  w.switchTo().window(child_window4);
		  Thread.sleep(5000);
		  w.switchTo().window(parent_window4);
		  
		  Thread.sleep(2000);
		  w.navigate().back();
		 
		  
		  
	   //To check functionality Syllabus in academics section under CSE section
	   Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       academics.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
       Thread.sleep(2000);	     
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")).click();     //Syllabus
	      Thread.sleep(2000);
	     // w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();    //Unit I
	      //Thread.sleep(2000);
	     // w.switchTo().frame(w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
	     // Thread.sleep(2000);
	      //w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[4]")).click();    //Download
	      //Thread.sleep(2000);
       //w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	      
	     
	   //To check functionality of Library in academics section under CSE section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       academics.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
       Thread.sleep(2000);
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();         //Library
       Thread.sleep(2000);
       w.navigate().back();
      
       
       //To check functionality of Events in CSE section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[6]/a[1]")).click();         //Events
       Thread.sleep(2000);
       
       //To check functionality of 2019-20 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();                 //2019-20
       Thread.sleep(1000);
       
       //To check functionality of 2018-19 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();                 //2018-19
       Thread.sleep(1000);
       
       //To check functionality of 2017-18 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();                 //2017-18
       Thread.sleep(1000);
       
       //To check functionality of 2016-17 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();                 //2016-17
       Thread.sleep(1000);
       //To check functionality of 2015-16 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();                 //2015-16
       Thread.sleep(1000);
       
       //To check functionality of 2014-15 button in Events section
       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();                 //2014-15
       w.navigate().back();
       
       //To check functionality of lab in CSE section under Department section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[7]/a[1]")).click();                     //lab
       Thread.sleep(2000);
       w.navigate().back();
       
       
       //To check functionality of Publications in CSE section under Department section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[8]/a[1]")).click();                    //Publications
       
       //To check functionality of 2019-20 button in Publications section
       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();               //2019-20
       Thread.sleep(1000);
     
       
       //To check functionality of 2018-19 button in Publications section
       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();               //2018-19
       Thread.sleep(1000);
     
       
       //To check functionality of 2017-18 button in Publications section
       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();              //2017-18
       Thread.sleep(1000);
     
       
       //To check functionality of 2016-17 button in Publications section
       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();               //2016-17
       Thread.sleep(1000);
     
       
       //To check functionality of 2015-16 button in Publications section
       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();              //2015-16
       w.navigate().back(); 
       
       //To check functionality of Contact us in CSE section under Department section
       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[9]/a[1]")).click();                    //Contact us
       Thread.sleep(2000);
      
       //To check functionality of CSE in Contact us section
       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();                       //cse
       Thread.sleep(2000);
     
       //To check functionality of IT in Contact us section
       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/h2[1]/a[1]")).click();                       //IT
       Thread.sleep(2000);
     
       //To check functionality of ECE in Contact us section
       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/h2[1]/a[1]")).click();                       //ECE
       Thread.sleep(2000);
    
       //To check functionality of ECE in Contact us section
       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/h2[1]/a[1]")).click();                       //ECE
       Thread.sleep(2000);
       w.navigate().back();
       
       
       
       /* -----------------------------------------------------------------*****---------------------------------------------------------------------*/
   	
   	
 	     Actions research=new Actions(w);
	 	
       //To check check functionality of Research
       research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      
       //To check functionality of About Research under Research
       w.findElement(By.xpath("//a[contains(text(),'About Research')]")).click();                                                                  //About research
	     
       //To check functionality of Research lab link in About Research section
       w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]")).click();                                    //Research lab
	      
       //To check functionality of Biomedical imaging image under Research lab section
       w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[2]")).click();                         //Biomedical imaging
	      Thread.sleep(2000);
	      w.navigate().back();
	      Thread.sleep(2000);
	      
	    //To check functionality of Bio-Informatics image under Research lab section
	      w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[2]")).click();                         //Bio-Informatics
	      Thread.sleep(1000);
	      w.navigate().back();
	      w.navigate().back();
	
	      //To check functionality Sponsored Research link under About research section
	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[3]/li[1]/a[1]")).click();                                 //Sponsered Research
	     
	      //To check functionality of Auto Education Tools button in Sponsored research link
	      w.findElement(By.xpath("//a[contains(text(),'Auto Education Tools')]")).click();                                                       //Auto education tools
	      Thread.sleep(2000);
	      
	     //To check functionality of Tessellator button in Sponsored research link
	     // w.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();                                                                //Tessellator
	      //Thread.sleep(1000);
	      
	    //To check functionality of Other Research Projects button in Sponsored research link
	      w.findElement(By.xpath("//a[contains(text(),'Other Research Projects')]")).click();                                                   //Other Research Projects 
	      Thread.sleep(1000);
	      
	    //To check functionality of A.Y 2019-20 button in Sponsored research link
	      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                               //A.Y 2019-20
	      Thread.sleep(1000);
	     
	    //To check functionality of A.Y 2018-19 button in Sponsored research link
	      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                              //A.Y 2018-19
	      Thread.sleep(1000);
	    
	      //To check functionality of A.Y 2016-17 button in Sponsored research link 
	      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                              //A.Y  2016-17
	      Thread.sleep(1000);
	     
	      //To check functionality of Research Labs under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("//a[contains(text(),'Research Labs')]")).click();                                                              //Research labs
	      Thread.sleep(2000);
	     
	      //To check functionality of CFD image under Research lab section
	      w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[2]")).click();                   // CFD            
	      w.navigate().back();
	   
	      //To check functionality of IOT & ROBOTICS image under Research lab section
	      w.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[4]/div/div/a/img[2]")).click();                   // IOT & ROBOTICS           
	      w.navigate().back();
	
	      //To check functionality of Center of Excellence under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[3]/a")).click();                           //Center of Excellence
	      
	      JavascriptExecutor jsCOE=(JavascriptExecutor) w;
	  	
       Thread.sleep(2000);
		  jsCOE.executeScript("window.scrollBy(0,500)");
	      
	      //w.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div[1]/div/div/a/img[2]")).clear();           //NUIDIA   //defect not working
	      //w.navigate().back();                                                                                                        
	      //w.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div[2]/div/div/a/img[2]")).clear();           //UIRTUSA     //defect not working
	     // w.navigate().back();                                                                                                        
	
		 Thread.sleep(2000);
      //To check functionality of Sponsored Research under Research section
		  research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[4]/a")).click();                             //Sponsored research
	
	      //To check functionality of Auto Education Tools button in Sponsored research section
	      w.findElement(By.xpath("//a[contains(text(),'Auto Education Tools')]")).click();                                                       //Auto education tools
	      
	     //To check functionality of Tessellator button in Sponsored research section
	     // w.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();                                                                //Tessellator
	      //Thread.sleep(2000);
	     
	      //To check functionality of Other Research Projects button in Sponsored research section
	      w.findElement(By.xpath("//a[contains(text(),'Other Research Projects')]")).click();                                                   //Other Research Projects 
	      Thread.sleep(2000);
	     
	    //To check functionality of A.Y 2019-20 button in Sponsored research section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                               //A.Y 2019-20
	      Thread.sleep(2000);
	      
	    //To check functionality of A.Y 2018-19 button in Sponsored research section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                              //A.Y 2018-19
	      Thread.sleep(2000);
	      
	    //To check functionality of A.Y 2016-17 button in Sponsored research section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                              //A.Y  2016-17
	      Thread.sleep(2000);
	
	      
	      //To check functionality of Consultancy Projects under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("//a[contains(text(),'Consultancy Projects')]")).click();                                             //Consultancy Projects
	      
	      //To check functionality of Other Consultancy Projects button in Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'Other Consultancy Projects')]")).click();                                //Other Consultancy Projects
	      
	      //To check functionality of AY 2020-21 button under Other Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2020-21')]")).click();                                                  //AY 2020-21
	      Thread.sleep(1000);
	
	     //To check functionality of AY 2019-20 button under Other Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                  //AY 2019-20
	      Thread.sleep(1000);
	
	    //To check functionality of AY 2018-19 button under Other Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                  //AY 2018-19
	      Thread.sleep(1000);
	
	    //To check functionality of AY 2017-18 button under Other Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2017-18')]")).click();                                                  //AY 2017-18
	      Thread.sleep(1000);
	     
	    //To check functionality of AY 2016-17 button under Other Consultancy Projects section
	      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                  //AY 2016-17
	      Thread.sleep(1000);
	
	      
	      //To check functionality of Publications and Patents under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      Actions publications_patents = new Actions(w);
	      
	      publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	      
	      //To check functionality of Publication Policy in Publications and Patents section
	      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[6]/ul/li[1]/a")).click();            //Publication policy
	  
	      
	      //To check functionality of E-Resources in Publications and Patents section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/ul[1]/li[6]/ul[1]/li[2]/a[1]")).click();            //E-Sources
	
	      Set <String> windowsoesources=w.getWindowHandles();
	      Iterator <String> itesources = windowsoesources.iterator();
	      String parent_windowesources=itesources.next();
	      String child_windowesources=itesources.next();
	        
	      w.switchTo().window(child_windowesources);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowesources);
	
      
	     //To check functionality of Publication Committee in Publications and Patents section
	     research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	     publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	     w.findElement(By.xpath("//a[contains(text(),'Publication Committee')]")).click();                                                 //Publication Committee
	
	     
	     //To check functionality of List of Publications in Publications and Patents section
	     research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	     publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	     w.findElement(By.xpath("//a[contains(text(),'List of Publications')]")).click();                                                   //List of Publications
	     
	                                                               
	                     
	     
	     //To check functionality of SCCN: Security in Controller of Computer Networks link in List of Publications section
	      w.findElement(By.xpath("//a[contains(text(),'SCCN: Security in Controller of Computer Networks ')]")).click();      //SCCN: Security in Controller of Computer Networks
	     Set <String> windowsccn=w.getWindowHandles();
	      Iterator <String> itsccn = windowsccn.iterator();
	      String parent_windowsccn=itsccn.next();
	      String child_windowesccn=itsccn.next();
	        
	      w.switchTo().window(child_windowesccn);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowsccn);
	
	                                                        
	      
	      //To check functionality of List of Patents in Publications and Patents section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
		  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	      w.findElement(By.xpath("//a[contains(text(),'List of Patents')]")).click();                                             //List of Patents
	      
	      
	      //To open Patents Filed by CSE Faculty PDF in List of Patents section
	      w.findElement(By.xpath("//span[contains(text(),'Patents Filed by CSE Faculty')]")).click();                             ////span[contains(text(),'Patents Filed by CSE Faculty')]
	      Thread.sleep(2000);
	     
	      //To close Patents Filed by CSE Faculty PDF in List of Patents section
	      w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	
	     //To open Patents Filed by IT Faculty PDF in List of Patents section
	      w.findElement(By.xpath("//span[contains(text(),'Patents Filed by IT Faculty')]")).click();                           //Patents Filed by IT Faculty
	      Thread.sleep(2000);
	     
	    //To close Patents Filed by IT Faculty PDF in List of Patents section
	      w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click(); 
	
	
	      /*research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
		  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	      w.findElement(By.xpath("//a[contains(text(),'Re-Imbursement Form')]")).click();                                                //Re-Imbursement Form
	      w.findElement(By.xpath("//body/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]")).click();                                           //zoom-in                                          
	      w.findElement(By.xpath("//body/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")).click();                                           //zoom-out  
	      w.navigate().back();  
	*/
	      
	      //To check functionality of Code of Ethics in Publications & Patents section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
		  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
	      w.findElement(By.xpath("//a[contains(text(),'Code of Ethics')]")).click();                                                          //Code of Ethics
	
	      //To check functionality of Research Workshops under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("//a[contains(text(),'Research Workshops')]")).click();                                                    //Research Workshops
	      
	      //To check functionality of DRDL button under Research Workshops section
	      w.findElement(By.xpath("//a[contains(text(),'DRDL')]")).click();                                                            //DRDL
	      Thread.sleep(2000);
	     
	    //To check functionality of Biomedical Imaging button under Research Workshops section
	      w.findElement(By.xpath("//a[contains(text(),'Biomedical Imaging')]")).click();                                               //Biomedical Imaging
	      Thread.sleep(2000);
	      
	    //To check functionality of Blockchain Technology button under Research Workshops section
	      w.findElement(By.xpath("//a[contains(text(),'Blockchain Technology')]")).click();                                               //Blockchain Technology
	      
	      //To check functionality of Industry Interaction Cell under Research section
	      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/ul[1]/li[8]/a[1]")).click();                                    //Industry Interaction Cell
       
     //To check functionality of IIC Events under Industry Interaction Cell section
       w.findElement(By.xpath("//a[contains(text(),'IIC Events')]")).click();                                                       //IIC Events
	
       //To check functionality of GSOC under Research section
       research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
	      w.findElement(By.xpath("//a[contains(text(),'GSOC')]")).click();                                                             //GSOC
	      
	      //To check functionality of click here link
	      w.findElement(By.xpath("//body/div[1]/div[1]/p[1]/a[1]")).click();                                                         //click here    
	
	      Set <String> windowgsoc=w.getWindowHandles();
	      Iterator <String> itgsoc = windowgsoc.iterator();
	      String parent_windowgsoc=itgsoc.next();
	      String child_windowgsoc=itgsoc.next();
	        
	      w.switchTo().window(child_windowgsoc);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowgsoc);
	      w.navigate().back();
	     
	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
	      
	      
	      
/* -------------------------------------------------------------------*****-------------------------------------------------------------------------*/

	    //To scroll Home page
		  JavascriptExecutor homepage=(JavascriptExecutor) w;
		  	
        Thread.sleep(2000);
        homepage.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(2000);
        
        //To check functionality of Swayam image
        w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[1]/div[1]/div[1]/a[1]/div[3]")).click();          //Swayam
        Thread.sleep(2000);
        
       
        //To check functionality of Swayam-NPTEL lOGO under Swayam image
        w.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/a[1]/img[1]")).click();                                      //Swayam-NPTEL LOGO
	      Thread.sleep(2000);
	     
	      //To check functionality of Click here (NPTEL April 24/25 exams postponed) link
	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/p[1]/b[1]/a[1]")).click();                 //NPTEL April 24/25 exams postponed-CLICK HERE
	      Thread.sleep(2000);
	      
	      w.navigate().back();
	     
	     //To check functionality of Click here (Timelines and Guidelines for Jan-Apr 2021) link
	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/h3[2]/p[1]/b[1]/a[1]")).click();            //Timelines and Guidelines for Jan-Apr 2021-Click here
	      Thread.sleep(2000);
	      w.navigate().back();
	
	     
	      //To check functionality of click here (Tentative Course List (Jul - Dec 2021)) link
	      JavascriptExecutor featured_new=(JavascriptExecutor) w;
		  	
        Thread.sleep(3000);
        featured_new.executeScript("window.scrollBy(0,500)");
	      
        Thread.sleep(3000);
	     
        
        w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();        //Tentative Course List (Jul - Dec 2021)-click here
	      Thread.sleep(3000);
	      
	      
	      Set <String> TCL21=w.getWindowHandles();
	      Iterator <String> ITCL21 = TCL21.iterator();
	      String parent_windowTCL21=ITCL21.next();
	      String child_windowTCL21=ITCL21.next();
	        
	      w.switchTo().window(child_windowTCL21);
	      Thread.sleep(3000);
	      w.switchTo().window(parent_windowTCL21);
	      
	   
	      //To check functionality of NPTEL ONLINE COURSES image
	      w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h4[1]")).click();              //NPTEL ONLINE COURSES
	      
	    Set <String> NOC=w.getWindowHandles();
	      Iterator <String> ITNOC = NOC.iterator();
	      String parent_windowNOC=ITNOC.next();
	      String child_windowNOC=ITNOC.next();
	        
	      w.switchTo().window(child_windowNOC);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowNOC);
	      
	      w.navigate().back();
	      
	      //To check functionality of Home 
	      w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();                      //home
	
	     //To check functionality of Existing SPOC image under Home 
	      w.findElement(By.xpath("//body/div[1]/div[1]/div[2]/a[1]/img[1]")).click();           //Existing SPOC
	      
	      Set <String> existingSPOC=w.getWindowHandles();
	      Iterator <String> ITexistingSPOC =existingSPOC.iterator();
	      String parent_windowexistingSPOC= ITexistingSPOC.next();
	      String child_windowexistingSPOC = ITexistingSPOC.next();
	      
	      w.switchTo().window(child_windowexistingSPOC);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowexistingSPOC);
	      
	      
	      
	     w.navigate().back();
	
	     //To check functionality of About us
	     w.findElement(By.xpath("//a[contains(text(),'About us')]")).click();       //About us
	     Thread.sleep(1000);
	     w.navigate().back();
	     Thread.sleep(1000);
	     
	     //To check functionality of Quick Reference Links
	     w.findElement(By.xpath("//a[contains(text(),'Quick Reference Links')]")).click();       //Quick Reference Links
	
	    
	     //To check functionality of jan-Apr 2021 semester link
	     w.findElement(By.xpath("//a[@id='nav-item-tab']")).click();                   //jan-Apr 2021 semester
	     Thread.sleep(1000);
	
	     //To check functionality of SPOC Timelines and Guidelines for Jan 2021 Semester link
	     w.findElement(By.xpath("//b[contains(text(),'SPOC Timelines and Guidelines for Jan 2021 Semeste')]")).click();   //SPOC Timelines and Guidelines for Jan 2021 Semeste
	     Thread.sleep(1000);
	
	      Set <String> existingSPOCT=w.getWindowHandles();
	      Iterator <String> ITexistingSPOCT =existingSPOCT.iterator();
	      String parent_windowexistingSPOCT= ITexistingSPOCT.next();
	      String child_windowexistingSPOCT = ITexistingSPOCT.next();
	      
	      w.switchTo().window(child_windowexistingSPOCT);
	      Thread.sleep(2000);
	      w.switchTo().window(parent_windowexistingSPOCT);
	      w.navigate().back();
	     
	      //To check functionality of Contact us
	      w.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();                   ////a[contains(text(),'Contact Us')]
	      w.navigate().back();
	      w.navigate().back();
	
	
	      
	      //To check functionality of Trishul image
	      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[2]/div[1]/div[1]/a[1]/div[3]")).click();                 //Image Trishul
	      Thread.sleep(1000);
	      w.navigate().back();
	
	      //To check functionality of Arjuna image
	      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[3]/div[1]/div[1]/a[1]/div[3]")).click();                          //Image Arjuna
	      Thread.sleep(1000);
	      w.navigate().back();
	      
	      //To check functionality of NFS image
	      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[4]/div[1]/div[1]/a[1]/div[3]")).click();                         //Image NFS
	      Thread.sleep(1000);
	      w.navigate().back();





	}

}
