package advice.app.view;

import advice.app.controller.SaveAction;

import javax.swing.*;
import java.awt.*;

public class AdviceView extends JFrame {

    private JTextArea readAdvice;
    private JTextArea writeAdvice;
    private JButton save;
    private JScrollPane readAdviceScroller;

    public AdviceView() {
        super();

        initComponents();
        initControllers();
        initView();

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        readAdvice = new JTextArea(20, 20);
        save = new JButton("Save");
        readAdviceScroller = new JScrollPane(readAdvice);
    }

    private void initControllers() {
        save.addActionListener(new SaveAction(readAdvice));
    }

    private void initView() {
        readAdviceScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        readAdviceScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(readAdviceScroller);
        getContentPane().add(BorderLayout.SOUTH, save);
    }
}
