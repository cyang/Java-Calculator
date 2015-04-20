import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ChrisYang on 4/16/15.
 */
public class JavaGUI extends JFrame {
    private double number1 = 0;
    private double number2 = 0;
    private double answer = 0;
    private String currentOperation = "";

    public static void main(String[] args) {
        JavaGUI sample = new JavaGUI();
    }

    public JavaGUI(){
        initComponents();
    }

    private void initComponents(){

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3,2,10,10));

        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        final JTextField numField = new JTextField();

        final JButton addButton = new JButton("+");
        final JButton subButton = new JButton("-");
        final JButton divButton = new JButton("/");
        final JButton multButton = new JButton("*");
        final JButton equalButton = new JButton("=");

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
                    numField.setText(String.valueOf(number1 + number2));
                else if (currentOperation.equals("-"))
                    numField.setText(String.valueOf(number1 - number2));
                else if (currentOperation.equals("/"))
                    numField.setText(String.valueOf(number1 / number2));
                else if (currentOperation.equals("*"))
                    numField.setText(String.valueOf(number1 * number2));


                number1 = Double.parseDouble(numField.getText());
            }
        });


        contentPane.add(addButton);
        contentPane.add(subButton);
        contentPane.add(divButton);
        contentPane.add(multButton);
        contentPane.add(equalButton);

        contentPane.add(numField);

        setVisible(true);
    }
}
