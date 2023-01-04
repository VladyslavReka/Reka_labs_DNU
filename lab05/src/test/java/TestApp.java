import org.example.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    public void testPhoneNumber() {
        App number = new App();
        Assertions.assertTrue(number.tNumber("(+380)46-914-20-13"));
        Assertions.assertTrue(number.tNumber("(+380)12-345-67-89"));
        Assertions.assertFalse(number.tNumber("+380987654039"));
        Assertions.assertFalse(number.tNumber("hha43jgh3"));
        Assertions.assertFalse(number.tNumber("98&*23$%6"));
    }

    @Test
    public void testSpace() {
        App st = new App();
        Assertions.assertEquals("Я хочу бути програмістом",st.space("Я  хочу  бути  програмістом"));
    }

    @Test
    public void Html() {
        String corrSt = "" + "Символы круглых скобок '(' и ')'. Эти символы" +
                "позволяют получить из искомой строки дополнительную информацию." +
                "Обычно, если парсер регулярных выражений ищет в тексте информацию" +
                "по заданному выражению и находит ее - он просто возвращает" +
                "найденную строку." + "А вот тут ссылка, чтоб жизнь медом не казалась." + "";

        App st = new App();

        Assertions.assertEquals(corrSt,st.delHtml("<div>" +
                "<p>Символы круглых скобок <code>'('</code> и <code>')'</code>. Эти символы" +
                "позволяют получить из искомой строки дополнительную информацию." +
                "<br/>Обычно, если парсер регулярных выражений ищет в тексте информацию" +
                "по заданному выражению и находит ее - он просто возвращает" +
                "найденную строку.</p>" +
                "<p align=\"right\">А вот тут <a href=\"google.com\">ссылка</a>, чтоб жизнь медом не казалась.</p>" +
                "</div>"));

    }
}
