
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.text.StyledEditorKit;
import java.awt.Font;
import javax.swing.text.StyledEditorKit;
import static java.awt.Font.ITALIC;

public class LoginPage  implements ActionListener{
    JFrame frame = new JFrame();
    JButton LoginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> LoginInfoOriginal) {

        logininfo = LoginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);


        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font .ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        LoginButton.setBounds(125, 200,100,25);
        LoginButton.setFocusable(false);
        LoginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(LoginButton);
        frame.add(resetButton);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }
    @Override
            public void actionPerformed(ActionEvent e){
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==LoginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID));
            if(logininfo.get(userID).equals(password)) {
                messageLabel.setForeground(Color.green);
                messageLabel.setText(" Login successful");
                frame.dispose();
                WelcomePage welcomePage = new WelcomePage(userID);
            }
            else{
                messageLabel.setForeground(Color.green);
                messageLabel.setText("Wrong password");
            }
        }else{
            messageLabel.setForeground(Color.red);
            messageLabel.setText("username not found");
        }

    }
}
