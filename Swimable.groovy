package Seminar.Seminar_2_from_My_DZ1

interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 6;
    };
}