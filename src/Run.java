import javax.swing.*;

public class Run {
    public static void main(String[] args){
        JFrame frame = new JFrame("Scrcpy GUI");
        frame.setContentPane(new Main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

