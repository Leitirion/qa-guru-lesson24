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

    public void selectButton (){
        subjectButton1.click();
    }

//    private SelenideElement
//            genderInput = $("#genterWrapper"),
//            pictureUpload = $("#uploadPicture"),
//            subjectsInput = $("#subjectsInput"),
//            hobbies = $("#hobbiesWrapper");
//
//
//
//
//
//    public RegistrationPage uploadPicture(String picture){
//        pictureUpload.uploadFromClasspath(picture);
//        return this;
//    }
//
//    public RegistrationPage selectHobby (String hobby){
//        hobbies.$(byText(hobby)).click();
//        return this;
//    }
//
//    public RegistrationPage fillSubject(String subject1){
//        subjectsInput.val(subject1).pressEnter();
//        return this;
//    }
//
//    public RegistrationPage fillAddress(String state, String city){
//        $("#react-select-3-input").setValue("NCR").pressEnter();
//        $("#react-select-4-input").setValue("Noida").pressEnter();
//        return this;
//    }
//
//    public void submitEnter(){
//        $("#submit").pressEnter();
//    }
}