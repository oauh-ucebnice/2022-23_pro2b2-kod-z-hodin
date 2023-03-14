import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class MenuFrame extends JFrame {

    private JPanel mainPanel;
    private JTextField textFieldJmeno;
    private JButton btNext;
    private JTextField textFieldIndex;

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuHelp;
    private JMenuItem miOpenFile;

    private JFileChooser fileChooserOpen = new JFileChooser(".");

    private Data data = new Data();

    public MenuFrame() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F); // Menu File se vyvolá klávesou F
        menuBar.add(menuFile);
        menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);

        miOpenFile = new JMenuItem("Open...", KeyEvent.VK_O);
        menuFile.add(miOpenFile);

        miOpenFile.addActionListener(e -> openFile());

        btNext.addActionListener(e -> posunNaDalsi());
        zobrazData();
    }

    private void openFile() {
        int vysledek = fileChooserOpen.showOpenDialog(this);
        if (vysledek == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooserOpen.getSelectedFile();
            // String selectedFilePath = selectedFile.getPath();
            // JOptionPane.showMessageDialog(this,
            //         "Chceš otevřít soubor: "+selectedFilePath);
            data.loadFromFile(selectedFile);
            zobrazData();
        }
    }

    private void posunNaDalsi() {
        data.next();
        zobrazData();
    }

    private void zobrazData() {
        textFieldJmeno.setText(data.getAktualniJmeno());
        textFieldIndex.setText(data.getAktualniIndex());
    }

    public static void main(String[] args) {
        MenuFrame frame = new MenuFrame();
        frame.pack();
        frame.setVisible(true);
    }

}
