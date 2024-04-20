import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class managerframe implements ActionListener {

    Font font = new Font("Serif", Font.BOLD, 60);
    JFrame frame = new JFrame();
    JPanel panel;
    JPasswordField passwordField;
    JPasswordField confirmPasswordField;
    JLabel passwordLabel;
    JLabel confirmPasswordLabel;
    JButton submitButton;

    managerframe() {
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setUndecorated(false);
        frame.setBackground(ColorApp.backColor );

        JLabel LabelTitle = new JLabel();
        LabelTitle.setText("Maneger Page");
        LabelTitle.setHorizontalAlignment(JLabel.CENTER);
        LabelTitle.setVerticalAlignment(JLabel.CENTER);
        LabelTitle.setFont(font);
        LabelTitle.setBounds(0, 0, 1000, 100);
        LabelTitle.setBackground(new Color(200, 50, 50));
        LabelTitle.setOpaque(true);

        //////////////////////////////////
        //////// password
        panel = new JPanel();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 30));
        confirmPasswordField.setPreferredSize(new Dimension(200, 30));

        passwordLabel = new JLabel("Password:");
        confirmPasswordLabel = new JLabel("Confirm Password:");

        // Add the password field and label to the panel
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        // Add a button to submit the form
        submitButton = new JButton("Confirm");
        submitButton.addActionListener(this);
        panel.setBounds(40, 200, 900, 100);
        panel.add(submitButton);
        // Add an action listener to the submit button to check if the passwords match
        frame.add(LabelTitle);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char[] password = passwordField.getPassword();
        char[] confirmPassword = confirmPasswordField.getPassword();
        char[] correct_password = { '1' };
        if (Arrays.equals(password, confirmPassword) && Arrays.equals(password, correct_password)) {
            if (e.getSource() == submitButton) {
                frame.dispose();
                new AddMoviesUI();
            }
        } else {
            // Passwords do not match, display an error message
            JOptionPane.showMessageDialog(panel, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
