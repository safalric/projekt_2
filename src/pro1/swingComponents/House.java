package pro1.swingComponents;

import java.awt.*;

public class House {
    private int x, y;
    private Color color;

    public House(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - 10, y - 10, 20, 20); // tělo domečku
        int[] xPoints = {x - 12, x, x + 12};
        int[] yPoints = {y - 10, y - 25, y - 10}; // střecha
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
