package Seminar.Seminar_2_from_My_DZ1;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swim, Speak, ToGo {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void toGo() {
        System.out.println("Отлично ходят");
    }

    @Override
    public void swim() {
        System.out.println("Некоторые коты умеют плавать");
    }

    @Override
    public void speak() {
        System.out.println("Говорят: Мяу");
    }

    @Override
    public void run() {
        System.out.print("Кот бежит со скоростью: ");
    }
}
