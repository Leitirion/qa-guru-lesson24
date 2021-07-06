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
    void openVacancyPageAndFindJob() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step("CLick on button 'Вакансия'", () -> {
            PageElementsAndHelpers.VacancyButton();
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

    @Test
    @DisplayName("Открытие страницы Вакансия, найти Актуальные вакансии, отфильтровать вакансии по Новейшим")
    void openVacancyPageAndFilterByNew() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step("CLick on button 'Вакансия'", () -> {
            PageElementsAndHelpers.VacancyButton();
        });

        step("Find and click on button 'Актуальные вакансии'", () -> {
            $(byText("Актуальные вакансии")).click();
        });

        step("Find and click on filter and select 'Новейшие'", () -> {
            $x("//div[@id='content-wrapper']//button//span[text()='Фильтр:']").click();
            $(byText("Новейшие")).click();
            $x("//div[@id='content-wrapper']//button[@aria-label='Фильтр:']//span[text()='Новейшие']").shouldHave(text("Новейшие"));
        });
    }

    @Test
    @DisplayName("Открытие страницы Вакансия, найти Актуальные вакансии, нажать на многоточие и выбрать 'Поделиться постом'")
    void openVacancyPageFindTitle() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step("CLick on button 'Вакансия'", () -> {
            PageElementsAndHelpers.VacancyButton();
        });

        step("Find and click on button 'Сейчас не ищем, но интересны'", () -> {
            $(byText("Сейчас не ищем, но интересны")).click();
        });

        step("Find on page description title 'Сейчас не ищем, но интересны'", () -> {
            $x("//div[@data-hook='page-description__title']").shouldHave(text("Сейчас не ищем, но интересны"));
        });
    }

    @Test
    @DisplayName("Открытие страницы Вакансия, найти Актуальные вакансии, нажать на многоточие и выбрать 'Поделиться постом'")
    void openVacancyPageWithBottomLinkAndFindTitle() {
        step("Open ${URL}", () -> {
            PageElementsAndHelpers.openPage(URL);
        });

        step("CLick on button 'Вакансия'", () -> {
            PageElementsAndHelpers.VacancyButton();
        });

        step("Find and click on button 'Вакансии' внизу экрана", () -> {
            $x("//div[@id='SITE_FOOTER']//a[text()='Вакансии']").click();
        });

        step("Find on page description title 'Вакансии'", () -> {
            $x("//div[@data-hook='page-description__title']").shouldHave(text("Вакансии"));
        });
    }
}



