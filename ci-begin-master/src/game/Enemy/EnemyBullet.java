package game.Enemy;

import game.FrameCounter;
import game.GameObject;
import game.Physic.BoxCollider;
import game.Physic.Physics;
import game.Player;
import game.RenderR.Animation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class EnemyBullet extends GameObject implements Physics {
    BoxCollider boxCollider;
    FrameCounter fcounter;

    public EnemyBullet() {
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
        this.boxCollider = new BoxCollider(this.position, 30, 30);
        this.fcounter = new FrameCounter(30);
    }


    @Override
    public void run() {
            super.run();
//            Player player = GameObject.findIntersected(Player.class, this.boxCollider);
//            if (player != null) {
//            System.out.println("hit");
//                player.deactive();
//            }
        }
        @Override
        public BoxCollider getBoxColider () {
            return this.boxCollider;
    }
}
