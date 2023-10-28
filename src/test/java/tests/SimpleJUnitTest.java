package tests;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("###             beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###     beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     afterEach()\n");
        result = 0;
    }

    int getResult() {
        return 3;
    }

    @Test
    void firstTest() {
        System.out.println("### firstTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest()");
        Assertions.assertTrue(3 > 2);
    }

//    @Test
//    void successfulSearchTest() {
//        Configuration.pageLoadStrategy = "eager";
//        open("https://www.google.com/");
//        $("[name=q]").setValue("selenide").pressEnter();
//        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
//    }
}
