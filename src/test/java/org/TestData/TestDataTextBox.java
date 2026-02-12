package org.TestData;

public class TestDataTextBox {
    // Основные тестовые данные для TextBox формы
    public static final String VALID_NAME = "Alex";
    public static final String VALID_EMAIL = "alex@gmail.ru";
    public static final String VALID_CURRENT_ADDRESS = "Vologda";
    public static final String VALID_PERMANENT_ADDRESS = "Arhangelsk";

    // Негативные тестовые данные
    public static final String INVALID_EMAIL = "alex";
    public static final String EMPTY_NAME = "";
    public static final String LONG_NAME = "A".repeat(100);

    // Ожидаемые результаты
    public static final String EXPECTED_ERROR_COLOR = "rgb(255, 0, 0)";
}
