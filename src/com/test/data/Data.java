package com.test.data;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Data {
	static HashMap<String, String> xPaths = new HashMap<String, String>();
	static HashMap<String, String> registerData = new HashMap<String, String>();
	static HashMap<String, String> data = new HashMap<String, String>();
	
	public Data() {
		// Checkout flow xPaths
		xPaths.put("CloseWindow", "//span[@title='Close Window']");
		xPaths.put("OpenShoppingCart", "//a[@title='View shopping cart']");
		xPaths.put("ProceedToCheckOut", "//a[@title='Proceed to checkout']");
		xPaths.put("ProceedToCheckOut2", "//*[@id=\"center_column\"]/p[2]/a[1]");
		xPaths.put("ProcessAdress", "//button[@name='processAddress']");
		xPaths.put("CarrierCheck", "//*[@id=\"form\"]/div/p[2]/label");
		xPaths.put("ProcessCarrier", "//button[@name='processCarrier']");
		xPaths.put("PayByBankWire", "//a[@title='Pay by bank wire']");
		xPaths.put("Submit", "//*[@id='cart_navigation']/button");  // /html/body/div/div[2]/div/div[3]/div/form/p/button
		
		xPaths.put("CloseX", "//a[@title='Close']");
		// Product and Product List pages xPaths
		xPaths.put("LinkFilterProduct","//a[@class='sf-with-ul']");
		xPaths.put("CategoryProduct","//input[@type='checkbox' and @id='layered_category_");
		xPaths.put("SizeProductChk","//input[@id='layered_id_attribute_group_");
		xPaths.put("FeatureProduct","//input[@type='checkbox' and @id='layered_id_feature_");
		xPaths.put("InStockOption","//input[@type='checkbox' and @id='layered_quantity_1']");
		xPaths.put("ProductManufacturer","//input[@type='checkbox' and @id='layered_manufacturer_");
		xPaths.put("ProductNewOption","//input[@type='checkbox' and @id='layered_condition_new']");
		xPaths.put("ProductLink","//img[@title='Printed Summer Dress']");
		xPaths.put("PlusProduct","//i[@class='icon-plus']");
		xPaths.put("SizeProductSelect","//select[@id='group_1']");
		xPaths.put("AddToCarButton","//button[@name='Submit' and @class='exclusive']");

		// Authentication xPaths
		xPaths.put("LoginInputEmail", "//input[@id='email']");
		xPaths.put("LoginPw",  "//input[@id='passwd']");
		xPaths.put("LoginSubmit",  "//button[@id='SubmitLogin']");
		xPaths.put("HomeLink", "//img[@class='logo img-responsive']");
		xPaths.put("HomeLogout", "//a[@class='logout']");
		xPaths.put("HomeSignInLink", "//a[@class='login']");
		xPaths.put("HomeContactUs", "//a[@title='Contact Us']");
		xPaths.put("RegisterInputEmail", "//input[@id='email_create']");
		xPaths.put("RegisterSubmitStep1", "//button[@id='SubmitCreate']");
		xPaths.put("RegisterCheckTitle", "//input[@id='id_gender1']");
		xPaths.put("RegisterInputCustomerFirstName", "//input[@id='customer_firstname']");
		xPaths.put("RegisterInputCustomerLastName", "//input[@id='customer_lastname']");
		xPaths.put("RegisterInputPassword", "//input[@id='passwd']");
		xPaths.put("RegisterSelectDay", "//select[@id='days']");
		xPaths.put("RegisterSelectMonth", "//select[@id='months']");
		xPaths.put("RegisterSelectYear", "//select[@id='years']");
		xPaths.put("RegisterInputFirstName", "//input[@id='firstname']");
		xPaths.put("RegisterInputLastName", "//input[@id='lastname']");
		xPaths.put("RegisterInputCompany", "//input[@id='company']");
		xPaths.put("RegisterInputAddress", "//input[@id='address1']");
		xPaths.put("RegisterInputCity", "//input[@id='city']");
		xPaths.put("RegisterSelectState", "//select[@id='id_state']");
		xPaths.put("RegisterInputPostCode", "//input[@id='postcode']");
		xPaths.put("RegisterInputAditionalInfo", "//textarea[@id='other']");
		xPaths.put("RegisterInputPhone", "//input[@id='phone_mobile']");
		xPaths.put("RegisterInputAlias", "//input[@id='alias']");
		xPaths.put("RegisterSubmitStep2", "//button[@id='submitAccount']");
		
		// Contact Page xPaths
		xPaths.put("ContactSelectSubjectHeading", "//select[@id='id_contact']");
		xPaths.put("ContactSelectOrder", "//select[@name='id_order']");
		xPaths.put("ContactSelectProduct", "//select[@name='id_product']");
		xPaths.put("ContactTextAreaMessage", "//textarea[@name='message']");
		xPaths.put("ContactSubmit", "//button[@id='submitMessage']");
		
		data.put("RegisterEmail", "prueba00101@domain.com");
		data.put("RegisterCustomerFirstName", "Mauricio");
		data.put("RegisterCustomerLastName", "Gonzalez");
		data.put("RegisterPassword", "Ab123");
		data.put("RegisterDay", "15  ");
		data.put("RegisterMonth", "July ");
		data.put("RegisterYear", "1995  ");
		data.put("RegisterFirstName", "Mauricio");
		data.put("RegisterLastName", "Gzz");
		data.put("RegisterCompany", "Todas");
		data.put("RegisterAddress", "Lira 343 Col. Alto");
		data.put("RegisterCity", "Monterrey");
		data.put("RegisterState", "New Mexico");
		data.put("RegisterPostCode", "64900");
		data.put("RegisterAditionalInfo", "No hay mucho que decir");
		data.put("RegisterPhone", "8114151617");
		data.put("RegisterAlias", "Mi casa, su casa");
		
		data.put("ContactSubjectHeading", "Customer service");
		data.put("ContactMessage", "Bueno, esta es una prueba automatizada, favor de hacer caso omiso");
	}
	
	public static WebDriver configInit() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		String url = "http://automationpractice.com/index.php";
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static String getXpath(String key) {
		return xPaths.get(key);
	}
	
	public static String getData(String key) {
		return data.get(key);
	}
}

