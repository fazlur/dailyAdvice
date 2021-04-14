import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AdviceGui extends JFrame {
    private JTextArea readAdvice;
    private JTextArea writeAdvice;


    public void writeAdvice() {
        //JFrame frame = new JFrame("Daily Advice");
        readAdvice = new JTextArea(20, 20);
        JButton save = new JButton("Save");
        JScrollPane readAdviceScroller = new JScrollPane(readAdvice);

        save.addActionListener(new SaveAction());
        readAdviceScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        readAdviceScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(readAdviceScroller);
        getContentPane().add(BorderLayout.SOUTH, save);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getAdviceText() {
        return readAdvice.getText();
    }

    public class SaveAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(readAdvice.getText());
            String file = "C:\\Users\\fazlura\\Google Drive\\JavaStudy\\Portfolio\\dailyAdvice\\data\\advicelist.txt";

            try (Writer source = new FileWriter(file); BufferedWriter data = new BufferedWriter(source)) {
                data.write(getAdviceText() + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
