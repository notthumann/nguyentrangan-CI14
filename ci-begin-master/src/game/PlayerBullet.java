package game;

import game.Enemy.Enemy;
import game.Physic.BoxCollider;
import game.Physic.Physics;
import game.RenderR.Animation;
import game.RenderR.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerBullet extends GameObject implements Physics {
    BoxCollider boxCollider;
    public PlayerBullet() {
        super(); // this.position = new Vector2D()
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\player-bullets\\a\\0.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\player-bullets\\a\\1.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\player-bullets\\a\\2.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\player-bullets\\a\\3.png"));
        this.renderer = new Animation(images);
        this.velocity.set(0, -7);
        this.boxCollider = new BoxCollider(this.position, 30,30);
    }

    @Override
    public void run() {
        super.run();
//        this.position.add(0, -7);
        Enemy enemy = GameObject.findIntersected(Enemy.class, this.boxCollider);
        if(enemy != null){
            System.out.println("hit");
            enemy.deactive();
        }
    }

    @Override
    public BoxCollider getBoxColider() {
        return this.boxCollider;
    }
}
