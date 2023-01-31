import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxDemo extends JFrame {
    private JButton btAkce;
    private JCheckBox checkBox;
    private JPanel mainPanel;
    private JTextArea textArea;

    public CheckBoxDemo() {
        /*btAkce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btAkce,"Hello");
            }
        });*/
        // btAkce.addActionListener(event -> JOptionPane.showMessageDialog(btAkce,"Hello"));
        btAkce.addActionListener(e -> spustAkci(e));
    }

    private void spustAkci(ActionEvent e) {
        String text = "Stav checkboxu: ";

        if (checkBox.isSelected()) text += "zatrženo";
        else text+= "není zatrženo";

        textArea.append(text +"\n");

        text += "\n\nPřepínám stav na opačný.";

        prepniCheckBox();

        JOptionPane.showMessageDialog(btAkce, text);
    }

    private void prepniCheckBox() {
        checkBox.setSelected(!checkBox.isSelected());
    }

    public static void main(String[] args) {
        CheckBoxDemo okno = new CheckBoxDemo();
        okno.setContentPane(okno.mainPanel);
        okno.setVisible(true);
        okno.pack();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
