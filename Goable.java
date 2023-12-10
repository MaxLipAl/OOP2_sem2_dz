package Seminar.Seminar_2_from_My_DZ1;

public interface Goable {
    public static final String type = "Gloable"; //не обязательно, стоит по умолчанию

    void run();
  default double getRunSpeed(){
      return 5.5;
  };
}
