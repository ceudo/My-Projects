import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

class Calculator extends JFrame{
    public Calculator(){
        ui();
    }
    private void ui(){
        
        //Labels and titles
        setTitle("Calculator");
        JLabel header=new JLabel("Calculator");
        JLabel sign1=new JLabel("Output:");
        header.setFont(new Font("Serif",Font.BOLD,20));
        header.setBounds(98,0,100,50);
        add(header);
        sign1.setFont(new Font("Serif",Font.BOLD,15));
        sign1.setBounds(120,165,50,20);
        add(sign1);
        
        //TextFields
        JTextField input1=new JTextField();
        JTextField sign=new JTextField();
        JTextField input2=new JTextField();
        JTextField output=new JTextField();
        JTextField clicked=new JTextField("input1");
        input1.setBounds(15,50,100,100);
        sign.setBounds(120,75,50,50);
        input2.setBounds(175,50,100,100);
        output.setBounds(175,155,100,40);
        clicked.setBounds(15,15,100,20);
        clicked.setEditable(false);
        clicked.setVisible(false);
        output.setEditable(true);
        add(input1);
        add(sign);
        add(input2);
        add(output);
        add(clicked);
        input1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked.setText("input1");
            }
        });
        sign.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked.setText("sign");
            }
        });
        input2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked.setText("input2");
            }
        });
        
        //Buttons
        JButton be=new JButton("=");
        be.setBounds(-5,160,60,40);
        add(be);
        be.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("      +".equals(sign.getText())){
                    double value=Double.parseDouble(input1.getText())+Double.parseDouble(input2.getText());
                    output.setText(String.valueOf(value));
                }
                if("      -".equals(sign.getText())){
                    double value=Double.parseDouble(input1.getText())-Double.parseDouble(input2.getText());
                    output.setText(String.valueOf(value));
                }
                if("      X".equals(sign.getText())){
                    double value=Double.parseDouble(input1.getText())*Double.parseDouble(input2.getText());
                    output.setText(String.valueOf(value));
                }
                if("      /".equals(sign.getText())){
                    if(Double.parseDouble(input2.getText())==0){
                        output.setText("Error");
                    }
                    else{
                       double value=Double.parseDouble(input1.getText())/Double.parseDouble(input2.getText());
                        output.setText(String.valueOf(value)); 
                    }
                }
            }
        });
        JButton bp=new JButton(".");
        bp.setBounds(55,160,60,40);
        add(bp);
        bp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+".");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+".");
                }
            }
        });
        JButton b0=new JButton("0");
        b0.setBounds(-5,200,60,60);
        add(b0);
        b0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"0");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"0");
                }
            }
        });
        JButton b1=new JButton("1");
        b1.setBounds(55,200,60,60);
        add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"1");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"1");
                }
            }
        });
        JButton b2=new JButton("2");
        b2.setBounds(115,200,60,60);
        add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"2");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"2");
                }
            }
        });
        JButton b3=new JButton("3");
        b3.setBounds(175,200,60,60);
        add(b3);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"3");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"3");
                }
            }
        });
        JButton bc=new JButton("del");
        bc.setBounds(235,200,55,60);
        add(bc);
        bc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    String text = input1.getText();
                    if(text.length()>0){
                        input1.setText(text.substring(0, text.length()-1));
                    }
                }
                if("input2".equals(clicked.getText())){
                    String text = input2.getText();
                    if(text.length()>0){
                        input2.setText(text.substring(0, text.length()-1));
                    }
                }
                if("sign".equals(clicked.getText())){
                    String text = sign.getText();
                    if(text.length()>0){
                        sign.setText(text.substring(0, text.length()-1));
                    }
                }
            }
        });
        JButton b4=new JButton("4");
        b4.setBounds(-5,260,60,60);
        add(b4);
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"4");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"4");
                }
            }
        });
        JButton b5=new JButton("5");
        b5.setBounds(55,260,60,60);
        add(b5);
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"5");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"5");
                }
            }
        });
        JButton b6=new JButton("6");
        b6.setBounds(115,260,60,60);
        add(b6);
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"6");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"6");
                }
            }
        });
        JButton b7=new JButton("7");
        b7.setBounds(175,260,60,60);
        add(b7);
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"7");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"7");
                }
            }
        });
        JButton ba=new JButton("+");
        ba.setBounds(235,260,55,60);
        add(ba);
        ba.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("sign".equals(clicked.getText())){
                    sign.setText("      +");
                }
            }
        });
        JButton b8=new JButton("8");
        b8.setBounds(-5,320,60,60);
        add(b8);
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"8");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"8");
                }
            }
        });
        JButton b9=new JButton("9");
        b9.setBounds(55,320,60,60);
        add(b9);
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("input1".equals(clicked.getText())){
                    input1.setText(input1.getText()+"9");
                }
                if("input2".equals(clicked.getText())){
                    input2.setText(input2.getText()+"9");
                }
            }
        });
        JButton bd=new JButton("/");
        bd.setBounds(115,320,60,60);
        add(bd);
        bd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("sign".equals(clicked.getText())){
                    sign.setText("      /");
                }
            }
        });
        JButton bm=new JButton("X");
        bm.setBounds(175,320,60,60);
        add(bm);
        bm.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("sign".equals(clicked.getText())){
                    sign.setText("      X");
                }
            }
        });
        JButton bs=new JButton("-");
        bs.setBounds(235,320,55,60);
        add(bs);
        bs.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if("sign".equals(clicked.getText())){
                    sign.setText("      -");
                }
            }
        });
        setLayout(null);
        setResizable(false);
        setSize(300,417);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Calculator();
    }
}
