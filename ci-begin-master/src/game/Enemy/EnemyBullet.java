package game.Enemy;

import game.GameObject;
import game.RenderR.Animation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class EnemyBullet extends GameObject {
    public EnemyBullet(){
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\blue.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\cyan.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\green.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\pink.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\red.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\white.png"));
        images.add(SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\enemies\\bullets\\yellow.png"));
        this.renderer = new Animation(images);
        this.velocity.set(0, 7);
    }
}
