import javax.swing.*;
import java.awt.*;
import sweeper.Box;

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
        setImages();
        initFrame();
    }

    private void initPanel()
    {
        panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Box box : Box.values())
                    g.drawImage((Image)box.image, box.ordinal() * IMAGE_SIZE, 0,  this);
            }
        };
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

    private void setImages()
    {
        for (Box box : Box.values())
            box.image = getImage(box.name().toLowerCase());
    }

    private Image getImage(String name)
    {
        String filename = "/res/img/" + name + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }

}
