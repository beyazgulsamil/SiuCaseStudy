package utils;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import utils.driver.Driver;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class Utilities extends Driver {

    public Utilities(){PageFactory.initElements(driver,this);}

    public void click(WebElement element){waitUntilClickable(scroll(element),System.currentTimeMillis()).click();}

    public void fillInput(WebElement inputBox, String inputText){
        clear(scroll(waitUntilVisible(inputBox,System.currentTimeMillis()))).sendKeys(inputText);}

    public WebElement clear(WebElement inputBox){
        inputBox.clear();
        for (int i = 0; i < inputBox.getAttribute("value").length(); i++) {
            inputBox.sendKeys(Keys.BACK_SPACE);
        }
        return inputBox;
    }

    public WebElement scroll(WebElement element){
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor)driver).executeScript(scrollElementIntoMiddle, element);
        pause(0.5);
        return element;
    }

    public void pause(double duration){
        try {Thread.sleep((long) (duration*1000));}
        catch (InterruptedException e) {e.printStackTrace();}
    }

    public WebElement waitUntilVisible(WebElement element, long initialTime){
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis()-initialTime>15000){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return null;
        }
        try {if (!element.isDisplayed()){waitUntilVisible(element, initialTime);}}
        catch (StaleElementReferenceException|NoSuchElementException|TimeoutException exception){
            waitUntilVisible(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return element;
    }

    public WebElement waitUntilClickable(WebElement element, long initialTime){
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis()-initialTime>15000){
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return null;
        }
        try {if (!element.isEnabled()){waitUntilClickable(element, initialTime);}}
        catch (StaleElementReferenceException|NoSuchElementException|TimeoutException exception){
            waitUntilClickable(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return element;
    }
    public void existError(WebElement element, String failText) {
        try {
            if (element.isDisplayed()) {
                System.out.println("ERROR ("+element.getText()+")");
                return;
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println(failText);
            return;
        }
        Assert.fail(failText);
    }
    public void verifyText(WebElement element, String failText) {
        try {
            if (element.isDisplayed()) {
                System.out.println("'"+element.getText()+"' text available on this page");
                return;
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println(failText);
            return;
        }
        Assert.fail(failText);
    }

    public void existText(String text){
        try {
            String locator = "//*[contains(text(), '" + text + "')]";
            if (driver.findElement(By.xpath(locator)).isDisplayed()){
                System.out.println("This page '"+text+"' text is available");
                return;
            }
        }catch (NoSuchElementException noSuchElementException){
            System.out.println("ERROR (This page '"+text+"' text is none)");
            return;
        }
    }

    public void checkURL(String url){
        String getURL =driver.getCurrentUrl();
        if (Objects.equals(url, getURL)){
            System.out.println("Correct address reached ("+url+")");
        }
        else {
            System.out.println("ERROR (Correct address not found)");
        }
    }
    public void loopAndClick(List<WebElement> list, String buttonName){
        for (WebElement item:list) {
            if (item.getText().contains(buttonName)){
                click(item);
                return;
            }
        }
        Assert.fail("No such element was found...");
    }

    public void basicLoop(List<WebElement> list) {
        int i=-1;
        for (WebElement item : list) {
            int x=i+1;
            if (Objects.equals(x,1));
            click(item);
        }
    }
}