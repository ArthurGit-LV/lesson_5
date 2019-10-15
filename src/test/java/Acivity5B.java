import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Acivity5B {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Arthur/Documents/Chromedriver/chromedriver.exe");
    CustomWaitExample();

    }
    private static void CustomWaitExample()
    {
        WebDriver driver = new ChromeDriver();
       /* driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_1.html");


        try {
            //set an explicit driver wait
            WebElement element = new WebDriverWait(driver,5).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver d)
                {

                    return d.findElement(By.id("runTestButton"));
                }

            });

            if(element.getAttribute("id").equals("runTestButton"))
            {
                System.out.println("We have successfully found the info element");
            }
            else {
                System.out.println("Something has gone wrong,we didn't find the element");
            }*/


      /*  driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_2.html");
       try {
           //click the runTestButton to start the test
           driver.findElement(By.id("runTestButton")).click();
           Boolean active = new WebDriverWait(driver,5).until(new ExpectedCondition<Boolean>()
           {
              public Boolean apply(WebDriver d)
              {
                  return d.findElement(By.id("runTestButton")).getAttribute("disabled") != null;
              }

           });

        }*/

        driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_3.html");
        try {
            //click the runTestButton to start the test
            driver.findElement(By.id("runTestButton")).click();
            Boolean active = new WebDriverWait(driver,5).until(new ExpectedCondition<Boolean>()
            {
                public Boolean apply(WebDriver d)
                {
                    return !d.findElement(By.id("runTestButton")).isDisplayed();
                }

            });

        }
       finally {
           driver.quit();
        }
    }
}
