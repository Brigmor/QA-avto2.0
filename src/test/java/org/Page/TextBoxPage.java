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
    public void pageCheckEmptyFormElements(){
        pageTitle.shouldBe(Condition.visible);
        pageUserName.shouldBe(Condition.visible);
        pageUserEmail.shouldBe(Condition.visible);
        pageCurrentAddress.shouldBe(Condition.visible);
        pagePermanentAddress.shouldBe(Condition.visible);
        pageSubmit.shouldBe(Condition.visible);
    }
    //Ввод значений на форму
    public void pageValueTextInput(String UserName,String userEmail,String currentAddress,String permanentAddress){
        pageUserName.setValue(UserName);
        pageUserEmail.setValue(userEmail);
        pageCurrentAddress.setValue(currentAddress);
        pagePermanentAddress.setValue(permanentAddress);

    }
    //Нажать на кнопку Sumbit
    public void pageClkickSumbit(){
        pageSubmit.click();
    }
    //Проверить имя юзера
    public void pageCheckTextUserName(){
        pageUserName.shouldHave(Condition.value("Alex"));
    }
    //Проверить емаил
    public void pageCheckTextEmail(){
        pageUserEmail.shouldHave(Condition.value("alex@gmail.ru"));
    }
    //Проверить что курент адрес ввелся правильно
    public void pageCheckCurrentAddress(){
        pageCurrentAddress.shouldHave(Condition.value("Vologda"));
    }
    //Проверить что перманетный адрес ввелся правильно
    public void pageCheckPermanentAddress(){
        pagePermanentAddress.shouldHave(Condition.value("Arhangelsk"));
    }








}
