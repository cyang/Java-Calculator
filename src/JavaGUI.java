import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author      Christopher Yang <cyang001@citymail.cuny.edu>
 * @version     1.0
 * @since       2015-04-23
 */


public class JavaGUI extends JFrame {
    // Two operands
    private double number1 = 0;
    private double number2 = 0;

    private double result = 0;
    private double memory = 0;

    // State of the current operation
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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 300);
        setVisible(true);

        // Groups the numberButtons
        JPanel numberButtonPanel = new JPanel();
        numberButtonPanel.setLayout(new GridLayout(4, 3, 1, 1));

        // Groups the operatorButtons
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(5,1,2,2));

        // Groups the memoryButtons
        JPanel memoryPanel = new JPanel();
        memoryPanel.setLayout(new GridLayout(4,1,2,2));

        // Textfield to display the numbers
        final JTextField numField = new JTextField("");
        numField.setHorizontalAlignment(JTextField.RIGHT);

        // Creating the buttons
        final JButton mrButton = new JButton("MR");
        final JButton mcButton = new JButton("MC");
        final JButton mAddButton = new JButton("M+");
        final JButton mSubButton = new JButton("M-");
        final JButton clearButton = new JButton("Clear");
        final JButton equalButton = new JButton("=");

        // Clears the number on the screen
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numField.setText(Double.toString(0));
                result = 0;
                number1 = 0;
                number2 = 0;
            }
        });

        // Recalls the memory
        mrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = memory;
                numField.setText(Double.toString(number1));
            }
        });

        // Clears the memory
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory = 0;
            }
        });

        // Adds to the memory
        mAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                memory+=number1;
                number1=0;
            }
        });

        // Subtracts from the memory
        mSubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(numField.getText());
                memory-=number1;
                number1=0;
            }
        });

        // Pressing the equal button after an operator will give the correct solution
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

        // OperatorListener listens for an action from operator Buttons
        class OperatorListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String operator = e.getActionCommand();
                number1 = Double.parseDouble(numField.getText());
                currentOperation = operator;
                numField.setText("");
            }
        }

        // NumberListener listens for an action from the numberButtons
        class NumberListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String digit = e.getActionCommand();
                if(currentOperation.equals("")){
                    number1 = (number1*10)+Integer.parseInt(digit);
                    numField.setText(Double.toString(number1));
                }
                else
                {
                    number2 = (number2*10)+Integer.parseInt(digit);
                    numField.setText(Double.toString(number2));
                }
            }
        }

        // Using NumberListener
        ActionListener numberListener = new NumberListener();

        int[] numberList = {7,8,9,4,5,6,1,2,3,0};

        // Go through the numberList and create the buttons and actions for these numbers
        for (int element: numberList) {
            JButton numberButton = new JButton(Integer.toString(element));
            numberButton.addActionListener(numberListener);
            numberButtonPanel.add(numberButton);
        }

        // Using OperatorListener
        ActionListener operatorListener = new OperatorListener();

        char[] operatorList = {'/', '*', '+', '-'};

        // Go through the operatorList and create the buttons and actions for these operators
        for (char element: operatorList) {
            JButton operatorButton = new JButton(Character.toString(element));
            operatorButton.addActionListener(operatorListener);
            operatorPanel.add(operatorButton);
        }


        operatorPanel.add(equalButton);

        memoryPanel.add(mrButton);
        memoryPanel.add(mcButton);
        memoryPanel.add(mAddButton);
        memoryPanel.add(mSubButton);

        // Adjusts the location of the panels
        contentPane.add(numField, BorderLayout.NORTH);
        contentPane.add(numberButtonPanel, BorderLayout.CENTER);
        contentPane.add(operatorPanel, BorderLayout.EAST);
        contentPane.add(memoryPanel, BorderLayout.WEST);
        contentPane.add(clearButton, BorderLayout.SOUTH);
    }
}
