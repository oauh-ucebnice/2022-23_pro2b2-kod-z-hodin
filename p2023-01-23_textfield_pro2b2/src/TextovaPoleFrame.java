import javax.swing.*;

public class TextovaPoleFrame extends JFrame{
    private JButton button1;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton button2;
    private JPanel mainPanel;

    public static void main(String[] args) {
        TextovaPoleFrame t = new TextovaPoleFrame();
        t.setContentPane(t.mainPanel);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

