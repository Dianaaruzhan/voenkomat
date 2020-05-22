import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Result extends JPanel{
    private JLabel resultLabel;
    private JButton menu;
    private JButton refresh;
    public static JTextArea tarea;
    private DefaultTableModel model;
    private JScrollPane pane;
    private JTable table;

    public Result(){
        setSize(1400,700);
        setLayout(null);

        Font f = new Font(Font.DIALOG,Font.BOLD,30);
        this.setBackground(Color.gray);
        Font f2 = new Font(Font.DIALOG,Font.CENTER_BASELINE,15);

//        Object columns[] = {"ALIBEK","DIANA","NAIL"};
//
//        table = new JTable();
//        model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        table.setModel(model);
//        table.setBackground(Color.gray);
//        table.setForeground(Color.green);
//        table.setRowHeight(2,100);
//        pane = new JScrollPane(table);
//        pane.setBounds(700,500,100,30);
//        add(pane);

        resultLabel = new JLabel("RESULT");
        resultLabel.setBounds(650,25,200,30);
        resultLabel.setFont(f);
        add(resultLabel);

        refresh = new JButton("Refresh");
        refresh.setBounds(625,600,150,50);
        refresh.setBackground(Color.lightGray);
        refresh.setFont(f2);



        menu = new JButton("Menu");
        menu.setBounds(425,600,150,50);
        menu.setBackground(Color.lightGray);
        menu.setFont(f2);

        menu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.frame.result.setVisible(false);
                Main.frame.menu.setVisible(true);
            }
        });
        add(menu);

        refresh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Packet p = new Packet("LIST_RESULT");
                Main.connect(p);
            }
        });
        add(refresh);



        tarea = new JTextArea();
        tarea.setBounds(350, 80, 700, 500);
        tarea.setFont(new Font("Arial", Font.BOLD,15));
        add(tarea);
    }
}
