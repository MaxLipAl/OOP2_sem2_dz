package Seminar.Seminar_2_from_My_DZ1;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swim, Speak, ToGo {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }
    @Override
    public void toGo() {
        System.out.println("Отлично ходят");
    }

    @Override
    public void swim() {
        System.out.println("Умеют плавать");
    }

    @Override
    public void speak() {
        System.out.println("Говорят: Гав");
    }

    @Override
    public void run() {
        System.out.print("Собака бежит со скоростью: ");
    }

    @Override
    public double getRunSpeed() {
        return 25;
    }
}
