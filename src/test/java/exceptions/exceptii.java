package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptii {
    // exceptie- erore care paare in mmentul in care programul ruleaza
    // exceptiile trebuie sa le tratam deoarece contin informatii din interior care pot sa fie exploatate
    // ca sa tratam o exceptie se foloseste structura try... catch.. finally

    // 2 tipuri de exceptii: unchecked si checked
    //checked- exceptii care apar in momentul in care vrem sa folosim o anumita clasa
    //uncheck= exceptii care ne iau prin surprindere

    // 2 keyword specifice- throw si throws
    // throw- cuvant pe care il folosim cand vrem sa facem trigger la o exceptie
    // throws= cuvant pe care il folosim ca sa adaugam exceptia la semnatura metodei ( veci !!)

    @Test
    public void testMethod(){
      //  checkedExample();
        //uncheckedExample();
        throwExample();

    }
    //checked
    public void checkedExample(){
        String path = "src/CustomerData.json";
        File file = new File(path);

        try {
            FileInputStream fileContent = new FileInputStream(file);
        } catch (FileNotFoundException e){

        }
    }

// unchecked

    public void uncheckedExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement alex = driver.findElement(By.xpath("Oana Topan"));
        alex.click();
    }
    //throw
    public void throwExample(){
        String path = "src/CustomerData.json";
        File file = new File(path);

        try {
            FileInputStream fileContent = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
