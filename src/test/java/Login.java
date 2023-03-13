import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/IMOE001/Downloads/index.html");
    }
    @Test
    public void test1(){

        WebElement el = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        WebElement el1 = wd.findElement(By.tagName("budy"));
        WebElement element1 = wd.findElement(By.cssSelector("budy"));

        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement element2 = wd.findElement(By.cssSelector("div"));

        WebElement el3 = wd.findElement(By.tagName("button"));
        WebElement element3= wd.findElement(By.cssSelector("button"));

        WebElement el4 = wd.findElement(By.tagName("h1"));
        WebElement element4 = wd.findElement(By.cssSelector("h1"));

        WebElement el5= wd.findElement(By.tagName("a"));
        WebElement element5 = wd.findElement(By.cssSelector("a"));

        WebElement el6 = wd.findElement(By.tagName("form"));
        WebElement element6 = wd.findElement(By.cssSelector("form"));

        WebElement el7 = wd.findElement(By.tagName("input"));
        WebElement element7 = wd.findElement(By.cssSelector("input"));

        WebElement el8 = wd.findElement(By.className("container"));
        WebElement element8 = wd.findElement(By.cssSelector(".container"));
        WebElement el9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element9 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el10 = wd.findElement(By.className("active"));
        WebElement element10 = wd.findElement(By.cssSelector(".active"));

        WebElement el11 = wd.findElement(By.id("root"));
        WebElement element11 = wd.findElement(By.cssSelector("#root"));

        WebElement element12= wd.findElement(By.cssSelector("[id = 'root']"));
        WebElement element13= wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement element14= wd.findElement(By.cssSelector("[name = 'email']"));





    }
}
