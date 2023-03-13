import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {
WebDriver wd;

    @Test
    public void classwork(){
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/ancestor::div[1]"));
        List l;
        List<WebElement>List = wd.findElements(By.xpath("//h1/following-sibling::a"));

    }
    @Test
    public void classwork1(){
        WebElement element = wd.findElement(By.cssSelector("[name ='login']"));
         String text = element.getText();
         System.out.println(text);
         WebElement form = wd.findElement(By.xpath("//form"));
         String textForm = form.getText();
        System.out.println("****************");
         System.out.println(textForm);

    }
}
