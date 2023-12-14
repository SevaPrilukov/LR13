package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService = context.getBean("courseService", CourseService.class);

        // Выводим список всех курсов
        //courseService.printAll();

        //Добавляем студента с низким баллом
        System.out.println("------------------------------");
        courseService.setRequest("Васильев Владимир", "Группа A", "Android Developer");

        // Добавляем студента
        System.out.println("------------------------------");
        courseService.setRequest("Андреев Андрей", "Группа C", "C#");
        System.out.println("------------------------------");
        courseService.setRequest("Андреев Андрей", "Группа C", "Python");
        System.out.println("------------------------------");
        courseService.setRequest("Андреев Андрей", "Группа C", "Data Engineer");

        //Повторно добавить студента
        System.out.println("------------------------------");
        courseService.setRequest("Андреев Андрей", "Группа C", "Python");



        // Отчисляем студента
        System.out.println("------------------------------");
        courseService.expelStudent("Андреев Андрей", "C#");

    }
}