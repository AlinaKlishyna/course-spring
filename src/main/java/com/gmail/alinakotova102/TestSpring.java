package com.gmail.alinakotova102;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alina Klishyna
 */
public class TestSpring {

    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext, который обращается к конфигурационному
         * файлу res/applicationContext.xml, считывает все находящие в нем бины и
         * и помещает в Application Context
         *
         * В который передаем название конфигурационного файла
         *
         * Важно: совпадение имен файла и чтобы данный файл лежал именно в resources(папке с ресурсами)
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // достаем бин с класса TestBean
        // в качестве 1-го аргумента указываем id
        // в качестве 1-го аргумента указываем тот класс, из которого хочем достать бин
        // обьект класса TestBeat ложим в переменную testBean
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName() + " " + testBean.getLastname());

        // после работы с обьектом обязательно должны его закрыть
        context.close();
    }
}
