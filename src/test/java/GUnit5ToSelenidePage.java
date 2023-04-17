import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GUnit5ToSelenidePage {

    @BeforeEach
    void beforeEach() {
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
    @Tag("simple")
    @Test
    void gUnit5ShouldHaveSelenidePage(){

        //открыть https://github.com/selenide/selenide
        open("https://github.com/selenide/selenide");
        //перейти в раздел Wiki
        $("#wiki-tab").click();
        //убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        //открыть SoftAssertions
        $$("ul.filterable-active li span").findBy(text("SoftAssertions")).click();
        //проверить, что внутри есть пример кода для JUnit5
        $("div #wiki-content").shouldHave(text("Using JUnit5 extend test class"));
    }
}
