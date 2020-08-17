package dev.snapgram.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPhotoPage {

	WebDriver driver;
	
	public AddPhotoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, AddPhotoPage.class);
	}
	
	//Placeholder element ids below
	
	@FindBy(id = "photo_link_input")
	public WebElement photoLinkField;
	@FindBy(id = "photo_name_input")
	public WebElement photoNameField;
	@FindBy(id = "caption_input")
	public WebElement captionField;
	@FindBy(id = "tag_input")
	public WebElement tagsField;
	@FindBy(id = "upload_btn")
	public WebElement uploadPhotoBtn;
	@FindBy(id = "save_btn")
	public WebElement savePhotoBtn;
}
