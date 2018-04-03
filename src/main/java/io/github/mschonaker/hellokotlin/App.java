package io.github.mschonaker.hellokotlin;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "! This is Java";
    }

    public static String greet(Message message) {
        message.setText("Hello, " + message.getText() + "! This is Java");
        return message.toString();
    }
}
