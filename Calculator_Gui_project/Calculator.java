import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Calculator {
    static String calculation = new String("");
    static JLabel Display = new JLabel();
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setBackground(Color.GRAY);
        jp2.setBackground(Color.RED);
        jf.setTitle("Calculator");
        jf.setLayout(null);
        setComponent1(jp1);
        setComponent2(jp2);
        jf.add(jp1);
        jf.add(jp2);
        jf.setSize(512,637);
        jf.setIconImage(new ImageIcon("Calculator.png").getImage());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        jf.setResizable(false);
    }
    public static void setComponent1(JPanel jp1){
        Display.setText("Enter value");
        Display.setFont(new Font("Serif", Font.PLAIN, 30));
        Display.setSize(500,100);
        jp1.setBounds(0, 0, 500, 100);
        jp1.add(Display);
    }
    public static void setComponent2(JPanel jp2){
        JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,eql,div,mul,sub,add,mod;
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        n0 = new JButton("0");
        eql = new JButton("Ans");
        div = new JButton("/");
        mul = new JButton("*");
        add = new JButton("+");
        sub = new JButton("-");
        mod = new JButton("%");
        n0.setFont(new Font("Serif", Font.PLAIN, 30));
        n1.setFont(new Font("Serif", Font.PLAIN, 30));
        n2.setFont(new Font("Serif", Font.PLAIN, 30));
        n3.setFont(new Font("Serif", Font.PLAIN, 30));
        n4.setFont(new Font("Serif", Font.PLAIN, 30));
        n5.setFont(new Font("Serif", Font.PLAIN, 30));
        n6.setFont(new Font("Serif", Font.PLAIN, 30));
        n7.setFont(new Font("Serif", Font.PLAIN, 30));
        n8.setFont(new Font("Serif", Font.PLAIN, 30));
        n9.setFont(new Font("Serif", Font.PLAIN, 30));
        mul.setFont(new Font("Serif", Font.PLAIN, 30));
        div.setFont(new Font("Serif", Font.PLAIN, 30));
        add.setFont(new Font("Serif", Font.PLAIN, 30));
        sub.setFont(new Font("Serif", Font.PLAIN, 30));
        mod.setFont(new Font("Serif", Font.PLAIN, 30));
        eql.setFont(new Font("Serif", Font.PLAIN, 30));
        jp2.setLayout(new GridLayout(4,4));
        n0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"0";
                Display.setText(calculation);
            }
        });
        n1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"1";
                Display.setText(calculation);
            }
        });
        n2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"2";
                Display.setText(calculation);
            }
        });
        n3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"3";
                Display.setText(calculation);
            }
        });
        n4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"4";
                Display.setText(calculation);
            }
        });
        n5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"5";
                Display.setText(calculation);
            }
        });
        n6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"6";
                Display.setText(calculation);
            }
        });
        n7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"7";
                Display.setText(calculation);
            }
        });
        n8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"8";
                Display.setText(calculation);
            }
        });
        n9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"9";
                Display.setText(calculation);
            }
        });
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"+";
                Display.setText(calculation);
            }
        });
        sub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"-";
                Display.setText(calculation);
            }
        });
        mul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"*";
                Display.setText(calculation);
            }
        });
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"/";
                Display.setText(calculation);
            }
        });
        mod.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                calculation = calculation+"%";
                Display.setText(calculation);
            }
        });
        eql.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (calculation.length()==0){
                    Display.setText("Enter value");
                }else{
                    float result = Back_calculation();
                    if (result!=(float)0.000000002){
                        Display.setText(Float.toString(result));
                    }
                }
            }
            public float Back_calculation() {
                String str = "";
                calculation = calculation+"$";
                if ((!Character.isDigit(calculation.charAt(0)) | (!Character.isDigit(calculation.charAt(calculation.length()-2))))){
                    Display.setText("Enter valid Operations");
                    calculation = "";
                    return (float) 0.000000002;
                }else{
                    for(int i=0;calculation.charAt(i)!='$';i++){
                        char c = calculation.charAt(i);
                        if (Character.isDigit(c)){
                            str = str+c;
                        }else if (c=='+'){
                            int j= i+1;
                            String str2 = "";
                            while(Character.isDigit(calculation.charAt(j)) & calculation.charAt(j)!='$'){
                                str2 = str2+calculation.charAt(j);
                                j++;
                            }
                            str = Float.toString(Float.parseFloat(str)+Float.parseFloat(str2));
                            if (calculation.charAt(j)=='$'){
                                break;
                            }
                            i = j-1;
                        }else if (c=='-'){
                            int j= i+1;
                            String str2 = "";
                            while(Character.isDigit(calculation.charAt(j)) & calculation.charAt(j)!='$'){
                                str2 = str2+calculation.charAt(j);
                                j++;
                            }
                            str = Float.toString(Float.parseFloat(str)-Float.parseFloat(str2));
                            if (calculation.charAt(j)=='$'){
                                break;
                            }
                            i = j-1;
                        }else if (c=='*'){
                            int j= i+1;
                            String str2 = "";
                            while(Character.isDigit(calculation.charAt(j)) & calculation.charAt(j)!='$'){
                                str2 = str2+calculation.charAt(j);
                                j++;
                            }
                            str = Float.toString(Float.parseFloat(str)*Float.parseFloat(str2));
                            if (calculation.charAt(j)=='$'){
                                break;
                            }
                            i = j-1;
                        }else if (c=='/'){
                            int j= i+1;
                            String str2 = "";
                            while(Character.isDigit(calculation.charAt(j)) & calculation.charAt(j)!='$'){
                                str2 = str2+calculation.charAt(j);
                                j++;
                            }
                            try{
                                Integer.toString(Integer.parseInt(str)/Integer.parseInt(str2));
                                float f = Float.parseFloat(str)/Float.parseFloat(str2);
                                str = Float.toString(f);
                            }catch(ArithmeticException e){
                                Display.setText("Division by Zero isnt possible");
                                calculation = "";
                                throw new ArithmeticException("You cannot divide by Zero");
                            }
                            if (calculation.charAt(j)=='$'){
                                break;
                            }
                            i = j-1;
                        }else if (c=='%'){
                            int j= i+1;
                            String str2 = "";
                            while(Character.isDigit(calculation.charAt(j)) & calculation.charAt(j)!='$'){
                                str2 = str2+calculation.charAt(j);
                                j++;
                            }
                            try{
                                str = Float.toString(Float.parseFloat(str)%Float.parseFloat(str2));
                                if (str=="NaN"){
                                    throw new ArithmeticException();
                                }
                            }catch(ArithmeticException e){
                                Display.setText("Division by Zero isnt possible");
                                calculation = "";
                                throw new ArithmeticException("You cannot divide by Zero");
                            }
                            if (calculation.charAt(j)=='$'){
                                break;
                            }
                            i = j-1;
                        }else{
                            break;
                        }
                    }
                }
                calculation = "";
                return Float.parseFloat(str);
            }
        });
        jp2.add(n1);jp2.add(n2);jp2.add(n3);jp2.add(mul);
        jp2.add(n4);jp2.add(n5);jp2.add(n6);jp2.add(div);
        jp2.add(n7);jp2.add(n8);jp2.add(n9);jp2.add(mod);
        jp2.add(add);jp2.add(n0);jp2.add(sub);jp2.add(eql);
        jp2.setSize(500,500);
        jp2.setBounds(0, 100, 500, 500);
    }
}
