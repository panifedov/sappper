package src.main.java;

import javax.swing.*;
import java.awt.*;

public class MainSapper extends JFrame
{
    private  JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;

    public static void main(String[] args)
    {
        new MainSapper();
    }

    private MainSapper ()
    {
        initPanel();
        initFrame();
    }

    private void initPanel()
    {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE, IMAGE_SIZE*ROWS));
        add(panel);
    }

    private void initFrame ()
    {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sapper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
