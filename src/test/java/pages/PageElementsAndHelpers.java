package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class PageElementsAndHelpers {

    private SelenideElement
            subjectButton1 = $("#comp-ioclk9191label");

    public PageElementsAndHelpers openPage(String URL){
        open(URL);
        return this;
    }

    public void VacancyButton (){
        subjectButton1.click();
    }
}