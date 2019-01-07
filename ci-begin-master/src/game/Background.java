package game;

import game.RenderR.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {

    public Background() {
        super();
        BufferedImage image = SpriteUtils.loadImage("C:\\Users\\NottHumann\\Desktop\\nguyentrangan-CI14-master\\ci-begin-master\\assets\\images\\background\\0.png");
        this.renderer = new SingleImageRenderer(image);
        this.position.set(0, 600 - image.getHeight());
        this.velocity.set(0, 1);
    }
    private void limitPosition(){
        if (this.position.y > 0) {
            this.velocity.set(0, 0);
        }
    }

    @Override
    public void run() {
        super.run();
        limitPosition();
            // TODO: gioi han di chuyen cho Background
    }
}
