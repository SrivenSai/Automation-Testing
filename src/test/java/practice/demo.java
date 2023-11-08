package practice;

import org.testng.annotations.Test;

public class demo {
@Test
public void test1()
{
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
}
}
