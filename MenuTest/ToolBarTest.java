import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

public class ToolBarTest
{
    public static void main(String[] args)
    {
        ToolBarFrame frame = new ToolBarFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}


class ToolBarFrame extends JFrame
{
    public ToolBarFrame()
    {
        setTitle("ToolBarTest");
        setSize(WIDTH, HEIGHT);

        // add a panel for color change

        Container contentPane = getContentPane();
        panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);

        // set up actions

        Action blueAction = new ColorAction("Blue",
        new ImageIcon("blue-ball.gif"), Color.blue);
        Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"), Color.yellow);
        Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.red);


        Action exitAction = new
        AbstractAction("Exit", new ImageIcon("exit.gif"))
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        };
        exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

        // populate tool bar

        JToolBar bar = new JToolBar();
        bar.add(blueAction);
        bar.add(yellowAction);
        bar.add(redAction);
        bar.addSeparator();
        bar.add(exitAction);
        contentPane.add(bar, BorderLayout.NORTH);

        // populate menu

        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);
        menu.add(exitAction);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
        }

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel panel;

    /**
    The color action sets the background of the frame to a given color.
    */
    class ColorAction extends AbstractAction
    {
        public ColorAction(String name, Icon icon, Color c)
        {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION,
                name + " background");
            putValue("Color", c);
        }

        public void actionPerformed(ActionEvent evt)
        {
            Color c = (Color)getValue("Color");
            panel.setBackground(c);
            panel.repaint();
        }
    }
}