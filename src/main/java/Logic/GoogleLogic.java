package Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleLogic  {
	
	        WebDriver driver = new ChromeDriver();
	
	public void caminhosite() {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver.get("https://www.google.com.br/");
		driver.manage().window().maximize();
	}
	  
	public void inserindopesquisa() {
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cachorro");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])")).submit();
	
		
	}
	
	
	
	
	public boolean validandopaginacachorro() {
		if (driver.findElement(By.xpath("(//span[text()='Cachorro'])")) != null) {
			driver.quit();
			return true;
		} else {
			System.out.println("Elemento não encontrado !!!");
			driver.quit();
			return false;
		}
		
		
	}
	
	

}
