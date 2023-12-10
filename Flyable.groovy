package Seminar.Seminar_2_from_My_DZ1

interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 25;
    };
}