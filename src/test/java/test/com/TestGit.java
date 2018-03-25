/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.myhomeproject.testgit.Doctor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Sviatik
 */
public class TestGit {
    Doctor doc;
    private WebDriver driver;
    public TestGit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        doc = new Doctor();
        System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestForGit() {
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //its not wont to work
    //driver.findElement(By.name("g")).sendKeys("lavrynovych");
   // driver.findElement(By.name("btnK")).click();
    }
    @Test
    public void TestForGit2() {
    doc.setName("tom");
        assertEquals("tom", doc.getName());
    }
}
