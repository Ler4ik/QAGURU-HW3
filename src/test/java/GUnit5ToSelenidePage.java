import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GUnit5ToSelenidePage extends TestBase {

    @Tag("simple")
    @Test
    void gUnit5ShouldHaveSelenidePage(){

        step("Открыть github",() -> {
        open("selenide/selenide");
        });
        step("Перейти в раздел Wiki",() -> {
        $("#wiki-tab").click();
        });
        step(" Найти страницу SoftAssertions",() -> {
        $("#wiki-pages-filter").setValue("SoftAssertions");
        });
        step(" Открыть SoftAssertions",() -> {
        $$("ul.filterable-active li span").findBy(text("SoftAssertions")).click();
        });
        step(" Проверить, что внутри есть пример кода для JUnit5",() -> {
        $("div #wiki-content").shouldHave(text("Using JUnit5 extend test class"));
        });
    }
}
