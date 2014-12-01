package sanityTests;
//Comment added from Windows
public class Elements {

	// All Categories xpath
	private String allCats = "(//TextView[@id='popular_categories_grid_item_tv_category_name'])[8]";

	public String getAllCats() {
		return allCats;
	}

	// Food & Drink Category xpath
	private String cat = "(//ToggleButton[@id='category_menu_screen_item_tv_category'])[11]";
	public String getCat(){
		return cat;
	}
	
	// Beverage Sub Category xpath
	private String subCat = "(//TextView[@id='menu_category_item_category_screen_tv_text'])[1]";
	public String getSubCat(){
		return subCat;
	}
	
	//Coffee Sub Sub Category xpath
	private String subSubCat = "//TextView[@id='menu_category_item_subcategory_screen_tv_text']";
	public String getSubSubCat(){
		return subSubCat;
	}
	
	//3rd Product xpath
	private String product = "(//TextView[@id='adapter_category_product_list_row_tv_product_name'])[3]";
	public String getProduct(){
		return product;
	}
	
	//Buy Now id
	private String buyNow = "fragment_product_detail_bt_buynow";
	public String getBuyNow(){
		return buyNow;
	}
	
	//Email id
	private String emailField = "fragment_check_out_step_one_et_email";
	public String getEmailField(){
		return emailField;
	}
	
	//QA Test Mail 
	private String myEmail = "qatest2@konga.com";
	public String getMyEmail(){
		return myEmail;
	}
	
	//Password id
	private String passwordField = "fragment_check_out_step_one_et_password";
	public String getPasswordFeild(){
		return passwordField;
	}
	
	//QA Test Password
	private String myPassword = "PASS123";
	public String getMyPassword(){
		return myPassword;
	}
	
	//Login id
	private String login = "fragment_check_out_step_one_bt_sign_in";
	public String getLogin(){
		return login;
	}
	
//	//First Address id
//	private String address = "common_cart_shipping_details_rb_item";
//	public String getAddress(){
//		return address;
//	}
	
	//First Address xpath
		private String address = "(//RadioButton[@id='common_cart_shipping_details_rb_item'])[1]";
		public String getAddress(){
			return address;
		}
	
	//Deliver button id
	private String deliver = "fragment_check_out_step_two_bt_submit_address";
	public String getDeliver(){
		return deliver;
	}
	
	//POD Payment Method xpath
	private String POD = "(//RadioButton[@id='common_cart_shipping_details_rb_item'])[2]";
	public String getPOD(){
		return POD;
	}
	
	//Confirm Payment id
	private String confirm = "fragment_check_out_bt_proceed_to_pay";
	public String getConfirm(){
		return confirm;
	}
	
	//Order Status id
	private String status ="fragment_order_information_tv_order_status";
	public String getStatus(){
		return status;
		
	}

}