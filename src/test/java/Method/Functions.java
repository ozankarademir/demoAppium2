package Method;

import io.appium.java_client.MobileElement;
import Constants.*;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

public class Functions extends BaseTest{

    public void initializeTest() throws MalformedURLException {
        setUp();
    }

    public void skipOnboarding() throws InterruptedException {
        untilElementAppear(Constants.skipButton);
        click(Constants.skipButton);
    }

    public void goToBabyCareCategory() throws InterruptedException {
        untilElementAppear(Constants.homeCareCategory);
        click(Constants.homeCareCategory);
        click(Constants.babyCareCategory);
    }
    public void goToSnacksCategory() throws InterruptedException {
        untilElementAppear(Constants.homeCareCategory);
        click(Constants.waterCategory);
        click(Constants.snacksCategory);
    }

    public void randomProductAddToCart() throws InterruptedException {
        List<MobileElement> element = waitForElements(60, Constants.cardView);
        System.out.println(element.size());
        Random rnd = new Random();
        int rndInt = rnd.nextInt(element.size()-1);
        element.get(rndInt).click();
        click(Constants.addToCartButton);
        driver.navigate().back();
    }

    public void goToBasket() throws InterruptedException {
        untilElementAppear(Constants.basketButton);
        click(Constants.basketButton);
    }

    public void removeProducts() throws InterruptedException {
        while(isElementExist(Constants.removeButton,3)){
            click(Constants.removeButton);
        }
    }
    public void priceConfirmed() throws InterruptedException {
        MobileElement element = findElement(Constants.price);
        String basketPrice = element.getText();
        Assert.assertEquals(basketPrice,"$3.96" );
    }

    public void basketConfirmedEmty() throws InterruptedException {
        driver.navigate().back();
        goToBasket();
        MobileElement element = findElement(Constants.emptyCart);
        String emptyBasket = element.getText();
        Assert.assertEquals(emptyBasket,"Your Cart is empty !" );
    }
    public void homePageConfirmed() throws InterruptedException {
        untilElementAppear(Constants.homePageHeader);
        MobileElement element = findElement(Constants.homePageHeader);
        String basketPrice = element.getText();
        Assert.assertEquals(basketPrice,"GetirSample" );
    }

    public void randomCategory() throws InterruptedException {
        List<MobileElement> element = waitForElements(60, Constants.menuTabs);
        System.out.println(element.size());
        Random rnd = new Random();
        int rndInt = rnd.nextInt(element.size()-1);
        element.get(rndInt).click();
    }

    public void randomWislistItem() throws InterruptedException {
        List<MobileElement> element = waitForElements(60, Constants.wishlistbutton);
        System.out.println(element.size());
        for (int i=0; i< element.size()-2 ; i++){
            element.get(i).click();
        }
    }

    public void goToLeftMenu() throws InterruptedException {
        click(Constants.leftMenu);
    }

    public void goToMyWishlist() throws InterruptedException {
        click(Constants.myWishlist);
    }

    public void removeWishlists() throws InterruptedException {
        while(isElementExist(Constants.deleteWishList,3)){
            click(Constants.deleteWishList);
        }
    }
    public void wishlistConfirmedEmty() throws InterruptedException {
        driver.navigate().back();
        goToMyWishlist();
        MobileElement element = findElement(Constants.emptywishlist);
        String emptyWishlist = element.getText();
        Assert.assertEquals(emptyWishlist,"Your Wishlist is empty !" );
    }
}
