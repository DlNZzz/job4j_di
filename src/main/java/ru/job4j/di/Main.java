package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru");
        context.refresh();
        StartUI startUI = context.getBean(StartUI.class);
        startUI.add("Petr Arsentev");
        startUI.add("Ivan ivanov");
        startUI.print();
    }
}