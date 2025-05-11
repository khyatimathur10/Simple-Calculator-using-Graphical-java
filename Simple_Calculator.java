import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Simple_Calculator extends JFrame implements ActionListener
{
    JTextField txtscreen;
    JButton btn7, btn8, btn9, btnplus, btn4, btn5, btn6, btnminus ,btn1, btn2, btn3, btninto, btnc, btn0, btnequal, btndivide;
    
    String operand1 = "", operand2 = "", operator = "";
    public static void main(String args[])
    {
        Simple_Calculator q=new Simple_Calculator();
    }
    public Simple_Calculator()
    {
        setTitle("Simple_Calculator");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtscreen=new JTextField();
        txtscreen.setEditable(false);
        txtscreen.setFont(new Font("Arial", Font.BOLD, 56));
        txtscreen.setHorizontalAlignment(SwingConstants.RIGHT);
        btn7=new JButton("7");
        btn7.setFont(new Font("Arial", Font.BOLD, 24));
        btn8=new JButton("8");
        btn8.setFont(new Font("Arial", Font.BOLD, 24));
        btn9=new JButton("9");
        btn9.setFont(new Font("Arial", Font.BOLD, 24));
        btnplus=new JButton("+");
        btnplus.setFont(new Font("Arial", Font.BOLD, 24));
        btn4=new JButton("4");
        btn4.setFont(new Font("Arial", Font.BOLD, 24));
        btn5=new JButton("5");
        btn5.setFont(new Font("Arial", Font.BOLD, 24));
        btn6=new JButton("6");
        btn6.setFont(new Font("Arial", Font.BOLD, 24));
        btnminus=new JButton("-");
        btnminus.setFont(new Font("Arial", Font.BOLD, 24));
        btn1=new JButton("1");
        btn1.setFont(new Font("Arial", Font.BOLD, 24));
        btn2=new JButton("2");
        btn2.setFont(new Font("Arial", Font.BOLD, 24));
        btn3=new JButton("3");
        btn3.setFont(new Font("Arial", Font.BOLD, 24));
        btninto=new JButton("*");
        btninto.setFont(new Font("Arial", Font.BOLD, 24));
        btnc=new JButton("C");
        btnc.setFont(new Font("Arial", Font.BOLD, 24));
        btn0=new JButton("0");
        btn0.setFont(new Font("Arial", Font.BOLD, 24));
        btnequal=new JButton("=");
        btnequal.setFont(new Font("Arial", Font.BOLD, 24));
        btndivide=new JButton("/");
        btndivide.setFont(new Font("Arial", Font.BOLD, 24));
        JPanel A = new JPanel();
        JPanel B = new JPanel();
        GridLayout A1 =new GridLayout(1,1);
        A.setLayout(A1);
        A.add(txtscreen);
        GridLayout B1 =new GridLayout(4,4);
        B.setLayout(B1);
        B.add(btn7);
        B.add(btn8);
        B.add(btn9);
        B.add(btnplus);
        B.add(btn4);
        B.add(btn5);
        B.add(btn6);
        B.add(btnminus);
        B.add(btn1);
        B.add(btn2);
        B.add(btn3);
        B.add(btninto);
        B.add(btnc);
        B.add(btn0);
        B.add(btnequal);
        B.add(btndivide);
        setLayout(new BorderLayout());
        add(A, BorderLayout.NORTH);  
        add(B, BorderLayout.CENTER);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnplus.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnminus.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btninto.addActionListener(this);
        btnc.addActionListener(this);
        btn0.addActionListener(this);
        btnequal.addActionListener(this);
        btndivide.addActionListener(this);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent e) {        
            if (e.getSource() == btn0 || e.getSource() == btn1 || e.getSource() == btn2 || e.getSource() == btn3 || e.getSource() == btn4 ||
                e.getSource() == btn5 || e.getSource() == btn6 || e.getSource() == btn7 || e.getSource() == btn8 || e.getSource() == btn9) {
            
                String digit = ((JButton) e.getSource()).getText();         
                if (operator.equals("")) {
                    operand1 += digit;
                    txtscreen.setText(operand1);
                } else 
                {
                    operand2 += digit;
                    txtscreen.setText(operand2);
                }
            }
            
            else if (e.getSource() == btnplus || e.getSource() == btnminus || e.getSource() == btninto || e.getSource() == btndivide) {
                operator = ((JButton) e.getSource()).getText();
            }
            
            else if (e.getSource() == btnc) {
                operand1 = operand2 = operator = "";
                txtscreen.setText("");
            }
        
            else if (e.getSource() == btnequal) {
                int num1 = Integer.parseInt(operand1);
                int num2 = Integer.parseInt(operand2);
                int result = 0;
        
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 != 0) result = num1 / num2;
                        else {
                            txtscreen.setText("Error");
                            return;
                        }
                        break;
                }
                txtscreen.setText(String.valueOf(result));
                operand1 = String.valueOf(result);
                operand2 = "";
                operator = "";
            }
        
        }
    }


