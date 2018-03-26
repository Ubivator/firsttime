/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.myhomeproject.testgit.Doctor;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 *
 * @author Sviatik
 */
public class TestGit {

    Doctor doc;
    WebDriver driver;

    public TestGit() {
    }

   

  

    @Before
    public void setUp() {
        doc = new Doctor();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sviatik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        

        
    }

    

    @Test
    public void TestForGit() {

       driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");


        
        driver.findElement(By.name("q")).sendKeys("lavrynovych");
        driver.findElement(By.name("btnK")).submit();
    }

    @Test
    public void TestForGit2() {
       doc.setName("tom");
        assertEquals("tom", doc.getName());
    }
}
