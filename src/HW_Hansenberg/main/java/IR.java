package HW_Hansenberg.main.java;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Date;

/**
 * Project "Sandbox"
 * "IR.java" created by David Wu on Wed,16.08.17.
 */

class IR {
    private Point start;
    private BufferedImage img;
    private int img_height, img_width;

    private IR() {
    }

    public IR(Point start, BufferedImage image) {
        this.start = start;
        this.img = image;
        this.img_height = this.img.getHeight();
        this.img_width = this.img.getWidth();
    }

    public ArrayList<Date> getIR() {
        ArrayList<Date> list = new ArrayList<>();
        search(start, img, list);
        return list;
    }

    private void search(Point start, BufferedImage img, ArrayList<Date> list) {
        int y = start.y;
        while (y<img_height) {
            
            y++;
        }
    }
}

/**
 * End of IR.java
 */