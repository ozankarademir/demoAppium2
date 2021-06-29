package Steps;

import Method.Functions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;


public class Steps {

    Functions function = new Functions();

    @Given("^Navigate to the MobileApp$")
    public void navigeToTheMobileApp() throws MalformedURLException {
        function.initializeTest();
    }

    @Then("^Skip the onboarding screen$")
    public void skipTheOnboardingScreen() throws InterruptedException {
        function.skipOnboarding();
    }

    @Then("^BABY CARE category selected$")
    public void babyCARECategorySelected() throws InterruptedException {
        function.goToBabyCareCategory();
    }

    @Then("^Add a random product to basket$")
    public void addARandomProductToBasket() throws InterruptedException {
        function.randomProductAddToCart();
    }

    @Then("^Snacks category selected$")
    public void snacksCategorySelected() throws InterruptedException {
        function.goToSnacksCategory();
    }


    @Then("^Go To Basket$")
    public void goToBasket() throws InterruptedException {
        function.goToBasket();
    }

    @Then("^Remove Products$")
    public void removeProducts() throws InterruptedException {
        function.removeProducts();
    }

    @Then("^Confirmed Price$")
    public void confirmedPrice() throws InterruptedException {
        function.priceConfirmed();
    }

    @Then("^Confirmed Basket Empty$")
    public void confirmedBasketEmpty() throws InterruptedException {
        function.basketConfirmedEmty();
    }

    @Then("^HomePage Header Check$")
    public void homepageHeaderCheck() throws InterruptedException {
        function.homePageConfirmed();
    }

    @Then("^Select a random category$")
    public void selectARandomCategory() throws InterruptedException {
        function.randomCategory();
    }

    @Then("^Select random wislist items$")
    public void selectRandomWislistItems() throws InterruptedException {
        function.randomWislistItem();
    }

    @Then("^Go to Left Menu$")
    public void goToLeftMenu() throws InterruptedException {
        function.goToLeftMenu();
    }

    @Then("^Go to My Wishlist Page$")
    public void goToMyWishlistPage() throws InterruptedException {
        function.goToMyWishlist();
    }

    @Then("^Remove Wishlists$")
    public void removeWishlists() throws InterruptedException {
        function.removeWishlists();
    }

    @Then("^Confirmed Wishlist Empty$")
    public void confirmedWishlistEmpty() throws InterruptedException {
        function.wishlistConfirmedEmty();
    }
}
