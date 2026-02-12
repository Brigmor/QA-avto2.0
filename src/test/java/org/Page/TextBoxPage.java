package org.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    //=========================СЕЛЕКТОРА=====================================================
    //Селектора титульников
    private final SelenideElement pageTitle =$(".text-center");
    //Селектора полей ввода текста
    private final SelenideElement pageUserEmail =$("#userEmail");
    private final SelenideElement pageUserName =$("#userName");
    private final  SelenideElement pageCurrentAddress =$("#currentAddress");
    private final SelenideElement pagePermanentAddress =$("#permanentAddress");
    private final SelenideElement pageSubmit =$("#submit");

   //==============================Методы======================================================
    //Проверка элементов формы
    public TextBoxPage CheckEmptyFormElements(){
        pageTitle.shouldBe(Condition.visible);
        pageUserName.shouldBe(Condition.visible);
        pageUserEmail.shouldBe(Condition.visible);
        pageCurrentAddress.shouldBe(Condition.visible);
        pagePermanentAddress.shouldBe(Condition.visible);
        pageSubmit.shouldBe(Condition.visible);
        return this;
    }
    //Ввод значений на форму
    public  TextBoxPage ValueTextInput(String UserName,String userEmail,String currentAddress,String permanentAddress){
        pageUserName.setValue(UserName);
        pageUserEmail.setValue(userEmail);
        pageCurrentAddress.setValue(currentAddress);
        pagePermanentAddress.setValue(permanentAddress);

        pageUserName.shouldHave(Condition.value(UserName));
        pageUserEmail.shouldHave(Condition.value(userEmail));
        pageCurrentAddress.shouldHave(Condition.value(currentAddress));
        pagePermanentAddress.shouldHave(Condition.value(permanentAddress));
        return this;


    }
    //Нажать на кнопку Sumbit
    public TextBoxPage ClickSumbit(){
        pageSubmit.click();
        return this;
    }


    public TextBoxPage verifyUserName(String expectedName) {
        pageUserName.shouldHave(Condition.value(expectedName));
        return this;
    }

    public TextBoxPage verifyUserEmail(String expectedEmail) {
        pageUserEmail.shouldHave(Condition.value(expectedEmail));
        return this;
    }

    public TextBoxPage verifyCurrentAddress(String expectedAddress) {
        pageCurrentAddress.shouldHave(Condition.value(expectedAddress));
        return this;
    }

    public TextBoxPage verifyPermanentAddress(String expectedAddress) {
        pagePermanentAddress.shouldHave(Condition.value(expectedAddress));
        return this;
    }









}
