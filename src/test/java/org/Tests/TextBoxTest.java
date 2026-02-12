package org.Tests;

import org.BaseTest;
import org.junit.jupiter.api.Test;
import org.Page.TextBoxPage;
import static org.TestData.TestDataTextBox.*;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest extends BaseTest {
    @Test
    void test1(){
        //Открыть страницу сайта
        openPage("/text-box");
        //Создание экземпляра класса
        new TextBoxPage()
        //Проверить элементы формы заполнения
                .CheckEmptyFormElements()
                .ValueTextInput(VALID_NAME, VALID_EMAIL, VALID_CURRENT_ADDRESS, VALID_PERMANENT_ADDRESS)
                .ClickSumbit()
                .verifyUserName(VALID_NAME)
                .verifyUserEmail(VALID_EMAIL)
                .verifyCurrentAddress(VALID_CURRENT_ADDRESS)
                .verifyPermanentAddress(VALID_PERMANENT_ADDRESS);


    }
}
