package game;

import game.Physic.BoxCollider;
import game.Physic.Physics;
import game.RenderR.Renderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GameObject {
    // static: quan li
    public static ArrayList<GameObject> gameObjects = new ArrayList<>();

    public static void addNew(GameObject object) {
        gameObjects.add(object);
    }

    public static void clearAll() {
        gameObjects.clear();
    }

    public static void runAll() {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i); // GameObject, Player, Background
            object.run(); // GameObject.run() || Player.run() || Background.run()
            if(object.isActive){
                object.run();
            }
        }
    }

    public static void renderAll(Graphics g) {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i);
            if(object.isActive) {
                object.render(g);
            }
        }
    }
    public static <E extends GameObject> E findIntersected(Class<E> cls, BoxCollider boxCollider){
        for (int i = 0; i < gameObjects.size();i++){
         GameObject object = gameObjects.get(i);
         if(cls.isAssignableFrom(object.getClass())
            && object instanceof Physics
            && ((Physics) object).getBoxColider().intersected(boxCollider)
            && object.isActive){
             return (E) object;
         }
        }
        return null;
    }
    // dinh nghia doi tuong
//    public BufferedImage image;
    public Renderer renderer;
    public Vector2D position;
    public Vector2D velocity;
    public boolean isActive;

    public GameObject() { //ham tao rong
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        isActive = true;
        addNew(this); // cho gameObject vao mang quan li
    }

    public void run() {
        this.position.add(this.velocity);
    }

    public void render(Graphics g) {
        if(this.renderer != null) {
            this.renderer.render(g, this);
        }
    }

    public void deactive() {
        this.isActive = false;
    }
}
