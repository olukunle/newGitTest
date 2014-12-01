package sanityTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.Reporter;

public class Functions {

	private WebDriver driver;

	public Functions(WebDriver driver) {
		this.driver = driver;
	}

	Elements elements = new Elements();

	// -------------------------------------------------------------------------------------------------
	// Method to open product page from All Categories in HomeScreen
	// public void AllCategoriesProduct() throws InterruptedException {
	// TODO Auto-generated method stub

	// Click All Categories
	public void selectAllCats() {
		try {
			WebElement allCats2 = driver.findElement(By.xpath(elements
					.getAllCats()));
			Reporter.log(allCats2.getText() + " found\n");
			System.out.println(allCats2.getText() + " found\n");
		} catch (Throwable e) {
			Reporter.log("No Category found. Check internet connection\n");
			System.out.println("No Category found. Check internet connection");
		}
		driver.findElement(By.xpath(elements.getAllCats())).click();
	}

	// Click Food & Drink Category
	public void selectCat() {
		try {
			WebElement food = driver.findElement(By.xpath(elements.getCat()));
			Reporter.log(food.getText() + " category found\n");
			System.out.println(food.getText() + " category found\n");
		} catch (Throwable e) {
			Reporter.log("Food & Drink Category not found\n");
			System.out.println("Food & Drink Category not found\n");
		}
		driver.findElement(By.xpath(elements.getCat())).click();

	}

	// Click Beverage Sub Category
	public void selectSubCat() {
		try {
			WebElement food = driver
					.findElement(By.xpath(elements.getSubCat()));
			Reporter.log(food.getText() + " sub-category found\n");
			System.out.println(food.getText() + " sub-category found\n");
		} catch (Throwable e) {
			Reporter.log("Food & Drink Sub Category not found\n");
			System.out.println("Food & Drink Sub Category not found\n");
		}
		driver.findElement(By.xpath(elements.getSubCat())).click();
	}

	// Click Coffee Sub Sub Category
	public void selectSubSubCat() {
		try {
			WebElement food = driver.findElement(By.xpath(elements
					.getSubSubCat()));
			Reporter.log(food.getText() + " sub-sub-category found\n");
			System.out.println(food.getText() + " sub-sub-category found\n");
		} catch (Throwable e) {
			Reporter.log("Beverage Sub Sub Category not found\n");
			System.out.println("Beverage Sub Sub Category not found\n");
		}
		driver.findElement(By.xpath(elements.getSubSubCat())).click();

	}

	// CLick 6th Product Id: category_menu_screen_item_tv_category
	public void selectProduct() {
		try {
			WebElement firstProduct = driver.findElement(By.xpath(elements
					.getProduct()));
			Reporter.log(firstProduct.getText() + " product found\n");
			System.out.println(firstProduct.getText() + " product found\n");
		} catch (Throwable e) {
			Reporter.log("No product found\n");
			System.out.println("No product found");
		}
		driver.findElement(By.xpath(elements.getProduct())).click();

	}

	// CLick Buy Now
	public void buyNow() {
		try {
			WebElement buyNow = driver.findElement(By.id(elements.getBuyNow()));
			Reporter.log(buyNow.getText() + " button found\n");
			System.out.println(buyNow.getText() + " button found\n");
		} catch (Throwable e) {
			Reporter.log("Product is out of stock\n");
			System.out.println("Product is out of stock\n");
		}
		driver.findElement(By.id(elements.getBuyNow())).click();
	}

	// Enter Email
	public void email() {
		try {
			driver.findElement(By.id(elements.getEmailField()));
			Reporter.log("Email field found\n");
			System.out.println("Email field found\n");
		} catch (Throwable e) {
			Reporter.log("Email field not found\n");
			System.out.println("Email field not found\n");
		}
		driver.findElement(By.id(elements.getEmailField())).sendKeys(
				elements.getMyEmail());
	}

	// Enter Password
	public void password() {
		try {
			driver.findElement(By.id(elements.getPasswordFeild()));
			Reporter.log("Password field found\n");
			System.out.println("Password field found\n");
		} catch (Throwable e) {
			Reporter.log("Password field not found\n");
			System.out.println("Password field not found\n");
		}
		driver.findElement(By.id(elements.getPasswordFeild())).sendKeys(
				elements.getMyPassword());
	}

	// Click Login
	public void login() {
		try {
			WebElement login = driver.findElement(By.id(elements.getLogin()));
			Reporter.log(login.getText() + " button found\n");
			System.out.println(login.getText() + " button found\n");
		} catch (Throwable e) {
			Reporter.log("Login button not found\n");
			System.out.println("Login button not found\n");
		}
		driver.findElement(By.id(elements.getLogin())).click();
	}

	// Select First Address
	public void address() {
		try {
			driver.findElement(By.xpath(elements.getAddress()));
			Reporter.log("Address found\n");
			System.out.println("Address found\n");
		} catch (Throwable e) {
			Reporter.log("No address found\n");
			System.out.println("No address found\n");
		}
		driver.findElement(By.xpath(elements.getAddress())).click();
	}

	// Click Deliver Button
	public void deliver() {
		try {
			WebElement deliver = driver
					.findElement(By.id(elements.getDeliver()));
			Reporter.log(deliver.getText() + " button found\n");
			System.out.println(deliver.getText() + " button found\n");
		} catch (Throwable e) {
			Reporter.log("Deliver button not found\n");
			System.out.println("Deliver button not found\n");
		}
		driver.findElement(By.id(elements.getDeliver())).click();
	}

	// Choose POD
	public void POD() {
		try {
			WebElement pod = driver.findElement(By.xpath(elements.getPOD()));
			Reporter.log(pod.getText() + " payment option found\n");
			System.out.println(pod.getText() + " payment option found\n");
		} catch (Throwable e) {
			Reporter.log("POD payment option not found\n");
			System.out.println("POD payment option not found\n");
		}

		driver.findElement(By.xpath(elements.getPOD())).click();
	}

	// Click Confirm Payment
	public void confirm() {
		try {
			WebElement confirm = driver
					.findElement(By.id(elements.getConfirm()));
			Reporter.log(confirm.getText() + " button found\n");
			System.out.println(confirm.getText() + " button found\n");
		} catch (Throwable e) {
			Reporter.log("Confirm Payment button not found\n");
			System.out
					.println("Cart Error occured or Confirm Payment button not found\n");
		}
		driver.findElement(By.id(elements.getConfirm())).click();
	}

	// Verify Order Status
	public void verify() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement orderStatus = wait.until(ExpectedConditions
				.presenceOfElementLocated(By
						.id(elements.getStatus())));

		Thread.sleep(15000);
		try {
			WebElement status = driver.findElement(By
					.id(elements.getStatus()));
			Reporter.log(status.getText() + " found\n");
			System.out.println(status.getText() + " found\n");
		} catch (Throwable e) {
			Reporter.log("Order status yet to display\n");
			System.out.println("Order status yet to display\n");
		}
//		return orderStatus;
	}

}

