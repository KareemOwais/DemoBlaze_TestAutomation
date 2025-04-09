package DemoBlaze.pages;

import Factory.WebDriverFactory;
import Interactions.Button;
import Interactions.Label;
import org.openqa.selenium.By;

import static Utils.WaitUtils.HandleAlert;
import static Utils.WaitUtils.waitForElementToBeVisible;
import static DemoBlaze.pages.HomePage.Products;
import static DemoBlaze.pages.HomePage.ProductsPrices;

public class ProductPage {
    private int i =0;
    private int j =0;
    private Label productName = new Label(By.xpath("//h2[@class='name']"));
    private Label productPrice = new Label(By.xpath("//h3[@class='price-container']"));
    private Button AddToCartButton = new Button(By.xpath("//a[text()='Add to cart']"));
   private Label Discription = new Label(By.xpath("//strong"));
    private Label WelcomeText= new Label(By.xpath("//a[normalize-space()='Welcome kareem1234']"));

    public void clickAddToCart() {
        waitForElementToBeVisible(WebDriverFactory.getDriver(),WelcomeText.Locator);
        Products[i] =  productName.getText();
        String price = productPrice.getText();
        price = price.substring(1,price.indexOf(" "));
        ProductsPrices[i] =Integer.parseInt(price);
        i++;
//        System.out.println("=== START ===");
//        System.out.println(ProductsPrices[0]);
//        System.out.println("=== END ===");
        AddToCartButton.click();
        HandleAlert(WebDriverFactory.getDriver());
    }

}

