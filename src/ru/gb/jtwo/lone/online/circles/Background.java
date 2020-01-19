package ru.gb.jtwo.lone.online.circles;

import java.awt.*;

public class Background {
    private static final int defaultR = 255;
    private static final int defaultG = 255;
    private static final int defaultB = 255;

    Background(GameCanvas canvas) {
        //white by default
        canvas.setBackground(new Color(defaultR, defaultG, defaultB));
    }

    void setBackgroundColor(GameCanvas canvas) {
        //set random color to canvas
        canvas.setBackground(new Color(
                (int)(Math.random() * 255),
                (int)(Math.random() * 255),
                (int)(Math.random() * 255)));
    }
}
