
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Font;

import java.io.IOException;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Give Your meat a good old rub!");
    //JLabel imageLabel = new JLabel();
    //BufferedImage image = ImageIO.read(new File("ainsley.jpg"));

    WelcomePage(String userID) throws IOException{


        welcomeLabel.setBounds(0,0,500,35);
        welcomeLabel.setText(userID+" give Your meat a good old rub!");
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        

        ImageIcon icon = new ImageIcon("ainsley.jpg");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(100,35,300,300);


        frame.add(welcomeLabel);
        frame.add(imageLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}

