import javax.swing.*;

public class MainFrame extends JFrame{

    public static Profile profile;
    public static Result result;
    public static Allinfo allinfo;
    public static Menu menu;
    public static Medicine medicine;
//    public static Psychotest psychotest;
    public static Physicaltraining physicaltraining;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,700);
        setTitle("Recruitment Office");
        setLayout(null);

        menu = new Menu();
        menu.setLocation(0,0);
        add(menu);

        profile = new Profile();
        profile.setLocation(0,0);
        profile.setVisible(false);
        add(profile);

//        psychotest = new Psychotest();
//        psychotest.setLocation(0,0);
//        psychotest.setVisible(false);
//        add(psychotest);

        medicine = new Medicine();
        medicine.setLocation(0,0);
        medicine.setVisible(false);
        add(medicine);

        physicaltraining = new Physicaltraining();
        physicaltraining.setLocation(0,0);
        physicaltraining.setVisible(false);
        add(physicaltraining);

        result = new Result();
        result.setLocation(0,0);
        result.setVisible(false);
        add(result);

        allinfo = new Allinfo();
        allinfo.setLocation(0,0);
        allinfo.setVisible(false);
        add(allinfo);

        repaint();
    }
}