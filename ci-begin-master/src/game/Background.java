package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {

    public Background() {
        super();
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
        this.position.set(0, 600 - this.image.getHeight());
        this.velocity.set(0, 10);
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
