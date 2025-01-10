package n08_recursion;

import javax.swing.*;
import java.awt.*;

public class RecursiveImage extends JPanel {
    private final int maxDepth; // maximale Rekursionstiefe
    private final Color color; // Farbe des Bildes

    public RecursiveImage(int maxDepth, Color color) {
        this.maxDepth = maxDepth;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Rekursive Methode zur Erstellung des Fraktalbildes
        drawRecursive(g, 0, 0, getWidth(), getHeight(), 0);
    }

    private void drawRecursive(Graphics g, int x, int y, int width, int height, int depth) {
        if (depth >= maxDepth) { // Rekursionstiefe erreicht
            g.setColor(color);
            g.fillRect(x, y, width, height);
        } else { // Rekursion fortsetzen
            drawRecursive(g, x, y, width / 2, height / 2, depth + 1);
            drawRecursive(g, x + width / 2, y, width / 2, height / 2, depth + 1);
            drawRecursive(g, x, y + height / 2, width / 2, height / 2, depth + 1);
            drawRecursive(g, x + width / 2, y + height / 2, width / 2, height / 2, depth + 1);
        }
    }
}
