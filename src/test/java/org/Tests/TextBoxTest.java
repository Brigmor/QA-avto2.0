package org.Tests;

import org.BasePage;
import org.junit.jupiter.api.Test;
import org.Page.TextBoxPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TextBoxTest extends BasePage {
    @Test
    void test1(){
        //Создание экземпляра класса
        TextBoxPage page = new TextBoxPage();
        //Открыть страницу сайта
        openPage("/text-box");
        //Проверить элементы формы заполнения
        page.pageCheckEmptyFormElements();
        //Заполнить поля формы
        page.pageValueTextInput("Alex ","alex@gmail.ru","Vologda","Arhangelsk");
        //
        page.pageClkickSumbit();
        //=========================Проверки введенной информации в поле======================================================
        //Проверить юзернейм
        page.pageCheckTextUserName();
        //Проверить емаил
        page.pageCheckTextEmail();
        //Проверить куррент адрес
        page.pageCheckCurrentAddress();
        //Проверить перманентный адрес
        page.pageCheckPermanentAddress();

        //sleep(5000);
    }
}
