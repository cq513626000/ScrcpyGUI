import javax.swing.*;

public class Main {
    private JButton startButton;
    private JButton connect;
    private JTextField ip;
    protected JPanel mainPanel;

    public static void main(String[] args){
            JFrame frame = new JFrame("Scrcpy GUI");
            frame.setContentPane(new Main().mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
