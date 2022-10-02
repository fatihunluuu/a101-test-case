package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class testAutomation {

    public static void main(String[] Args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatih\\Desktop\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.a101.com.tr/");
        webDriver.manage().window().maximize();

        WebElement cookie = webDriver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cookie.click();

        Actions action = new Actions(webDriver);

        WebElement catagory = webDriver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        action.moveToElement(catagory).perform();
        Thread.sleep(1000L);

        WebElement socks = webDriver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/div/div/div/div/div[1]/ul[2]/li[8]/a"));
        action.moveToElement(socks).click().build().perform();


        WebElement blackSocks = webDriver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3"));
        blackSocks.click();

        WebElement checkBlack = webDriver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/a/img"));
        checkBlack.click();

        WebElement addCart = webDriver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button"));
        addCart.click();

        Thread.sleep(1000L);

        WebElement show = webDriver.findElement(By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]"));
        show.click();

        WebElement confirmCart = webDriver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a"));
        confirmCart.click();

        WebElement cont = webDriver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a"));
        cont.click();

        Thread.sleep(2000L);

        WebElement email = webDriver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input"));
        email.click();
        email.sendKeys("fatihunluu37@hotmail.com");

        WebElement emailCont = webDriver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button"));
        emailCont.click();

        Thread.sleep(2000L);

        WebElement addAdress = webDriver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a"));
        addAdress.click();

        Thread.sleep(2000L);

        WebElement title = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input"));
        title.click();
        title.sendKeys("Ev");

        WebElement name = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input"));
        name.click();
        name.sendKeys("Fatih Doğan");

        WebElement surname = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input"));
        surname.click();
        surname.sendKeys("Ünlü");

        WebElement phone = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input"));
        phone.click();
        phone.sendKeys("5953265415");

        Select city = new Select(webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select")));
        city.selectByVisibleText("İSTANBUL");
        city.selectByIndex(1);

        Thread.sleep(500L);

        Select district = new Select(webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select")));
        district.selectByVisibleText("ATAŞEHİR");
        district.selectByIndex(3);

        Thread.sleep(500L);

        Select neighbour = new Select(webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select")));
        neighbour.selectByVisibleText("İÇERENKÖY MAH");
        neighbour.selectByIndex(7);

        Thread.sleep(500L);

        WebElement address = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea"));
        address.click();
        address.sendKeys("Palmiye Cad. No:20");

        Thread.sleep(500L);

        WebElement save = webDriver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]"));
        save.click();

        WebElement saveAndCont = webDriver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button"));
        saveAndCont.click();

    }
}
