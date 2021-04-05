package pratice.designPattern.creational.prototype;

public abstract class Shape {
    public int x , y;
    public String color;
    public Shape(){

    }

    public Shape(Shape target) {
        if (target!=null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

}
