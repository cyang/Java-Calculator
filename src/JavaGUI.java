import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ChrisYang on 4/16/15.
 */
public class JavaGUI extends JFrame {
    private double number1 = 0;
    private double number2 = 0;
    private double memory = 0;
    private double result = 0;
    private String currentOperation = "";

    public static void main(String[] args) {
        JavaGUI sample = new JavaGUI();
    }

    public JavaGUI(){
        initComponents();
    }

    private void initComponents(){

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));
        setSize(300, 300);

        JPanel numberButtonPanel = new JPanel();
        numberButtonPanel.setLayout(new GridLayout(4, 3, 2, 2));

        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(5,1,2,2));

        JPanel memoryPanel = new JPanel();
        memoryPanel.setLayout(new GridLayout(4,1,2,2));


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        final JTextField numField = new JTextField("0");
        numField.setHorizontalAlignment(JTextField.RIGHT);

        final JButton mrButton = new JButton("MR");
        final JButton mcButton = new JButton("MC");
        final JButton mAddButton = new JButton("M+");
        final JButton mSubButton = new JButton("M-");

        final JButton clearButton = new JButton("Clear");

        final JButton button1 = new JButton("1");
        final JButton button2 = new JButton("2");
        final JButton button3 = new JButton("3");
        final JButton button4 = new JButton("4");
        final JButton button5 = new JButton("5");
        final JButton button6 = new JButton("6");
        final JButton button7 = new JButton("7");
        final JButton button8 = new JButton("8");
        final JButton button9 = new JButton("9");
        final JButton button0 = new JButton("0");

        final JButton addButton = new JButton("+");
        final JButton subButton = new JButton("-");
        final JButton divButton = new JButton("/");
        final JButton multButton = new JButton("*");
        final JButton equalButton = new JButton("=");

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numField.setText(Double.toString(0));
                result = 0;
                number1 = 0;
                number2 = 0;
            }
        });

        mrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = memory;
                numField.setText(Double.toString(number1));
            }
        });

        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory = 0;
            }
        });

        mAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                memory+=number1;
                number1=0;
            }
        });

        mSubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                memory-=number1;
                number1=0;
            }
        });

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+1;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+1;
                    numField.setText(Double.toString(number2));
                }

            }
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+2;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+2;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+3;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+3;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+4;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+4;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+5;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+5;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+6;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+6;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+7;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+7;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+8;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+8;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 = (number1*10)+9;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+9;
                    numField.setText(Double.toString(number2));
                }
            }
        });
        button0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(currentOperation.equals("")){
                    number1 *= 10;
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 *= 10;
                    numField.setText(Double.toString(number2));
                }
            }
        });


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                currentOperation = "+";
                numField.setText("");
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                currentOperation = "-";
                numField.setText("");
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                currentOperation = "/";
                numField.setText("");
            }
        });

        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                currentOperation = "*";
                numField.setText("");
            }
        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number2 = Double.parseDouble(numField.getText());
                if(currentOperation.equals("+"))
                    result = number1 + number2;
                else if (currentOperation.equals("-"))
                    result = number1 - number2;
                else if (currentOperation.equals("/"))
                    result = number1 / number2;
                else if (currentOperation.equals("*"))
                    result = number1 * number2;
                else {
                    result = Double.parseDouble(numField.getText());
                    numField.setText(Double.toString(result));
                }

                currentOperation = "";
                numField.setText(String.valueOf(result));
                number1 = 0;
                number2 = 0;
            }
        });

        numberButtonPanel.add(button7);
        numberButtonPanel.add(button8);
        numberButtonPanel.add(button9);
        numberButtonPanel.add(button4);
        numberButtonPanel.add(button5);
        numberButtonPanel.add(button6);
        numberButtonPanel.add(button1);
        numberButtonPanel.add(button2);
        numberButtonPanel.add(button3);
        numberButtonPanel.add(button0);

        operatorPanel.add(divButton);
        operatorPanel.add(multButton);
        operatorPanel.add(addButton);
        operatorPanel.add(subButton);
        operatorPanel.add(equalButton);

        memoryPanel.add(mrButton);
        memoryPanel.add(mcButton);
        memoryPanel.add(mAddButton);
        memoryPanel.add(mSubButton);

        contentPane.add(numField, BorderLayout.NORTH);
        contentPane.add(numberButtonPanel, BorderLayout.CENTER);
        contentPane.add(operatorPanel, BorderLayout.EAST);
        contentPane.add(memoryPanel, BorderLayout.WEST);
        contentPane.add(clearButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
