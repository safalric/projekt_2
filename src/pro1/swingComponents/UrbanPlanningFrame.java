package pro1.swingComponents;

import javax.swing.*;
import java.awt.*;

public class UrbanPlanningFrame extends JFrame {

    public UrbanPlanningFrame() {
        setTitle("Urban Planning");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField colorField = new JTextField("000000", 10);
        JButton resetButton = new JButton("Reset");

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(new JLabel("Color code (např. FF0000):"));
        leftPanel.add(colorField);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(resetButton);

        pro1.swingComponents.DrawingPanel drawingPanel = new pro1.swingComponents.DrawingPanel(colorField);
        resetButton.addActionListener(e -> drawingPanel.reset());

        add(leftPanel, BorderLayout.WEST);
        add(drawingPanel);

        setVisible(true);
    }

    private void add(pro1.swingComponents.DrawingPanel drawingPanel) {
    }
}
