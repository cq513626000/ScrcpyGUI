import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel;
    private JButton button1;
    private JTextField textField1;
    private JButton adb;

    public GUI(){
        button1.addActionListener(new StartListener());
        adb.addActionListener(new ConnectEventListener());
    }

    public static void main(String[] args){
        Scrcpy.connect("90.147.106.112");
       // Scrcpy.runScrcpy();
        JFrame frame = new JFrame("Scrcpy GUI");
        frame.setContentPane(new GUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Scrcpy.runScrcpy();
        }
    }

    private class ConnectEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Scrcpy.connect(textField1.getText());
        }
    }
}
