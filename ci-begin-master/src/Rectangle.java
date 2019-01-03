import game.Vector2D;

public class Rectangle {
    Vector2D position;
    int width;
    int height;

    public Rectangle(float x, float y, int width, int height) {
        this.position = new Vector2D(x, y);
        this.width = width;
        this.height = height;
    }

    public boolean intersected(Rectangle other) {
        //TODO: kiem tra giao nhau giua hinh 'this' vs 'other'
        float distSubX = (this.position.x +(this.width/2)) - (other.position.x + (other.width/2));
        if (distSubX <0){
            distSubX = distSubX * (-1);
        }
        float distW = (this.width + other.width)/2;
        float distSubY = (this.position.y +(this.height/2)) - (other.position.y + (other.height/2));
        if (distSubY <0){
            distSubY = distSubY * (-1);
        }
        float distH = (this.height + other.height)/2;
        if(distSubX <= distW && distSubY <= distH) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0, 0, 4, 4);
        Rectangle rect2 = new Rectangle(5, 5, 4, 4);
        Rectangle rect3 = new Rectangle(2, 2, 4, 4);
        System.out.println(rect1.intersected(rect2)); // false
        System.out.println(rect1.intersected(rect3)); // true
        System.out.println(rect2.intersected(rect3)); // true
    }
}
