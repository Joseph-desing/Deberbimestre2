import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Pantalla de Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Crear los componentes necesarios
        JLabel userLabel = new JLabel("Usuario:");
        JTextField userField = new JTextField();

        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Iniciar sesión");
        JLabel messageLabel = new JLabel("");

        // Agregar ActionListener al botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());

                // Validar las credenciales
                if ("PERSEO".equals(username) && "1234".equals(password)) {
                    messageLabel.setText("Acceso correcto");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Usuario o contraseña incorrectos");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Agregar componentes al marco
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
