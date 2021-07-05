package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pages.PageElementsAndHelpers;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class ProoftechItTests extends TestBase {
    PageElementsAndHelpers PageElementsAndHelpers = new PageElementsAndHelpers();

    static final String URL = "https://www.prooftechit.com/";

    @Test
    @DisplayName("Открытие и проверка надписи на сайте")
    void titleTest() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step(" 'Разработка программного обеспечения | Prooftech IT'", () -> {
            String expectedTitle = "Разработка программного обеспечения | Prooftech IT";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Открытие страницы Вакансия, найти Актуальные вакансии, открыть вакансию Automation QA Engineer (JAVA) и найти текст")
    void openVacancyPage() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step("CLick on button 'Вакансия'", () -> {
            PageElementsAndHelpers.selectButton();
        });

        step("Find and click on button 'Актуальные вакансии'", () -> {
            $(byText("Актуальные вакансии")).click();
        });

        step("Find and click on link 'Automation QA Engineer (JAVA)'", () -> {
            $(byText("Automation QA Engineer (JAVA)")).click();
        });

        step("Page should have text 'В связи расширением команды ищем талантливого Automation QA " +
                "Engineer для участия в тестировании проектов разработки банковского ПО с микросервисной архитектурой.'", () -> {
            $("#viewer-foo").shouldHave(text("В связи расширением команды ищем талантливого Automation QA " +
                    "Engineer для участия в тестировании проектов разработки банковского ПО с микросервисной архитектурой."));
        });
    }
}



