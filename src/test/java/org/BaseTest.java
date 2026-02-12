package org;
//конфигурации селенид
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
//конфигурации с junit
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
//===================Базовые класс для всех тестов 'наследуется'====================

public abstract class  BaseTest {
    protected static final String BASE_URL = "https://demoqa.com";
    @BeforeAll
    public static void configureBrowser(){
      Configuration.browser="Chrome";
      Configuration.browserSize ="1920x1080";
      Configuration.timeout =5000;
      Configuration.pageLoadTimeout =30000;
      Configuration.baseUrl = BASE_URL;
    }
    protected void openPage(String relativePath) {
        open(relativePath);
    }

    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }

}
