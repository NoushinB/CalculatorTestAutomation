package core.pages;

import core.pages.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class CalculatorPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"result_text_view\")")
    private WebElement resultTextView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"clear_button\")")
    private WebElement btnClear;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"plus_button\")")
    private WebElement btnAddition;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"minus_button\")")
    private WebElement btnSub;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"multiply_button\")")
    private WebElement btnMultiply;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"divide_button\")")
    private WebElement btnDivide;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"plus_minus_button\")")
    private WebElement btnPlusMinus;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"one_button\")")
    private WebElement btnOne;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"two_button\")")
    private WebElement btnTwo;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"three_button\")")
    private WebElement btnThree;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"four_button\")")
    private WebElement btnFour;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"five_button\")")
    private WebElement btnFive;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"six_button\")")
    private WebElement btnSix;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"seven_button\")")
    private WebElement btnSeven;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"eight_button\")")
    private WebElement btnEight;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"nine_button\")")
    private WebElement btnNine;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"zero_button\")")
    private WebElement btnZero;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"equals_button\")")
    private WebElement btnEqual;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"dot_button\")")
    private WebElement btnDot;

    public CalculatorPage() {
    }

    public boolean isCalculatorPageDisplayed() {
        return reusableUIMethods.isElementDisplayed(resultTextView);
    }

    public String getTextViewResult() {
        return resultTextView.getText();
    }

    public void clickOnOperatorButton(String operator) {

        Objects.requireNonNull(findOperatorButton(operator)).click();
    }

    private WebElement findOperatorButton(String operator) {
        switch (operator) {
            case "+":
                return btnAddition;
            case "-":
                return btnSub;
            case "*":
                return btnMultiply;
            case "/":
                return btnDivide;
            case "=":
                return btnEqual;
            case "AC":
                return btnClear;
            case "+/-":
                return btnPlusMinus;
            default:
                return null;
        }
    }

    public void clickOnNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            char num = number.charAt(i);
            Objects.requireNonNull(findNumber(num)).click();
        }
    }

    private WebElement findNumber(char num) {
        switch (num) {
            case '0':
                return btnZero;
            case '1':
                return btnOne;
            case '2':
                return btnTwo;
            case '3':
                return btnThree;
            case '4':
                return btnFour;
            case '5':
                return btnFive;
            case '6':
                return btnSix;
            case '7':
                return btnSeven;
            case '8':
                return btnEight;
            case '9':
                return btnNine;
            case '.':
                return btnDot;
            default:
                return null;
        }
    }
}
