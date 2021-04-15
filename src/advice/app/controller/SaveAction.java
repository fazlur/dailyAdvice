package advice.app.controller;

import advice.repository.AdviceRepository;
import advice.repository.io.FileAdviceRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveAction implements ActionListener {

    private final JTextArea field;

    private AdviceRepository repository;

    public SaveAction(JTextArea field) {
        super();

        this.field = field;
        this.repository = new FileAdviceRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(field.getText());

        repository.write(field.getText());
    }
}
