import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Physicaltraining extends JPanel{
    private JLabel physicaltrainingLabel;
    private JLabel pullupsLabel;
    private JLabel hundredmeterrunLabel;
    private JLabel threekilometerrunLabel;

    private JTextField pullupsTextField;
    private JTextField hundredmeterrunTextField;
    private JTextField threekilometerrunTextField;
    private JOptionPane okno;

    private JButton nextButton;
    private JButton backButton;

    public Physicaltraining(){
        setSize(1400,700);
        setLayout(null);

        Font f = new Font(Font.DIALOG,Font.BOLD,30);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);
        Font f3 = new Font(Font.DIALOG,Font.TRUETYPE_FONT,15);

        physicaltrainingLabel = new JLabel("PHYSICAL TRAINING");
        physicaltrainingLabel.setBounds(550,60,400,50);
        physicaltrainingLabel.setFont(f);
        add(physicaltrainingLabel);

        pullupsLabel = new JLabel("Pull-ups: ");
        pullupsLabel.setBounds(590,160,200,30);
        pullupsLabel.setFont(f3);
        add(pullupsLabel);

        pullupsTextField = new JTextField();
        pullupsTextField.setBounds(700,160,100,40);
        add(pullupsTextField);

        hundredmeterrunLabel = new JLabel("100 meter run (in sec): ");
        hundredmeterrunLabel.setBounds(530,240,200,40);
        hundredmeterrunLabel.setFont(f3);
        add(hundredmeterrunLabel);

        hundredmeterrunTextField = new JTextField();
        hundredmeterrunTextField.setBounds(700,240,100,40);
        add(hundredmeterrunTextField);

        threekilometerrunLabel = new JLabel("3 km run (in min) : ");
        threekilometerrunLabel.setBounds(560,320,200,30);
        threekilometerrunLabel.setFont(f3);
        add(threekilometerrunLabel);

        threekilometerrunTextField = new JTextField();
        threekilometerrunTextField.setBounds(700,320,100,40);
        add(threekilometerrunTextField);

        backButton = new JButton("Back");
        backButton.setBounds(560,400,100,40);
        backButton.setBackground(Color.lightGray);
        backButton.setFont(f2);
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.frame.physicaltraining.setVisible(false);
                Main.frame.medicine.setVisible(true);
            }
        });
        add(backButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(720,400,100,40);
        nextButton.setBackground(Color.lightGray);
        nextButton.setFont(f2);
        nextButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int pullups = Integer.parseInt(pullupsTextField.getText());
                int hundredmeterrun = Integer.parseInt(hundredmeterrunTextField.getText());
                int threekilometerrun = Integer.parseInt(threekilometerrunTextField.getText());

                Pt p = new Pt();
                p.setId_user(Main.user.getId());
                p.setPullups(pullups);
                p.setHundredmeterrun(hundredmeterrun);
                p.setThreekilometerrun(threekilometerrun);

                Main.user_pt = p;

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(okno,"Do you congirm that all information is entered correctly?","",dialogButton);
                if(dialogResult == 0){
                    Packet pak = new Packet(Main.user_med,Main.user_pt,Main.user,"ADD");
                    Main.connect(pak);
                    Main.frame.physicaltraining.setVisible(false);
                    Main.frame.result.setVisible(true);
                }
            }
        });
        add(nextButton);
    }
}