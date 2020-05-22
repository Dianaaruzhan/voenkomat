import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Profile extends JPanel {
    private JLabel profileLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel ageLabel;
    private JLabel regionLabel;

    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField ageTextField;

    private JComboBox box;
    private String region[] = {"","Akmola region", "Aktobe region", "Almaty region", "Atyrau region", "East Kazakhstan region",
            "Zhambyl region", "West Kazakhstan region", "Karaganda region", "Kostanay region", "Kyzylorda region", "Mangystau region",
            "Pavlodar region", "North Kazakhstan region", "Turkestan region"};
    private JButton nextButton;
    private JButton backButton;

    public Profile(){
        setSize(1400, 700);
        setLayout(null);

//        File file=new File("diana.jpg");
//
//        JLabel imgLabel=new JLabel(new ImageIcon(file.getName()));
//        imgLabel.setBounds(110,90,140,170);
//        add(imgLabel);

        Font f = new Font(Font.DIALOG,Font.BOLD,30);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);
        Font f3 = new Font(Font.DIALOG,Font.TRUETYPE_FONT,15);

        profileLabel = new JLabel("PROFILE");
        profileLabel.setBounds(575,80,200,50);
        profileLabel.setFont(f);
        add(profileLabel);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(400, 200, 100, 40);
        nameLabel.setFont(f3);
        add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(550, 200, 300, 40);
        add(nameTextField);

        surnameLabel = new JLabel("Surname: ");
        surnameLabel.setBounds(400, 250, 100, 40);
        surnameLabel.setFont(f3);
        add(surnameLabel);

        surnameTextField = new JTextField();
        surnameTextField.setBounds(550, 250, 300, 40);
        add(surnameTextField);

        ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(400, 300, 100, 40);
        ageLabel.setFont(f3);
        add(ageLabel);

        ageTextField = new JTextField();
        ageTextField.setBounds(550,300,100,40);
        add(ageTextField);

        regionLabel = new JLabel("Region: ");
        regionLabel.setBounds(400,350,100,40);
        regionLabel.setFont(f3);
        add(regionLabel);

        box = new JComboBox(region);
        box.setBackground(Color.WHITE);
        box.setBounds(550, 350, 300, 40);
        add(box);

        nextButton = new JButton("Next");
        nextButton.setBounds(700, 420, 100, 40);
        nextButton.setFont(f2);
        nextButton.setBackground(Color.lightGray);
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String surname = surnameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                String region = (String) box.getSelectedItem();


                Person p = new Person();
                p.setName(name);
                p.setSurname(surname);
                p.setAge(age);
                p.setRegion(region);
                Main.user = p;
                Packet pac = new Packet("ADD_USER", p);

                Main.connect(pac);
                Person per = new Person();
                per.setName(name);
                per.setSurname(surname);
                Packet pl = new Packet("SIGN_IN",per);
                Main.connect(pl);


                Main.frame.profile.setVisible(false);
                Main.frame.medicine.setVisible(true);
//                if(box.getSelectedIndex() !=0 ){
//                    nameTextField.setText("");
//                    surnameTextField.setText("");
//                    ageTextField.setText("");
//                    box.setSelectedIndex(0);
//
////                    if(ageTextField.getText() <= 18){
//////                        Main.frame.profile.setVisible(false);
//////                        Main.frame.apologies.setVisible(true);
//////                    }//
//                }
            }
        });
        add(nextButton);

        backButton = new JButton("Back");
        backButton.setBounds(500, 420, 100, 40);
        backButton.setFont(f2);
        backButton.setBackground(Color.lightGray);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.frame.menu.setVisible(true);
                Main.frame.profile.setVisible(false);
            }
        });
        add(backButton);
    }
}