
package quizapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class AdminLogin extends JFrame {

    private JTextField adminNameField;
    private JPasswordField passwordField;
    private final String adminName = "Admin";
    private final String password = "1234";

    public AdminLogin() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Admin Login");
        getContentPane().setLayout(null);

        JLabel lblAdmin = new JLabel("Admin Name:");
        lblAdmin.setFont(new Font("Sitka Text", Font.BOLD, 15));
        lblAdmin.setBounds(76, 69, 136, 36);
        getContentPane().add(lblAdmin);

        adminNameField = new JTextField();
        adminNameField.setBounds(191, 69, 184, 36);
        getContentPane().add(adminNameField);
        adminNameField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Sitka Text", Font.BOLD, 15));
        lblPassword.setBounds(86, 136, 95, 36);
        getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(191, 135, 184, 36);
        getContentPane().add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Sitka Small", Font.BOLD, 13));
        btnLogin.setBounds(161, 201, 117, 25);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (adminNameField.getText().equals(adminName) && password.equals(new String(passwordField.getPassword()))) {
                    dispose();
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(btnLogin, "Incorrect Username or Password");
                }
            }
        });
        getContentPane().add(btnLogin);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminLogin();
    }
}
