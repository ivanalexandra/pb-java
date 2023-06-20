import javax.swing.*;
import java.awt.*;

public class EmailFrame extends JFrame {
    public EmailFrame() {
        setTitle("Fereastra de e-mail");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JLabel toLabel = new JLabel("To:");
        JTextField toField = new JTextField(30);

        JLabel ccLabel = new JLabel("Cc:");
        JTextField ccField = new JTextField(30);

        JLabel bccLabel = new JLabel("Bcc:");
        JTextField bccField = new JTextField(30);

        JLabel subjectLabel = new JLabel("Subject:");
        JTextField subjectField = new JTextField(50);

        
        JTextArea messageArea = new JTextArea(10, 50);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        JButton sendButton = new JButton("Send");

        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        panel.add(toLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(toField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(ccLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(ccField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(bccLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        panel.add(bccField, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(subjectLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        panel.add(subjectField, c);

       

        c.gridx = 1;
        c.gridy = 4;
        c.gridheight = 5;
        panel.add(scrollPane, c);

        c.gridx = 0;
        c.gridy = 9;
        c.gridheight = 1;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(sendButton, c);

        add(panel);

        setVisible(true);
    }
    public static void main(String[] args) {
    EmailFrame emailFrame = new EmailFrame();
}

}

