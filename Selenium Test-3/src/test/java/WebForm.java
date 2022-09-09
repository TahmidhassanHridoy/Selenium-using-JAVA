import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "TAHMID";
    private final String MIDDLE_NAME = "HASSAN";
    private final String LAST_NAME = "RIDOY";
    private final String EMAIL = "TAHMID12@GMAIL.COM";
    private final String PHONE = "01700000000";
    private final String USER_NAME = "TAHMID12";
    private final String PASSWORD = "1234";
    private final String CPASSWORD = "1234";

    @FindBy(id = "fname")
    private WebElement Fname;

    @FindBy(id = "mname")
    private WebElement Mname;

    @FindBy(id = "lname")
    private WebElement Lname;


    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "phone")
    private WebElement Phone;

    @FindBy(id = "username")
    private WebElement uname;

    @FindBy(id = "pwd")
    private WebElement password;

    @FindBy(id = "cpwd")
    private WebElement confirm;

    @FindBy(xpath = "/html/body/table/tbody/tr[13]/td/input")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFName(){
        this.Fname.sendKeys(FIRST_NAME);
    }

    public void enterMNAME(){
        this.Mname.sendKeys(MIDDLE_NAME);
    }

    public void enterLNAME(){
        this.Lname.sendKeys(LAST_NAME);
    }


    public void enterMAIL(){
        this.Email.sendKeys(EMAIL);
    }

    public void enterPHONE(){
        this.Phone.sendKeys(PHONE);
    }

    public void enterUName(){
        this.uname.sendKeys(USER_NAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void enterCPassword(){
        this.confirm.sendKeys(CPASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
    @FindBy(xpath = "/html/body")
    private WebElement alertSuccess;

    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}
