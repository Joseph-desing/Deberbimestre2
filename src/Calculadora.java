import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear los componentes necesarios
        JLabel label1 = new JLabel("Número 1:");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Número 2:");
        JTextField textField2 = new JTextField();

        JLabel resultLabel = new JLabel("Resultado: ");
        JLabel resultValue = new JLabel("0");

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        // Agregar ActionListeners a los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultValue.setText(String.valueOf(num1 + num2));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultValue.setText(String.valueOf(num1 - num2));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultValue.setText(String.valueOf(num1 * num2));
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                if (num2 != 0) {
                    resultValue.setText(String.valueOf(num1 / num2));
                } else {
                    resultValue.setText("Error: Div/0");
                }
            }
        });

        // Agregar componentes al marco
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);
        frame.add(resultValue);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
