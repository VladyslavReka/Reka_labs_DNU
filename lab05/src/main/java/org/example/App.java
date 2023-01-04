package org.example;

public class App {
    public boolean tNumber(String number) {
        if (number.matches("\\(\\+380\\)[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}")) {
            System.out.println("Вірний номер телефону");
            return true;
        } else {
            System.out.println("Не вірний номер телефону");
            return false;
        }
    }

    public String space(String st) {
        String st1 = st.replaceAll("\\s{2,}", " ");
        return st1;
    }

    public String delHtml(String st) {
        String st2 = st.replaceAll("<[^>]*>", "");
        return st2;
    }
}
