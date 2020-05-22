import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JPanel {

    private JLabel welcomeLabel;

    private JButton profileButton;
    private JButton resultButton;
    private JButton exitButton;

    public Menu() {
        setSize(1400, 700);
        setLayout(null);

        Font f = new Font(Font.DIALOG,Font.BOLD,35);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);

        welcomeLabel = new JLabel("WELCOME");
        welcomeLabel.setBounds(615,80,200,50);
        welcomeLabel.setFont(f);
        add(welcomeLabel);

        profileButton = new JButton("Profile");
        profileButton.setBounds(550, 200, 300, 50);
        profileButton.setBackground(Color.lightGray);
        profileButton.setFont(f2);
        profileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.frame.menu.setVisible(false);
                Main.frame.profile.setVisible(true);
            }
        });
        add(profileButton);

        resultButton = new JButton("Result");
        resultButton.setBounds(550, 270, 300, 50);
        resultButton.setBackground(Color.lightGray);
        resultButton.setFont(f2);
        resultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Main.frame.menu.setVisible(false);
                Main.frame.result.setVisible(true);
                Packet p = new Packet("LIST_RESULT");
                Main.connect(p);

            }
        });
        add(resultButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(550, 340, 300, 50);
        exitButton.setBackground(Color.lightGray);
        exitButton.setFont(f2);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}