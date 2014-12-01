package sanityTests;

//import org.apache.commons.collections.OrderedBidiMap;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Annotations {

	@Test
	public void KongaTest() throws InterruptedException {

		Functions functions = new Functions(driver);

		// Select Product from All Categories
		functions.selectAllCats();

		// Assert.assertEquals(functions.orderStatus.getText(),
		// " Thanks for your order");//assert.actual.contains.expected

		// Select Category
		functions.selectCat();
		
//		// Select Sub Category
//		functions.selectSubCat();
//		
//		//Select Sub Sub Category
//		functions.selectSubSubCat();
		
		//Select Product
		functions.selectProduct();
		
		//Buy Now
		functions.buyNow();
		
		//Send Email
		functions.email();
		
		//Send Password
		functions.password();
		
		//Click Login
		functions.login();
		
		//Select Delivery Address
		functions.address();
		
		//Deliver to selected address
		functions.deliver();
		
		//Select Payment Method
		functions.POD();
		
		//Confirm Payment
		functions.confirm();
		
		//Verify Order Status
		functions.verify();
		//Assert.assertEquals(orderStatus.getText(), " Thanks for your order");

	}

}
