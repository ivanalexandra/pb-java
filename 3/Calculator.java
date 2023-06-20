import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public Calculator() {
        super("Calculator");

        // Setam layout-ul fereastrei ca fiind un grid cu 4 rânduri și 2 coloane
        setLayout(new GridLayout(4, 2, 5, 5));

        // Adăugăm un label pentru primul număr
        add(new JLabel("Primul număr:"));

        // Adăugăm un câmp de text pentru primul număr
        num1Field = new JTextField(10);
        add(num1Field);

        // Adăugăm un label pentru al doilea număr
        add(new JLabel("Al doilea număr:"));

        // Adăugăm un câmp de text pentru al doilea număr
        num2Field = new JTextField(10);
        add(num2Field);

        // Adăugăm butonul de adunare
        JButton addButton = new JButton("Adună");
        addButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 + num2;
            resultLabel.setText("Rezultat: " + result);
        });
        add(addButton);

        // Adăugăm butonul de scădere
        JButton subtractButton = new JButton("Scade");
        subtractButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 - num2;
            resultLabel.setText("Rezultat: " + result);
        });
        add(subtractButton);

        // Adăugăm butonul de înmulțire
        JButton multiplyButton = new JButton("Înmulțește");
        multiplyButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 * num2;
            resultLabel.setText("Rezultat: " + result);
        });
        add(multiplyButton);

        // Adăugăm butonul de împărțire
        JButton divideButton = new JButton("Împarte");
        divideButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            if (num2 == 0) {
                resultLabel.setText("Rezultat: eroare (împărțire la zero)");
            } else {
                double result = (double) num1 / num2;
                resultLabel.setText("Rezultat: " + result);
            }
        });
        add(divideButton);

        // Adăugăm un label pentru afișarea rezultatului
        resultLabel = new JLabel("Rezultat:");
        add(resultLabel);

        // Setăm dimensiunea și afișăm fereastra
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
