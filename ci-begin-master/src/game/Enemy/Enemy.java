package game.Enemy;

import game.GameObject;
import game.RenderR.Animation;
import game.SphereBullet;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Enemy extends GameObject {
    public Enemy() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\level0\\pink\\0.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\level0\\pink\\1.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\level0\\pink\\2.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\level0\\pink\\3.png"));
        this.renderer = new Animation(images);
        this.position.set(200, 400);
        this.velocity.set(5, 0);
    }

    private void limitPosition() {
        if (this.position.x > 384 - 32) {
            this.velocity.set(-5, 0);
        }
        if (this.position.x < 0) {
            this.velocity.set(5, 0);
        }
    }

    public void run() {
        super.run();
        limitPosition();
        this.fire();
    }

    int count; //TODO: continue editing

    private void fire() {
        this.count++;
        if (this.count > 20) {
            EnemyBullet bullet = new EnemyBullet();
            bullet.position.set(this.position);
            this.count = 0;
        }
    }
}