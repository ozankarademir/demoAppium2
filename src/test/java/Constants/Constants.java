package Constants;

import org.openqa.selenium.By;


public class Constants {

    public static By basketButton = By.xpath("//android.widget.TextView[@content-desc=\"Cart\"]");
    public static By removeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]");
    public static By skipButton = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button[1]");
    public static By babyCareCategory = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Baby Care\"]/android.widget.TextView");
    public static By homeCareCategory = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Home Care\"]/android.widget.TextView");
    public static By waterCategory = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Water\"]/android.widget.TextView");
    public static By snacksCategory = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Snacks\"]/android.widget.TextView");
    public static By addToCartButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    public static By price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
    public static By emptyCart = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    public static By homePageHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
    public static By menuTabs = By.className("android.support.v7.app.ActionBar$Tab");
    public static By leftMenu =By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    public static By myWishlist =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView");
    public static By deleteWishList=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[2]");
    public static By wishlistbutton=By.id("com.allandroidprojects.getirsample:id/ic_wishlist");
    public static By cardView = By.id("com.allandroidprojects.getirsample:id/cardview");
    public static By emptywishlist = By.id("android:id/content");
}
