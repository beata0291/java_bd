package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTests {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions( ).setLegacy(true));
        wd.manage( ).timeouts( ).implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/group.php");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click( );
        wd.findElement(By.name("user")).clear( );
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click( );
        wd.findElement(By.name("pass")).clear( );
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click( );
    }

    @Test
    public void testGroupCreationTests(String name, String header, String futer) {

        goToGroupPage("groups");
        wd.findElement(By.name("new")).click( );
        wd.findElement(By.name("group_name")).click( );
        wd.findElement(By.name("group_name")).clear( );
        wd.findElement(By.name("group_name")).sendKeys(name);
        wd.findElement(By.name("group_header")).click( );
        wd.findElement(By.name("group_header")).clear( );
        wd.findElement(By.name("group_header")).sendKeys(header);
        wd.findElement(By.name("group_footer")).click( );
        wd.findElement(By.name("group_footer")).clear( );
        wd.findElement(By.name("group_footer")).sendKeys(futer);
        wd.findElement(By.name("submit")).click( );
        wd.findElement(By.linkText("group page")).click( );
        wd.findElement(By.cssSelector("span.group")).click( );
        wd.findElement(By.linkText("Logout")).click( );
    }

    private void goToGroupPage(String groups) {
        wd.findElement(By.linkText(groups)).click( );
    }

    @AfterMethod
    public void tearDown() {
        wd.quit( );
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo( ).alert( );
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
