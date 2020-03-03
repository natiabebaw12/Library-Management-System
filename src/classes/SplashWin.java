package classes;

import Log.YouAre;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.lang.InterruptedException;

public class SplashWin extends JWindow {

    public SplashWin() {

         JWindow splash = new JWindow();
        JPanel content = (JPanel) splash.getContentPane();

        // set the window's bounds, centering the window
        int width = 349;
        int height = 210;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        splash.setBounds(x, y, width, height);

        // build the splash screen
         Icon img = new ImageIcon(this.getClass().getResource("s.png"));
        JLabel label = new JLabel(img);
        JLabel copyrt = new JLabel("", JLabel.CENTER);
       
        //content.setBackground(new Color(232, 232, 228));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        content.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // display it
        splash.setVisible(true);

        // Wait a little while, maybe while loading resources
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        splash.setVisible(false);
        YouAre you = new YouAre();
        you.youAre();
    }

}
