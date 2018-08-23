import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://ec2-34-237-100-2.compute-1.amazonaws.com/siapa/web-v2/inicio')

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id("sp-email")).sendKeys("daikiry@gmail.com")

driver.findElement(By.id("sp-password")).sendKeys("12345678")

driver.findElement(By.cssSelector("button[type='submit']")).click()

Thread.sleep(3000)

driver.findElement(By.linkText("Asignación de ruta")).click()

paginas = driver.findElements(By.cssSelector("button[title='Editar']"))

int pages= paginas.size()

paginas.get(pages-12).click()

driver.findElement(By.cssSelector("span[class='select2-selection__rendered'][title='132-aasdasd']")).click()

Usuarios = driver.findElements(By.className("select2-results__option"))

System.out.println(Usuarios)

Usuarios.get(2).click()


