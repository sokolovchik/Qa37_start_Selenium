import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {


    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/IMOE001/Downloads/index.html");
    }
@Test
public void tableTest(){
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");
}

@Test
    public void cssLocators(){
   // by tag name
  WebElement el =  wd.findElement(By.tagName("button"));
  WebElement element = wd.findElement(By.cssSelector("button"));
  wd.findElement(By.xpath("//button"));
  WebElement el1 = wd.findElement(By.tagName("a"));
  WebElement element1 = wd.findElement(By.cssSelector("a"));
  wd.findElement(By.xpath("//td[text() = 'Canada']"));

  //by class

    WebElement divcontainer = wd.findElement(By.className("container"));
    WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

    List<WebElement> navList = wd.findElements(By.className("nav-item"));
    List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

    //by id

    WebElement nav = wd.findElement(By.id("nav"));
    WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

    //by attribute

    WebElement div = wd.findElement(By.cssSelector("[class = 'contaiher']"));
    WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = \'Type your name\']"));
    WebElement inputS = wd.findElement(By.cssSelector("[name = surname]"));
    WebElement inputS1 = wd.findElement(By.name("surname"));

    //by start
    wd.findElement(By.cssSelector("[placeholder ^= 'Type']"));
    //by end
    wd.findElement(By.cssSelector("[placeholder $= ' name']"));
    //contains
    wd.findElement(By.cssSelector("[placeholder *=' your' ]"));

}

}
