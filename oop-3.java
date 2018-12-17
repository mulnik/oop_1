Main.java
 
package com.company;
 
public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0,0,5,5,10);
        System.out.println(circle.toString());
    }
}
 
MovablePoint.java
 
package com.company;
 
public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
 
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x= x;
        this.y= y;
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
 
    @Override
    public String toString() {
        return "MCNVI.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed+
                ", ySpeed=" + ySpeed+
                '}';
    }
 
    @Override
    public void moveUp() {
        y=y+ySpeed;
    }
 
    @Override
    public void moveDown() {
        y=y-ySpeed;
    }
 
    @Override
    public void moveLeft() {
        x=x-xSpeed;
    }
 
    @Override
    public void moveRight() {
        x=x+xSpeed;
    }
}
 
MovableCircle.java
 
package com.company;
 
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
 
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
 
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
 
    @Override
    public void moveUp() {
        center.y=center.y+center.ySpeed;
    }
 
    @Override
    public void moveDown() {
        center.y=center.y-center.ySpeed;
    }
 
    @Override
    public void moveLeft() {
        center.x=center.x-center.xSpeed;
    }
 
    @Override
    public void moveRight() {
        center.x=center.x+center.xSpeed;
    }
}
 
Movable.java
 
package com.company;
 
public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}