import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {
    private JButton btHello;
    private JPanel pnMain;

    public HelloFrame() {
        btHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello GUI!");
            }
        });
    }

    public static void main(String[] args) {
        HelloFrame frame = new HelloFrame();
        frame.setTitle("Hello GUI!");
        frame.setContentPane(frame.pnMain);
        // frame.pack();
        // frame.setSize(600, 400);
        frame.setBounds(200, 200, 400, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
