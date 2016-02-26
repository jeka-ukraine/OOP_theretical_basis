/**
 * Created by yprokopenko on 24-Feb-16.
 */
public class Lesson_4_p1 {
    private int num;

    public int getNum(){
        return num;
    }

    public void setNum(int newValue){
        num = newValue;
    }

    public void ride(){
        num = 5;
    }

    /////////////////////////////////////////////////
    /// method overloading
    public void drive(){}

    public void drive (int a) {}

    public void drive (int a, double b) {}
    public void drive (String ss) {}

    public void dddrive(){
        this.drive(5);

    /////////////////////////////////////

    }
}
