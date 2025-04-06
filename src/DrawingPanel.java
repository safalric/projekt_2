package pro1.swingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {
    private ArrayList<House> houses = new ArrayList<>();
    private JTextField colorField;

    public DrawingPanel(JTextField colorField) {
        this.colorField = colorField;
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Color color = getColorFromInput();
                houses.add(new House(e.getX(), e.getY(), color));
                repaint();
            }
        });
    }

    private Color getColorFromInput() {
        try {
            return Color.decode("#" + colorField.getText());
        } catch (Exception e) {
            return Color.BLACK;
        }
    }

    public void reset() {
        houses.clear();
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (House h : houses) {
            h.draw(g);
        }
    }
}
