import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Medicine extends JPanel {
    private JLabel medicineLabel;
    private JLabel policlinicLabel;
    private JLabel weightLabel;
    private JLabel heightLabel;
    private JLabel visionLabel;
    private JLabel scoliosisLabel;
    private JLabel flatfeetLabel;
    private JLabel pulseLabel;
    private JLabel wereregisteredwithadoctorLabel;
    private JLabel mentalhospitalLabel;

    private JTextField weightTextField;
    private JTextField heightTextField;
    private JTextField visionTextField;
    private JTextField pulseTextField;

    private JComboBox box;
    private String policlinic[] = {"","GKP on PHV 'City Polyclinic'","GKP on PHV 'City polyclinic №1'", "GKP on PHV 'City Polyclinic №2'"
            , "GKP on PHV 'City Polyclinic №3'","GKP on PHV 'City polyclinic №4'","GKP on PHV 'City polyclinic №5'",
            "GKP on PHV 'City Polyclinic No. 6'","GKKP 'Center for primary health care'",
            "KGP on ПХВ 'Atyrau city polyclinic №1'", "KGP on ПХВ 'Atyrau city polyclinic №2'","KGP on ПХВ 'Atyrau city polyclinic №3'",
            "KGP on PHV 'Atyrau city polyclinic №4'","GKKP 'Aktau city polyclinic № 1'",
            " GKP on PHV 'Aktau city polyclinic № 2'", " GKP on ПХВ 'Munaylinsky central regional hospital'",
            " GKP on ПХВ 'Zhanaozen city polyclinic № 1''" ," GKKP 'Zhanaozen city polyclinic № 2'","Medical institution 'Clinic number 6 mixed type'",
            "Institution 'Rural outpatient clinic' Harmony 'Novobazhenovo village'",
            "KGKP 'VA village. Znamenka'", "KGP at the Shulbinsk VA VA", "LLP Railway Hospital of Semey", "KGKP 'Abay central district hospital'",
            "KGKP 'Abralinsky hospital'", "KGKP 'Ayagoz central district hospital' UZ East Kazakhstan", "KGKP 'Beskaragai central district hospital'",
            "KGKP 'Borodulikhinskaya Central Regional Hospital'", "KGKP 'Glubokovskaya central district hospital'",
            "KGKP 'Zharma Central District Hospital'"};
    private JComboBox box1;
    private String scoliosis[] = {"","YES","NO"};
    private JComboBox box2;
    private String flatfeet[] = {"","YES","NO"};
    private JComboBox box3;
    private String wereregisteredwithadoctor[] = {"","YES","NO"};
    private JComboBox box4;
    private String  mentalhospital[] = {"","YES","NO"};

    private JButton nextButton;
    private JButton backButton;

    public Medicine(){
        setSize(1400,700);
        setLayout(null);

        Font f = new Font(Font.DIALOG,Font.BOLD,30);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.TRUETYPE_FONT,15);
        Font f3 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);

        medicineLabel = new JLabel("MEDICINE");
        medicineLabel.setBounds(650,10,300,50);
        medicineLabel.setFont(f);
        add(medicineLabel);

        policlinicLabel = new JLabel("Policlinic: ");
        policlinicLabel.setBounds(465,80,100,30);
        policlinicLabel.setFont(f2);
        add(policlinicLabel);

        box = new JComboBox(policlinic);
        box.setBounds(630,80,300,35);
        box.setBackground(Color.WHITE);
        add(box);

        weightLabel = new JLabel("Weight (kg): ");
        weightLabel.setBounds(465,130,100,30);
        weightLabel.setFont(f2);
        add(weightLabel);

        weightTextField = new JTextField();
        weightTextField.setBounds(630,130,300,35);
        add(weightTextField);

        heightLabel = new JLabel("Height (сm): ");
        heightLabel.setBounds(465,180,100,30);
        heightLabel.setFont(f2);
        add(heightLabel);

        heightTextField = new JTextField();
        heightTextField.setBounds(630,180,300,35);
        add(heightTextField);

        visionLabel = new JLabel("Vision: ");
        visionLabel.setBounds(465,230,100,30);
        visionLabel.setFont(f2);
        add(visionLabel);

        visionTextField = new JTextField();
        visionTextField.setBounds(630,230,300,35);
        add(visionTextField);

        scoliosisLabel = new JLabel("Scoliosis: ");
        scoliosisLabel.setBounds(465,280,100,30);
        scoliosisLabel.setFont(f2);
        add(scoliosisLabel);

        box1 = new JComboBox(scoliosis);
        box1.setBounds(630,280,300,35);
        box1.setBackground(Color.WHITE);
        add(box1);

        flatfeetLabel = new JLabel("Flatfeet: ");
        flatfeetLabel.setBounds(465,330,100,30);
        flatfeetLabel.setFont(f2);
        add(flatfeetLabel);

        box2 = new JComboBox(flatfeet);
        box2.setBounds(630,330,300,35);
        box2.setBackground(Color.WHITE);
        add(box2);

        pulseLabel = new JLabel("Pulse (in min):");
        pulseLabel.setBounds(465,380,100,30);
        pulseLabel.setFont(f2);
        add(pulseLabel);

        pulseTextField = new JTextField();
        pulseTextField.setBounds(630,380,300,35);
        add(pulseTextField);

        wereregisteredwithadoctorLabel = new JLabel("Were registered with a doctor: ");
        wereregisteredwithadoctorLabel.setBounds(400,430,250,30);
        wereregisteredwithadoctorLabel.setFont(f2);
        add(wereregisteredwithadoctorLabel);

        box3 = new JComboBox(wereregisteredwithadoctor);
        box3.setBounds(630,430,300,35);
        box3.setBackground(Color.WHITE);
        add(box3);

        mentalhospitalLabel = new JLabel("Mental Hospital: ");
        mentalhospitalLabel.setBounds(455,480,300,30);
        mentalhospitalLabel.setFont(f2);
        add(mentalhospitalLabel);

        box4 = new JComboBox(mentalhospital);
        box4.setBounds(630,480,300,35);
        box4.setBackground(Color.WHITE);
        add(box4);

        nextButton = new JButton("Next");
        nextButton.setBounds(750,550,150,40);
        nextButton.setFont(f3);
        nextButton.setBackground(Color.lightGray);
        nextButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String policlinic = (String) box.getSelectedItem();
                double weight = Double.parseDouble(weightTextField.getText());
                int height = Integer.parseInt(heightTextField.getText());
                double vision = Double.parseDouble(visionTextField.getText());
                String scoliosis = (String) box1.getSelectedItem();
                String flatfeet = (String) box2.getSelectedItem();
                double pulse = Double.parseDouble(pulseTextField.getText());
                String wereregisteredwithadoctor = (String) box3.getSelectedItem();
                String mentalhospital = (String) box4.getSelectedItem();

                Med m = new Med();
                m.setPoliclinic(policlinic);
                m.setWeight(weight);
                m.setHeight(height);
                m.setVision(vision);
                m.setScoliosis(scoliosis);
                m.setFlatfeet(flatfeet);
                m.setPulse(pulse);
                m.setWereregisteredwithadoctor(wereregisteredwithadoctor);
                m.setMentalhospital(mentalhospital);
                m.setId_person(Main.user.getId());

                Main.user_med = m;

//                if(box.getSelectedIndex()!=0){
//                    weightTextField.setText("");
//                    heightTextField.setText("");
//                    visionTextField.setText("");
//                    pulseTextField.setText("");
//                    box.setSelectedIndex(0);
//                    box1.setSelectedIndex(0);
//                    box2.setSelectedIndex(0);
//                    box3.setSelectedIndex(0);
//                    box4.setSelectedIndex(0);
//                }

                Main.frame.medicine.setVisible(false);
                Main.frame.physicaltraining.setVisible(true);

//                    if(box4.getSelectedIndex()!=1){
//                        Main.frame.apologies.setVisible(true);
//                        Main.frame.medicine.setVisible(false);
//                    }
            }
        });
        add(nextButton);

        backButton = new JButton("Back");
        backButton.setBounds(500,550,150,40);
        backButton.setFont(f3);
        backButton.setBackground(Color.lightGray);
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.frame.medicine.setVisible(false);
                Main.frame.profile.setVisible(true);
            }
        });
        add(backButton);
    }
}