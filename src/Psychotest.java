//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Psychotest extends JPanel{
//    private JLabel psychotest;
//    private JLabel number1;
//    private JLabel number2;
//    private JLabel number3;
//    private JLabel number4;
//    private JLabel number5;
//    private JLabel number6;
//    private JLabel number7;
//    private JLabel number8;
//    private JLabel number9;
//    private JLabel number10;
//
//    private JRadioButton radioButton1;
//    private JRadioButton radioButton11;
//    private JRadioButton radioButton111;
//
//    private JRadioButton radioButton2;
//    private JRadioButton radioButton22;
//    private JRadioButton radioButton222;
//
//    private JRadioButton radioButton3;
//    private JRadioButton radioButton33;
//    private JRadioButton radioButton333;
//
//    private JRadioButton radioButton4;
//    private JRadioButton radioButton44;
//    private JRadioButton radioButton444;
//
//    private JRadioButton radioButton5;
//    private JRadioButton radioButton55;
//    private JRadioButton radioButton555;
//
//    private JRadioButton radioButton6;
//    private JRadioButton radioButton66;
//    private JRadioButton radioButton666;
//
//    private JRadioButton radioButton7;
//    private JRadioButton radioButton77;
//    private JRadioButton radioButton777;
//
//    private JRadioButton radioButton8;
//    private JRadioButton radioButton88;
//    private JRadioButton radioButton888;
//
//    private JRadioButton radioButton9;
//    private JRadioButton radioButton99;
//    private JRadioButton radioButton999;
//
//    private JRadioButton radioButton10;
//    private JRadioButton radioButton100;
//    private JRadioButton radioButton1000;
//
//    private JButton nextButton;
//    private JButton backButton;
//
//    public Psychotest(){
//        setSize(1400,700);
//        setLayout(null);
//
//        Font f = new Font(Font.DIALOG,Font.CENTER_BASELINE,13);
//        this.setBackground(Color.gray);
//        Font f2 = new Font(Font.DIALOG,Font.BOLD,30);
//        Font f3 = new Font(Font.DIALOG,Font.CENTER_BASELINE,13);
//
//        psychotest = new JLabel("PSYCHOTEST");
//        psychotest.setBounds(570,25,250,50);
//        psychotest.setFont(f2);
//        add(psychotest);
//
//        number1 = new JLabel("1. Suddenly, at the most interesting place of the TV show, the TV breaks. What will you do?");
//        number1.setBounds(50,100,560,20);
//        number1.setFont(f);
//        add(number1);
//
//        radioButton1 = new JRadioButton("I’ll put something into it, it’ll be worse anyway");
//        radioButton1.setBounds(70,120,560,20);
//        radioButton1.setBackground(Color.gray);
//        add(radioButton1);
//
//        radioButton11 = new JRadioButton("I’ll look for a workshop phone number");
//        radioButton11.setBounds(70,140,560,20);
//        radioButton11.setBackground(Color.gray);
//        add(radioButton11);
//
//        radioButton111 = new JRadioButton("I will try to fix the breakdown on my own");
//        radioButton111.setBounds(70,160,560,20);
//        radioButton111.setBackground(Color.gray);
//        add(radioButton111);
//
//        number2 = new JLabel("2. Can you name three books that you intend to read in the near future?");
//        number2.setBounds(50,200,560,20);
//        number2.setFont(f);
////        number2.setForeground(Color.DARK_GRAY);
//        add(number2);
//
//        radioButton2 = new JRadioButton("No");
//        radioButton2.setBounds(70,220,560,20);
//        radioButton2.setBackground(Color.gray);
//        add(radioButton2);
//
//        radioButton22 = new JRadioButton("Yes");
//        radioButton22.setBounds(70,240,560,20);
//        radioButton22.setBackground(Color.gray);
//        add(radioButton22);
//
//        radioButton222 = new JRadioButton("I do not know for sure");
//        radioButton222.setBounds(70,260,560,20);
//        radioButton222.setBackground(Color.gray);
//        add(radioButton222);
//
//        number3 = new JLabel("3. Do you have any hobbies?");
//        number3.setBounds(50,300,560,20);
//        number3.setFont(f);
//        add(number3);
//
//        radioButton3 = new JRadioButton("Yes");
//        radioButton3.setBounds(70,320,560,20);
//        radioButton3.setBackground(Color.gray);
//        add(radioButton3);
//
//        radioButton33 = new JRadioButton("I just prefer to relax at home or go somewhere to have fun");
//        radioButton33.setBounds(70,340,560,20);
//        radioButton33.setBackground(Color.gray);
//        add(radioButton33);
//
//        radioButton333 = new JRadioButton("I do not have time for all kinds of nonsense");
//        radioButton333.setBounds(70,360,560,20);
//        radioButton333.setBackground(Color.gray);
//        add(radioButton333);
//
//        number4 = new JLabel("4. Do you like outings in nature?");
//        number4.setBounds(50,400,560,20);
//        number4.setFont(f);
//        add(number4);
//
//        radioButton4 = new JRadioButton("No, I prefer to contemplate nature in pictures");
//        radioButton4.setBounds(70,420,560,20);
//        radioButton4.setBackground(Color.gray);
//        add(radioButton4);
//
//        radioButton44 = new JRadioButton("I use every opportunity to get to some pleasant place, at least to the nearest park");
//        radioButton44.setBounds(70,440,560,20);
//        radioButton44.setBackground(Color.gray);
//        add(radioButton44);
//
//        radioButton444 = new JRadioButton("Yes, but only if it is not fraught with excessive difficulties");
//        radioButton444.setBounds(70,460,560,20);
//        radioButton444.setBackground(Color.gray);
//        add(radioButton444);
//
//        number5 = new JLabel("5. You had a free minute. What is your reaction?");
//        number5.setBounds(50,500,560,20);
//        number5.setFont(f);
//        add(number5);
//
//        radioButton5 = new JRadioButton("Enjoy the delightful doing nothing");
//        radioButton5.setBounds(70,520,560,20);
//        radioButton5.setBackground(Color.gray);
//        add(radioButton5);
//
//        radioButton55 = new JRadioButton("I’m going to where I had long wanted to get out, but things interfered");
//        radioButton55.setBounds(70,540,560,20);
//        radioButton55.setBackground(Color.gray);
//        add(radioButton55);
//
//        radioButton555 = new JRadioButton("I do not find a place, I feel some strange discomfort because suddenly there was nothing to do");
//        radioButton555.setBounds(70,560,560,20);
//        radioButton555.setBackground(Color.gray);
//        add(radioButton555);
//
//        number6 = new JLabel("6. Weekend. They promised to call you, but the call has been delayed for about twenty minutes. What are you doing?");
//        number6.setBounds(670,100,750,20);
//        number6.setFont(f);
//        add(number6);
//
//        radioButton6 = new JRadioButton("I’m waiting and doing something at the same time so that time is not wasted (for example, I clean the apartment)");
//        radioButton6.setBounds(690,120,700,20);
//        radioButton6.setBackground(Color.gray);
//        add(radioButton6);
//
//        radioButton66 = new JRadioButton("Mad at my unorganized friends");
//        radioButton66.setBounds(690,140,600,20);
//        radioButton66.setBackground(Color.gray);
//        add(radioButton66);
//
//        radioButton666 = new JRadioButton("I sit down in front of the TV and, without waiting for the call, I can spend the front few hours");
//        radioButton666.setBounds(690,160,600,20);
//        radioButton666.setBackground(Color.gray);
//        add(radioButton666);
//
//        number7 = new JLabel("7. What is your favorite game?");
//        number7.setBounds(670,200,600,20);
//        number7.setFont(f);
//        add(number7);
//
//        radioButton7 = new JRadioButton("Checkers, chess, backgammon and the like board games");
//        radioButton7.setBounds(690,220,600,20);
//        radioButton7.setBackground(Color.gray);
//        add(radioButton7);
//
//        radioButton77 = new JRadioButton("Cards, slot machines, tote, lottery");
//        radioButton77.setBounds(690,240,600,20);
//        radioButton77.setBackground(Color.gray);
//        add(radioButton77);
//
//        radioButton777 = new JRadioButton("None of the above strings in the soul hurt");
//        radioButton777.setBounds(690,260,600,20);
//        radioButton777.setBackground(Color.gray);
//        add(radioButton777);
//
//        number8 = new JLabel("8. Is there a problem for you - how to fill your free time?");
//        number8.setBounds(670,300,300,20);
//        number8.setFont(f);
//        add(number8);
//
//        radioButton8 = new JRadioButton("I have so many different interests that it’s hard to choose what to do right now");
//        radioButton8.setBounds(690,320,600,20);
//        radioButton8.setBackground(Color.gray);
//        add(radioButton8);
//
//        radioButton88 = new JRadioButton("Hate messing around. Better still work");
//        radioButton88.setBounds(690,340,600,20);
//        radioButton88.setBackground(Color.gray);
//        add(radioButton88);
//
//        radioButton888 = new JRadioButton("It doesn’t concern anyone. I do what I want");
//        radioButton888.setBounds(690,360,600,20);
//        radioButton888.setBackground(Color.gray);
//        add(radioButton888);
//
//        number9 = new JLabel("9. A stranger (in line, in public transport, etc.) is rude to you. Your reaction");
//        number9.setBounds(670,400,600,20);
//        number9.setFont(f);
//        add(number9);
//
//        radioButton9 = new JRadioButton("I will answer him (her) in the same style");
//        radioButton9.setBounds(690,420,600,20);
//        radioButton9.setBackground(Color.gray);
//        add(radioButton9);
//
//        radioButton99 = new JRadioButton("I am silent, but inside I will 'boil'");
//        radioButton99.setBounds(690,440,600,20);
//        radioButton99.setBackground(Color.gray);
//        add(radioButton99);
//
//        radioButton999 = new JRadioButton("I’ll immediately throw this incident out of my head");
//        radioButton999.setBounds(690,460,600,20);
//        radioButton999.setBackground(Color.gray);
//        add(radioButton999);
//
//        number10 = new JLabel("10. At the checkout you have been shortchanged for a small amount. What will you do?");
//        number10.setBounds(670,500,600,20);
//        number10.setFont(f);
//        add(number10);
//
//        radioButton10 = new JRadioButton("'Rush into battle', defending their interests");
//        radioButton10.setBounds(690,520,600,20);
//        radioButton10.setBackground(Color.gray);
//        add(radioButton10);
//
//        radioButton100 = new JRadioButton("I politely demand that I bring my bosses");
//        radioButton100.setBounds(690,540,600,20);
//        radioButton100.setBackground(Color.gray);
//        add(radioButton100);
//
//        radioButton1000 = new JRadioButton("Wave my hand and leave. In the end, the cashier is also human");
//        radioButton1000.setBounds(690,560,600,20);
//        radioButton1000.setBackground(Color.gray);
//        add(radioButton1000);
//
//        backButton = new JButton("Back");
//        backButton.setBounds(500,600,90,30);
//        backButton.setFont(f3);
//        backButton.setBackground(Color.lightGray);
//        backButton.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                Main.frame.psychotest.setVisible(false);
//                Main.frame.medicine.setVisible(true);
//            }
//        });
//        add(backButton);
//
//        nextButton = new JButton("Next");
//        nextButton.setBounds(750,600,90,30);
//        nextButton.setFont(f3);
//        nextButton.setBackground(Color.lightGray);
//        nextButton.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                Main.frame.psychotest.setVisible(false);
//                Main.frame.physicaltraining.setVisible(true);
//            }
//        });
//        add(nextButton);
//    }
//}