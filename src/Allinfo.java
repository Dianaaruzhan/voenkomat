import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Allinfo extends JPanel {
    private JLabel informationLabel;
    private JButton backButton;
    private JButton refreshButton;
    private JTextArea tarea;

    public Allinfo(){
        setSize(1400,700);
        setLayout(null);

        Font f = new Font(Font.DIALOG,Font.BOLD,30);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);

        informationLabel = new JLabel("ALL INFORMATION");
        informationLabel.setBounds(570,25,300,30);
        informationLabel.setFont(f);
        add(informationLabel);

        backButton = new JButton("Back");
        backButton.setBounds(525,600,150,50);
        backButton.setBackground(Color.lightGray);
        backButton.setFont(f2);

        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.frame.allinfo.setVisible(false);
                Main.frame.result.setVisible(true);
            }
        });
        add(backButton);

        refreshButton = new JButton("Refresh");
        refreshButton.setBounds(725,600,150,50);
        refreshButton.setBackground(Color.lightGray);
        refreshButton.setFont(f2);

        refreshButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String all = "";
                for(int i=0; i<Main.count; i++){
                    all += (Main.personss[i].toString()+"\n");
                }
                tarea.setText(all);

//                String all1 = "";
//                for(int i=0; i<Main.count1; i++){
//                    all1 += (Main.med[i].toString()+"\n");
//                }
////                tarea.setText(all1);
            }
        });
        add(refreshButton);

        tarea = new JTextArea();
        tarea.setBounds(350, 80, 700, 500);
        add(tarea);
    }

}