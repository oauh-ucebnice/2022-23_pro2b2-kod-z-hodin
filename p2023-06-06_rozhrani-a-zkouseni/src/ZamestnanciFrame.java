import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZamestnanciFrame {
    private JButton kopirujABButton;
    private JTextField textA;
    private JTextField textB;

    public ZamestnanciFrame() {
        kopirujABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textB.setText(textA.getText());
            }
        });
        kopirujABButton.addActionListener(e -> textB.setText(textA.getText()));
    }

    public static void main(String[] args) {
        ZamestnanciFrame okno = new ZamestnanciFrame();
    }}
