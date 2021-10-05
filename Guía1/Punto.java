
package Guía1;


public class Punto {
    private float x1;
    private float y1;

    public Punto() {
        x1 = 0;
        y1 = 0;
    }

    public Punto(float x1, float y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public float getX() {
        return x1;
    }

    public void setX(float x1) {
        this.x1 = x1;
    }

    public float getY() {
        return y1;
    }

    public void setY(float y1) {
        this.y1 = y1;
    }
}
